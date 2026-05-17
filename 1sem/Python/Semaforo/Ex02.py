'''
# 4 pessoas em 200m para 1 porta

randoms
- passos 4 a 6
- abrir porta 1 a 2
'''

from time import sleep as sl
from random import randint as rand
import multiprocessing as mult

pessoa:int
andar:int
porta:int
sema = None

def init(s,pe,a,po):
    global sema,pessoa,andar,porta
    sema = s
    pessoa = pe
    andar = a
    porta = po

def proc(id):
    global sema,pessoa,andar,porta
    andado:int = 0

    while(andar.value >= andado):
        andado += pessoa.value 
        print('Pessoa #',id,'Andou',pessoa,'m')
        sl(0.2)

        if (andar.value <= andado):
            with sema:
                print('Pessoa #',id,'passando na porta')
                sl(porta.value)
                print('Porta livre')
                print('Pessoa #',id,'passou pela porta')

def main():
    global pessoa,andar, porta
    ordem:int = [0]*4
    sema = None
    pessoa = mult.Value('i',rand(4,6))
    andar = mult.Value('i',200)
    porta = mult.Value('i',rand(1,2))

    for i in range(len(ordem)):
        ordem[i] = i+1

    with mult.Manager() as man:
        sema = man.Semaphore(1)
        with mult.Pool(processes=4,initargs=init,initializer=(sema,pessoa,andar,porta)) as pool:
            pool.map(proc,ordem)
    
    print('Todos passaram')

if __name__ == '__main__':
    main()