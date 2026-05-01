def conversao():
    fah = (9*cel+160) /5
    return fah

cel=0
while cel <= 0:
    cel = int(input("Digite a temperatura em Celsius: "))
print("A temperatura em Fahrenheit é:", conversao())