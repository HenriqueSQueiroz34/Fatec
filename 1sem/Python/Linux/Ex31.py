# números de 10 a 150, seus quadrados
import os

global d, arq, n
d = '/home/henrique/temp/'
arq = 'Ex31.txt'
n = 10

def quad(num):
    num *= num
    return num

def main():
    res = ''
    global d, arq, n
    while n <= 150:
        res += str(n) + ': ' + str(quad(n)) + '\n'
        n+=1
    
    # fazendo a manipulação de arquivo
    tipo = 'w'
    enc = 'utf-8'
    file = d + arq
    if (os.path.exists(file)):
        os.remove(file)
    with open(file,tipo,encoding=enc) as f:
        f.write(res)

if __name__ == "__main__":
    main()