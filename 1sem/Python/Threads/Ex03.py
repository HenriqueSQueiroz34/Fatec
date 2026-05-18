import time
import multiprocessing as mulp
import random as ram

def corrida(sapo,fez,falta):
    while(falta >= fez):
        percurso:int
        salto:int = ram.randint(0,5)

        fez += salto
        percurso = fez - falta

        if (percurso >= 0):
            print('Sapo #',sapo,'chegou')
        else:
            print('Sapo #',sapo,'Pulou',salto,'cm')
        time.sleep(0.2)

def main():
    sapo:int
    correr:int = 100
    fez:int = 0
    carSapo:int = [(0,0,0)]*5

    print('A corrida de sapos já vai começar')

    for sapo in range(5):
        carSapo[sapo] = sapo+1,fez,correr

    with mulp.Pool(processes=5) as pool:
        pool.starmap(corrida,carSapo)



if __name__ == "__main__":
    main()