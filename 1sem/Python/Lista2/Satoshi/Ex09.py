from random import randint as ra

def main():
    l:int = 0
    c:int = 0
    val:int = 1
    ma:int = [[0]*4]*4

    for l in range(len(ma)):
        for c in range(len(ma[l])):
            if (l == c):
                ma [l][c] = val
                val *= 4
            else:
                ma [l][c] = ra(1,10)
    print(ma)

if __name__ == '__main__':
    main()