def rendimento():
    novoVal = valor * 1.3
    return novoVal

valor=0
while valor <=0:
    valor = float(input("Digite o depósito desejado: "))


print("O valor do depósito com o rendimento é: R$ %.2f" %rendimento())