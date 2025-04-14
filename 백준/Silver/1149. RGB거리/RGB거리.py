N = int(input())
colors = []

for _ in range(N):
    RGB = list(map(int, input().split()))
    colors.append(RGB)

dp = [[0] * 3 for _ in range(N)]

dp[0][0] = colors[0][0]
dp[0][1] = colors[0][1]
dp[0][2] = colors[0][2]

for i in range(1, N):
    dp[i][0] = min(dp[i - 1][1], dp[i - 1][2]) + colors[i][0]
    dp[i][1] = min(dp[i - 1][0], dp[i - 1][2]) + colors[i][1]
    dp[i][2] = min(dp[i - 1][0], dp[i - 1][1]) + colors[i][2]

print(min(dp[N - 1]))