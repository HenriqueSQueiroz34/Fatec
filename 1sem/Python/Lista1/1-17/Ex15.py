cat1=0
cat2=0
while cat1 <= 0 or cat2 <= 0:
    cat1 = float(input("Digite a medida do cateto oposto: "))
    cat2 = float(input("Digite a medida do cateto adjacente: "))

def hipot():
    return (cat1 ** 2 + cat2 ** 2) ** 0.5

print(f"A medida da hipotenusa é: {hipot()}")