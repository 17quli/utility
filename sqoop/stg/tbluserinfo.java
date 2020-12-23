// ORM class for table 'tbluserinfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:24:07 NZDT 2020
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class tbluserinfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fstrUser", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrUser = (String)value;
      }
    });
    setters.put("fstrType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrType = (String)value;
      }
    });
    setters.put("fdtmStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fdtmStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fdtmEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrFirstName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrFirstName = (String)value;
      }
    });
    setters.put("fstrFamilyName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrFamilyName = (String)value;
      }
    });
    setters.put("fstrMiddleName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrMiddleName = (String)value;
      }
    });
    setters.put("fstrTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrTitle = (String)value;
      }
    });
    setters.put("fstrStreet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrStreet = (String)value;
      }
    });
    setters.put("fstrStreet2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrStreet2 = (String)value;
      }
    });
    setters.put("fstrUnit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrUnit = (String)value;
      }
    });
    setters.put("fstrUnitType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrUnitType = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrCounty", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrCounty = (String)value;
      }
    });
    setters.put("fstrState", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrState = (String)value;
      }
    });
    setters.put("fstrZip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrZip = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrCountry = (String)value;
      }
    });
    setters.put("fstrAttention", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrAttention = (String)value;
      }
    });
    setters.put("fstrLocationCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrLocationCode = (String)value;
      }
    });
    setters.put("fstrUrbanization", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrUrbanization = (String)value;
      }
    });
    setters.put("fstrRowId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrRowId = (String)value;
      }
    });
    setters.put("fstrMunicipality", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrMunicipality = (String)value;
      }
    });
    setters.put("fstrDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrDistrict = (String)value;
      }
    });
    setters.put("fstrSubDistrict", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrSubDistrict = (String)value;
      }
    });
    setters.put("fstrSubProvince", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrSubProvince = (String)value;
      }
    });
    setters.put("fstrAddressDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrAddressDescription = (String)value;
      }
    });
    setters.put("fblnVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fblnVerified = (Integer)value;
      }
    });
    setters.put("fdtmVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fdtmVerified = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPhoneType1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrPhoneType1 = (String)value;
      }
    });
    setters.put("fintCountryCode1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fintCountryCode1 = (Integer)value;
      }
    });
    setters.put("fstrCountry1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrCountry1 = (String)value;
      }
    });
    setters.put("fstrAreaCode1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrAreaCode1 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrPhoneNumber1 = (String)value;
      }
    });
    setters.put("fstrExtension1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrExtension1 = (String)value;
      }
    });
    setters.put("fstrPhoneType2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrPhoneType2 = (String)value;
      }
    });
    setters.put("fintCountryCode2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fintCountryCode2 = (Integer)value;
      }
    });
    setters.put("fstrCountry2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrCountry2 = (String)value;
      }
    });
    setters.put("fstrAreaCode2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrAreaCode2 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrPhoneNumber2 = (String)value;
      }
    });
    setters.put("fstrExtension2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrExtension2 = (String)value;
      }
    });
    setters.put("fstrPhoneType3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrPhoneType3 = (String)value;
      }
    });
    setters.put("fintCountryCode3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fintCountryCode3 = (Integer)value;
      }
    });
    setters.put("fstrCountry3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrCountry3 = (String)value;
      }
    });
    setters.put("fstrAreaCode3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrAreaCode3 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrPhoneNumber3 = (String)value;
      }
    });
    setters.put("fstrExtension3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrExtension3 = (String)value;
      }
    });
    setters.put("fstrPhoneType4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrPhoneType4 = (String)value;
      }
    });
    setters.put("fintCountryCode4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fintCountryCode4 = (Integer)value;
      }
    });
    setters.put("fstrCountry4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrCountry4 = (String)value;
      }
    });
    setters.put("fstrAreaCode4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrAreaCode4 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrPhoneNumber4 = (String)value;
      }
    });
    setters.put("fstrExtension4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrExtension4 = (String)value;
      }
    });
    setters.put("fstrEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrEmail = (String)value;
      }
    });
    setters.put("fstrLOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrLOB = (String)value;
      }
    });
    setters.put("fstrSBU", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrSBU = (String)value;
      }
    });
    setters.put("fstrRegion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrRegion = (String)value;
      }
    });
    setters.put("fstrDistrictOffice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrDistrictOffice = (String)value;
      }
    });
    setters.put("fstrResLocation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrResLocation = (String)value;
      }
    });
    setters.put("fstrDeskLocation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrDeskLocation = (String)value;
      }
    });
    setters.put("fstrAliasName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrAliasName = (String)value;
      }
    });
    setters.put("fstrNetworkId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrNetworkId = (String)value;
      }
    });
    setters.put("fstrManager", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrManager = (String)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fblnProduction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fblnProduction = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tbluserinfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tbluserinfo() {
    init0();
  }
  private String fstrUser;
  public String get_fstrUser() {
    return fstrUser;
  }
  public void set_fstrUser(String fstrUser) {
    this.fstrUser = fstrUser;
  }
  public tbluserinfo with_fstrUser(String fstrUser) {
    this.fstrUser = fstrUser;
    return this;
  }
  private String fstrType;
  public String get_fstrType() {
    return fstrType;
  }
  public void set_fstrType(String fstrType) {
    this.fstrType = fstrType;
  }
  public tbluserinfo with_fstrType(String fstrType) {
    this.fstrType = fstrType;
    return this;
  }
  private java.sql.Timestamp fdtmStart;
  public java.sql.Timestamp get_fdtmStart() {
    return fdtmStart;
  }
  public void set_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
  }
  public tbluserinfo with_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
    return this;
  }
  private java.sql.Timestamp fdtmEnd;
  public java.sql.Timestamp get_fdtmEnd() {
    return fdtmEnd;
  }
  public void set_fdtmEnd(java.sql.Timestamp fdtmEnd) {
    this.fdtmEnd = fdtmEnd;
  }
  public tbluserinfo with_fdtmEnd(java.sql.Timestamp fdtmEnd) {
    this.fdtmEnd = fdtmEnd;
    return this;
  }
  private String fstrFirstName;
  public String get_fstrFirstName() {
    return fstrFirstName;
  }
  public void set_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
  }
  public tbluserinfo with_fstrFirstName(String fstrFirstName) {
    this.fstrFirstName = fstrFirstName;
    return this;
  }
  private String fstrFamilyName;
  public String get_fstrFamilyName() {
    return fstrFamilyName;
  }
  public void set_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
  }
  public tbluserinfo with_fstrFamilyName(String fstrFamilyName) {
    this.fstrFamilyName = fstrFamilyName;
    return this;
  }
  private String fstrMiddleName;
  public String get_fstrMiddleName() {
    return fstrMiddleName;
  }
  public void set_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
  }
  public tbluserinfo with_fstrMiddleName(String fstrMiddleName) {
    this.fstrMiddleName = fstrMiddleName;
    return this;
  }
  private String fstrTitle;
  public String get_fstrTitle() {
    return fstrTitle;
  }
  public void set_fstrTitle(String fstrTitle) {
    this.fstrTitle = fstrTitle;
  }
  public tbluserinfo with_fstrTitle(String fstrTitle) {
    this.fstrTitle = fstrTitle;
    return this;
  }
  private String fstrStreet;
  public String get_fstrStreet() {
    return fstrStreet;
  }
  public void set_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
  }
  public tbluserinfo with_fstrStreet(String fstrStreet) {
    this.fstrStreet = fstrStreet;
    return this;
  }
  private String fstrStreet2;
  public String get_fstrStreet2() {
    return fstrStreet2;
  }
  public void set_fstrStreet2(String fstrStreet2) {
    this.fstrStreet2 = fstrStreet2;
  }
  public tbluserinfo with_fstrStreet2(String fstrStreet2) {
    this.fstrStreet2 = fstrStreet2;
    return this;
  }
  private String fstrUnit;
  public String get_fstrUnit() {
    return fstrUnit;
  }
  public void set_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
  }
  public tbluserinfo with_fstrUnit(String fstrUnit) {
    this.fstrUnit = fstrUnit;
    return this;
  }
  private String fstrUnitType;
  public String get_fstrUnitType() {
    return fstrUnitType;
  }
  public void set_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
  }
  public tbluserinfo with_fstrUnitType(String fstrUnitType) {
    this.fstrUnitType = fstrUnitType;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tbluserinfo with_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
    return this;
  }
  private String fstrCounty;
  public String get_fstrCounty() {
    return fstrCounty;
  }
  public void set_fstrCounty(String fstrCounty) {
    this.fstrCounty = fstrCounty;
  }
  public tbluserinfo with_fstrCounty(String fstrCounty) {
    this.fstrCounty = fstrCounty;
    return this;
  }
  private String fstrState;
  public String get_fstrState() {
    return fstrState;
  }
  public void set_fstrState(String fstrState) {
    this.fstrState = fstrState;
  }
  public tbluserinfo with_fstrState(String fstrState) {
    this.fstrState = fstrState;
    return this;
  }
  private String fstrZip;
  public String get_fstrZip() {
    return fstrZip;
  }
  public void set_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
  }
  public tbluserinfo with_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
    return this;
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public tbluserinfo with_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
    return this;
  }
  private String fstrAttention;
  public String get_fstrAttention() {
    return fstrAttention;
  }
  public void set_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
  }
  public tbluserinfo with_fstrAttention(String fstrAttention) {
    this.fstrAttention = fstrAttention;
    return this;
  }
  private String fstrLocationCode;
  public String get_fstrLocationCode() {
    return fstrLocationCode;
  }
  public void set_fstrLocationCode(String fstrLocationCode) {
    this.fstrLocationCode = fstrLocationCode;
  }
  public tbluserinfo with_fstrLocationCode(String fstrLocationCode) {
    this.fstrLocationCode = fstrLocationCode;
    return this;
  }
  private String fstrUrbanization;
  public String get_fstrUrbanization() {
    return fstrUrbanization;
  }
  public void set_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
  }
  public tbluserinfo with_fstrUrbanization(String fstrUrbanization) {
    this.fstrUrbanization = fstrUrbanization;
    return this;
  }
  private String fstrRowId;
  public String get_fstrRowId() {
    return fstrRowId;
  }
  public void set_fstrRowId(String fstrRowId) {
    this.fstrRowId = fstrRowId;
  }
  public tbluserinfo with_fstrRowId(String fstrRowId) {
    this.fstrRowId = fstrRowId;
    return this;
  }
  private String fstrMunicipality;
  public String get_fstrMunicipality() {
    return fstrMunicipality;
  }
  public void set_fstrMunicipality(String fstrMunicipality) {
    this.fstrMunicipality = fstrMunicipality;
  }
  public tbluserinfo with_fstrMunicipality(String fstrMunicipality) {
    this.fstrMunicipality = fstrMunicipality;
    return this;
  }
  private String fstrDistrict;
  public String get_fstrDistrict() {
    return fstrDistrict;
  }
  public void set_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
  }
  public tbluserinfo with_fstrDistrict(String fstrDistrict) {
    this.fstrDistrict = fstrDistrict;
    return this;
  }
  private String fstrSubDistrict;
  public String get_fstrSubDistrict() {
    return fstrSubDistrict;
  }
  public void set_fstrSubDistrict(String fstrSubDistrict) {
    this.fstrSubDistrict = fstrSubDistrict;
  }
  public tbluserinfo with_fstrSubDistrict(String fstrSubDistrict) {
    this.fstrSubDistrict = fstrSubDistrict;
    return this;
  }
  private String fstrSubProvince;
  public String get_fstrSubProvince() {
    return fstrSubProvince;
  }
  public void set_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
  }
  public tbluserinfo with_fstrSubProvince(String fstrSubProvince) {
    this.fstrSubProvince = fstrSubProvince;
    return this;
  }
  private String fstrAddressDescription;
  public String get_fstrAddressDescription() {
    return fstrAddressDescription;
  }
  public void set_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
  }
  public tbluserinfo with_fstrAddressDescription(String fstrAddressDescription) {
    this.fstrAddressDescription = fstrAddressDescription;
    return this;
  }
  private Integer fblnVerified;
  public Integer get_fblnVerified() {
    return fblnVerified;
  }
  public void set_fblnVerified(Integer fblnVerified) {
    this.fblnVerified = fblnVerified;
  }
  public tbluserinfo with_fblnVerified(Integer fblnVerified) {
    this.fblnVerified = fblnVerified;
    return this;
  }
  private java.sql.Timestamp fdtmVerified;
  public java.sql.Timestamp get_fdtmVerified() {
    return fdtmVerified;
  }
  public void set_fdtmVerified(java.sql.Timestamp fdtmVerified) {
    this.fdtmVerified = fdtmVerified;
  }
  public tbluserinfo with_fdtmVerified(java.sql.Timestamp fdtmVerified) {
    this.fdtmVerified = fdtmVerified;
    return this;
  }
  private String fstrPhoneType1;
  public String get_fstrPhoneType1() {
    return fstrPhoneType1;
  }
  public void set_fstrPhoneType1(String fstrPhoneType1) {
    this.fstrPhoneType1 = fstrPhoneType1;
  }
  public tbluserinfo with_fstrPhoneType1(String fstrPhoneType1) {
    this.fstrPhoneType1 = fstrPhoneType1;
    return this;
  }
  private Integer fintCountryCode1;
  public Integer get_fintCountryCode1() {
    return fintCountryCode1;
  }
  public void set_fintCountryCode1(Integer fintCountryCode1) {
    this.fintCountryCode1 = fintCountryCode1;
  }
  public tbluserinfo with_fintCountryCode1(Integer fintCountryCode1) {
    this.fintCountryCode1 = fintCountryCode1;
    return this;
  }
  private String fstrCountry1;
  public String get_fstrCountry1() {
    return fstrCountry1;
  }
  public void set_fstrCountry1(String fstrCountry1) {
    this.fstrCountry1 = fstrCountry1;
  }
  public tbluserinfo with_fstrCountry1(String fstrCountry1) {
    this.fstrCountry1 = fstrCountry1;
    return this;
  }
  private String fstrAreaCode1;
  public String get_fstrAreaCode1() {
    return fstrAreaCode1;
  }
  public void set_fstrAreaCode1(String fstrAreaCode1) {
    this.fstrAreaCode1 = fstrAreaCode1;
  }
  public tbluserinfo with_fstrAreaCode1(String fstrAreaCode1) {
    this.fstrAreaCode1 = fstrAreaCode1;
    return this;
  }
  private String fstrPhoneNumber1;
  public String get_fstrPhoneNumber1() {
    return fstrPhoneNumber1;
  }
  public void set_fstrPhoneNumber1(String fstrPhoneNumber1) {
    this.fstrPhoneNumber1 = fstrPhoneNumber1;
  }
  public tbluserinfo with_fstrPhoneNumber1(String fstrPhoneNumber1) {
    this.fstrPhoneNumber1 = fstrPhoneNumber1;
    return this;
  }
  private String fstrExtension1;
  public String get_fstrExtension1() {
    return fstrExtension1;
  }
  public void set_fstrExtension1(String fstrExtension1) {
    this.fstrExtension1 = fstrExtension1;
  }
  public tbluserinfo with_fstrExtension1(String fstrExtension1) {
    this.fstrExtension1 = fstrExtension1;
    return this;
  }
  private String fstrPhoneType2;
  public String get_fstrPhoneType2() {
    return fstrPhoneType2;
  }
  public void set_fstrPhoneType2(String fstrPhoneType2) {
    this.fstrPhoneType2 = fstrPhoneType2;
  }
  public tbluserinfo with_fstrPhoneType2(String fstrPhoneType2) {
    this.fstrPhoneType2 = fstrPhoneType2;
    return this;
  }
  private Integer fintCountryCode2;
  public Integer get_fintCountryCode2() {
    return fintCountryCode2;
  }
  public void set_fintCountryCode2(Integer fintCountryCode2) {
    this.fintCountryCode2 = fintCountryCode2;
  }
  public tbluserinfo with_fintCountryCode2(Integer fintCountryCode2) {
    this.fintCountryCode2 = fintCountryCode2;
    return this;
  }
  private String fstrCountry2;
  public String get_fstrCountry2() {
    return fstrCountry2;
  }
  public void set_fstrCountry2(String fstrCountry2) {
    this.fstrCountry2 = fstrCountry2;
  }
  public tbluserinfo with_fstrCountry2(String fstrCountry2) {
    this.fstrCountry2 = fstrCountry2;
    return this;
  }
  private String fstrAreaCode2;
  public String get_fstrAreaCode2() {
    return fstrAreaCode2;
  }
  public void set_fstrAreaCode2(String fstrAreaCode2) {
    this.fstrAreaCode2 = fstrAreaCode2;
  }
  public tbluserinfo with_fstrAreaCode2(String fstrAreaCode2) {
    this.fstrAreaCode2 = fstrAreaCode2;
    return this;
  }
  private String fstrPhoneNumber2;
  public String get_fstrPhoneNumber2() {
    return fstrPhoneNumber2;
  }
  public void set_fstrPhoneNumber2(String fstrPhoneNumber2) {
    this.fstrPhoneNumber2 = fstrPhoneNumber2;
  }
  public tbluserinfo with_fstrPhoneNumber2(String fstrPhoneNumber2) {
    this.fstrPhoneNumber2 = fstrPhoneNumber2;
    return this;
  }
  private String fstrExtension2;
  public String get_fstrExtension2() {
    return fstrExtension2;
  }
  public void set_fstrExtension2(String fstrExtension2) {
    this.fstrExtension2 = fstrExtension2;
  }
  public tbluserinfo with_fstrExtension2(String fstrExtension2) {
    this.fstrExtension2 = fstrExtension2;
    return this;
  }
  private String fstrPhoneType3;
  public String get_fstrPhoneType3() {
    return fstrPhoneType3;
  }
  public void set_fstrPhoneType3(String fstrPhoneType3) {
    this.fstrPhoneType3 = fstrPhoneType3;
  }
  public tbluserinfo with_fstrPhoneType3(String fstrPhoneType3) {
    this.fstrPhoneType3 = fstrPhoneType3;
    return this;
  }
  private Integer fintCountryCode3;
  public Integer get_fintCountryCode3() {
    return fintCountryCode3;
  }
  public void set_fintCountryCode3(Integer fintCountryCode3) {
    this.fintCountryCode3 = fintCountryCode3;
  }
  public tbluserinfo with_fintCountryCode3(Integer fintCountryCode3) {
    this.fintCountryCode3 = fintCountryCode3;
    return this;
  }
  private String fstrCountry3;
  public String get_fstrCountry3() {
    return fstrCountry3;
  }
  public void set_fstrCountry3(String fstrCountry3) {
    this.fstrCountry3 = fstrCountry3;
  }
  public tbluserinfo with_fstrCountry3(String fstrCountry3) {
    this.fstrCountry3 = fstrCountry3;
    return this;
  }
  private String fstrAreaCode3;
  public String get_fstrAreaCode3() {
    return fstrAreaCode3;
  }
  public void set_fstrAreaCode3(String fstrAreaCode3) {
    this.fstrAreaCode3 = fstrAreaCode3;
  }
  public tbluserinfo with_fstrAreaCode3(String fstrAreaCode3) {
    this.fstrAreaCode3 = fstrAreaCode3;
    return this;
  }
  private String fstrPhoneNumber3;
  public String get_fstrPhoneNumber3() {
    return fstrPhoneNumber3;
  }
  public void set_fstrPhoneNumber3(String fstrPhoneNumber3) {
    this.fstrPhoneNumber3 = fstrPhoneNumber3;
  }
  public tbluserinfo with_fstrPhoneNumber3(String fstrPhoneNumber3) {
    this.fstrPhoneNumber3 = fstrPhoneNumber3;
    return this;
  }
  private String fstrExtension3;
  public String get_fstrExtension3() {
    return fstrExtension3;
  }
  public void set_fstrExtension3(String fstrExtension3) {
    this.fstrExtension3 = fstrExtension3;
  }
  public tbluserinfo with_fstrExtension3(String fstrExtension3) {
    this.fstrExtension3 = fstrExtension3;
    return this;
  }
  private String fstrPhoneType4;
  public String get_fstrPhoneType4() {
    return fstrPhoneType4;
  }
  public void set_fstrPhoneType4(String fstrPhoneType4) {
    this.fstrPhoneType4 = fstrPhoneType4;
  }
  public tbluserinfo with_fstrPhoneType4(String fstrPhoneType4) {
    this.fstrPhoneType4 = fstrPhoneType4;
    return this;
  }
  private Integer fintCountryCode4;
  public Integer get_fintCountryCode4() {
    return fintCountryCode4;
  }
  public void set_fintCountryCode4(Integer fintCountryCode4) {
    this.fintCountryCode4 = fintCountryCode4;
  }
  public tbluserinfo with_fintCountryCode4(Integer fintCountryCode4) {
    this.fintCountryCode4 = fintCountryCode4;
    return this;
  }
  private String fstrCountry4;
  public String get_fstrCountry4() {
    return fstrCountry4;
  }
  public void set_fstrCountry4(String fstrCountry4) {
    this.fstrCountry4 = fstrCountry4;
  }
  public tbluserinfo with_fstrCountry4(String fstrCountry4) {
    this.fstrCountry4 = fstrCountry4;
    return this;
  }
  private String fstrAreaCode4;
  public String get_fstrAreaCode4() {
    return fstrAreaCode4;
  }
  public void set_fstrAreaCode4(String fstrAreaCode4) {
    this.fstrAreaCode4 = fstrAreaCode4;
  }
  public tbluserinfo with_fstrAreaCode4(String fstrAreaCode4) {
    this.fstrAreaCode4 = fstrAreaCode4;
    return this;
  }
  private String fstrPhoneNumber4;
  public String get_fstrPhoneNumber4() {
    return fstrPhoneNumber4;
  }
  public void set_fstrPhoneNumber4(String fstrPhoneNumber4) {
    this.fstrPhoneNumber4 = fstrPhoneNumber4;
  }
  public tbluserinfo with_fstrPhoneNumber4(String fstrPhoneNumber4) {
    this.fstrPhoneNumber4 = fstrPhoneNumber4;
    return this;
  }
  private String fstrExtension4;
  public String get_fstrExtension4() {
    return fstrExtension4;
  }
  public void set_fstrExtension4(String fstrExtension4) {
    this.fstrExtension4 = fstrExtension4;
  }
  public tbluserinfo with_fstrExtension4(String fstrExtension4) {
    this.fstrExtension4 = fstrExtension4;
    return this;
  }
  private String fstrEmail;
  public String get_fstrEmail() {
    return fstrEmail;
  }
  public void set_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
  }
  public tbluserinfo with_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
    return this;
  }
  private String fstrLOB;
  public String get_fstrLOB() {
    return fstrLOB;
  }
  public void set_fstrLOB(String fstrLOB) {
    this.fstrLOB = fstrLOB;
  }
  public tbluserinfo with_fstrLOB(String fstrLOB) {
    this.fstrLOB = fstrLOB;
    return this;
  }
  private String fstrSBU;
  public String get_fstrSBU() {
    return fstrSBU;
  }
  public void set_fstrSBU(String fstrSBU) {
    this.fstrSBU = fstrSBU;
  }
  public tbluserinfo with_fstrSBU(String fstrSBU) {
    this.fstrSBU = fstrSBU;
    return this;
  }
  private String fstrRegion;
  public String get_fstrRegion() {
    return fstrRegion;
  }
  public void set_fstrRegion(String fstrRegion) {
    this.fstrRegion = fstrRegion;
  }
  public tbluserinfo with_fstrRegion(String fstrRegion) {
    this.fstrRegion = fstrRegion;
    return this;
  }
  private String fstrDistrictOffice;
  public String get_fstrDistrictOffice() {
    return fstrDistrictOffice;
  }
  public void set_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
  }
  public tbluserinfo with_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
    return this;
  }
  private String fstrResLocation;
  public String get_fstrResLocation() {
    return fstrResLocation;
  }
  public void set_fstrResLocation(String fstrResLocation) {
    this.fstrResLocation = fstrResLocation;
  }
  public tbluserinfo with_fstrResLocation(String fstrResLocation) {
    this.fstrResLocation = fstrResLocation;
    return this;
  }
  private String fstrDeskLocation;
  public String get_fstrDeskLocation() {
    return fstrDeskLocation;
  }
  public void set_fstrDeskLocation(String fstrDeskLocation) {
    this.fstrDeskLocation = fstrDeskLocation;
  }
  public tbluserinfo with_fstrDeskLocation(String fstrDeskLocation) {
    this.fstrDeskLocation = fstrDeskLocation;
    return this;
  }
  private String fstrAliasName;
  public String get_fstrAliasName() {
    return fstrAliasName;
  }
  public void set_fstrAliasName(String fstrAliasName) {
    this.fstrAliasName = fstrAliasName;
  }
  public tbluserinfo with_fstrAliasName(String fstrAliasName) {
    this.fstrAliasName = fstrAliasName;
    return this;
  }
  private String fstrNetworkId;
  public String get_fstrNetworkId() {
    return fstrNetworkId;
  }
  public void set_fstrNetworkId(String fstrNetworkId) {
    this.fstrNetworkId = fstrNetworkId;
  }
  public tbluserinfo with_fstrNetworkId(String fstrNetworkId) {
    this.fstrNetworkId = fstrNetworkId;
    return this;
  }
  private String fstrManager;
  public String get_fstrManager() {
    return fstrManager;
  }
  public void set_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
  }
  public tbluserinfo with_fstrManager(String fstrManager) {
    this.fstrManager = fstrManager;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tbluserinfo with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer fblnProduction;
  public Integer get_fblnProduction() {
    return fblnProduction;
  }
  public void set_fblnProduction(Integer fblnProduction) {
    this.fblnProduction = fblnProduction;
  }
  public tbluserinfo with_fblnProduction(Integer fblnProduction) {
    this.fblnProduction = fblnProduction;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tbluserinfo with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tbluserinfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbluserinfo)) {
      return false;
    }
    tbluserinfo that = (tbluserinfo) o;
    boolean equal = true;
    equal = equal && (this.fstrUser == null ? that.fstrUser == null : this.fstrUser.equals(that.fstrUser));
    equal = equal && (this.fstrType == null ? that.fstrType == null : this.fstrType.equals(that.fstrType));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmEnd == null ? that.fdtmEnd == null : this.fdtmEnd.equals(that.fdtmEnd));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrTitle == null ? that.fstrTitle == null : this.fstrTitle.equals(that.fstrTitle));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrStreet2 == null ? that.fstrStreet2 == null : this.fstrStreet2.equals(that.fstrStreet2));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrLocationCode == null ? that.fstrLocationCode == null : this.fstrLocationCode.equals(that.fstrLocationCode));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fstrRowId == null ? that.fstrRowId == null : this.fstrRowId.equals(that.fstrRowId));
    equal = equal && (this.fstrMunicipality == null ? that.fstrMunicipality == null : this.fstrMunicipality.equals(that.fstrMunicipality));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fblnVerified == null ? that.fblnVerified == null : this.fblnVerified.equals(that.fblnVerified));
    equal = equal && (this.fdtmVerified == null ? that.fdtmVerified == null : this.fdtmVerified.equals(that.fdtmVerified));
    equal = equal && (this.fstrPhoneType1 == null ? that.fstrPhoneType1 == null : this.fstrPhoneType1.equals(that.fstrPhoneType1));
    equal = equal && (this.fintCountryCode1 == null ? that.fintCountryCode1 == null : this.fintCountryCode1.equals(that.fintCountryCode1));
    equal = equal && (this.fstrCountry1 == null ? that.fstrCountry1 == null : this.fstrCountry1.equals(that.fstrCountry1));
    equal = equal && (this.fstrAreaCode1 == null ? that.fstrAreaCode1 == null : this.fstrAreaCode1.equals(that.fstrAreaCode1));
    equal = equal && (this.fstrPhoneNumber1 == null ? that.fstrPhoneNumber1 == null : this.fstrPhoneNumber1.equals(that.fstrPhoneNumber1));
    equal = equal && (this.fstrExtension1 == null ? that.fstrExtension1 == null : this.fstrExtension1.equals(that.fstrExtension1));
    equal = equal && (this.fstrPhoneType2 == null ? that.fstrPhoneType2 == null : this.fstrPhoneType2.equals(that.fstrPhoneType2));
    equal = equal && (this.fintCountryCode2 == null ? that.fintCountryCode2 == null : this.fintCountryCode2.equals(that.fintCountryCode2));
    equal = equal && (this.fstrCountry2 == null ? that.fstrCountry2 == null : this.fstrCountry2.equals(that.fstrCountry2));
    equal = equal && (this.fstrAreaCode2 == null ? that.fstrAreaCode2 == null : this.fstrAreaCode2.equals(that.fstrAreaCode2));
    equal = equal && (this.fstrPhoneNumber2 == null ? that.fstrPhoneNumber2 == null : this.fstrPhoneNumber2.equals(that.fstrPhoneNumber2));
    equal = equal && (this.fstrExtension2 == null ? that.fstrExtension2 == null : this.fstrExtension2.equals(that.fstrExtension2));
    equal = equal && (this.fstrPhoneType3 == null ? that.fstrPhoneType3 == null : this.fstrPhoneType3.equals(that.fstrPhoneType3));
    equal = equal && (this.fintCountryCode3 == null ? that.fintCountryCode3 == null : this.fintCountryCode3.equals(that.fintCountryCode3));
    equal = equal && (this.fstrCountry3 == null ? that.fstrCountry3 == null : this.fstrCountry3.equals(that.fstrCountry3));
    equal = equal && (this.fstrAreaCode3 == null ? that.fstrAreaCode3 == null : this.fstrAreaCode3.equals(that.fstrAreaCode3));
    equal = equal && (this.fstrPhoneNumber3 == null ? that.fstrPhoneNumber3 == null : this.fstrPhoneNumber3.equals(that.fstrPhoneNumber3));
    equal = equal && (this.fstrExtension3 == null ? that.fstrExtension3 == null : this.fstrExtension3.equals(that.fstrExtension3));
    equal = equal && (this.fstrPhoneType4 == null ? that.fstrPhoneType4 == null : this.fstrPhoneType4.equals(that.fstrPhoneType4));
    equal = equal && (this.fintCountryCode4 == null ? that.fintCountryCode4 == null : this.fintCountryCode4.equals(that.fintCountryCode4));
    equal = equal && (this.fstrCountry4 == null ? that.fstrCountry4 == null : this.fstrCountry4.equals(that.fstrCountry4));
    equal = equal && (this.fstrAreaCode4 == null ? that.fstrAreaCode4 == null : this.fstrAreaCode4.equals(that.fstrAreaCode4));
    equal = equal && (this.fstrPhoneNumber4 == null ? that.fstrPhoneNumber4 == null : this.fstrPhoneNumber4.equals(that.fstrPhoneNumber4));
    equal = equal && (this.fstrExtension4 == null ? that.fstrExtension4 == null : this.fstrExtension4.equals(that.fstrExtension4));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrLOB == null ? that.fstrLOB == null : this.fstrLOB.equals(that.fstrLOB));
    equal = equal && (this.fstrSBU == null ? that.fstrSBU == null : this.fstrSBU.equals(that.fstrSBU));
    equal = equal && (this.fstrRegion == null ? that.fstrRegion == null : this.fstrRegion.equals(that.fstrRegion));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrResLocation == null ? that.fstrResLocation == null : this.fstrResLocation.equals(that.fstrResLocation));
    equal = equal && (this.fstrDeskLocation == null ? that.fstrDeskLocation == null : this.fstrDeskLocation.equals(that.fstrDeskLocation));
    equal = equal && (this.fstrAliasName == null ? that.fstrAliasName == null : this.fstrAliasName.equals(that.fstrAliasName));
    equal = equal && (this.fstrNetworkId == null ? that.fstrNetworkId == null : this.fstrNetworkId.equals(that.fstrNetworkId));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fblnProduction == null ? that.fblnProduction == null : this.fblnProduction.equals(that.fblnProduction));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tbluserinfo)) {
      return false;
    }
    tbluserinfo that = (tbluserinfo) o;
    boolean equal = true;
    equal = equal && (this.fstrUser == null ? that.fstrUser == null : this.fstrUser.equals(that.fstrUser));
    equal = equal && (this.fstrType == null ? that.fstrType == null : this.fstrType.equals(that.fstrType));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmEnd == null ? that.fdtmEnd == null : this.fdtmEnd.equals(that.fdtmEnd));
    equal = equal && (this.fstrFirstName == null ? that.fstrFirstName == null : this.fstrFirstName.equals(that.fstrFirstName));
    equal = equal && (this.fstrFamilyName == null ? that.fstrFamilyName == null : this.fstrFamilyName.equals(that.fstrFamilyName));
    equal = equal && (this.fstrMiddleName == null ? that.fstrMiddleName == null : this.fstrMiddleName.equals(that.fstrMiddleName));
    equal = equal && (this.fstrTitle == null ? that.fstrTitle == null : this.fstrTitle.equals(that.fstrTitle));
    equal = equal && (this.fstrStreet == null ? that.fstrStreet == null : this.fstrStreet.equals(that.fstrStreet));
    equal = equal && (this.fstrStreet2 == null ? that.fstrStreet2 == null : this.fstrStreet2.equals(that.fstrStreet2));
    equal = equal && (this.fstrUnit == null ? that.fstrUnit == null : this.fstrUnit.equals(that.fstrUnit));
    equal = equal && (this.fstrUnitType == null ? that.fstrUnitType == null : this.fstrUnitType.equals(that.fstrUnitType));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCounty == null ? that.fstrCounty == null : this.fstrCounty.equals(that.fstrCounty));
    equal = equal && (this.fstrState == null ? that.fstrState == null : this.fstrState.equals(that.fstrState));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrAttention == null ? that.fstrAttention == null : this.fstrAttention.equals(that.fstrAttention));
    equal = equal && (this.fstrLocationCode == null ? that.fstrLocationCode == null : this.fstrLocationCode.equals(that.fstrLocationCode));
    equal = equal && (this.fstrUrbanization == null ? that.fstrUrbanization == null : this.fstrUrbanization.equals(that.fstrUrbanization));
    equal = equal && (this.fstrRowId == null ? that.fstrRowId == null : this.fstrRowId.equals(that.fstrRowId));
    equal = equal && (this.fstrMunicipality == null ? that.fstrMunicipality == null : this.fstrMunicipality.equals(that.fstrMunicipality));
    equal = equal && (this.fstrDistrict == null ? that.fstrDistrict == null : this.fstrDistrict.equals(that.fstrDistrict));
    equal = equal && (this.fstrSubDistrict == null ? that.fstrSubDistrict == null : this.fstrSubDistrict.equals(that.fstrSubDistrict));
    equal = equal && (this.fstrSubProvince == null ? that.fstrSubProvince == null : this.fstrSubProvince.equals(that.fstrSubProvince));
    equal = equal && (this.fstrAddressDescription == null ? that.fstrAddressDescription == null : this.fstrAddressDescription.equals(that.fstrAddressDescription));
    equal = equal && (this.fblnVerified == null ? that.fblnVerified == null : this.fblnVerified.equals(that.fblnVerified));
    equal = equal && (this.fdtmVerified == null ? that.fdtmVerified == null : this.fdtmVerified.equals(that.fdtmVerified));
    equal = equal && (this.fstrPhoneType1 == null ? that.fstrPhoneType1 == null : this.fstrPhoneType1.equals(that.fstrPhoneType1));
    equal = equal && (this.fintCountryCode1 == null ? that.fintCountryCode1 == null : this.fintCountryCode1.equals(that.fintCountryCode1));
    equal = equal && (this.fstrCountry1 == null ? that.fstrCountry1 == null : this.fstrCountry1.equals(that.fstrCountry1));
    equal = equal && (this.fstrAreaCode1 == null ? that.fstrAreaCode1 == null : this.fstrAreaCode1.equals(that.fstrAreaCode1));
    equal = equal && (this.fstrPhoneNumber1 == null ? that.fstrPhoneNumber1 == null : this.fstrPhoneNumber1.equals(that.fstrPhoneNumber1));
    equal = equal && (this.fstrExtension1 == null ? that.fstrExtension1 == null : this.fstrExtension1.equals(that.fstrExtension1));
    equal = equal && (this.fstrPhoneType2 == null ? that.fstrPhoneType2 == null : this.fstrPhoneType2.equals(that.fstrPhoneType2));
    equal = equal && (this.fintCountryCode2 == null ? that.fintCountryCode2 == null : this.fintCountryCode2.equals(that.fintCountryCode2));
    equal = equal && (this.fstrCountry2 == null ? that.fstrCountry2 == null : this.fstrCountry2.equals(that.fstrCountry2));
    equal = equal && (this.fstrAreaCode2 == null ? that.fstrAreaCode2 == null : this.fstrAreaCode2.equals(that.fstrAreaCode2));
    equal = equal && (this.fstrPhoneNumber2 == null ? that.fstrPhoneNumber2 == null : this.fstrPhoneNumber2.equals(that.fstrPhoneNumber2));
    equal = equal && (this.fstrExtension2 == null ? that.fstrExtension2 == null : this.fstrExtension2.equals(that.fstrExtension2));
    equal = equal && (this.fstrPhoneType3 == null ? that.fstrPhoneType3 == null : this.fstrPhoneType3.equals(that.fstrPhoneType3));
    equal = equal && (this.fintCountryCode3 == null ? that.fintCountryCode3 == null : this.fintCountryCode3.equals(that.fintCountryCode3));
    equal = equal && (this.fstrCountry3 == null ? that.fstrCountry3 == null : this.fstrCountry3.equals(that.fstrCountry3));
    equal = equal && (this.fstrAreaCode3 == null ? that.fstrAreaCode3 == null : this.fstrAreaCode3.equals(that.fstrAreaCode3));
    equal = equal && (this.fstrPhoneNumber3 == null ? that.fstrPhoneNumber3 == null : this.fstrPhoneNumber3.equals(that.fstrPhoneNumber3));
    equal = equal && (this.fstrExtension3 == null ? that.fstrExtension3 == null : this.fstrExtension3.equals(that.fstrExtension3));
    equal = equal && (this.fstrPhoneType4 == null ? that.fstrPhoneType4 == null : this.fstrPhoneType4.equals(that.fstrPhoneType4));
    equal = equal && (this.fintCountryCode4 == null ? that.fintCountryCode4 == null : this.fintCountryCode4.equals(that.fintCountryCode4));
    equal = equal && (this.fstrCountry4 == null ? that.fstrCountry4 == null : this.fstrCountry4.equals(that.fstrCountry4));
    equal = equal && (this.fstrAreaCode4 == null ? that.fstrAreaCode4 == null : this.fstrAreaCode4.equals(that.fstrAreaCode4));
    equal = equal && (this.fstrPhoneNumber4 == null ? that.fstrPhoneNumber4 == null : this.fstrPhoneNumber4.equals(that.fstrPhoneNumber4));
    equal = equal && (this.fstrExtension4 == null ? that.fstrExtension4 == null : this.fstrExtension4.equals(that.fstrExtension4));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrLOB == null ? that.fstrLOB == null : this.fstrLOB.equals(that.fstrLOB));
    equal = equal && (this.fstrSBU == null ? that.fstrSBU == null : this.fstrSBU.equals(that.fstrSBU));
    equal = equal && (this.fstrRegion == null ? that.fstrRegion == null : this.fstrRegion.equals(that.fstrRegion));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fstrResLocation == null ? that.fstrResLocation == null : this.fstrResLocation.equals(that.fstrResLocation));
    equal = equal && (this.fstrDeskLocation == null ? that.fstrDeskLocation == null : this.fstrDeskLocation.equals(that.fstrDeskLocation));
    equal = equal && (this.fstrAliasName == null ? that.fstrAliasName == null : this.fstrAliasName.equals(that.fstrAliasName));
    equal = equal && (this.fstrNetworkId == null ? that.fstrNetworkId == null : this.fstrNetworkId.equals(that.fstrNetworkId));
    equal = equal && (this.fstrManager == null ? that.fstrManager == null : this.fstrManager.equals(that.fstrManager));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fblnProduction == null ? that.fblnProduction == null : this.fblnProduction.equals(that.fblnProduction));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fstrUser = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrType = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmEnd = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrTitle = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrRowId = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(26, __dbResults);
    this.fblnVerified = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fdtmVerified = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fstrPhoneType1 = JdbcWritableBridge.readString(29, __dbResults);
    this.fintCountryCode1 = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrCountry1 = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrAreaCode1 = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrPhoneNumber1 = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrExtension1 = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrPhoneType2 = JdbcWritableBridge.readString(35, __dbResults);
    this.fintCountryCode2 = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrCountry2 = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrAreaCode2 = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrPhoneNumber2 = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrExtension2 = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrPhoneType3 = JdbcWritableBridge.readString(41, __dbResults);
    this.fintCountryCode3 = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fstrCountry3 = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrAreaCode3 = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrPhoneNumber3 = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrExtension3 = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrPhoneType4 = JdbcWritableBridge.readString(47, __dbResults);
    this.fintCountryCode4 = JdbcWritableBridge.readInteger(48, __dbResults);
    this.fstrCountry4 = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrAreaCode4 = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrPhoneNumber4 = JdbcWritableBridge.readString(51, __dbResults);
    this.fstrExtension4 = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(53, __dbResults);
    this.fstrLOB = JdbcWritableBridge.readString(54, __dbResults);
    this.fstrSBU = JdbcWritableBridge.readString(55, __dbResults);
    this.fstrRegion = JdbcWritableBridge.readString(56, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(57, __dbResults);
    this.fstrResLocation = JdbcWritableBridge.readString(58, __dbResults);
    this.fstrDeskLocation = JdbcWritableBridge.readString(59, __dbResults);
    this.fstrAliasName = JdbcWritableBridge.readString(60, __dbResults);
    this.fstrNetworkId = JdbcWritableBridge.readString(61, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(62, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(63, __dbResults);
    this.fblnProduction = JdbcWritableBridge.readInteger(64, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(65, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(66, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fstrUser = JdbcWritableBridge.readString(1, __dbResults);
    this.fstrType = JdbcWritableBridge.readString(2, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.fdtmEnd = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrFirstName = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrFamilyName = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMiddleName = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrTitle = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrStreet = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrStreet2 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrUnit = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrUnitType = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrCounty = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrState = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrAttention = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrLocationCode = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrUrbanization = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrRowId = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrMunicipality = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrDistrict = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrSubDistrict = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrSubProvince = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrAddressDescription = JdbcWritableBridge.readString(26, __dbResults);
    this.fblnVerified = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fdtmVerified = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.fstrPhoneType1 = JdbcWritableBridge.readString(29, __dbResults);
    this.fintCountryCode1 = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrCountry1 = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrAreaCode1 = JdbcWritableBridge.readString(32, __dbResults);
    this.fstrPhoneNumber1 = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrExtension1 = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrPhoneType2 = JdbcWritableBridge.readString(35, __dbResults);
    this.fintCountryCode2 = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrCountry2 = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrAreaCode2 = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrPhoneNumber2 = JdbcWritableBridge.readString(39, __dbResults);
    this.fstrExtension2 = JdbcWritableBridge.readString(40, __dbResults);
    this.fstrPhoneType3 = JdbcWritableBridge.readString(41, __dbResults);
    this.fintCountryCode3 = JdbcWritableBridge.readInteger(42, __dbResults);
    this.fstrCountry3 = JdbcWritableBridge.readString(43, __dbResults);
    this.fstrAreaCode3 = JdbcWritableBridge.readString(44, __dbResults);
    this.fstrPhoneNumber3 = JdbcWritableBridge.readString(45, __dbResults);
    this.fstrExtension3 = JdbcWritableBridge.readString(46, __dbResults);
    this.fstrPhoneType4 = JdbcWritableBridge.readString(47, __dbResults);
    this.fintCountryCode4 = JdbcWritableBridge.readInteger(48, __dbResults);
    this.fstrCountry4 = JdbcWritableBridge.readString(49, __dbResults);
    this.fstrAreaCode4 = JdbcWritableBridge.readString(50, __dbResults);
    this.fstrPhoneNumber4 = JdbcWritableBridge.readString(51, __dbResults);
    this.fstrExtension4 = JdbcWritableBridge.readString(52, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(53, __dbResults);
    this.fstrLOB = JdbcWritableBridge.readString(54, __dbResults);
    this.fstrSBU = JdbcWritableBridge.readString(55, __dbResults);
    this.fstrRegion = JdbcWritableBridge.readString(56, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(57, __dbResults);
    this.fstrResLocation = JdbcWritableBridge.readString(58, __dbResults);
    this.fstrDeskLocation = JdbcWritableBridge.readString(59, __dbResults);
    this.fstrAliasName = JdbcWritableBridge.readString(60, __dbResults);
    this.fstrNetworkId = JdbcWritableBridge.readString(61, __dbResults);
    this.fstrManager = JdbcWritableBridge.readString(62, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(63, __dbResults);
    this.fblnProduction = JdbcWritableBridge.readInteger(64, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(65, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(66, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrUser, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnd, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitle, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRowId, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVerified, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVerified, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType1, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode1, 30 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry1, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode1, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber1, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension1, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType2, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode2, 36 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry2, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode2, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber2, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension2, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType3, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode3, 42 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry3, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode3, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber3, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension3, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType4, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode4, 48 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry4, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode4, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber4, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension4, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLOB, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSBU, 55 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegion, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 57 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResLocation, 58 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDeskLocation, 59 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAliasName, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNetworkId, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 62 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 63 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProduction, 64 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 65 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 66 + __off, 93, __dbStmt);
    return 66;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(fstrUser, 1 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrType, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEnd, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrFirstName, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrFamilyName, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMiddleName, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitle, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrStreet2, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnit, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUnitType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCounty, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrState, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAttention, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLocationCode, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrUrbanization, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRowId, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMunicipality, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrict, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubDistrict, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSubProvince, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressDescription, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVerified, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVerified, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType1, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode1, 30 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry1, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode1, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber1, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension1, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType2, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode2, 36 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry2, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode2, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber2, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension2, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType3, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode3, 42 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry3, 43 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode3, 44 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber3, 45 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension3, 46 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType4, 47 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode4, 48 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry4, 49 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode4, 50 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber4, 51 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension4, 52 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 53 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLOB, 54 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSBU, 55 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRegion, 56 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 57 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrResLocation, 58 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDeskLocation, 59 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAliasName, 60 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNetworkId, 61 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrManager, 62 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 63 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProduction, 64 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 65 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 66 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fstrUser = null;
    } else {
    this.fstrUser = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrType = null;
    } else {
    this.fstrType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStart = null;
    } else {
    this.fdtmStart = new Timestamp(__dataIn.readLong());
    this.fdtmStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEnd = null;
    } else {
    this.fdtmEnd = new Timestamp(__dataIn.readLong());
    this.fdtmEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFirstName = null;
    } else {
    this.fstrFirstName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFamilyName = null;
    } else {
    this.fstrFamilyName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMiddleName = null;
    } else {
    this.fstrMiddleName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTitle = null;
    } else {
    this.fstrTitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreet = null;
    } else {
    this.fstrStreet = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrStreet2 = null;
    } else {
    this.fstrStreet2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnit = null;
    } else {
    this.fstrUnit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUnitType = null;
    } else {
    this.fstrUnitType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCity = null;
    } else {
    this.fstrCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCounty = null;
    } else {
    this.fstrCounty = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrState = null;
    } else {
    this.fstrState = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrZip = null;
    } else {
    this.fstrZip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry = null;
    } else {
    this.fstrCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAttention = null;
    } else {
    this.fstrAttention = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLocationCode = null;
    } else {
    this.fstrLocationCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrUrbanization = null;
    } else {
    this.fstrUrbanization = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRowId = null;
    } else {
    this.fstrRowId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMunicipality = null;
    } else {
    this.fstrMunicipality = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrict = null;
    } else {
    this.fstrDistrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubDistrict = null;
    } else {
    this.fstrSubDistrict = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSubProvince = null;
    } else {
    this.fstrSubProvince = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressDescription = null;
    } else {
    this.fstrAddressDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnVerified = null;
    } else {
    this.fblnVerified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVerified = null;
    } else {
    this.fdtmVerified = new Timestamp(__dataIn.readLong());
    this.fdtmVerified.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType1 = null;
    } else {
    this.fstrPhoneType1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode1 = null;
    } else {
    this.fintCountryCode1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry1 = null;
    } else {
    this.fstrCountry1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode1 = null;
    } else {
    this.fstrAreaCode1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber1 = null;
    } else {
    this.fstrPhoneNumber1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension1 = null;
    } else {
    this.fstrExtension1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType2 = null;
    } else {
    this.fstrPhoneType2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode2 = null;
    } else {
    this.fintCountryCode2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry2 = null;
    } else {
    this.fstrCountry2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode2 = null;
    } else {
    this.fstrAreaCode2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber2 = null;
    } else {
    this.fstrPhoneNumber2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension2 = null;
    } else {
    this.fstrExtension2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType3 = null;
    } else {
    this.fstrPhoneType3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode3 = null;
    } else {
    this.fintCountryCode3 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry3 = null;
    } else {
    this.fstrCountry3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode3 = null;
    } else {
    this.fstrAreaCode3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber3 = null;
    } else {
    this.fstrPhoneNumber3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension3 = null;
    } else {
    this.fstrExtension3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType4 = null;
    } else {
    this.fstrPhoneType4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode4 = null;
    } else {
    this.fintCountryCode4 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry4 = null;
    } else {
    this.fstrCountry4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode4 = null;
    } else {
    this.fstrAreaCode4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber4 = null;
    } else {
    this.fstrPhoneNumber4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension4 = null;
    } else {
    this.fstrExtension4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmail = null;
    } else {
    this.fstrEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLOB = null;
    } else {
    this.fstrLOB = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSBU = null;
    } else {
    this.fstrSBU = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRegion = null;
    } else {
    this.fstrRegion = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrictOffice = null;
    } else {
    this.fstrDistrictOffice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrResLocation = null;
    } else {
    this.fstrResLocation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDeskLocation = null;
    } else {
    this.fstrDeskLocation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAliasName = null;
    } else {
    this.fstrAliasName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNetworkId = null;
    } else {
    this.fstrNetworkId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrManager = null;
    } else {
    this.fstrManager = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProduction = null;
    } else {
    this.fblnProduction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fstrUser) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUser);
    }
    if (null == this.fstrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrType);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnd.getTime());
    __dataOut.writeInt(this.fdtmEnd.getNanos());
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTitle);
    }
    if (null == this.fstrStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet);
    }
    if (null == this.fstrStreet2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet2);
    }
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrCounty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCounty);
    }
    if (null == this.fstrState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrState);
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrAttention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttention);
    }
    if (null == this.fstrLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCode);
    }
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fstrRowId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRowId);
    }
    if (null == this.fstrMunicipality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMunicipality);
    }
    if (null == this.fstrDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrict);
    }
    if (null == this.fstrSubDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubDistrict);
    }
    if (null == this.fstrSubProvince) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubProvince);
    }
    if (null == this.fstrAddressDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressDescription);
    }
    if (null == this.fblnVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVerified);
    }
    if (null == this.fdtmVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVerified.getTime());
    __dataOut.writeInt(this.fdtmVerified.getNanos());
    }
    if (null == this.fstrPhoneType1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType1);
    }
    if (null == this.fintCountryCode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode1);
    }
    if (null == this.fstrCountry1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry1);
    }
    if (null == this.fstrAreaCode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode1);
    }
    if (null == this.fstrPhoneNumber1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber1);
    }
    if (null == this.fstrExtension1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension1);
    }
    if (null == this.fstrPhoneType2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType2);
    }
    if (null == this.fintCountryCode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode2);
    }
    if (null == this.fstrCountry2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry2);
    }
    if (null == this.fstrAreaCode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode2);
    }
    if (null == this.fstrPhoneNumber2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber2);
    }
    if (null == this.fstrExtension2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension2);
    }
    if (null == this.fstrPhoneType3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType3);
    }
    if (null == this.fintCountryCode3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode3);
    }
    if (null == this.fstrCountry3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry3);
    }
    if (null == this.fstrAreaCode3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode3);
    }
    if (null == this.fstrPhoneNumber3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber3);
    }
    if (null == this.fstrExtension3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension3);
    }
    if (null == this.fstrPhoneType4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType4);
    }
    if (null == this.fintCountryCode4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode4);
    }
    if (null == this.fstrCountry4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry4);
    }
    if (null == this.fstrAreaCode4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode4);
    }
    if (null == this.fstrPhoneNumber4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber4);
    }
    if (null == this.fstrExtension4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension4);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrLOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLOB);
    }
    if (null == this.fstrSBU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSBU);
    }
    if (null == this.fstrRegion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegion);
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrResLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResLocation);
    }
    if (null == this.fstrDeskLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDeskLocation);
    }
    if (null == this.fstrAliasName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAliasName);
    }
    if (null == this.fstrNetworkId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNetworkId);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fblnProduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProduction);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fstrUser) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUser);
    }
    if (null == this.fstrType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrType);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEnd.getTime());
    __dataOut.writeInt(this.fdtmEnd.getNanos());
    }
    if (null == this.fstrFirstName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFirstName);
    }
    if (null == this.fstrFamilyName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFamilyName);
    }
    if (null == this.fstrMiddleName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMiddleName);
    }
    if (null == this.fstrTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTitle);
    }
    if (null == this.fstrStreet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet);
    }
    if (null == this.fstrStreet2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrStreet2);
    }
    if (null == this.fstrUnit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnit);
    }
    if (null == this.fstrUnitType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUnitType);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrCounty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCounty);
    }
    if (null == this.fstrState) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrState);
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrAttention) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAttention);
    }
    if (null == this.fstrLocationCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLocationCode);
    }
    if (null == this.fstrUrbanization) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrUrbanization);
    }
    if (null == this.fstrRowId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRowId);
    }
    if (null == this.fstrMunicipality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMunicipality);
    }
    if (null == this.fstrDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrict);
    }
    if (null == this.fstrSubDistrict) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubDistrict);
    }
    if (null == this.fstrSubProvince) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSubProvince);
    }
    if (null == this.fstrAddressDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressDescription);
    }
    if (null == this.fblnVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVerified);
    }
    if (null == this.fdtmVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVerified.getTime());
    __dataOut.writeInt(this.fdtmVerified.getNanos());
    }
    if (null == this.fstrPhoneType1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType1);
    }
    if (null == this.fintCountryCode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode1);
    }
    if (null == this.fstrCountry1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry1);
    }
    if (null == this.fstrAreaCode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode1);
    }
    if (null == this.fstrPhoneNumber1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber1);
    }
    if (null == this.fstrExtension1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension1);
    }
    if (null == this.fstrPhoneType2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType2);
    }
    if (null == this.fintCountryCode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode2);
    }
    if (null == this.fstrCountry2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry2);
    }
    if (null == this.fstrAreaCode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode2);
    }
    if (null == this.fstrPhoneNumber2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber2);
    }
    if (null == this.fstrExtension2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension2);
    }
    if (null == this.fstrPhoneType3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType3);
    }
    if (null == this.fintCountryCode3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode3);
    }
    if (null == this.fstrCountry3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry3);
    }
    if (null == this.fstrAreaCode3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode3);
    }
    if (null == this.fstrPhoneNumber3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber3);
    }
    if (null == this.fstrExtension3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension3);
    }
    if (null == this.fstrPhoneType4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType4);
    }
    if (null == this.fintCountryCode4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode4);
    }
    if (null == this.fstrCountry4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry4);
    }
    if (null == this.fstrAreaCode4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode4);
    }
    if (null == this.fstrPhoneNumber4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber4);
    }
    if (null == this.fstrExtension4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension4);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrLOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLOB);
    }
    if (null == this.fstrSBU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSBU);
    }
    if (null == this.fstrRegion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRegion);
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fstrResLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrResLocation);
    }
    if (null == this.fstrDeskLocation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDeskLocation);
    }
    if (null == this.fstrAliasName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAliasName);
    }
    if (null == this.fstrNetworkId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNetworkId);
    }
    if (null == this.fstrManager) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrManager);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fblnProduction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProduction);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUser==null?"\\N":fstrUser, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrType==null?"\\N":fstrType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnd==null?"\\N":"" + fdtmEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTitle==null?"\\N":fstrTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet2==null?"\\N":fstrStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCounty==null?"\\N":fstrCounty, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrState==null?"\\N":fstrState, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCode==null?"\\N":fstrLocationCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRowId==null?"\\N":fstrRowId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMunicipality==null?"\\N":fstrMunicipality, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrict==null?"\\N":fstrDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubDistrict==null?"\\N":fstrSubDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubProvince==null?"\\N":fstrSubProvince, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressDescription==null?"\\N":fstrAddressDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVerified==null?"\\N":"" + fblnVerified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVerified==null?"\\N":"" + fdtmVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType1==null?"\\N":fstrPhoneType1, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode1==null?"\\N":"" + fintCountryCode1, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry1==null?"\\N":fstrCountry1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode1==null?"\\N":fstrAreaCode1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber1==null?"\\N":fstrPhoneNumber1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension1==null?"\\N":fstrExtension1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType2==null?"\\N":fstrPhoneType2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode2==null?"\\N":"" + fintCountryCode2, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry2==null?"\\N":fstrCountry2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode2==null?"\\N":fstrAreaCode2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber2==null?"\\N":fstrPhoneNumber2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension2==null?"\\N":fstrExtension2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType3==null?"\\N":fstrPhoneType3, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode3==null?"\\N":"" + fintCountryCode3, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry3==null?"\\N":fstrCountry3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode3==null?"\\N":fstrAreaCode3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber3==null?"\\N":fstrPhoneNumber3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension3==null?"\\N":fstrExtension3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType4==null?"\\N":fstrPhoneType4, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode4==null?"\\N":"" + fintCountryCode4, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry4==null?"\\N":fstrCountry4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode4==null?"\\N":fstrAreaCode4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber4==null?"\\N":fstrPhoneNumber4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension4==null?"\\N":fstrExtension4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLOB==null?"\\N":fstrLOB, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSBU==null?"\\N":fstrSBU, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegion==null?"\\N":fstrRegion, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResLocation==null?"\\N":fstrResLocation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDeskLocation==null?"\\N":fstrDeskLocation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAliasName==null?"\\N":fstrAliasName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNetworkId==null?"\\N":fstrNetworkId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProduction==null?"\\N":"" + fblnProduction, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUser==null?"\\N":fstrUser, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrType==null?"\\N":fstrType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEnd==null?"\\N":"" + fdtmEnd, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFirstName==null?"\\N":fstrFirstName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFamilyName==null?"\\N":fstrFamilyName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMiddleName==null?"\\N":fstrMiddleName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTitle==null?"\\N":fstrTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet==null?"\\N":fstrStreet, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrStreet2==null?"\\N":fstrStreet2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnit==null?"\\N":fstrUnit, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUnitType==null?"\\N":fstrUnitType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCounty==null?"\\N":fstrCounty, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrState==null?"\\N":fstrState, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAttention==null?"\\N":fstrAttention, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLocationCode==null?"\\N":fstrLocationCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrUrbanization==null?"\\N":fstrUrbanization, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRowId==null?"\\N":fstrRowId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMunicipality==null?"\\N":fstrMunicipality, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrict==null?"\\N":fstrDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubDistrict==null?"\\N":fstrSubDistrict, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSubProvince==null?"\\N":fstrSubProvince, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressDescription==null?"\\N":fstrAddressDescription, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVerified==null?"\\N":"" + fblnVerified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVerified==null?"\\N":"" + fdtmVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType1==null?"\\N":fstrPhoneType1, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode1==null?"\\N":"" + fintCountryCode1, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry1==null?"\\N":fstrCountry1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode1==null?"\\N":fstrAreaCode1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber1==null?"\\N":fstrPhoneNumber1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension1==null?"\\N":fstrExtension1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType2==null?"\\N":fstrPhoneType2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode2==null?"\\N":"" + fintCountryCode2, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry2==null?"\\N":fstrCountry2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode2==null?"\\N":fstrAreaCode2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber2==null?"\\N":fstrPhoneNumber2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension2==null?"\\N":fstrExtension2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType3==null?"\\N":fstrPhoneType3, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode3==null?"\\N":"" + fintCountryCode3, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry3==null?"\\N":fstrCountry3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode3==null?"\\N":fstrAreaCode3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber3==null?"\\N":fstrPhoneNumber3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension3==null?"\\N":fstrExtension3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType4==null?"\\N":fstrPhoneType4, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode4==null?"\\N":"" + fintCountryCode4, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry4==null?"\\N":fstrCountry4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode4==null?"\\N":fstrAreaCode4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber4==null?"\\N":fstrPhoneNumber4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension4==null?"\\N":fstrExtension4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLOB==null?"\\N":fstrLOB, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSBU==null?"\\N":fstrSBU, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRegion==null?"\\N":fstrRegion, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrResLocation==null?"\\N":fstrResLocation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDeskLocation==null?"\\N":fstrDeskLocation, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAliasName==null?"\\N":fstrAliasName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNetworkId==null?"\\N":fstrNetworkId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrManager==null?"\\N":fstrManager, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProduction==null?"\\N":"" + fblnProduction, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUser = null; } else {
      this.fstrUser = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrType = null; } else {
      this.fstrType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnd = null; } else {
      this.fdtmEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTitle = null; } else {
      this.fstrTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet = null; } else {
      this.fstrStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet2 = null; } else {
      this.fstrStreet2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCounty = null; } else {
      this.fstrCounty = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrState = null; } else {
      this.fstrState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttention = null; } else {
      this.fstrAttention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLocationCode = null; } else {
      this.fstrLocationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUrbanization = null; } else {
      this.fstrUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRowId = null; } else {
      this.fstrRowId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMunicipality = null; } else {
      this.fstrMunicipality = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrict = null; } else {
      this.fstrDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubDistrict = null; } else {
      this.fstrSubDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubProvince = null; } else {
      this.fstrSubProvince = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressDescription = null; } else {
      this.fstrAddressDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVerified = null; } else {
      this.fblnVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVerified = null; } else {
      this.fdtmVerified = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType1 = null; } else {
      this.fstrPhoneType1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode1 = null; } else {
      this.fintCountryCode1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry1 = null; } else {
      this.fstrCountry1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode1 = null; } else {
      this.fstrAreaCode1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber1 = null; } else {
      this.fstrPhoneNumber1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension1 = null; } else {
      this.fstrExtension1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType2 = null; } else {
      this.fstrPhoneType2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode2 = null; } else {
      this.fintCountryCode2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry2 = null; } else {
      this.fstrCountry2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode2 = null; } else {
      this.fstrAreaCode2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber2 = null; } else {
      this.fstrPhoneNumber2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension2 = null; } else {
      this.fstrExtension2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType3 = null; } else {
      this.fstrPhoneType3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode3 = null; } else {
      this.fintCountryCode3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry3 = null; } else {
      this.fstrCountry3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode3 = null; } else {
      this.fstrAreaCode3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber3 = null; } else {
      this.fstrPhoneNumber3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension3 = null; } else {
      this.fstrExtension3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType4 = null; } else {
      this.fstrPhoneType4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode4 = null; } else {
      this.fintCountryCode4 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry4 = null; } else {
      this.fstrCountry4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode4 = null; } else {
      this.fstrAreaCode4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber4 = null; } else {
      this.fstrPhoneNumber4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension4 = null; } else {
      this.fstrExtension4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLOB = null; } else {
      this.fstrLOB = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSBU = null; } else {
      this.fstrSBU = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRegion = null; } else {
      this.fstrRegion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResLocation = null; } else {
      this.fstrResLocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDeskLocation = null; } else {
      this.fstrDeskLocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAliasName = null; } else {
      this.fstrAliasName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNetworkId = null; } else {
      this.fstrNetworkId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProduction = null; } else {
      this.fblnProduction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUser = null; } else {
      this.fstrUser = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrType = null; } else {
      this.fstrType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEnd = null; } else {
      this.fdtmEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFirstName = null; } else {
      this.fstrFirstName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFamilyName = null; } else {
      this.fstrFamilyName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMiddleName = null; } else {
      this.fstrMiddleName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTitle = null; } else {
      this.fstrTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet = null; } else {
      this.fstrStreet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrStreet2 = null; } else {
      this.fstrStreet2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnit = null; } else {
      this.fstrUnit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUnitType = null; } else {
      this.fstrUnitType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCounty = null; } else {
      this.fstrCounty = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrState = null; } else {
      this.fstrState = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAttention = null; } else {
      this.fstrAttention = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLocationCode = null; } else {
      this.fstrLocationCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrUrbanization = null; } else {
      this.fstrUrbanization = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRowId = null; } else {
      this.fstrRowId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMunicipality = null; } else {
      this.fstrMunicipality = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrict = null; } else {
      this.fstrDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubDistrict = null; } else {
      this.fstrSubDistrict = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSubProvince = null; } else {
      this.fstrSubProvince = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressDescription = null; } else {
      this.fstrAddressDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVerified = null; } else {
      this.fblnVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVerified = null; } else {
      this.fdtmVerified = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType1 = null; } else {
      this.fstrPhoneType1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode1 = null; } else {
      this.fintCountryCode1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry1 = null; } else {
      this.fstrCountry1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode1 = null; } else {
      this.fstrAreaCode1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber1 = null; } else {
      this.fstrPhoneNumber1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension1 = null; } else {
      this.fstrExtension1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType2 = null; } else {
      this.fstrPhoneType2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode2 = null; } else {
      this.fintCountryCode2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry2 = null; } else {
      this.fstrCountry2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode2 = null; } else {
      this.fstrAreaCode2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber2 = null; } else {
      this.fstrPhoneNumber2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension2 = null; } else {
      this.fstrExtension2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType3 = null; } else {
      this.fstrPhoneType3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode3 = null; } else {
      this.fintCountryCode3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry3 = null; } else {
      this.fstrCountry3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode3 = null; } else {
      this.fstrAreaCode3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber3 = null; } else {
      this.fstrPhoneNumber3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension3 = null; } else {
      this.fstrExtension3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType4 = null; } else {
      this.fstrPhoneType4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode4 = null; } else {
      this.fintCountryCode4 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry4 = null; } else {
      this.fstrCountry4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode4 = null; } else {
      this.fstrAreaCode4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber4 = null; } else {
      this.fstrPhoneNumber4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension4 = null; } else {
      this.fstrExtension4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLOB = null; } else {
      this.fstrLOB = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSBU = null; } else {
      this.fstrSBU = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRegion = null; } else {
      this.fstrRegion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrResLocation = null; } else {
      this.fstrResLocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDeskLocation = null; } else {
      this.fstrDeskLocation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAliasName = null; } else {
      this.fstrAliasName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNetworkId = null; } else {
      this.fstrNetworkId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrManager = null; } else {
      this.fstrManager = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProduction = null; } else {
      this.fblnProduction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tbluserinfo o = (tbluserinfo) super.clone();
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmEnd = (o.fdtmEnd != null) ? (java.sql.Timestamp) o.fdtmEnd.clone() : null;
    o.fdtmVerified = (o.fdtmVerified != null) ? (java.sql.Timestamp) o.fdtmVerified.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tbluserinfo o) throws CloneNotSupportedException {
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmEnd = (o.fdtmEnd != null) ? (java.sql.Timestamp) o.fdtmEnd.clone() : null;
    o.fdtmVerified = (o.fdtmVerified != null) ? (java.sql.Timestamp) o.fdtmVerified.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fstrUser", this.fstrUser);
    __sqoop$field_map.put("fstrType", this.fstrType);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmEnd", this.fdtmEnd);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrTitle", this.fstrTitle);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrStreet2", this.fstrStreet2);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrLocationCode", this.fstrLocationCode);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fstrRowId", this.fstrRowId);
    __sqoop$field_map.put("fstrMunicipality", this.fstrMunicipality);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fblnVerified", this.fblnVerified);
    __sqoop$field_map.put("fdtmVerified", this.fdtmVerified);
    __sqoop$field_map.put("fstrPhoneType1", this.fstrPhoneType1);
    __sqoop$field_map.put("fintCountryCode1", this.fintCountryCode1);
    __sqoop$field_map.put("fstrCountry1", this.fstrCountry1);
    __sqoop$field_map.put("fstrAreaCode1", this.fstrAreaCode1);
    __sqoop$field_map.put("fstrPhoneNumber1", this.fstrPhoneNumber1);
    __sqoop$field_map.put("fstrExtension1", this.fstrExtension1);
    __sqoop$field_map.put("fstrPhoneType2", this.fstrPhoneType2);
    __sqoop$field_map.put("fintCountryCode2", this.fintCountryCode2);
    __sqoop$field_map.put("fstrCountry2", this.fstrCountry2);
    __sqoop$field_map.put("fstrAreaCode2", this.fstrAreaCode2);
    __sqoop$field_map.put("fstrPhoneNumber2", this.fstrPhoneNumber2);
    __sqoop$field_map.put("fstrExtension2", this.fstrExtension2);
    __sqoop$field_map.put("fstrPhoneType3", this.fstrPhoneType3);
    __sqoop$field_map.put("fintCountryCode3", this.fintCountryCode3);
    __sqoop$field_map.put("fstrCountry3", this.fstrCountry3);
    __sqoop$field_map.put("fstrAreaCode3", this.fstrAreaCode3);
    __sqoop$field_map.put("fstrPhoneNumber3", this.fstrPhoneNumber3);
    __sqoop$field_map.put("fstrExtension3", this.fstrExtension3);
    __sqoop$field_map.put("fstrPhoneType4", this.fstrPhoneType4);
    __sqoop$field_map.put("fintCountryCode4", this.fintCountryCode4);
    __sqoop$field_map.put("fstrCountry4", this.fstrCountry4);
    __sqoop$field_map.put("fstrAreaCode4", this.fstrAreaCode4);
    __sqoop$field_map.put("fstrPhoneNumber4", this.fstrPhoneNumber4);
    __sqoop$field_map.put("fstrExtension4", this.fstrExtension4);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrLOB", this.fstrLOB);
    __sqoop$field_map.put("fstrSBU", this.fstrSBU);
    __sqoop$field_map.put("fstrRegion", this.fstrRegion);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrResLocation", this.fstrResLocation);
    __sqoop$field_map.put("fstrDeskLocation", this.fstrDeskLocation);
    __sqoop$field_map.put("fstrAliasName", this.fstrAliasName);
    __sqoop$field_map.put("fstrNetworkId", this.fstrNetworkId);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fblnProduction", this.fblnProduction);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fstrUser", this.fstrUser);
    __sqoop$field_map.put("fstrType", this.fstrType);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmEnd", this.fdtmEnd);
    __sqoop$field_map.put("fstrFirstName", this.fstrFirstName);
    __sqoop$field_map.put("fstrFamilyName", this.fstrFamilyName);
    __sqoop$field_map.put("fstrMiddleName", this.fstrMiddleName);
    __sqoop$field_map.put("fstrTitle", this.fstrTitle);
    __sqoop$field_map.put("fstrStreet", this.fstrStreet);
    __sqoop$field_map.put("fstrStreet2", this.fstrStreet2);
    __sqoop$field_map.put("fstrUnit", this.fstrUnit);
    __sqoop$field_map.put("fstrUnitType", this.fstrUnitType);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCounty", this.fstrCounty);
    __sqoop$field_map.put("fstrState", this.fstrState);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrAttention", this.fstrAttention);
    __sqoop$field_map.put("fstrLocationCode", this.fstrLocationCode);
    __sqoop$field_map.put("fstrUrbanization", this.fstrUrbanization);
    __sqoop$field_map.put("fstrRowId", this.fstrRowId);
    __sqoop$field_map.put("fstrMunicipality", this.fstrMunicipality);
    __sqoop$field_map.put("fstrDistrict", this.fstrDistrict);
    __sqoop$field_map.put("fstrSubDistrict", this.fstrSubDistrict);
    __sqoop$field_map.put("fstrSubProvince", this.fstrSubProvince);
    __sqoop$field_map.put("fstrAddressDescription", this.fstrAddressDescription);
    __sqoop$field_map.put("fblnVerified", this.fblnVerified);
    __sqoop$field_map.put("fdtmVerified", this.fdtmVerified);
    __sqoop$field_map.put("fstrPhoneType1", this.fstrPhoneType1);
    __sqoop$field_map.put("fintCountryCode1", this.fintCountryCode1);
    __sqoop$field_map.put("fstrCountry1", this.fstrCountry1);
    __sqoop$field_map.put("fstrAreaCode1", this.fstrAreaCode1);
    __sqoop$field_map.put("fstrPhoneNumber1", this.fstrPhoneNumber1);
    __sqoop$field_map.put("fstrExtension1", this.fstrExtension1);
    __sqoop$field_map.put("fstrPhoneType2", this.fstrPhoneType2);
    __sqoop$field_map.put("fintCountryCode2", this.fintCountryCode2);
    __sqoop$field_map.put("fstrCountry2", this.fstrCountry2);
    __sqoop$field_map.put("fstrAreaCode2", this.fstrAreaCode2);
    __sqoop$field_map.put("fstrPhoneNumber2", this.fstrPhoneNumber2);
    __sqoop$field_map.put("fstrExtension2", this.fstrExtension2);
    __sqoop$field_map.put("fstrPhoneType3", this.fstrPhoneType3);
    __sqoop$field_map.put("fintCountryCode3", this.fintCountryCode3);
    __sqoop$field_map.put("fstrCountry3", this.fstrCountry3);
    __sqoop$field_map.put("fstrAreaCode3", this.fstrAreaCode3);
    __sqoop$field_map.put("fstrPhoneNumber3", this.fstrPhoneNumber3);
    __sqoop$field_map.put("fstrExtension3", this.fstrExtension3);
    __sqoop$field_map.put("fstrPhoneType4", this.fstrPhoneType4);
    __sqoop$field_map.put("fintCountryCode4", this.fintCountryCode4);
    __sqoop$field_map.put("fstrCountry4", this.fstrCountry4);
    __sqoop$field_map.put("fstrAreaCode4", this.fstrAreaCode4);
    __sqoop$field_map.put("fstrPhoneNumber4", this.fstrPhoneNumber4);
    __sqoop$field_map.put("fstrExtension4", this.fstrExtension4);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrLOB", this.fstrLOB);
    __sqoop$field_map.put("fstrSBU", this.fstrSBU);
    __sqoop$field_map.put("fstrRegion", this.fstrRegion);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fstrResLocation", this.fstrResLocation);
    __sqoop$field_map.put("fstrDeskLocation", this.fstrDeskLocation);
    __sqoop$field_map.put("fstrAliasName", this.fstrAliasName);
    __sqoop$field_map.put("fstrNetworkId", this.fstrNetworkId);
    __sqoop$field_map.put("fstrManager", this.fstrManager);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fblnProduction", this.fblnProduction);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
