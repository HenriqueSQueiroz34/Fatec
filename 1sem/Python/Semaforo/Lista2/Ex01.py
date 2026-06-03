from random import uniform as rand
from time import sleep
import multiprocessing as mt

mano:int
taxi:int
deco:int
afs:int
lado:int
sema = None

def init(m,t,d,a,l,s):
    global mano,taxi,deco,afs,lado,sema
    mano=m
    taxi=t
    deco=d
    afs=a
    lado=l
    sema=s

def voo(id):
    global mano,taxi,deco,afs,lado,sema

    mano.value = rand(0.3,0.7)
    taxi.value = rand(0.5,1.0)
    deco.value = rand(0.6,0.8)
    afs.value = rand(0.3,0.8)
    
    print('Avião #',id,f'está manobrando')
    sleep(mano.value)
    print('Avião #',id,f'está taxiando')
    sleep(taxi.value)
    print('Avião #',id,'em espera de ordens')
    with sema:
        if (lado.value == 1): print('Avião #',id,'está decolando na pista Norte')
        else: print('Avião #',id,'está decolando na pista Sul')
        lado.value = 2
        sleep(deco.value)
        print('Avião #',id,f'está se afastando, espere')
        lado.value = 1
        sleep(afs.value)
        print('Avião #',id,'já voou')

def main():
    global mano,taxi,deco,afs,lado
    ordem:int = [0]*12
    i:int

    for i in range(len(ordem)):
        ordem[i] = i+1
    
    mano = mt.Value('f',0.0)
    taxi = mt.Value('f',0.0)
    deco = mt.Value('f',0.0)
    afs = mt.Value('f',0.0)
    lado = mt.Value('i',1)

    with mt.Manager() as man:
        sema = man.Semaphore(2)
        with mt.Pool(processes=12,initializer=init,initargs=(mano,taxi,deco,afs,lado,sema)) as pool:
            pool.map(voo,ordem)

    print('Todos os aviões já estão voando.')

if __name__ == '__main__':
    main()