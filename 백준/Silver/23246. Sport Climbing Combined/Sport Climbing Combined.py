import sys

input = sys.stdin.readline
n = int(input())
players = []

for _ in range(n):
    b, p, q, r = map(int, input().split())
    score = p * q * r
    total_rank = p + q + r
    players.append((score, total_rank, b))

players.sort()

for i in range(3):
    print(players[i][2], end=' ')