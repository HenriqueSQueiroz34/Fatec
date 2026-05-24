v1:int = [0]*3
v2:int = [0]*3
v3:int = [0]*6
c:int = 0

def main():
    global v1,v2,v3,c

    for i in range(len(v1)):
        v1[i] = int(input(f'Digite o termo {i+1}, vetor 1: '))
        v2[i] = int(input(f'Digite o termo {i+1}, vetor 2: '))

    for i in range(0,len(v3),2):
        if (v1[c]<v2[c]):
            v3[i] = v1[c]
            v3[i+1] = v2[c]
        else:
            v3[i] = v2[c]
            v3[i+1] = v1[c]

        c+=1

    v3.sort()
    print(v3)

if __name__ == '__main__':
    main()