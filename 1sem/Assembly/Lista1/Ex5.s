.data
cat:.asciiz"Insira o valor do cateto: "
hip:.asciiz"A hipotenusa vale: "
.text

main:
li $v0,4
la $a0,cat
syscall
li $v0,5
syscall
move $t1,$v0

li $v0,4
la $a0,cat
syscall
li $v0,5
syscall
move $t2,$v0

# Estimativa de Taylor
# a = b + c²
#        ---
#        2b
mul $t2,$t2,$t2, # c²
mul $t3,$t1,2    # 2b
div $t3,$t2,$t3  # c² / 2b
add $t0,$t1,$t3  # a = b + $t3

li $v0,4
la $a0,hip
syscall
li $v0,1
add $a0,$t0,$zero
syscall