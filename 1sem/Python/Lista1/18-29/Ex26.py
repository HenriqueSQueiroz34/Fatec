global n1,n2
def __main__():
    global n1,n2
    n1 = int(input("Informe um número: "))
    n2 = int(input("Dê outro número: "))
    maioredivisivel()

def maioredivisivel():
    global n1,n2
    if n1 > n2:
        som = n1 % n2
        if som == 0:
            print(f"{n1} é maior que {n2} e também é divisível")
        else:
            print(f"{n1} é maior que {n2}")
    elif n2 > n1:
        som = n2 % n1
        if som == 0:
            print(f"{n2} é maior que {n1} e também é divisível")
        else:
            print(f"{n2} é maior que {n1}")
    else:
        print("Números iguais")
    
if "__name__" == __main__():
    maioredivisivel()