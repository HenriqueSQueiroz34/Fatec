def main():
    v:int = [0]*20
    soma:int = 0
    i:int

    for i in range(20):
        v[i] = int(input(f'Digite o valor na posição {i+1}: '))
        soma += v[i] - v[19-i]
    print(soma)

if __name__ == '__main__':
    main()