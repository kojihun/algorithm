# (이것이 코딩 테스트다) 음료수 얼려 먹기
# author kojihun

# deque라이브러리 호출
from collections import deque

# BFS 소스코드 구현
def bfs(x, y):
    queue = deque()
    queue.append((x, y))

    while queue:
        x, y = queue.popleft()
        
        # 4가지 방향으로 위치 확인
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if graph[nx][ny] == 0:
                continue

            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))
    return graph[n - 1][m - 1]

# N, M 공백을 기준으로 입력받기
n, m = map(int, input().split())

# 맵 정보 입력받기
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

print(bfs(0, 0))

'''
<입력>
3 3
110
010
011

<결과>
5
'''