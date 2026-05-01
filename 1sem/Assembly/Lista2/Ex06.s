.data
n1:.asciiz"Digite um numeral ("
n2:.asciiz"): "
mai:.asciiz"Maior: "
men:.asciiz"Menor: "
nega:.asciiz"Numeral negativo, tente novamente.\n"
pula:.asciiz"\n"
.text

main:

# input com contador
li $v0,4
la $a0,n1
syscall
addi $t7,$t7,1
li $v0,1
move $a0,$t7
syscall
li $v0,4
la $a0,n2
syscall

#recebendo o valor
li $v0,5
syscall
move $t0,$v0

blt $t0,0,invalido

beq $t7,1,primeiro

bgt $t0,$t1,maior
blt $t0,$t2,menor

blt $t7,10,main
j fim

invalido:
sub $t7,$t7,1
li $v0,4
la $a0,nega
syscall
j main

primeiro:
move $t1,$t0
move $t2,$t0
j main

maior:
move $t1,$t0
j main

menor:
move $t2,$t0
j main

fim:
li $v0,4
la $a0,mai
syscall
li $v0,1
move $a0,$t1
syscall

li $v0,4
la $a0,pula
syscall

li $v0,4
la $a0,men
syscall
li $v0,1
move $a0,$t2
syscall