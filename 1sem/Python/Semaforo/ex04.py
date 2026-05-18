# serão 5 carros por pista, tendo 7 equipes
# cada equipe tem 2 carros (14 no total)
# o piloto na pista deve dar 3 voltas e o tempo de cada uma será mostrado
# o piloto que não entrou ficará em espera

import multiprocessing as mulp
from time import sleep
from random import randint

sema = None

def init(s):
    global sema
    sema = s

def corrida(c):
    sleep(0.2)

def main():
    global sema
    carros:int = [[1,2],[3,4],[5,6],[7,8],[9,10],[11,12],[13,14]]

    with mulp.Manager as manager:
        sema = manager.Semaphore(5)
        with mulp.Pool(processes=14,initializer=init,initargs=(sema)) as pool:
            pool.map(corrida,carros)

if __name__ == '__main__':
    main()