global a,b,c
def __main__():
    global a,b,c
    a=0
    b=0
    c=0
    while a <=0 or b <= 0 or c <= 0:
        a = int(input("Digite o primeiro valor: "))
        b = int(input("Digite o segundo valor: "))
        c = int(input("Digite o terceiro valor: "))
    baskara()

def baskara():
    global a,b,c
    j = b*b-4*a*c

    if j >= 0:
        if j == 0:
            r1 = (-b+(j)**(1/2))/(2*a)
            print("1 raíz real:",r1)
        else:
            r1 = (-b+(j)**(1/2))/(2*a)
            r2 = (-b-(j)**(1/2))/(2*a)
            print("2 raízes reais:",r1,r2)
    else:
        print("Nenhuma raíz real")

if "__name__" == __main__():
    baskara()