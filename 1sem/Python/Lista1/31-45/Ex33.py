global s
dec=0
s = 1
while dec <= 0:
    dec = int(input("Digite um número: "))

def formulaDecimal(decimal,soma):
    while decimal > 1:
        soma = soma + soma/decimal
        decimal = decimal - 1
    print("A soma da parte 1 + 1/n é:",soma)

formulaDecimal(dec,s)