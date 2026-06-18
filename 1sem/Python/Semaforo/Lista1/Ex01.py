import time
import multiprocessing
import random

sentido: str = ['azul','amarelo','vermelho','verde']
semaforo = None
andado: int

def carregar(s,a):
    global semaforo
    global andado
    semaforo = s
    andado = a

def thread(i):
    global sentido
    global semaforo
    global andado
    lim = 30

    with semaforo:
        while (lim > 0):
            lim -= andado.value
            print('Carro',sentido[i],'andou',andado.value,'m')
            andado.value = random.randint(1,5)
            time.sleep(0.5)
            if (lim <= 0):
                print('Venha próximo carro\n')

def main():
    i: int
    andado:int
    sem = None
    params:int = [0]*4

    andado = multiprocessing.Value('i',random.randint(1,5))

    for i in range(len(params)):
        params[i] = i

    with multiprocessing.Manager() as manager:
        sem = manager.Semaphore(1)
        with multiprocessing.Pool(processes=4,initializer=carregar,initargs=(sem,andado)) as pool:
            pool.map(thread,params)

    print('Todos os carros passaram!!')

if __name__ == '__main__':
    main()