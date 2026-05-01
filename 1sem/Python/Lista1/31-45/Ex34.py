global d
n=0
d = 1
while n <= 0:
    n = int(input("Digite um número inteiro: "))

def tabuada(numero):
    global d
    while d <= 12:
        print(numero*d, f": {numero} x {d}")
        d += 1

tabuada(n)