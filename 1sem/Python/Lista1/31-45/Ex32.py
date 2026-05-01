global resultado
resultado=1
def fatorial(numero):
    global resultado
    while numero>1:
        resultado *= numero
        print(resultado)
        numero-=1


a=0
while a <= 0:
    a = int(input("Digite um número: "))

fatorial(a)