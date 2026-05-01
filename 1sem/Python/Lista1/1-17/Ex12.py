ano=0
atual=0
while ano <= 0 or atual <= 0:
    ano = int(input("Digite seu ano de nascimento: "))
    atual = int(input("Digite o ano atual: "))

def idadePessoa():
    return atual - ano

def idade17():
    return idadePessoa() + 17

print("Sua idade é: ", idadePessoa())
print("Você terá ", idade17(), " em 17 anos.")