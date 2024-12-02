# 사탕의 총 개수 n
n = int(input())

# 경우의 수 s
answer = 0

# 조건식 반복
for i in range(0, n + 1):
    for j in range(0, n + 1):
        for k in range(0, n + 1):
            if i + j + k == n:
                if i >= j + 2:
                    if i != 0 and j != 0 and k != 0:
                        if k % 2 == 0:
                            answer += 1

print(answer)