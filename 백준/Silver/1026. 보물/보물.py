# 입력 값 n
n = int(input())

# A, B 배열 입력
A = list(map(int, input().split()))
B = list(map(int, input().split()))

# A는 오름차순, B는 내림차순으로 정렬
A.sort()
B.sort(reverse=True)

answer = 0

# 각 원소 자리 끼리 곱하기
for i in range(len(A)):
    answer += (A[i] * B[i])

# 결과 출력
print(answer)