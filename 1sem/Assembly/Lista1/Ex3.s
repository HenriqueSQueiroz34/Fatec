.data
normal:.asciiz"Quantas horas de trabalho normal foram cumpridas?: "
extra:.asciiz"E as horas extras?: "
desc:.asciiz"Qual a porcentagem do desconto?: "
sal:.asciiz"Salario liquido de: R$ "
n:.asciiz"\n"
.text

main:
# horas normais $t1
li $v0,4
la $a0,normal
syscall
li $v0,5
syscall
add $t1,$v0,$zero

# horas extras $t2
li $v0,4
la $a0,extra
syscall
li $v0,5
syscall
add $t2,$v0,$zero

# desconto $t3
li $v0,4
la $a0,desc
syscall
li $v0,5
syscall
add $t3,$v0,$zero

# contas
addi $t4,$t4,10
addi $t5,$t5,15
mul $t1,$t1,$t4   # $t1 = $t1 * $t4
mul $t2,$t2,$t5   # $t2 = $t2 * $t5
add $t0,$t0,$t1   # $t0 = $t0 + $t1
add $t0,$t0,$t2   # $t0 = $t0 + $t2
div $t3,$t0,$t3   # $t3 = $t0 / $t3
sub $t0,$t0,$t3

# saida
li $v0,4
la $a0,sal
syscall
li $v0,1
add $a0,$t0,$zero
syscall