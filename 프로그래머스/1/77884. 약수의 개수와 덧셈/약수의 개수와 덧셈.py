def get_divisor_count(n):
    count = 0
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            count += 1
            if i != n // i:  # 제곱수일 경우 중복 약수 방지
                count += 1
    return count

def solution(left, right):
    answer = 0

    for i in range(left, right + 1):
        count = get_divisor_count(i)

        if count % 2 == 0:  # 약수 개수가 짝수일 때
            answer += i
        else:              # 약수 개수가 홀수일 때
            answer -= i

    return answer