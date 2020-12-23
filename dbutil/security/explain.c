#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include <libgen.h>
#include <string.h>

int main(int argc, char ** argv)
{
	const char explain_exe_name[] = ";./explain.sh";
	//const char rm_exe_name[] = ";./cleanegg.sh";
	//const char chmod_exe_name[] = ";./chmod.sh";
	const char cd[] = "cd ";
	char* dir_name = dirname(argv[0]);
	char * explain_cmd;
	int explain_level=1;
	//char* rm_cmd;
	//char * chmod_cmd;
	char msg[30];
	if (argc==2) {
		//char a = argv[1];
		//explain_level =  a - '0';
		explain_level=atoi(argv[1]);
		if (explain_level<0 || explain_level>3){
			explain_level=1;
		}
	}
	/*rm_cmd=malloc(strlen(cd) + strlen(dir_name) + strlen(rm_exe_name) + 1);
	if (!rm_cmd) {
		fprintf(stderr,"malloc() failed for cleanegg: insufficient memory!\n");
		return EXIT_FAILURE;
	}
	strcpy(rm_cmd,cd);
	strcat(rm_cmd,dir_name);
	strcat(rm_cmd,rm_exe_name);
	system( rm_cmd );
	free(rm_cmd);*/
	/*chmod_cmd=malloc(strlen(cd) + strlen(dir_name) + strlen(chmod_exe_name) + 1);
	if (!chmod_cmd) {
		fprintf(stderr,"malloc() failed for chmod: insufficient memory!\n");
		return EXIT_FAILURE;
	}
	strcpy(chmod_cmd,cd);
	strcat(chmod_cmd,dir_name);
	strcat(chmod_cmd,chmod_exe_name);
	system( chmod_cmd );
	free(chmod_cmd);*/

	sprintf(msg, " -u %d -l %d", getuid(),explain_level);
	explain_cmd=malloc(strlen(cd) + strlen(dir_name) + strlen(msg) + strlen(explain_exe_name) + 1);
	if (!explain_cmd) {
		fprintf(stderr,"malloc() failed for explain: insufficient memory!\n");
		return EXIT_FAILURE;
	}
	strcpy(explain_cmd,cd);
	strcat(explain_cmd,dir_name);
	strcat(explain_cmd,explain_exe_name);
	strcat(explain_cmd,msg);
	//setuid(geteuid());   
	setreuid(geteuid(),geteuid());   
	system( explain_cmd );
	free(explain_cmd);
	//printf("exit succeded");
	return 0;
 }
