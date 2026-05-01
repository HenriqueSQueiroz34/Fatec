cont = 0
max = 0
min = 0

while cont < 100:
    num = int(input(f"Digite um número({cont + 1}): "))
    if num < 0:
        print("Número inválido. Digite um número positivo.")
        continue
    if cont == 0:
        max = num
        min = num
    else:
        if num > max:
            max = num
        if num < min:
            min = num
    cont += 1

print("O maior número é: ", max)
print("O menor número é: ", min)