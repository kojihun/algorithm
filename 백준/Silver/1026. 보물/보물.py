N = int(input())
A = sorted(list(map(int, input().split())))
B = sorted(list(map(int, input().split())), reverse=True)

sum_number = 0

for i in range(len(A)):
    sum_number = sum_number + (A[i] * B[i])

print(sum_number)
