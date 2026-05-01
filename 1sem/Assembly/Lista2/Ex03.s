.data
int1:.asciiz"Insira o primeiro número: "
int2:.asciiz"Insir o segundo número: "
dif:.asciiz"A diferenca foi de: "
.text

Main: 

li $v0,4
la $a0,int1
syscall
li $v0,5
syscall
move $t1,$v0

li $v0,4
la $a0,int2
syscall
li $v0,5
syscall
move $t2,$v0

bgt $t2,$t1,maior

sub $t0,$t2,$t1

res: 

li $v0,4
la $a0,dif
syscall
li $v0,1
move $a0,$t0
syscall

j fim

maior: 

move $t3,$t2
move $t2,$t1
move $t1,$t3
j res

fim: