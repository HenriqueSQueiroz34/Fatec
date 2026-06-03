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
from time import sleep

