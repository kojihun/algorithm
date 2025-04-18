def solve():
    n = int(input())
    board = [list(input()) for _ in range(n)]
    max_candies = 0

    def count_candies(current_board):
        n = len(current_board)
        max_count = 0
        # 가로로 연속된 사탕 개수 확인
        for r in range(n):
            count = 1
            for c in range(1, n):
                if current_board[r][c] == current_board[r][c - 1]:
                    count += 1
                else:
                    max_count = max(max_count, count)
                    count = 1
            max_count = max(max_count, count)

        # 세로로 연속된 사탕 개수 확인
        for c in range(n):
            count = 1
            for r in range(1, n):
                if current_board[r][c] == current_board[r - 1][c]:
                    count += 1
                else:
                    max_count = max(max_count, count)
                    count = 1
            max_count = max(max_count, count)
        return max_count

    for r in range(n):
        for c in range(n):
            # 오른쪽으로 swap
            if c + 1 < n:
                board[r][c], board[r][c + 1] = board[r][c + 1], board[r][c]
                max_candies = max(max_candies, count_candies(board))
                board[r][c], board[r][c + 1] = board[r][c + 1], board[r][c] # 원상 복구

            # 아래쪽으로 swap
            if r + 1 < n:
                board[r][c], board[r + 1][c] = board[r + 1][c], board[r][c]
                max_candies = max(max_candies, count_candies(board))
                board[r][c], board[r + 1][c] = board[r + 1][c], board[r][c] # 원상 복구

    # swap이 없는 경우도 고려 (초기 상태에서 연속된 사탕 개수)
    max_candies = max(max_candies, count_candies(board))

    print(max_candies)

if __name__ == "__main__":
    solve()