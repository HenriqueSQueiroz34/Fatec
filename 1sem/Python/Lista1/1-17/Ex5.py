def raizes():
    # achando o delta
    delta = b**2 - 4*a*c
    raiz1 = (-b + delta**0.5) / (2*a)
    raiz2 = (-b - delta**0.5) / (2*a)
    if delta >= 0:
        return "A equação tem raízes reais."
    elif delta == 0:
        return "A equação tem uma raiz real:", raiz1
    else:
        return "A equação tem duas raízes reais.", raiz1, "e", raiz2


a=0
b=0
c=0
while a <= 0 or b <= 0 or c <= 0:
    a = int(input("Digite um número inteiro: "))
    b = int(input("Digite outro número inteiro: "))
    c = int(input("Digite mais um número inteiro: "))
print(raizes())