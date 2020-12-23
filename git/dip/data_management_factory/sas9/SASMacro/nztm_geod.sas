%macro nztm_geod;
/*
    Name:                           NZTM -> GEOD
    Author:                         Laurie Fleming, Daemons Ltd / Tenzing
    Date-written:                   Mid-2013, originally
    Remarks:                        Converted from LINZ C code, converts NZTM (NZ Transverse Mercator)
                                    eastings and northings to latitude and longitude. I know nothing of 
                                    quasi-spherical geometry, so I don't know how it does what it does. 
                                    But does it it does.
                                    
    
    Modification History:           (in reverse chronological order)
    Laurie Fleming                  Minor changes to fit in with IR DI transformations.
    5 Nov 2019

    Laurie Fleming                  First written for NZ Police
    mid-2013
*/
option mprint notes nofullstimer bufsize=65535 bufno=3000;

%if &_output0_memtype = DATA 
    %then %do;
          data &_output0(&_output0_options);
          %end;
    %else %do;
          data &_output0 / view=&_output0;
          %end;
retain a 6378137
       rf 298.257222101
       nztm_cm 173.0
       scalef 0.9996
       falsee 1600000.0
       falsen 10000000.0
       pi cm e2 f e2 n n2 n3 n4 g rad2deg;
set &_input0;
if _n_ = 1 then do; 
   pi = constant('pi');    
   rad2deg = 180 / pi;    
   cm = nztm_cm / rad2deg;    
   f = 1 / rf;    
   e2 = (2 * f) - (f ** 2);    
   n = f / (2 - f);    
   n2 = n ** 2;    
   n3 = n ** 3;    
   n4 = n ** 4;    
   g = a * (1 - n) * (1 - n2) * (1 + 9 * n2 / 4) + (225 * n4 / 64); 
   end;
cn1 = (&northing - falsen) / scalef; 
sig = cn1 / g; 
fphi = sig 
     + sin(sig * 2) * (((n * 3) / 2) - ((n3 * 27) / 32))
     + sin(sig * 4) * (((n2 * 21) / 16) - ((n4 * 55) / 32))  
     + sin(sig * 6) * ((n3 * 155) / 96)  
     + sin(sig * 8) * ((n4 * 1097) / 512); 
slt = sin(fphi); 
clt = cos(fphi); 
eslt = (1 - e2 * slt ** 2); 
eta = a / sqrt(eslt); 
rho = eta * (1 - e2) / eslt; 
psi = eta / rho; 
E = (&easting - falsee); 
x = E / (eta * scalef); 
x2 = x ** 2; 
t = tan(fphi); 
t2 = t ** 2; 
t4 = t ** 4; 
term1 = 1 / 2; 
term2 = ((-4 * psi + 9 * (1 - t2)) * psi + 12 * t2) / 24; 
term3 = ((((8 * (11 - 24 * t2) * psi     
          - 12 * (21 - 71 * t2)) * psi  
          + 15 * ((15 * t2 - 98) * t2 + 15)) * psi      
          + 180 * ((-3 * t2 + 5) * t2)) * psi + 360 * t4) / 720; 
term4 = (((1575 * t2 + 4095) * t2 + 3633) * t2 + 1385) / 40320; 
&latitude = fphi + (t * x * E / (scalef * rho))          
         * (((term4 * x2 - term3) * x2 + term2) * x2 - term1); 
term1 = 1; 
term2 = (psi + 2 * t2) / 6; 
term3 = (((-4 * (1 - 6 * t2) * psi          
         + (9 - 68 * t2)) * psi 
         + 72 * t2) * psi
         + 24 * t4) / 120; 
term4 = (((720 * t2 + 1320) * t2 + 662) * t2 + 61) / 5040; 
&longitude = cm - (x / clt) * (((term4 * x2 - term3) * x2 + term2) * x2 - term1); 
&latitude = &latitude * rad2deg; 
&longitude = &longitude * rad2deg; 
keep &keep;
run;
%mend nztm_geod;