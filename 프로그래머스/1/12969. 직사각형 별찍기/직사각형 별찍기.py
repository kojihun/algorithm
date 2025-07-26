a, b = map(int, input().strip().split(' '))
for i in range(b):
    print(''.join('*' for star in range(a)))