ang1=0
ang2=0
while ang1 <=0 or ang2 <= 0:
    ang1 = int(input("Digite o primeiro ângulo do triângulo: "))
    ang2 = int(input("Digite o segundo ângulo do triângulo: "))

def ang():
    ang3 = 180 - (ang1 + ang2)
    return ang3

print(f"O terceiro ângulo do triângulo é: {ang()} graus.")