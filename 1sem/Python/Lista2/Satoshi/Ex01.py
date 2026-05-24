def main():
    vetor:int = [0]*50
    somai:int = 0
    j:int
    contm:int = 0
    med:int = 0

    for j in range(50):
        vetor[j] = int(input(f'Digite o termo {j+1}: '))
        if (vetor[j]%2==1):
            somai += vetor[j]
        if (vetor[j] >= 10 and vetor[j] <= 200):
            med += vetor[j]
            contm += 1

    print(f'Soma dos valores impares: {somai}')
    print(f'Média dos valores entre 10 e 200: {med/contm:.2f}')

if __name__ == '__main__':
    main()