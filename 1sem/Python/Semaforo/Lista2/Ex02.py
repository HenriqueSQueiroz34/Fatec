'''
    4 cavaleiros
    1 corredor
    2 a 4m por 50ms
    dist: 2km
    aumento:
        - tocha a 500m (+2m)
        - pedra a 1.5k (+2m [o cavaleiro da tocha não pode pegar a pedra])
    - 4 portas aleatórias, 1 é saída, resto é monstro (sem repetir)
'''

from random import randint as rand
import multiprocessing as mull
import multiprocessing.sharedctypes as m
from time import sleep

porta:int
certa:int
toc:int
ped:int

def init(t,p,c,por):
    global toc,ped,certa,porta
    toc = t
    ped = p
    certa = c
    porta = por

def corredor(id,t,pe):
    global porta,certa,toc,ped
    toc.value = 0
    feito = 0
    max = 2000
    pa = rand(0,3)

    if (pa+1 == porta[pa]):
        porta[pa] = 0
    else:
        while pa+1 != porta[pa]:
            pa = rand(0,3)

    anda =rand(2,4)
    feito += anda
    while (feito <= max):
        anda = rand(2,4)

        if (toc.value == 0 and feito >= 500):
            toc.value = 1
            t = 1
            print('Cavaleiro #',id,'pegou a tocha, ele ganha mais 2m de velocidade')
        if (ped.value == 0 and t == 0 and feito >= 1500):
            ped.value = 1
            pe = 1
            print('Cavaleiro #',id,'pegou a pedra, ele ganha mais 2m de velocidade')

        if (t == 1 or pe == 1):
            anda = rand(4,6)

        feito += anda
        if (feito >= max):
            print('Cavaleiro #',id,'irá passar pela porta #',pa+1)
            if (pa+1 == certa.value):
                print('Cavaleiro #',id,'foi pela saída')
                certa.value = 0
            else:
                print('Cavaleiro #',id,'foi devorado')
        else:
            print('Cavaleiro #',id,'andou',anda,'m. Faltam',2000 - feito)
            sleep(0.5)

def main():
    global toc,ped,porta,certa
    cavaleiro:int = [(0,0,0)]*4
    i:int

    porta = m.Array('i',4)

    for i in range(len(porta)):
        porta[i] = i+1

    certa = mull.Value('i',porta[rand(0,3)])
    toc = mull.Value('i',0)
    ped = mull.Value('i',0)

    for i in range(len(cavaleiro)):
        cavaleiro[i] = i+1,0,0

    with mull.Pool(processes=4,initializer=init,initargs=(toc,ped,certa,porta)) as pool:
        pool.starmap(corredor,cavaleiro)

if __name__ == '__main__':
    main()