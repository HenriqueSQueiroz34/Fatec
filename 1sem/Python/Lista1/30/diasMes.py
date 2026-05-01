from bissexto import bissexto

def diasMes(mesA:int, anoA:int, mesN:int, anoN:int)->int:
    if mesN==1 or mesN==3 or mesN==5 or mesN==7 or mesN==8 or mesN==10 or mesN==12:
        dias = 31
    else:
        dias=30
        if mesN==2:
            dias=bissexto(anoN)

    if mesA==1 or mesA==3 or mesA==5 or mesA==7 or mesA==8 or mesA==10 or mesA==12:
        dias = 31
    else:
        dias=30
        if mesA==2:
            dias=bissexto(anoA)

    return dias