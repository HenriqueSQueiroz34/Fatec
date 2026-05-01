sub = 1
c = 2

while c < 15:
    sub = sub + c / (c*c)
    c = c + 1
    print(c, '+' ,sub)
    if c < 15:
        sub = sub - c / (c*c)
        c = c + 1
        print(c, '-' ,sub)

print("O valor da série é: {:.2f}".format(sub))