n1=0
n2=0
while n1 <= 0 or n2 <= 0:
    n1 = int(input("Digite um número inteiro: "))
    n2 = int(input("Digite outro número inteiro: "))

def soma():
    q1 = n1*n1
    q2 = n2*n2
    return q1 + q2

print("A soma dos quadrados deles é: ", soma())