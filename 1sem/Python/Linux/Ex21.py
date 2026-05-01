import os

global dir,arq,nome,nota1,nota2,nota3,nota4,media
dir = '/tmp/exercicios/'
arq = 'Ex21.txt'
nome = ''
nota1,nota2,nota3,nota4,media = 0.0,0.0,0.0,0.0,0.0

def entrada():
    global nome,nota1,nota2,nota3,nota4,media
    nome = input('Digite o nome do aluno: ')
    nota1 = float(input('Digite a primeira nota: '))
    nota2 = float(input('Digite a segunda nota: '))
    nota3 = float(input('Digite a terceira nota: '))
    nota4 = float(input('Digite a quarta nota: '))
    media = med(nota1,nota2,nota3,nota4)
    cadastro(nome,nota1,nota2,nota3,nota4,media)
    return media

def med(n1,n2,n3,n4):
    media = float((n1 + n2 + n3 + n4) / 4)
    return media

def cadastro(nome,nota1,nota2,nota3,nota4,media):
    global dir,arq
    linha = ''
    dir = '/tmp/exercicios/'
    arq = 'Ex21.txt'
    linha = nome + ': ' + str(nota1) + '; ' + str(nota2) + '; ' + str(nota3) + '; ' + str(nota4) + '; ' + f'{media:.2f}' + '\n'
    escreveArq(dir,arq,linha)

def escreveArq(diret,arqui,li):
    file =''
    tipo = ''
    enc = ''
    if (not os.path.isdir(diret) and not os.path.exists(diret)):
        print('O caminho é inválido')
        return
    tipo = 'w'
    file = diret + arqui
    enc = 'utf-8'
    if (os.path.exists(file)):
        tipo = 'a'
    with open(file,tipo,encoding=enc) as f:
        f.write(li)

def main():
    global dir
    os.makedirs(dir, exist_ok=True)
    os.chmod(dir,0o744)
    
    for c in range(1,6):
        print('Cadastro de aluno:',c)
        entrada()

if __name__ == "__main__":
    main()