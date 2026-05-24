v1: int = [0]*3
v2: int = [0]*3
v3: int = [0]*6

def main():
    global v1,v2,v3

    for i in range(len(v1)):

        v1[i] = int(input(f'Digite o termo {i+1}, vetor 1: '))
        v2[i] = int(input(f'Digite o termo {i+1}, vetor 2: '))

        if (v3[i] != 0):
            if (v3[i] < v1[i]):
                v3[i+1] = v1[i]
            elif (v3[i] < v2[i]):
                v3[i+1] = v2[i]
        else:
            if (v1[i] < v2[i]):
                v3[i] = v1[i]
                v3[i+(len(v1))] = v2[i]
            else:
                v3[i] = v2[i]
                v3[i+(len(v1))] = v1[i]

    print(v3)

if __name__ == '__main__':
    main()