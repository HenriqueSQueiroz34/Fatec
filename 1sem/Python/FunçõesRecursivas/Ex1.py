# Soma de 1 a 100

def somador(n):
    while (n < 100):
        n=n+somador(n+1)
    return n

def main():
    n=1
    print(somador(n))

if __name__ == '__main__':
    main()