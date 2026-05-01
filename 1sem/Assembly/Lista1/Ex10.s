.data
gran:.asciiz"Digite um numero grande: "
ze:.asciiz"Proibida a divisao por 0\n"
peq:.asciiz"Digite um numero menor: "
res:.asciiz"Resto: "
n:.asciiz"\n"
.text

main:
bgtz $t1,num2
li $v0,4
la $a0,gran
syscall
li $v0,5
syscall
add $t1,$v0,$zero

num2:
li $v0,4
la $a0,peq
syscall
li $v0,5
syscall
add $t2,$v0,$zero
beqz $t2,novot

continua:
bgt $t2,$t1,troca
j dividir

j fim

troca:
move $t3,$t1   # t3 = t1
move $t1,$t2   # t1 = t2
move $t2,$t3   # t2 = t3
j continua

dividir:
sub $t1,$t1,$t2
blt $t1,$t2,fim
j dividir

novot:
li $v0,4
la $a0,ze
syscall
j main

fim:
li $v0,4
la $a0,res
syscall
li $v0,1
add $a0,$t1,$zero
syscall