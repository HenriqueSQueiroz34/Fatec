.data
larg:.asciiz"Entre com a largura (em metros): "
comp:.asciiz"Entre com o comprimento (em metros): "
n:.asciiz"\n"
m:.asciiz" metros"
.text

main:

# largura entrada
li $v0,4
la $a0,larg
syscall

li $v0,5
syscall
add $t2,$v0,$zero

# comprimento entrada
li $v0,4
la $a0,comp
syscall

li $v0,5
syscall
add $t1,$v0,$zero

# area total
li $t0,0
mul $t0,$t1,$t2

#prints

#valor final
li $v0,1
add $a0,$t0,$zero
syscall 

#" metros"
li $v0,4
la $a0,m
syscall