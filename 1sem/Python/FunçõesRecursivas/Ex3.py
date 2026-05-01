# 1/1 + 1/2 + ... + 1/N

def divi(n,t):
    if (n > 1):
        t += 1/n
        print(t)
        divi(n-1,t)

def main():
    n = int(input('Informe até quanto será seu N: '))
    t = 1
    divi(n,t)

if __name__ == '__main__':
    main()