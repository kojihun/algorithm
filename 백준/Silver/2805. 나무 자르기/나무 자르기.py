def is_possible(k):
    global N, M, heights

    num = 0
    for h in heights:
        if h > k:
            num += (h - k)

    return num >= M


N, M = map(int, input().split())
heights = list(map(int, input().split()))

cur = -1
step = int(1e9) + 1

while step != 0:
    while (cur + step <= int(1e9)) and is_possible(cur + step):
        cur += step
    step //= 2

print(cur)