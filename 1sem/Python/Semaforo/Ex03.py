import time
import multiprocessing as mulp
import random as ram

sema = None
posic:int

def init(s,p):
    global sema
    global posic
    sema = s
    posic = p

def corrida(sapo,fez,falta):
    global posic
    while(falta >= fez):
        percurso:int
        salto:int = ram.randint(1,5)

        fez += salto
        percurso = fez - falta

        if (percurso >= 0):
            with sema:
                print('Sapo #',sapo,'chegou em',posic.value,'º lugar')
                posic.value = posic.value + 1
        else:
            print('Sapo #',sapo,'Pulou',salto,'cm. Faltam', percurso*(-1))
        time.sleep(0.2)

def main():
    global sema, posic
    sapo:int
    correr:int = 100
    fez:int = 0
    carSapo:int = [(0,0,0)]*5

    print('A corrida de sapos já vai começar')

    for sapo in range(5):
        carSapo[sapo] = sapo+1,fez,correr

    posic = mulp.Value('i',1)

    with mulp.Manager() as manager:
        sema = manager.Semaphore(1)
        with mulp.Pool(processes=5,initializer=init,initargs=(sema,posic)) as pool:
            pool.starmap(corrida,carSapo)



if __name__ == "__main__":
    main()