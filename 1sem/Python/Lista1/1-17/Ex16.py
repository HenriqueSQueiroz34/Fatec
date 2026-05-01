horas=0
valH=0
depends=0
pesc=0
while horas <= 0 or valH <= 0 or depends <= 0 or pesc <= 0:
    horas = int(input("Digite a quantidade de horas trabalhadas: "))
    valH = float(input("Digite o valor da hora trabalhada: "))
    depends = int(input("Digite a quantidade de dependentes: "))
    pesc = float(input("Digite o percentual do desconto: "))

def salario():
    desc = pesc / 100

    bruto = horas * valH
    descTotal = bruto * desc
    liquido = bruto - descTotal + (depends * 100)
    return liquido

print(f"O salário a receber é: R${salario():.2f}")