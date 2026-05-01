def inverte():
    global x, y
    c = x
    x = y
    y = c

x=0
y=0
while x <= 0 or y <= 0:
    x = int(input("Digite um número inteiro: "))
    y = int(input("Digite outro número inteiro: "))

print("O valor de x é:", x)
print("O valor de y é:", y)

print("Trocando os valores...")

inverte()

print("O valor de x é:", x)
print("O valor de y é:", y)