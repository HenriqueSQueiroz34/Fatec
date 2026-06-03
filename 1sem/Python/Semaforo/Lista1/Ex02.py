'''
# 4 pessoas em 200m para 1 porta

randoms
- passos 4 a 6
- abrir porta 1 a 2
'''

from time import sleep as sl
from random import randint as rand
import multiprocessing as mult

andar:int
sema = None

def init(s,a,po):
    global sema,andar,porta
    sema = s
    andar = a
    porta = po

def proc(id):
    global sema,andar,porta
    andado:int = 0

    while(andar.value >= andado):
        pessoa = rand(4,6)
        andado += pessoa
        print('Pessoa #',id,'Andou',pessoa,'m. Faltam',andar.value-andado,'m')
        sl(0.2)

        if (andar.value <= andado):
            porta.value=rand(1,2)
            with sema:
                print('Pessoa #',id,'passando na porta')
                sl(porta.value)
                print('Pessoa #',id,'passou pela porta em',porta.value,'s')
                print('Porta livre')

def main():
    global andar, porta
    ordem:int = [0]*4
    sema = None
    andar = mult.Value('i',200)
    porta = mult.Value('i',0)

    for i in range(len(ordem)):
        ordem[i] = i+1

    with mult.Manager() as man:
        sema = man.Semaphore(1)
        with mult.Pool(processes=4,initializer=init,initargs=(sema,andar,porta)) as pool:
            pool.map(proc,ordem)
    
    print('Todos passaram')

if __name__ == '__main__':
    main()