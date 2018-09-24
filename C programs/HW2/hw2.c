#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main(int argc, char **argv){
	printf("Problem 1: \n");
	char * hexValue[8]= {"0x0A","0x06","0x14","0x6B","0x8A","0x86","0x94","0xEB"};
	char * binValue[8]= {"00001010", "00000110", "00010100", "01101011", "10001010", "10000110", "10010010", "11101011"};
	int i;
	for(i=0;i<8; i++){	
		printf("Hex:Binary:B2U8:B2T8 : %s: %s: %s: %s \n",hexValue[i],binValue[i],binValue[i],binValue[i]);
	}
	printf("\n");
	printf("Problem 2: \n");
	   printf("The of value of UMaxw of wordsize 8 = %d %x\n", UCHAR_MAX, UCHAR_MAX);
	   printf("The of value of TMinw of wordsize 8 = %d %x\n", SCHAR_MIN, SCHAR_MIN);
	   printf("The of value of TMaxw of wordsize 8 = %d %x\n", SCHAR_MAX, SCHAR_MAX);
	   printf("The of value of -1 of wordsize 8 = %d %x\n", -1, -1);
	   printf("The of value of 0 of wordsize 8 = %d %x\n", 0, 0);
		printf("\n");
	   printf("The of value of UMaxw of wordsize 16 = %d %x\n", USHRT_MAX, USHRT_MAX);
	   printf("The of value of TMinw of wordsize 16 = %d %x\n", SHRT_MAX, SHRT_MAX);
	   printf("The of value of TMaxw of wordsize 16 = %d %x\n", SHRT_MAX, SHRT_MAX);
	   printf("The of value of -1 of wordsize 16 = %d %x\n", -1, -1);
	   printf("The of value of 0 of wordsize 16 = %d %x\n", 0, 0);
		printf("\n");
	   printf("The of value of UMaxw of wordsize 32 = %d %x\n", UINT_MAX, UINT_MAX);
	   printf("The of value of TMinw of wordsize 32 = %d %x\n", INT_MIN, INT_MIN);
	   printf("The of value of TMaxw of wordsize 32 = %d %x\n", INT_MAX, INT_MAX);
	   printf("The of value of -1 of wordsize 32 = %d %x\n", -1, -1);
	   printf("The of value of 0 of wordsize 32 = %d %x\n", 0, 0);
		printf("\n");
	   printf("The of value of UMaxw of wordsize 64 = %lu %lx\n", ULONG_MAX, ULONG_MAX);
	   printf("The of value of TMinw of wordsize 64 = %ld %lx\n", LONG_MIN, LONG_MIN);
	   printf("The of value of TMaxw of wordsize 64 = %ld %lx\n", LONG_MAX, LONG_MAX);
	   printf("The of value of -1 of wordsize 64 = %d %x\n", -1, -1);
	   printf("The of value of 0 of wordsize 64 = %d %x\n", 0, 0);
		printf("\n");
	printf("Problem #3: \n");
	printf("If unsigned/signed numbers are below 15, those are same when w=5, then +- 32");
	printf("thus -16 signed = 16 unsigned \n");
	printf("Problem #4: \n");
	unsigned int t = 32;
	signed int w = -32;
	_Bool answer4 = t>w;
	printf("%d\n", answer4);

	printf("Problem #5: /n");
	



	

}


