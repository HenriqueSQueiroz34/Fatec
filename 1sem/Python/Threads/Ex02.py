"""Fazer uma aplicação que, na main, inicialize uma variável id, inteira e inicialize 5 variáveis
inteiras para valores, crie um vetor de parâmetros, com o id como primeiro parâmetro e um
vetor com os 5 valores recebidos. As variáveis que recebem os valores devem receber, cada
uma delas, um valor aleatório de 1 a 100. Esses parâmetros devem ser preenchidos para 3
chamadas de Threads. Faça 3 chamadas de Threads, passando os parâmetros e, cada Thread,
deve calcular a soma de cada linha (Cada iteração do laço, para a soma deve ser seguido por
um sleep de 0.2 segundos), ao final, deve-se imprimir a identificação da linha e o resultado da
soma."""
import multiprocessing as mul
import time as t
import random as r

# cada thread a chamar, novos valores para as 5 vars
# calcular a soma dos valores recebidos em cada uma das 3 threads a chamar
# o resultado deve ser colocado na respectiva posição em params
# sleep(0.2) para cada thread
# imprimir o vetor de resultado e a posição de cada um destes em params

def repetir(params):
    v1 = r.randint(1,100)
    v2 = r.randint(1,100)
    v3 = r.randint(1,100)
    v4 = r.randint(1,100)
    v5 = r.randint(1,100)

def main():
    id:int = 3
    v1:int = 0
    v2:int = 0
    v3:int = 0
    v4:int = 0
    v5:int = 0
    paramid:int =[0]*3
    params:int = [0]*5

    for p in range(id):
        paramid[p] = p

    with mul.Pool(processes=id) as pool:
        pool.map(repetir,paramid)    

if __name__ == "__main__":
    main()