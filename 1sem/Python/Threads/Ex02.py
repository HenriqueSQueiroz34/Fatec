import multiprocessing as mul
import time as t
import random as r

def repetir(params):
    soma = 0
    para: int = [0]*5
    v1 = r.randint(1,100)
    v2 = r.randint(1,100)
    v3 = r.randint(1,100)
    v4 = r.randint(1,100)
    v5 = r.randint(1,100)
    
    para[0] = v1
    para[1] = v2
    para[2] = v3
    para[3] = v4
    para[4] = v5

    for p in range(len(para)):
        soma += para[p]
        print("Linha #",params,"Soma:",soma)
        t.sleep(0.2)

def main():
    id: int 
    params: int = [0]*3

    for id in range(3):
        params[id] = id

    with mul.Pool(processes=3) as pool:
        pool.map(repetir,params)

if __name__ == "__main__":
    main()