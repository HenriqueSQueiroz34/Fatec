import multiprocessing as mulp
from time import sleep
from random import randint

sema = None
limite:int

def init(s,l):
    global sema,limite
    sema = s
    limite = l

def corrida(eq):
    global sema,limite
    temcarro = None
    voltas = 0
    falta:int = 0
    tempo:int = 0
    with sema:
        print('Carro # 1 da equipe #',eq,'na pista')
        print('Carro # 2 da equipe #',eq,'em espera')
        temcarro = True
        sleep(0.5)
        while (temcarro):
            andado:int = randint(10,30)
            falta += andado
            print('Carro # 1 da equipe #',eq,'andou',andado,'m. Faltam',limite.value-falta,'m')
            tempo += 1
            sleep(0.5)
            if (falta >= limite.value):
                voltas += 1
                falta = 0
                if (voltas < 3):
                    print('Carro # 1 da equipe #',eq,'fez',voltas,'volta(s). Tempo:',tempo,'minuto(s)')
                    tempo = 0
                if (voltas == 3): 
                    temcarro = False
                    print('Carro # 1 da equipe #',eq,'terminou o percurso em',tempo,'minutos')
                    print('Carro # 2 da equipe #',eq,'está entrando na pista')
        
        falta = 0
        voltas = 0
        tempo = 0

        while(temcarro == False):
            andado:int = randint(10,30)
            falta += andado
            print('Carro # 2 da equipe #',eq,'andou',andado,'m. Faltam',limite.value-falta,'m')
            tempo += 1
            sleep(0.5)
            if (falta >= limite.value):
                voltas += 1
                falta = 0
                if (voltas < 3):
                    print('Carro # 2 da equipe #',eq,'fez',voltas,'volta(s). Tempo:',tempo,'minuto(s)')
                    tempo = 0
                if (voltas == 3): 
                    temcarro = True
                    print('Carro # 2 da equipe #',eq,'terminou o percurso em',tempo,'minutos')

def main():
    global sema,limite
    carros:int = [0]*7
    i:int

    limite = mulp.Value('i',200)

    for i in range(7):
        carros[i] = i+1

    with mulp.Manager() as manager:
        sema = manager.Semaphore(5)
        with mulp.Pool(processes=7,initializer=init,initargs=(sema,limite)) as pool:
            pool.map(corrida,carros)

    print('Corrida encerrada')

if __name__ == "__main__":
    main()