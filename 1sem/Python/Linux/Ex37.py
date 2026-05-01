# Fibonacci em um e impares da sequência em outro
import os

global d, arq1, arq2, n, tipo, enc, file1, file2
d = '/home/henrique/temp/'
arq1 = 'Ex37.txt'
arq2 = 'Ex37_Impares.txt'
n = 0
tipo = 'w'
enc = 'utf-8'
file1 = d+arq1
file2 = d+arq2

def fibon(n):
    res = ''
    a = 1
    b = 1
    if n >= 1:
        res += '1\n'
    if n >= 2:
        res += '1\n'
    while n >= 3:
        res += str(a+b) + '\n'
        if n % 2 == 0:
            a += b
        else:
            b += a
        n-=1
    return res

def fiboimp(n):
    res = ''
    a = 1
    b = 1
    if n >= 1:
        res += '1\n'
    if n >= 2:
        res += '1\n'
    while n >= 3:
        t = a+b
        if n % 2 == 0:
            a += b
        else:
            b += a

        if t % 2 == 1:
            res += str(t) + '\n'
        n-=1
    return res

def grava1(n):
    global tipo, enc, file1
    r = fibon(n)
    if (os.path.exists(file1)):
        os.remove(file1)
    with open(file1,tipo,encoding=enc) as f1:
        f1.write(r)

def grava2(n):
    global tipo, enc, file2
    re = fiboimp(n)
    if (os.path.exists(file2)):
        os.remove(file2)
    with open(file2,tipo,encoding=enc) as f2:
        f2.write(re)


def main():
    global n
    n = int(input('Digite em qual posição da sequência de fibonacci deseja parar: '))
    if n <= 0:
        n = int(input('Digite em qual posição da sequência de fibonacci deseja parar: '))
    grava1(n)
    grava2(n)
    print('Terminado')

if __name__ == "__main__":
    main()