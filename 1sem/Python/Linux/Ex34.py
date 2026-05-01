import os

global valor,dir,arq,arquivo
valor:int=0
dir:str=''
arq:str=''
arquivo:str=''



def mult(multiplo,maximo):
    res = multiplo * maximo
    return res

def grava(cont,res):
    global dir,arq
    dir = '/tmp/exercicios/'
    arq = 'Ex34.txt'
    file = ''
    tipo = ''
    enc = ''
    linha = ''
    linha = str(res) + '\n'
    
    if not os.path.exists(dir) and not os.path.isdir(dir):
        print('O caminho é inválido')
        return
    tipo = 'w'
    file = dir + arq
    enc = 'utf-8'
    if (os.path.exists(file)):
        tipo = 'a'
    with open(file,tipo,encoding=enc) as f:
        f.write(linha)

def main():
    global valor,dir
    contador:int=1
    result:int=0

    dir = '/tmp/exercicios/'
    os.makedirs(dir, exist_ok=True)
    os.chmod(dir,0o744)

    valor = int(input('Digite um número para calcular a tabuada: '))

    for contador in range(1,11):
        result = mult(valor,contador)
        grava(contador,result)

if __name__ == "__main__":
    main()