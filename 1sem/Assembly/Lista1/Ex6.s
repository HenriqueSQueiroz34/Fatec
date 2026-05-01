.data
A:.asciiz"Insira o valor de A: "
B:.asciiz"Insira o valor de B: "
C:.asciiz"Resultado final: "
.text

main:
li $v0,4
la $a0,A
syscall
li $v0,5
syscall
add $t1,$v0,$zero

li $v0,4
la $a0,B
syscall
li $v0,5
syscall
add $t2,$v0,$zero

beq $t1,$t2,igual

diferente:
mul $t0,$t1,$t2
j fim

igual:
add $t0,$t1,$t2

fim:
li $v0,4
la $a0,C
syscall
li $v0,1
add $a0,$t0,$zero
syscall