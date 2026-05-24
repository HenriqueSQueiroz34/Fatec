vals:int = [0]*100
mai:int
men:int
med:float = 0.0

for i in range(100):
    vals[i] = int(input(f'Digite o termo {i+1}: '))

    if (i==0):
        mai = vals[i]
        men = vals[i]
    if (vals[i] > mai):
        mai = vals[i]
    if (vals[i] < men):
        men = vals[i]

    med += vals[i]

med = med / len(vals)
print(f'Maior: {mai}\nMenor: {men}\nMédia: {med}')