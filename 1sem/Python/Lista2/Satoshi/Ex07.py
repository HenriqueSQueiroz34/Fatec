import random

def main():
    v:int = [0]*20
    i:int
    x:int
    t:int

    for i in range(20):
        v[i] = random.randint(1,200)
        for x in range(19):
            if (v[x] > v[x+1]):
                t = v[x]
                v[x] = v[x+1]
                v[x+1] = t

    v.sort()   
    t = int(input('Qual o termo que gostaria de saber as posições entre 1 e 200? '))

    for i in range(20):
        if (v[i] == t):
            print(i)
        
        if (i == 19 and v[i] != t):
            print('Termo não encontrado')

if __name__ == '__main__':
    main()