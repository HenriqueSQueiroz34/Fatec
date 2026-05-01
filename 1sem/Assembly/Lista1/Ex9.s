.data
n1:.asciiz"Digite um número: "
n2:.asciiz"Digite outro numero: "
inv:.asciiz"0 invalidado"
res:.asciiz"Resultado(inteiro): "
n:.asciiz"\n"
.text

main:
li $v0,4
la $a0,n1
syscall
li $v0,5
syscall
add $t1,$v0,$zero

li $v0,4
la $a0,n2
syscall
li $v0,5
syscall
add $t2,$v0,$zero
beqz $t2,maior

divisao:
div $t0,$t1,$t2
li $v0,4
la $a0,res
syscall
li $v0,1
add $a0,$t0,$zero
syscall
j fim

maior:
li $v0,4
la $a0,inv
syscall
la $a0,n
syscall
li $v0,4
la $a0,n2
syscall
li $v0,5
syscall
add $t2,$v0,$zero
beqz $t2,maior
j divisao

fim: