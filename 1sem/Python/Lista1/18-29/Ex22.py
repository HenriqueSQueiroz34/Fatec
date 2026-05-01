global v1,v2
def __main__():
    global v1,v2
    v1=0
    2=0
    while v1 <= 0 or v2 <= 0:
        v1 = int(input("Digite o primeiro valor: "))
        v2 = int(input("Digite o segundo valor: "))
    ordem()

def ordem():
    global v1,v2
    if v1 > v2:
        print(f"A ordem crescente dos valores é: {v2}, {v1}")
    elif v2 > v1:
        print(f"A ordem crescente dos valores é: {v1}, {v2}")
    else:
        print("Valores iguais")

if "__name__" == __main__():
    ordem()