A, B, C = map(int, input().split())

# 모듈러 거듭제곱을 사용하여 (A^B) % C를 계산
answer = pow(A, B, C)

print(answer)
