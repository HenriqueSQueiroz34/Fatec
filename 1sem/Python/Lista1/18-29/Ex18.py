global n1
global n2
def __main__():
    global n1, n2
    n1=0
    n2=0
    while n1 <= 0 or n2 <= 0:
        n1 = int(input("Digite o primeiro número: "))
        n2 = int(input("Digite o segundo número: "))
    diferenca()

def diferenca():
    global n1, n2
    dif = n1 - n2

    if dif != 0:
        if dif < 0:
            dif *= -1
        print(dif, "é a diferença entre eles")
    else:
        print("Os números são iguais.")
    
if "__name__" == __main__():
    diferenca()