# 타일의 크기를 결정하는 n
n = int(input())

# 경우의 수를 저장하기 위한 배열 선언
# 2 x 1의 경우의 수는 1이고, 2 x 2의 경우의 수는 2이기 때문에 미리 저장
answer = [0, 1, 2]

# 3번째 부터 n 까지 반복문 수행
for i in range(3, n + 1):
    answer.append((answer[i - 2] + answer[i - 1]) % 10_007)

# n번째 경우의 수 출력
print(answer[n])