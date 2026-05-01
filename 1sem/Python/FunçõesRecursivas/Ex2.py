# N + (N-1) + (N-2) + ... + 1

# N deve ser guardada
# a partir do 1º +, pode começar o soma
# soma deve ser a subtração, com adição do 1

def soma(n,t):
    if (n<2):
        return t
    else:
        t += n - soma(n-1,t)
        return n


def main():
    n = int(input("Digite um valor para a somatória de N: "))
    t = n
    t += soma(n,t)
    print(t)

if __name__ == '__main__':
    main()