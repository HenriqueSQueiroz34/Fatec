import multiprocessing as mul
import time as ti

def paralelo(id):
    print('Início Thread #',id)
    print('Rodando Thread #',id)
    ti.sleep(0.5)
    print('Fim Thread #',id)


def main():
    id = 5
    params = [0]*id

    for p in range(id):
        params[p] = p

    with mul.Pool(processes=id,) as pool:
        pool.map(paralelo, params)

if __name__ == "__main__":
    main()