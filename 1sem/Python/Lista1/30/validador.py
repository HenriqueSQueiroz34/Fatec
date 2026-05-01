from diasMes import diasMes

def validador(anoA:int,mesA:int,diaA:int,anoN:int,mesN:int,diaN:int):
# Validando variáveis mês e dia 
    if (mesA < 1 or mesA > 12) or (diaA < 1 or diaA > int(diasMes(mesA,anoA,mesN,anoN))): 
        return "Entrada inválida na seção Atual" 
    if (mesN < 1 or mesN > 12) or (diaN < 1 or diaN > int(diasMes(mesA,anoA,mesN,anoN))): 
        return "Entrada inválida na seção Nascimento" 

    diaI = diaA - diaN 
    anoI = anoA - anoN 
    mesI = mesA - mesN 

# Validando intervalo de tempo 
    if (anoI < 0): 
        return "Os anos não batem"
    if (anoI == 0 and mesI < 0): 
        return "Os meses não batem" 
    if (anoI == 0 and mesI == 0 and diaI < 0): 
        return "Os dias não coincidem"
    
    if mesA == 2 or mesN == 2:
        dias = diasMes(mesA,anoA,mesN,anoN)
        if (mesA == 2 and diaA > dias) or (mesN == 2 and diaN > dias):
            return "Dias de Fevereiro inválidos (ano bissexto)"
    return True