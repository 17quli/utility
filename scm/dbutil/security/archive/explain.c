#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include <libgen.h>

int main(int argc, char ** argv)
{
	char* exe_name = basename(argv[0]);
	printf(" Executable Name: %s", exe_name);
	setuid(geteuid());   
	system( "./explain.sh" );
	return 0;
 }
