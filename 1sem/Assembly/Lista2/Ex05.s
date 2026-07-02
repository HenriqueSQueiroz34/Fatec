.data
r1:.asciiz"Informe a raiz 1: "
r2:.asciiz"Qual a raiz 2: "
r3:.asciiz"E a raiz 3: "
u:.asciiz"UMA RAÍZ REAL"
d:.asciiz"DUAS RAÍZES REAIS"
n:.asciiz"NÃO EXISTEM RAÍZES REAIS"
.text

main:
li $v0,4
la $a0,r1
syscall
li $v0,5
syscall
la $t1,($v0)

li $v0,4
la $a0,r2
syscall
li $v0,5
syscall
la $t2,($v0)

li $v0,4
la $a0,r3
syscall
li $v0,5
syscall
la $t3,($v0)

mul $t2,$t2,$t2
mul $t3,$t3,$t1
mul $t3,$t3,4
sub $t0,$t2,$t3

bgtz $t0,duas
beqz $t0,uma
bltz $t0,nenhuma

duas:
li $v0,4
la $a0,d
syscall
j fim

uma:
li $v0,4
la $a0,u
syscall
j fim

nenhuma:
li $v0,4
la $a0,n
syscall
j fim

fim: