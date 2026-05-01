global Hini,Mini,Hfim,Mfim
def __main__():
    global Hini,Mini,Hfim,Mfim
    Hini=0
    Mini=0
    Hfim=0
    Mfim=0
    while Hini <= 0 or Mini <= 0 or Hfim <= 0 or Mfim <= 0:
        Hini = int(input("Insira as horas do início do jogo: "))
        Mini = int(input("Insira os minutos do início do jogo: "))
        Hfim = int(input("Qual a hora do fim do jogo: "))
        Mfim = int(input("Quantos minutos do fim do jogo: "))


def tempoDoJogo():
    global Hini,Mini,Hfim,Mfim
    Hjogo = Hfim - Hini
    Mjogo = Mfim - Mini

    if Hjogo < 0:
        Hjogo = (Hjogo + 24)
    if Mjogo < 0:
        Mjogo = Mjogo * -1

    if Hjogo < 23 and Mjogo < 59:
        print(f"O jogo está permitido, tendo duração de {Hjogo}:{Mjogo}.")
    elif Hjogo == 24 and Mjogo == 0:
        print("O jogo pode acontecer, tendo um dia inteiro de duração.")
    else:
        print("O jogo não pode acontecer.")

if "__name__" == __main__():
    tempoDoJogo()