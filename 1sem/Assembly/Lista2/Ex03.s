.data
aa:.asciiz"Qual o ano atual: "
ma:.asciiz"Qual o mes atual: "
an:.asciiz"Informe o ano de nascimento: "
mn:.asciiz"Informa o mes de nascimento: "
idade:.asciiz"Meses de vida: "
.text

main:

# ano-mês
# $t1-2: nascimento
# $t3-4: atual

nascimento:
li $v0,4
la $a0,an
syscall
li $v0,5
syscall
add $t1,$v0,$zero

li $v0,4
la $a0,mn
syscall
li $v0,5
syscall
add $t2,$v0,$zero

bgt $t2,12,nascimento

atual:
li $v0,4
la $a0,aa
syscall
li $v0,5
syscall
add $t3,$v0,$zero

li $v0,4
la $a0,ma
syscall
li $v0,5
syscall
add $t4,$v0,$zero

bgt $t4,12,atual

bgt $t1,$t3,nascimento

#contas
anos:
add $t0,$t0,12
sub $t3,$t3,1
blt $t1,$t3,anos

meses:
sub $t4,$t4,$t2
bltz $t4,menor
add $t0,$t0,$t4
j fim

menor:
add $t0,$t0,$t4

fim:
li $v0,1
add $a0,$t0,$zero
syscall
