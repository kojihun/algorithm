# 주어진 수 N
N = int(input())

check = [False] * N
choose = []

def permutation(level):
    if level == N:
        print(*choose)
        return

    for i in range(0, N):
        if check[i] == True:
            continue

        choose.append(i + 1)
        check[i] = True

        permutation(level + 1)

        check[i] = False
        choose.pop()

permutation(0)