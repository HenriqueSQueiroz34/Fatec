.data
alt:.asciiz"Digite sua altra em cm"
menor:.asciiz"Menor altura: "
maior:.asciiz"Maior altura: "
zr:.asciiz"Invalidado. Repita.\n"
p1:.asciiz"("
p2:.asciiz"): "
n:.asciiz"\n"
.text

main:
li $v0,4
la $a0,alt
syscall

# Aqui faz a impressão de qual ordem das alturas é digitada
la $a0,p1
syscall
li $v0,1
addi $t4,$t4,1
add $a0,$t4,$zero
syscall
li $v0,4
la $a0,p2
syscall

li $v0,5
syscall
add $t1,$v0,$zero
ble $t1,$zero,zer
beq $t4,1,adiciona

blt $t1,$t2,meno
bgt $t1,$t3,maio

ble $t4,14,main

li $v0,4
la $a0,menor
syscall
li $v0,1
add $a0,$t2,$zero
syscall
li $v0,4
la $a0,n
syscall

li $v0,4
la $a0,maior
syscall
li $v0,1
add $a0,$t3,$zero
syscall

j fim

zer:
li $v0,4
la $a0,zr
syscall
la $a0,alt
syscall

la $a0,p1
syscall
li $v0,1
add $a0,$t4,$zero
syscall
li $v0,4
la $a0,p2
syscall

li $v0,5
syscall
add $t1,$v0,$zero
ble $t1,$zero,zer
j main

adiciona:
add $t2,$t1,$zero
add $t3,$t1,$zero
j main

meno:
sub $t2,$t2,$zero
add $t2,$t1,$zero
j main

maio:
sub $t3,$t3,$zero
add $t3,$t1,$zero
j main

fim:
