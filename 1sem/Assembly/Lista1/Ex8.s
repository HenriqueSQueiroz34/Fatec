.data
n:.asciiz"Informe número positivo ou negativo: "
z:.asciiz"0 nao pode"
r:.asciiz"Resultado final: "
.text

main:
li $v0,4
la $a0,n
syscall
li $v0,5
syscall
add $t1,$v0,$zero

blt $t1,$zero,nega
beqz $t1,zero

mul $t0,$t1,$t1
j fim

zero:
li $v0,4
la $a0,z
syscall
j ze

nega:
mul $t0,$t1,$t1
mul $t0,$t0,$t1

fim:
li $v0,4
la $a0,r
syscall
li $v0,1
add $a0,$t0,$zero
syscall

ze: