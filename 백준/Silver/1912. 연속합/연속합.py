n = int(input())
numbers = list(map(int, input().split()))

max_so_far = numbers[0]
current_max = numbers[0]

for i in range(1, n):
    current_max = max(numbers[i], current_max + numbers[i])
    max_so_far = max(max_so_far, current_max)

print(max_so_far)