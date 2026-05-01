def impares(inicial, final, soma):
    numero = inicial % 2
    if numero == 0:
        inicial += 1
    while inicial <= final:
        soma += inicial
        if soma <= final:
            print(soma)
        inicial += 2



a = int(input("Digite um valor: "))
b = int(input("Digite outro valor: "))
soma = 0

if a < b:
    impares(a,b,soma)
elif b > a:
    impares(b,a,soma)
else:
    print("Valores iguais")