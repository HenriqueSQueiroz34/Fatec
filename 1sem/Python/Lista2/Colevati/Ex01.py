# pegar 50 vals // média entre 10 e 200 // soma dos ímpares

def main():
    numeros: int = [0]*50
    mediaS: float = 0.0
    mediaC: int = 0
    somaImpar: int = 0

    for i in range(len(numeros)):
        numeros[i] = int(input(f'Insira o valor {i+1}: '))

        if (numeros[i] % 2 == 1):
            somaImpar += numeros[i]

        if (numeros[i] >= 10 and numeros[i] <= 200):
            mediaS += numeros[i]
            mediaC += 1

    print('A média dos números entre 10 e 200 é {:.2f}'.format(mediaS/mediaC))
    print('Somando todos os ímpares temos',somaImpar)

if __name__ == '__main__':
    main()