.data
b1:.asciiz"De a base menor: "
b2:.asciiz"De a base maior: "
alt:.asciiz"Qual a altura?: "
area:.asciiz"Area total de: "
.text

# t0: resultado
# t1: base menor
# t2: base maior
# t3: altura
# t4: divisao por 2

main:
li $v0,4
la $a0,b1
syscall
li $v0,5
syscall
add $t1,$v0,$zero

li $v0,4
la $a0,b2
syscall
li $v0,5
syscall
add $t2,$v0,$zero

li $v0,4
la $a0,alt
syscall
li $v0,5
syscall
add $t3,$v0,$zero

addi $t4,$t4,2
add $t0,$t0,$t1
add $t0,$t0,$t2
mul $t0,$t0,$t3
div $t0,$t0,$t4

li $v0,4
la $a0,area
syscall
li $v0,1
add $a0,$t0,$zero
syscall
