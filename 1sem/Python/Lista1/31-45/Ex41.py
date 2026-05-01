acerto=0

for d1 in range(1,7):
    for d2 in range(1,7):
        if d1+d2==7:
            acerto+=1

print(f"Chances de soma 7: {acerto}/36")