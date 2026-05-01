def __main__():
    precoA=0
    med=0
    while precoA <= 0 or med <= 0:
        precoA = float(input("Digite o preço do produto atualmente: "))
        med = float(input("Digite a média de preço do produto: "))
    alteracao(precoA,med)

# med        precoA     Varia     Ajuste
# <500 	      <30	       +        10%
# >=500<1000 >=30<80	   +        15%
# >=1000	  >=80	       -         5%
# Em outras condições, o preço do produto não sofre ajuste.

def alteracao(precoAtual,media):
    if media < 500 and precoAtual < 30:
        taxa = 0.10
        precoAtual += precoAtual * taxa
    elif 500 <= media < 1000 and 30 <= precoAtual < 80:
        taxa = 0.15
        precoAtual += precoAtual * taxa
    elif media >= 1000 and precoAtual >= 80:
        taxa = 0.05
        precoAtual -= precoAtual * taxa
    else:
        taxa = 0

    print(f"Preço ajustado: R${precoAtual:.2f}")

if "__name__" == __main__():
    alteracao()