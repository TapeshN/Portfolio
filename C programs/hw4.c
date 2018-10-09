/*Tapesh Nagarwal Hw4*/
/*#1
	Operand			Value
	%rdi			0x1000	//register
	0x1004			0xBB	//Absolute address
	$0x1008			0x1008  //Immediate 
	(%rdi)			0xAA	//memory address 0x1000
	4(%rdi)			0xBB    //Base + displacement
	8(%rdi,%rcx)		0xDD	//Indexed 
	0x1002(%rdx,%rcx)	0xCC		
	-4(%rdi,%rsi,4)		0xAA
	(%rdi,%rdx, 4)		0xCC
*/
/*#2	
Instruction			Destination 	Value
addq(%rdi),%rsi			%rsi		0xAA	
andq %rsi,%rdi			%rdi		0x00	
subq %rsi,(%rdi)		0x1000		0xA9	
incq %rsi			%rsi		0x2
decq %rdx			%rdx		0x1
xorq(%rdi,%rdx,4),%rcx		%rcx		0x0
orq 0x1002(%rdx,%rcx),%rsi	%rsi		0xCD 
*/						
/*#3						
unknown:
	imulq	%rdx, %rsi	//Src,Dest Dest= Dest*Src. 1stR,2nd arguement
	leaq	(%rsi,%rdi), %rax	//Src,Dest Dest=addrs of SRC
	ret

  long unknown(long x, long y, long z) {
        return ___(y*z)+x___;
  }
  
  unknown:
	movq	%rdi, %rax  //src,Dest Dest=SRC 1st reg,return value
	salq	$3, %rax    	//k,Dest  dest = Dest << k
	addq	%rdi, %rax	//src,Dest Dest = Dest+Src
	ret

  long unknown(long x) {
        return _____x+(x<<3)____;
  }
*/
/*#4
long decode(long x, long y, long z){
	y = y-z;
	x = x*y;
	answer = y;
	answer << 63;
	answer >> 63;
	answer= answer^x;
	return answer
}

*/
/*#5

arith:
	leaq (%rdi,%rsi), %rcx
	negq %rdx
	leaq (%rcx, %rdx), %rdi
	andq %rdi,%rcx
	leaq %rcx,%rsi
	imulq %rdi,%rsi
	leaq  %rsi,%rax
	ret 
	
 
	
