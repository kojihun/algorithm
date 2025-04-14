def longest_increasing_subsequence(arr):
    n = len(arr)
    dp = [1] * n

    for i in range(1, n):
        for j in range(i):
            if arr[j] < arr[i]:
                dp[i] = max(dp[i], dp[j] + 1)

    return max(dp) if dp else 0


A = int(input())

arr = list(map(int, input().split()))

max_length = longest_increasing_subsequence(arr)

print(max_length)

