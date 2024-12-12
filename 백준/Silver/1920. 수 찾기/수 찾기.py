def binary_search(numbers, find_number):
    left = 0
    right = len(numbers) - 1

    while left <= right:
        mid = (left + right) // 2

        if numbers[mid] < find_number:
            left = mid + 1

        if numbers[mid] > find_number:
            right = mid - 1

        if numbers[mid] == find_number:
            return 1

    return 0


# N
N = int(input())

n_numbers = list(map(int, input().split()))

# M
M = int(input())

m_numbers = list(map(int, input().split()))

# 이분 탐색을 위한 정렬
n_numbers.sort()

# 결과를 담을 answer
answer = []

for number in m_numbers:
    answer.append(binary_search(n_numbers, number))

for is_exist in answer:
    print(is_exist)

