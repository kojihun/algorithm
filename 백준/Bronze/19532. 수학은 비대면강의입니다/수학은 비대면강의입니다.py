# 연립방정식에 사용될 변수 a, b, c, d, e, f
a, b, c, d, e, f = map(int, input().split())

# x, y의 범위만큼 반복문 수행
for x in range(-999, 1000):
    for y in range(-999, 1000):
        if (a * x) + (b * y) == c:
            if (d * x) + (e * y) == f:
                print(x, y)
                break