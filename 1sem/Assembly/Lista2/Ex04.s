.data
sal:.asciiz"Informe o salario inteiro do funcionario R$ "
novo:.asciiz"o novo salario com 25% acrescido ficou R$ "
.text

main:

li $v0,4
la $a0,sal
syscall
li $v0,5
syscall
la $t1,($v0)

la $t0,($t1)

mul $t1,$t1,25
div $t1,$t1,100

add $t0,$t1,$t0

li $v0,4
la $a0,novo
syscall
li $v0,1
add $a0,$t0,$zero
syscall