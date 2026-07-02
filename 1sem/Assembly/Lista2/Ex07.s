.data
num:.asciiz"Digite um numeral entre 100 e 999: "
c:.asciiz"CENTENA: "
d:.asciiz"DEZENA: "
u:.asciiz"UNIDADE: "
pula:.asciiz"\n"
.text

main:

li $v0,4
la $a0,num
syscall
li $v0,5
syscall
la $t0,($v0)

bgt $t0,999,main
blt $t0,100,main

cen:
add $t3,$t3,1
sub $t0,$t0,100
bge $t0,100,cen

dez:
add $t2,$t2,1
sub $t0,$t0,10
bge $t0,10,dez

und:
add $t1,$t1,1
sub $t0,$t0,1
bge $t0,1,und

fim:
li $v0,4
la $a0,c
syscall
li $v0,1
add $a0,$t3,$zero
syscall
li $v0,4
la $a0,pula
syscall

li $v0,4
la $a0,d
syscall
li $v0,1
add $a0,$t2,$zero
syscall
li $v0,4
la $a0,pula
syscall

li $v0,4
la $a0,u
syscall
li $v0,1
add $a0,$t1,$zero
syscall
li $v0,4
la $a0,pula
syscall