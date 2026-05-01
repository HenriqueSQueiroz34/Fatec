n1=0
n2=0
while n1 <= 0 or n2 <= 0:
    n1 = int(input("Digite o primeiro número: "))
    n2 = int(input("Digite o segundo número: "))

if n1 > n2:
    c = n1
    n1 = n2
    n2 = c

print("Números primos entre", n1, "e", n2, ":")
for num in range(n1, n2 + 1):
    if num > 1:
        for i in range(2, int(num/2) + 1):
            if num % i == 0:
                break
        else:
            print(num, end=" ")