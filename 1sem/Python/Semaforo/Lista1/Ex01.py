import time
import multiprocessing

sentido: str = ['azul','amarelo','vermelho','verde']
semaforo = None
limite: int
andado: int
cont: int

def carregar(s,l,a,c):
    global semaforo
    global limite
    global andado
    global cont
    semaforo = s
    limite = l
    andado = a
    cont = c

def thread(i):
    global sentido
    global semaforo
    global limite
    global andado
    global cont

    with semaforo:
        while (limite.value > 0):
            limite.value -= andado.value
            lim = andado.value * cont.value
            print('Carro',sentido[i],'andou',lim,'m')
            time.sleep(0.5)
            if (limite.value == 0):
                print('Venha próximo carro\n')
            cont.value += 1
            
        limite.value = 30
        andado.value = 5
        cont.value = 1

def main():
    i: int
    limite:int
    andado:int
    sem = None
    cont:int
    params:int = [0]*4

    limite = multiprocessing.Value('i',30)
    andado = multiprocessing.Value('i',5)
    cont = multiprocessing.Value('i',1)

    for i in range(len(params)):
        params[i] = i

    with multiprocessing.Manager() as manager:
        sem = manager.Semaphore(1)
        with multiprocessing.Pool(processes=4,initializer=carregar,initargs=(sem,limite,andado,cont)) as pool:
            pool.map(thread,params)

    print('Todos os carros passaram!!')

if __name__ == '__main__':
    main()