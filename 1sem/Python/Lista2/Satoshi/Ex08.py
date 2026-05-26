def main():
    venda:int = [[0]*3]*4
    v:int
    l:int
    c:int
    pmes:int = [0]*3
    tsem:int = [0]*4
    tmes:int = 0

    for l in range(4):
        for c in range(3):
            v = int(input(f'Digite a qtd do prod {c+1} na semana {l+1}: '))

            pmes[c] += v
            tsem[l] += v
            tmes += v
        
            venda[l][c] = v
            print(venda)
    
    print(venda)
    print('Produtos no mês:',pmes)
    print('Total por semana:',tsem)
    print('Total no mês:',tmes)

if __name__ == '__main__':
    main()