.data
n1:.asciiz"Digite o valor 1: "
n2:.asciiz"Digite o valor 2: "
ma:.asciiz"O maior é "
me:.asciiz" e o menor é "
.text

main:

li $v0,4
la $a0,n1
syscall
li $v0,5
syscall
la $t0,($v0)

li $v0,4
la $a0,n2
syscall
li $v0,5
syscall
la $t1,($v0)

bgt $t1,$t0,maior
j fim

maior:
la $t2,($t0)
la $t0,($t1)
la $t1,($t2)

fim:
li $v0,4
la $a0,ma
syscall
li $v0,1
add $a0,$t0,$zero
syscall
li $v0,4
la $a0,me
syscall
li $v0,1
add $a0,$t1,$zero
syscall