.data
raio:.asciiz"Insira o raio da circunferência: "
res:.asciiz"O comprimento é "
.text

Main: 

li $v0,4
la $a0,raio
syscall
li $v0,5
syscall
move $t1,$v0

add $t2,$t2,6
mul $t0,$t2,$t1

li $v0,4
la $a0, res
syscall
li $v0,1
move $a0,$t0
syscall 