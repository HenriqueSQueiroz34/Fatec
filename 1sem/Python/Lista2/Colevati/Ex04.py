# pegar 30 reais // média // qtd acima da média // posições dos vals abaixo da média

def main():
    nums: float = [0.0]*30
    med: float = 0.0
    acima: int = 0
    abaixo: int = []
    j: int = 0

    for i in range(len(nums)):
        nums[i] = float(input('Digite o valor: '))
        med += nums[i]

    med = med/len(nums)
    i=0

    for i in range(len(nums)):
        if (nums[i] > med):
            acima+=1
        if (nums[i] < med):
            abaixo.append(i)

    print('A média é {:.2f}'.format(med))
    print('Quantidade de números acima da média:',acima)
    print('Posições dos números abaixo da média: {}'.format(abaixo))
    print()

if __name__ == '__main__':
    main()