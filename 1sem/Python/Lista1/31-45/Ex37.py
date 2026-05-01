N=0
while N <= 0:
    N = int(input("Digite um valor: "))
N-=3
A = 1
B = 1
F = 2
print('1')
print('1')

def fibo(pri, seg, res, cont):
    while cont != 0:
        print(pri + seg)
        if res%2==0:
            pri = res
            res+=seg
        else:
            seg = res
            res+=pri
        cont -= 1

fibo(A, B, F, N)