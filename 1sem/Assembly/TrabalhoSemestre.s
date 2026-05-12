.data
n:.asciiz"\nDigite o termo final da fórmula: "
erro:.asciiz"\nInválido.Repita!\n"
res:.asciiz"\nResultado final: "
.text

# lista de vars:
# n -> $t1
# somador -> $t2
# soma -> $t3
# resultado -> $t0

main: # pegando o valor de n
li $v0,4
la $a0,n
syscall
li $v0,5
syscall
move $t1,$v0
blez $t1,err
li $t0,1

enquanto: # definir o somador
rem $t2,$t1,2
beq $t2,0,par
li $t2,2
	continua: # calculando
	add $t3,$t1,$t2
	mul $t0,$t0,$t3
	sub $t1,$t1,1
	
bge $t1,1,enquanto
j fim

par:
li $t2,1
j continua

err:
li $v0,4
la $a0,erro
syscall
j main

fim:
li $v0,4
la $a0,res
syscall
li $v0,1
move $a0,$t0
syscall