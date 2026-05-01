def fatora(n):
    if (n > 1):
        f = n * fatora(n-1)
    else: 
        return n
    return f

def somatudo(num,men,t):
    if (num-men != 1):
        t += fatora(num - men)
        t = somatudo(num,men+1,t)
    else:
        t += 1
    return t

def main():
    n = int(input('Digite o valor de N: '))
    menos = 1
    fat = fatora(n)
    fat = somatudo(n,menos,fat)
    print(fat)

if __name__ == '__main__':
    main()