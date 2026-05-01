global val
def __main__():
    global val
    val=0
    while val <= 0:
        val = int(input("Digite um número:"))
    divisivel()

def divisivel():
    global val
    if val % 2 == 0 and val % 3 == 0:
        return "O valor é divisível por 2 e 3"
    else:
        return "O valor não é divisível por 2 e 3"
    
if "__name__" == __main__():
    divisivel()