.data
dolar:.asciiz"Informe quantos dolares deseja converter: U$"
rea:.asciiz"Isso resulta em R$ "
is:.asciiz",00"
.text

main:
li $v0,4
la $a0,dolar
syscall
li $v0,5
syscall
add $t0,$v0,$zero

mul $t0,$t0,5

li $v0,4
la $a0,rea
syscall
li $v0,1
add $a0,$t0,$zero
syscall
li $v0,4
la $a0,is
syscall