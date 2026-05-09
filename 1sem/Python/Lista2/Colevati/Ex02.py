# pegar 100 vals // mostrar média // maior e menor

def main():
    nums: int = [0]*100
    med: int = 0
    maior: int = 0
    menor: int = 0

    for i in range(len(nums)):
        nums[i] = int(input(f'Insira o valor {i+1}: '))
        med += nums[i]

        if (i==0):
            maior = nums[i]
            menor = nums[i]

        if (nums[i] > maior):
            maior = nums[i]
        if (nums[i] < menor):
            menor = nums[i]
    
    print('A média dos valores é {:.2f}'.format(med/len(nums)))
    print('O maior número é',maior,'\nO menor número é',menor)

if __name__ == '__main__':
    main()