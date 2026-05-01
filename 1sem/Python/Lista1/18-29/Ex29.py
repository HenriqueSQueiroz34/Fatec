def __main__():
    operacao = int(input("Digite o investimento: \n1 - Poupança\n2 - Renda fixa\nDigite: "))
    val = float(input("Quanto será investido?: "))
    calcular_investimento(operacao,val)

def calcular_investimento(tipo,valor):
    while tipo == 0 or tipo > 2:
        tipo = int(input("Tipo de Investimento:\n" \
             "1 - Poupança\n" \
             "2 - Renda Fixa\n" \
             "Digite o tipo desejado: "))
    if tipo == 1:
        taxa = 0.03
    else:
        taxa = 0.05
    valorF = valor + (valor * taxa)
    print(f"Valor final do investimento: R${valorF:.2f}")

if "__name__" == __main__():
    calcular_investimento()