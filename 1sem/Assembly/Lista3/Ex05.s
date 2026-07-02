.data
n1:.asciiz"Digite o primeiro numero: "
n2:.asciiz"Digite o segundo numero: "
res:.asciiz"A soma dos impares entre os dois fica "
.text

main:

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

bgt $t1,$t2,maior

resto:

rem $t3,$t1,2
beq $t3,0,par

# laço de repetição
somas:

add $t3,$t1,$zero
add $t0,$t0,$t3
add $t1,$t1,2

bgt $t2,$t1,somas
j fim

par:

addi $t1,$t1,1
j somas

# invertendo valores
maior:
move $t3,$t1
move $t1,$t2
move $t2,$t3
j resto

fim:

li $v0,4
la $a0,res
syscall
li $v0,1
move $a0,$t0
syscall
