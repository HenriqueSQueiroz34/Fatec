.data
peq:.asciiz"Entre com a quantia de camisetas pequenas: "
med:.asciiz"Entre com a quantia de camisetas medias: "
gran:.asciiz"Entre com a quantia de camisetas grandes: "
total:.asciiz"Valor total: "
din:.asciiz"R$ "
n:.asciiz"\n"
.text

main:

# entradas

	# pequenas  # $t1
	li $v0,4
	la $a0,peq
	syscall
	li $v0,5
	syscall
	addi $t1,$v0,0 

	# médias  # $t2
	li $v0,4
	la $a0,med
	syscall
	li $v0,5
	syscall
	addi $t2,$v0,0
	
	# grandes  # $t3
	li $v0,4
	la $a0,gran
	syscall
	li $v0,5
	syscall
	addi $t3,$v0,0

# cálculo
mul $t1,$t1,10
mul $t2,$t2,12
mul $t3,$t3,15

add $t0,$t0,$t1
add $t0,$t0,$t2
add $t0,$t0,$t3

# sáida
li $v0,4
la $a0,total
syscall

li $v0,4
la $a0,din
syscall

li $v0,1
add $a0,$zero,$t0
syscall
