from collections import deque

def solve_bfs_bitmask():
    r, c = map(int, input().split())
    board = [input() for _ in range(r)]
    start_alpha_index = ord(board[0][0]) - ord('A')
    initial_state = (0, 0, 1 << start_alpha_index)  # (row, col, visited_mask)
    queue = deque([initial_state])
    max_count = 1
    visited_states = set([initial_state])

    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]

    while queue:
        row, col, visited_mask = queue.popleft()
        current_count = bin(visited_mask).count('1')
        max_count = max(max_count, current_count)

        for i in range(4):
            next_row = row + dx[i]
            next_col = col + dy[i]

            if 0 <= next_row < r and 0 <= next_col < c:
                next_alpha_index = ord(board[next_row][next_col]) - ord('A')
                if not (visited_mask & (1 << next_alpha_index)):
                    next_visited_mask = visited_mask | (1 << next_alpha_index)
                    next_state = (next_row, next_col, next_visited_mask)
                    if next_state not in visited_states:
                        visited_states.add(next_state)
                        queue.append(next_state)

    print(max_count)

if __name__ == "__main__":
    solve_bfs_bitmask()