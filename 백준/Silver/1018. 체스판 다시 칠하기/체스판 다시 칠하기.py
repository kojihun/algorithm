import sys

def paint_start_with_w(sub_chess_board):
    change_count = 0
    for i in range(8):
        for j in range(8):
            if (i + j) % 2 == 0:
                if sub_chess_board[i][j] != 'W':
                    change_count += 1
            else:
                if sub_chess_board[i][j] != 'B':
                    change_count += 1
    return change_count

def paint_start_with_b(sub_chess_board):
    change_count = 0
    for i in range(8):
        for j in range(8):
            if (i + j) % 2 == 0:
                if sub_chess_board[i][j] != 'B':
                    change_count += 1
            else:
                if sub_chess_board[i][j] != 'W':
                    change_count += 1
    return change_count

M, N = map(int, input().split())

chess_board = []
for _ in range(M):
    chess_board.append(input())

min_change_count = sys.maxsize

for i in range(M - 7):
    for j in range(N - 7):
        sub_chess_board = [row[j:j+8] for row in chess_board[i:i+8]]
        min_change_count = min(min_change_count, paint_start_with_w(sub_chess_board))
        min_change_count = min(min_change_count, paint_start_with_b(sub_chess_board))

print(min_change_count)