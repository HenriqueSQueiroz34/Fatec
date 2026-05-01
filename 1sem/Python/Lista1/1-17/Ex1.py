def calcular_area_quadrado():
    return lado * lado
lado=0
while lado <= 0:
    lado = int(input("Digite o valor do lado do quadrado: "))
print(f"A área do quadrado é: {calcular_area_quadrado()}")