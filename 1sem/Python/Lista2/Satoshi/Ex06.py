from random import randint  as rn

def main():
    vetor:int = [0]*20

    for i in range(len(vetor)):
        vetor[i] = rn(1,200)

    vetor.sort()
    print(vetor)

if __name__ == '__main__':
    main()