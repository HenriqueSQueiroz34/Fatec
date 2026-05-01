.data
entra:.asciiz"Digite um numero de 0 a 100 ou -1 para encerrar "
p1:.asciiz"("
p2:.asciiz"): "
erro:.asciiz"\nNumero negado, repita\n"
int0_25:.asciiz"Numeros entre 0 e 25: "
int26_50:.asciiz"Numeros entre 26 e 50: "
int51_75:.asciiz"Numeros entre 51 e 75: "
int76_100:.asciiz"Numeros entre 76 e 100: "
n:.asciiz"\n"
.text

main:
li $v0,4
la $a0,n
syscall
la $a0,entra
syscall
la $a0,p1
syscall
li $v0,1
addi $t1,$t1,1
add $a0,$t1,$zero
syscall
li $v0,4
la $a0,p2
syscall
li $v0,5
syscall
add $t0,$t0,$v0

bgt $t0,100,repete

bltz $t0,fim
blt $t0,26,num25
blt $t0,51,num50
blt $t0,76,num75
j num100

continua:
sub $t0,$t0,$t0
j main

repete:
	li $v0,4
	la $a0,erro
	subi $t1,$t1,1
	syscall
	j continua
	
num25: 
addi $t2,$t2,1 
j continua

num50: 
	addi $t3,$t3,1 
	j continua

num75: 
addi $t4,$t4,1 
j continua

num100: 
	addi $t5,$t5,1 
	j continua

fim:
li $v0,4
la $a0,int0_25
syscall
li $v0,1
add $a0,$t2,$zero
syscall
li $v0,4
la $a0,n
syscall

	li $v0,4
	la $a0,int26_50
	syscall
	li $v0,1
	add $a0,$t3,$zero
	syscall
	li $v0,4
	la $a0,n
	syscall

li $v0,4
la $a0,int51_75
syscall
li $v0,1
add $a0,$t4,$zero
syscall
li $v0,4
la $a0,n
syscall

	li $v0,4
	la $a0,int76_100
	syscall
	li $v0,1
	add $a0,$t5,$zero
	syscall