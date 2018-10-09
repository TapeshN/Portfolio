/*Tapesh Nagarwal CS252-001*/
/* #1
     MODE		X		Y	X*Y, w=10	Truncated X*Y, w=5
a)unsigned	     16,10000       21,10101	336,0101010000	      16,10000
  Two's Complement  -16,10000	   -11,10101	176,0010110000	     -16,10000       6,0110		

b) unsigned	     21,10101        8,01000	168,0010101000         8,01000
  Two's Complement  -11,10101 	   -24,01000    264,0010001000 	       8,01000

c) unsigned 	     12,01100       25,11001	300,0100101100	      12,01100		
  Two's Complement  -20,01100	    -7,11001    140,0010001100        12,01100

d) unsigned	     10,01010	     5,00101	50,0000110010	      18,10010
  Two's Complement  -24,01010      -27,00101   648,1010001000          8,01000
 */

/* #2 Problem 2.77  
	for K=17 : (x << 4) + x;
	for K=-7 : x-(x << 3);  
	for K = 60 : (x << 6) - (x << 2);
	for K = -112 : (x << 4) - (x << 7);

*/

/*#3 Print a float in binary: ftob.c */
#include <stdio.h>
#include <stdlib.h>

//void float_to_string(float f, char *s, int n);
void float_to_string(float,char *,int);
void print_float();

#define LEN 32
#define EXP_32 8		/* ending index of s for exponent */
#define MAN_32 9		/* starting index of s for significand */

int main(int argc, char **argv) {
  int n=LEN;
  float f;
  char s[LEN];

  f = atof(argv[1]);
  printf("f=%f\n",f);

  float_to_string(f,s,n);
  print_float(s,n);

  return 0;
}

/* convert float to binary and store in s, a string of 32 chars */
void float_to_string(float f, char *s, int n){
  unsigned int u_int;
  int i=0;			/* for loop index */
  int quotient; 
  int remainder;
  int integral = (int)f;
  float frac = f-integral;
  quotient = integral/2; 
  remainder = integral%2;
  char part1[LEN];
  char returnval[LEN];
  returnval = itoa(remainder,returnval, 2);
  part1[i] = returnval[0];
  i++;
  while(quotient > 0){ 
	remainder = quotient%2;
	quotient = quotient/2;
	returnval = itoa(remainder,returnval, 2);
	part1[i] = returnval[0];
	i++;
  }
  part1[i] = '\0';
  float frac2 = frac*2;
  char part2[LEN];
  int j = 0;
  returnval = atoi((int)frac2);
  part2[j] = returnval[0];
  frac = frac2 - (int)frac2;
  j++;
  while(frac > 0){
	frac2 = frac*2;
	returnval = atoi((int)frac2);
	part2[j] = returnval[0];
	frac = frac2 - (int)frac2;
	j++;
  }
  part2[j] = '\0';
  
  int k;
  int p=0;
  for (k=strlen(part1)-1; k > 0 ; k-- ) {
	s[p]=part1[k];
        p++;
  }
  s[p]='\0'

  char * new_str = strcat(s, " ");
  s=strcat(new_str, part2);

}

/* print space in between sign bit, exponent, and significand */
void print_float(char *s, int n) {
  int i=0;

  /* fill here */

}

/* End of ftob.c */

/*Problem #4
VALUE		BINARY		ROUNDED		ACTION		ROUNDED VALUE
1 1/16		1.0001		1.00		(<1/2 down)	1
1 3/16		1.0011		1.01		(>1/2 up)	1 4/16
2 5/16		10.0101		10.01		(<1/2 down)	2 4/16
2 5/8		10.101		10.10		(1/2 down)	2 4/8
3 5/8		11.101		11.10		(1/2 down)	3 4/8		
3 7/8 		11.111		100		(1/2 up)	4
*/

/*Problem #5
VALUE		ROUNDED		EXP		ADJUSTED		RESULT
256		1.000		8					256
31		1.1111		4						
33		1.00001 	5
35		1.00011		5
276		1.000101	8
127		1.11111	        5
*/

/*Problem #6*/
int main(int argc, char **argv) {








  
