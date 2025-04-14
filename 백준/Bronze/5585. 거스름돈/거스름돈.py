# 잔돈 배열 remain_cost
remain_cost = [500, 100, 50, 10, 5, 1]

# 타로가 지불한 금액
pay = int(input())

# 거슬러주어야 하는 금액
remain_pay = 1_000 - pay

# 결과 값 answer
answer = 0

for cost in remain_cost:
    answer += remain_pay // cost
    remain_pay %= cost

print(answer)