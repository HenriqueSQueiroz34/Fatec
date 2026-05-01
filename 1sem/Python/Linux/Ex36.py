import os
global s,dir,arq
s=0
dir='/home/henrique/Download/exercicios/'
arq='Ex36.txt'

def fatorial(num):
    tot = 1
    while num > 1:
        tot *= num
        num-=1
    return tot

def divisao(sum,n):
    global s
    f = fatorial(n)
    sum += 1/f # a variável muda de acordo com a repetição
    n-=1
    s+=sum # o valor final é apresentado
    if n > 0: return '1/'+str(n+1) +'!: '+ str(sum)
    else: return '\nTotal: '+str(s)

def grava(s,n):
    global dir,arq
    tipo='w'
    enc='utf-8'
    file = dir + arq
    if (not os.path.isdir(dir) and not os.path.exists(dir)):
        print('O caminho é inválido')
        return
    if (os.path.exists(file)):
        tipo='a'

    with open(file,tipo,encoding=enc) as fi:
        fi.write('Somando 1 + 1/2! + ... + 1/N!' + '\n\n')
    while n >= 1:
        with open(file,tipo,encoding=enc) as f:
            f.write(str(divisao(s,n)) + '\n')
        n-=1

def main():
    global s,dir
    n=0
    os.makedirs(dir,exist_ok=True)
    os.chmod(dir,0o744)
    while n<=0:
        n = int(input("Digite o valor máximo do fatorial: "))
    grava(s,n)

if __name__ == "__main__":
    main()