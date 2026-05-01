.data
num:.asciiz"Informe qualquer número: "
res:.asciiz"O número final é: "
.text

main:
li $v0,4
la $a0,num
syscall
li $v0,5
syscall
add $t1,$v0,$zero

rem $t2,$t1,2
beq $t2,$zero,soma5   # (mod) == 0

addi $t0,$t1,8
j fim

soma5:
addi $t0,$t1,5
j fim

fim:
li $v0,4
la $a0,res
syscall
li $v0,1
add $a0,$t0,$zero
syscall