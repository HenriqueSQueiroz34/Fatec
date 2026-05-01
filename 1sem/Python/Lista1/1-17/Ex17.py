tempo=0
vel=0
while tempo <= 0 or vel <=0:
    tempo = float(input("Digite o tempo gasto na viagem (em horas): "))
    vel = float(input("Digite a velocidade média durante a viagem (em km/h): "))

def gastos():
    dist = tempo * vel
    litros = dist / 12
    return f"A quantidade de litros de combustível gasta na viagem é: {litros:.2f} litros."

print(gastos())