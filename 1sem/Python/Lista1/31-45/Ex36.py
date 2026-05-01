n=0
while n <= 0:
    n = int(input("Digite um valor: "))
s = 1

def somaMod(maxi,res):
    while maxi > 1:
        fat=1
        a=maxi
        while maxi > 1:
            fat *= maxi
            maxi-=1
        maxi=a
        res +=  1/fat
        maxi -= 1
    else:
        print(res)

somaMod(n,s)
