global sub,c

def __main__():
    global sub,c
    print("Exercício 45:")
    sub = 1
    c = 2
    print("Valor inicial:",sub)
    print("Base  Operação  Valor Final")
    finalBase()

def finalBase():
    global sub,c
    while c <= 15:
        sub = sub + c / (c*c)
        print(c, '       +        ' ,sub)
        c = c + 1
        if c <= 15:
            sub = sub - c / (c*c)
            print(c, '       -        ' ,sub)
            c = c + 1
    print("O valor da série é: {:.2f}".format(sub))

if "__name__" == __main__():
    finalBase()