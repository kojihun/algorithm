# 1. 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다.
# 2. 연속된 세 개의 계딴을 모두 밟아서는 안된다. (시작점은 포함X)
# 3. 마지막 도착 계단은 반드시 밟아야 한다.

# 계단의 개수 stairs_cnt
stairs_cnt = int(input())

# 계단 스코어
stairs_score = [0]  # 0번째 계단은 없으므로 0으로 설정
for _ in range(stairs_cnt):
    score = int(input())
    stairs_score.append(score)

# DP 테이블 (각 계단까지의 최대 점수)
dp = [0] * (stairs_cnt + 1)

# 첫 번째 계단은 첫 번째 계단 점수
dp[1] = stairs_score[1]

# 두 번째 계단은 첫 번째 + 두 번째 계단 점수
if stairs_cnt > 1:
    dp[2] = stairs_score[1] + stairs_score[2]

# 세 번째 계단부터는 점수를 계산
for i in range(3, stairs_cnt + 1):
    # 연속 세 계단을 밟을 수 없으므로, 이전 두 계단 중 하나를 선택하여 더하기
    dp[i] = max(dp[i-2] + stairs_score[i], dp[i-3] + stairs_score[i-1] + stairs_score[i])

# 마지막 계단은 반드시 밟아야 하므로, 마지막 계단까지의 최대 점수를 출력
print(dp[stairs_cnt])