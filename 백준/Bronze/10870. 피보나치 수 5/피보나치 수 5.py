# 문제 해결 IDEA
# 전제 조건: 피보나치의 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다. Fn = Fn-1 + Fn-2 (n ≥ 2)
# 입력: 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
# 출력: 첫째 줄에 n번재 피보나치 수를 출력한다.

# 1. n을 입력받는다.
n = int(input())

# 2. 피뵤나치 수열을 저장할 배열을 선언한다. 0번째, 1번째 원소를 초기화한다.
fibonacci = [0, 1]

# 3-1. Fn = Fn-1 + Fn-2 (n ≥ 2)의 공식에 따라 알고리즘 구성 (일반적인 방법)
for i in range(2, n + 1):
    fibonacci.append(fibonacci[i - 2] + fibonacci[i - 1])


# 3-2. Fn = Fn-1 + Fn-2 (n ≥ 2)의 공식에 따라 알고리즘 구성 (재귀를 사용한 방법)
def recursive(idx):
    if idx <= 1:
        return idx

    return recursive(idx - 1) + recursive(idx - 2)


# 4. 결과 출력
# print(fibonacci[n])
print(recursive(n))
