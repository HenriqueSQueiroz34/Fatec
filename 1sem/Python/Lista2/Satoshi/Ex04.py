vetor:int = [0]*30
media:float = 0.0
acima:int = 0
abaixo:int = []

def main():
    global vetor,media,acima,abaixo
    for i in range(len(vetor)):
        vetor[i] = int(input(f'Digite o termo {i+1}: '))

        media += vetor[i]

        if (i == len(vetor)-1):
            media = media / i

    for i in range(len(vetor)):
        if (vetor[i]>media): acima+=1
        elif (vetor[i]<media): abaixo.append(i)

    print(f'Média do grupo: {media}\nQTD acima da média: {acima}\nPosições dos abaixo da média: {abaixo}')

if __name__ == '__main__':
    main()