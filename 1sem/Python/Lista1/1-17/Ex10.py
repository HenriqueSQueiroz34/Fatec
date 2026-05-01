r1=0
r2=0
while r1 <= 0 or r2 <= 0:
    r1 = float(input("Digite um número: "))
    r2 = float(input("Digite outro número: "))

def diferenca():
    d = r1 - r2
    if d < 0:
        return f"A diferença é de {d*(-1):.2f}."
    elif d == 0:
        return("A diferença é 0")
    else:
        return f"A diferença é de {d:.2f}."