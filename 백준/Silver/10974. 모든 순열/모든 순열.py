import itertools

N = int(input())

# i부터 N까지의 수로 이루어진 배열을 만든다.
arr = [i for i in range(1, N + 1)]

# 파이썬 내장함수인 permutation 사용
permutation_arr = itertools.permutations(arr, N)

# 출력 (튜플을 풀어서 숫자만 출력)
for perm in permutation_arr:
    print(*perm)
