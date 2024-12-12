# N
N = int(input())

n_numbers = set(map(int, input().split()))  # 리스트 대신 집합 사용

# M
M = int(input())

m_numbers = list(map(int, input().split()))

for number in m_numbers:
    if number in n_numbers:
        print(1)
    else:
        print(0)
