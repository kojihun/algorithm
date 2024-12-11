import sys
sys.setrecursionlimit(10**6)

# N, M
M, N = map(int, input().split())

# 2차원 배열을 저장할 리스트
matrix = [list(map(int, input().split())) for _ in range(M)]
visited = [[-1] * N for _ in range(M)]

# 움직일 수 있는 방향
move_way_x = [1, 0, -1, 0]
move_way_y = [0, -1, 0, 1]


def dfs(matrix, y, x, visited):
    if visited[y][x] != -1:
        return visited[y][x]

    if y == M -1 and x == N -1:
        return 1

    visited[y][x] = 0

    for i in range(4):
        new_way_y = y + move_way_y[i]
        new_way_x = x + move_way_x[i]

        if 0 <= new_way_y < M and 0 <= new_way_x < N and matrix[new_way_y][new_way_x] < matrix[y][x]:
            visited[y][x] += dfs(matrix, new_way_y, new_way_x, visited)

    return visited[y][x]


# dfs 함수 호출
answer = dfs(matrix, 0, 0, visited)

print(answer)