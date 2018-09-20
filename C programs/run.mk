
OBJS = reality.o reality4.o
CC = gcc
PROGS = reality reality4

all:	$(PROGS)

reality:	reality.o
	$(CC) reality.c -o reality
reality4:	reality 4.0
	$(CC) reality4.c -o reality4
clean:
	rm *.o *~ reality realilty4
