global a,b,c,d
def __main__():
    global a,b,c,d
    a=0
    b=0
    c=0
    d=0
    while a <= 0 or b <= 0 or c <= 0 or d <= 0:
        a = int(input("Digite um número pequeno: "))
        b = int(input("Digite um número maior que o anterior: "))
        c = int(input("Digite um número ainda maior: "))
        d = int(input("Insira qualquer número agora:"))
    ordem()

def ordem():
    global a,b,c,d
    if d < a:
        print(f"A ordem é: {d}, {a}, {b}, {c}")
    elif d < b:
        print(f"A ordem é: {a}, {d}, {b}, {c}")
    elif d < c:
        print(f"A ordem é: {a}, {b}, {d}, {c}")
    else:
        print(f"A ordem é: {a}, {b}, {c}, {d}")
    
if "__name__" == __main__():
    ordem()