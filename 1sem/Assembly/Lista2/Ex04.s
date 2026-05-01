.data
n1:.asciiz"Digite a primeira nota: "
n2:.asciiz"Digite a segunda nota: "
n3:.asciiz"Digite a terceira nota: "
n4:.asciiz"Digite a quarta nota: "
sit:.asciiz"O aluno foi: "
retido:.asciiz"Retido "
exame:.asciiz"Exame "
aprova:.asciiz"Aprovado "
.text

Main:

# Utilize notas inteiras
li $v0,4
la $a0,n1
syscall
li $v0,5
syscall
move $t1,$v0

li $v0,4
la $a0,n2
syscall
li $v0,5
syscall
move $t2,$v0

li $v0,4
la $a0,n3
syscall
li $v0,5
syscall
move $t3,$v0

li $v0,4
la $a0,n4
syscall
li $v0,5
syscall
move $t4,$v0

add $t0,$t1,$t2
add $t0,$t0,$t3
add $t0,$t0,$t4
add $t7,$zero,4
div $t0,$t0,$t7
add $t5,$zero,3
add $t6,$zero,6

blt $t0,$t5,ret
blt $t0,$t6,ex

li $v0,4
la $a0,sit
syscall
la $a0,aprova
syscall
li $v0,1
move $a0,$t0
syscall
j fim

ret:

li $v0,4
la $a0,sit
syscall
la $a0,retido
syscall
li $v0,1
move $a0,$t0
syscall
j fim

ex:

li $v0,4
la $a0,sit
syscall
la $a0,exame
syscall
li $v0,1
move $a0,$t0
syscall

Fim: