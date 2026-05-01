def __main__():
    voltas=0
    tam=0
    min=0
    while voltas <= 0 or tam <= 0 or min <= 0:
        voltas = int(input("Informe as voltas feitas: "))
        tam = int(input("Qual o tamanho do circuito:"))
        min = int(input("Quantos minutos levou: "))
    velocidade(voltas,tam,min)

def velocidade(voltas,tamanho,minuto):
    vmpm = int(voltas * tamanho / minuto)
    kmh = vmpm * 3.6
    print(vmpm, "metros por minuto ou", kmh, "km/h")

if "__name__" == __main__():
    velocidade()