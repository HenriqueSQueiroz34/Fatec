.data
pri:.asciiz"Qual o primeiro valor: "
seg:.asciiz"E o segundo: "
troca:.asciiz"Trocando fica "
es:.asciiz" e "
.text

main:

li $v0,4
la $a0,pri
syscall
li $v0,5
syscall
add $t0,$v0,$zero

li $v0,4
la $a0,seg
syscall
li $v0,5
syscall
add $t1,$v0,$zero

add $t2,$t0,$zero
add $t0,$t1,$zero
add $t1,$t2,$zero

li $v0,4
la $a0,troca
syscall
li $v0,1
add $a0,$t0,$zero
syscall
li $v0,4
la $a0,es
syscall
li $v0,1
add $a0,$t1,$zero
syscall