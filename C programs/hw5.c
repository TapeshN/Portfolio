/* Tapesh Nagarwal- hw5

#1

	Number Type		%rdi/edi/di	&rsi/esi/si	Instruction	 | CF  SF  ZF  OF
a)	unsigned		0xFFFE		0x4		addw %di, %si	 | 1   0   0   0 
b)	unsigned		0xFFFE		0x4		addl %edi, %esi	 | 0   0   0   0
c)	signed 2's comp		0xFFFE		0x2		addw %di, %si	 | 1   0   1   0
d)	signed 2's comp		0xFFFE		0x2		addl %edi, %esi  | 0   0   0   0 
e)	signed 2's comp		0xFFFFFFFF	0x80000000	addl %edi, %esi  | 1   0   0   1 
f)	signed 2's comp		0xFFFF		-0xFFFF		subl %si, %di	 | 0   0   1   0 
g)	signed 2's comp		0xFFFFFFFE	0x7FFFFFFFE	subl %esi, %edi	 | 0   1   0   0 
h)	unsigned		0xF		0xFF		shlq 64, %rdi	 | 0   0   1   0 


#2 
   Address   Instruction in Hexa   --  Assembly Instructions
a) ab1234:  74 08			je 0xab123e
   ab1236:  48 89 d0			mov %rdx, %rax

b) abcdef:  7c 07			jl 0xabcdf8
   abcdf1:  48 39 f7			cmp %rsi, %rdi

c) 123443:  7d 11			jge 0x123456
   123445:  48 85 ab			test %rdi, %rdi
									
d) ab01f0:  7f 2f ff ff 		jg 0xdb01f3 		
   ab01f4: 48 39 d6			mov %rdx, %rsi			  
									      	

#3
reverse_logic:				//%rdi = x ; %rsi = y ; %rdx = z;
	cmpq	%rsi, %rdi     //compare x to y
	jge	.L3		//jump to .l3 if x greater than or equal to y
	cmpq	%rdx, %rdi	//compare  x to z
	jle	.L4		//jump to .l4 if x less than or equal to z
	movq	%rdx, %rax	//move z to return register
	subq	%rdi, %rax	//subtract result - x
	ret
.L4:
	leaq	(%rdi,%rdx), %rax	// add x+z store as result
	ret				//return result
.L3:
	cmpq	%rdx, %rsi		//compare y to z
	jle	.L7			//jump if y less than or equal to z 
	movq	%rdx, %rax		//move z to %rax
	subq	%rsi, %rax		//subtract result - y
	ret				//return result
.L7:
	leaq	(%rsi,%rdx), %rax	//add z+y and store as %rax
	ret				//return


long reverse_logic(long x, long y, long z)
{
    long result;
	if(x >= y){
		if( y <= z){
			result = y+z;
			return result;
		}
	}
	if(x <= z){
		result = x+z;
		return result;	
	}
	return = z-x;
   	return result;
}

#4
A. %rdi=x ; %esi=n ; %rax= result ; %rdx= mask; 
B. result = 0 ; mask = 1;
C. mask !- 0
D. Mask gets updated when it shifts left <<n&0xFF
E. result gets updated when (x & mask) | result
F.
long loop(long x, long n){
	long result= _0__ ;		
	long mask;
	for(mask=_1__; mask!= 0; mask=_<<n_){
		result |= _x & mask_;
	}
	return result;
}

#5
loop_while_hw5:
.LFB0:
	movl	$1, %eax		
	jmp	.L2
.L3:
	movq	%rdi, %rdx
	subq	%rsi, %rdx
	addq	%rdx, %rax
	addq	$1, %rsi
.L2:
	cmpq	%rdi, %rsi
	jl	.L3
	rep ret

long loop_while_hw5(long a, long b)		//%rdi = a ; %rsi= b ; %rdx=   ; %rax= result  ;
{
    long result = _1_;
    while (___b<a___) {  // rdx=a, rdx=rdx-b,result=rdx=a-b, b=b+1
	result = ___a-b___;
	b = __b+1__;
    }
    return result;
}

#6
(a) C Code
void switch_hw5(long a, long b, long c, long *dest)
{	     // %rdi     %rsi    %rdx     %rax=val
    long val;
    switch(a) {
    case _100__:		//%rdx:c => %rax=val; thus %rax=c 
	val = __c-a____;	//c-a
	break;
    case _102__:		//%rsi:b => %rdx:c; thus %rdx=b %rax = c		
	c = ___b<<4+b___;	//shift b<<4 times
	/* Fall through */	//add
    case __103__:
	val = __c^0xff_;  //%rdi= a ; %rsi=b  ; %rdx=c  ; %rax= val
	break;
    case _104____:
    case _106____:
	val = __(b+c)>>4__;
	break;
    default:
	val = _a+b_;
    }
    return val;
}
    
(b) Assembly Code
switch_hw5:
.L3:				//loc_a :case100
	movq	%rdx, %rax
	subq	%rdi, %rax
	ret
.L5:				//loc_b :case102
	movq	%rsi, %rdx
	salq	$4, %rdx
	addq	%rsi, %rdx
.L6:
	movq	%rdx, %rax	//loc_c :case 103
	xorb	$-1, %al
	ret
.L7:
	leaq	(%rdx,%rsi), %rax		//loc_d: case
	sarq	$4, %rax
	ret
.L2:
	leaq	(%rdi,%rsi), %rax	//loc_def
	ret
(c) Jump Table
.L4:
	.quad	.L3	//case:100
	.quad	.L5	//case:102
	.quad	.L2	//case:103
	.quad	.L6	//case:104
	.quad	.L2	//case:103
	.quad	.L7	//default
	.quad	.L2	//case:103
	.quad	.L7	//default


*/
