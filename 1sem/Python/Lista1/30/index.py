from validador import validador
from somaDias import somaDias

global anoI,mesI,diaI
anoI=0
mesI=0
diaI=0

def __main__():
    global aa,ma,da,an,mn,dn
    print("Descubra a seguir qual sua idade em\nanos, meses e dias") 
    an = int(input("Digite o ano de seu nascimento: ")) 
    mn = int(input("Digite o mês de seu nascimento: ")) 
    dn = int(input("Digite o dia de seu nascimento: ")) 
    print("-"*25) 
    aa = int(input("Digite o ano atual: ")) 
    ma = int(input("Digite o mês atual: ")) 
    da = int(input("Digite o dia atual: ")) 

    if validador(aa,ma,da,an,mn,dn) == True:
        somaDias(aa,ma,da,an,mn,dn)
    else: 
        print(validador(aa,ma,da,an,mn,dn))

if "__name__" == __main__(): 
    __main__()