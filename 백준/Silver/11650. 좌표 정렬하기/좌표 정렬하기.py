N = int(input())

graph = []

for _ in range(N):
    x, y = map(int, input().split())
    graph.append((x, y))

sorted_graph = sorted(graph, key=lambda x: (x[0], x[1]))

for data in sorted_graph:
    print(*data)
