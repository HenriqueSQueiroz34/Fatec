soma = 1
cont = 2
deno = 3

while cont <= 50:
    soma += cont/deno

    cont += 1
    deno += 2

print("A série resulta em: {:.2f}".format(soma))