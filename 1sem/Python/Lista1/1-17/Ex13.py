quilos=0
while quilos <= 0:
    quilos = float(input("Digite a quantidade de quilos de alimento: "))

def dias():
    return int(quilos / 0.05)

print(f"O alimento durará {dias()} dias.")