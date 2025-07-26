def solution(price, money, count):
    answer = sum(pay * price for pay in range(1, count + 1))

    return max(0, answer - money)