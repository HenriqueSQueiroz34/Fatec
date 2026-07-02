.data 
val:.asciiz"Qual o valor da compra (apenas inteiro): R$ " # 1000 a 9999,99
prc:.asciiz"Parcelas: "
pval:.asciiz"Valor da última parcelas: R$ " # 100 a 500
n:.asciiz"\n"
.text

main:

li $v0,4
la $a0,val
syscall
li $v0,5
syscall
add $t0,$v0,$zero
la $t9,($t0)

bgt $t0,10000,main
blt $t0,1000,main

li $t1,1

j contas

con:

li $t1,0

c:

add $t1,$t1,1


j fim

contas:

add $t1,$t1,1
sub $t0,$t0,500

bgt $t0,500,contas
blt $t0,500,ultima

j fim

ultima:

li $v0,4
la $a0,n
syscall
li $v0,1
add $a0,$t2,$zero
syscall
li $v0,4
la $a0,n
syscall

blt $t0,100,con

fim:

li $v0,4
la $a0,prc
syscall
li $v0,1
add $a0,$t1,$zero
syscall
li $v0,4
la $a0,n
syscall

la $a0,pval
syscall
li $v0,1
add $a0,$t0,$zero
syscall
