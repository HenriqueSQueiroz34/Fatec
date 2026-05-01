def salario():
    return sal * 1.15
sal=0
while sal <= 0:
    sal = float(input("Digite o salário do funcionário: "))
print("O novo salário do funcionário é: R$ {:.2f}".format(salario()))