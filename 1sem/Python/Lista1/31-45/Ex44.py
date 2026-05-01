base=0
expoente=0
while base <= 0 or expoente <= 0:
    base = int(input("Digite a base da potência: "))
    expoente = int(input("Digite o expoente da potência: "))
res = 1

while expoente > 0:
    res *= base
    expoente -= 1

print("Resultado:", res)