.data
larg:.asciiz"Insira a largura: "
comp:.asciiz"Insira o comprimento: "
alt:.asciiz"Insira a altura: "
res:.asciiz"O volume é "
.text

Main:

li $v0,4
la $a0,larg
syscall
li $v0,5
syscall
move $t1,$v0

li $v0,4
la $a0,alt
syscall
li $v0,5
syscall
move $t2,$v0

li $v0,4
la $a0,comp
syscall
li $v0,5
syscall
move $t3,$v0

mul $t0,$t1,$t2
mul $t0,$t0,$t3

li $v0,4
la $a0,res
syscall
li $v0,1
add $a0,$t0,$zero
syscall