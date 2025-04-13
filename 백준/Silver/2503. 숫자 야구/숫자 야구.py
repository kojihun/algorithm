def check(guess, answer):
    strikes = 0
    balls = 0
    for i in range(3):
        for j in range(3):
            if guess[i] == answer[j]:
                if i == j:
                    strikes += 1
                else:
                    balls += 1
    return strikes, balls

n = int(input())
questions = []
for _ in range(n):
    num, s, b = map(int, input().split())
    questions.append((str(num), s, b))

candidates = []
for i in range(123, 988):
    s_i = str(i)
    if len(set(s_i)) == 3 and '0' not in s_i:
        candidates.append(s_i)

count = 0
for candidate in candidates:
    valid = True
    for question, s, b in questions:
        if check(candidate, question) != (s, b):
            valid = False
            break
    if valid:
        count += 1

print(count)