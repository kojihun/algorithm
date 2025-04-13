import itertools

def solve():
    s = input()
    n = len(s)
    lucky_strings = set()

    for perm in itertools.permutations(s):
        is_lucky = True
        for i in range(n - 1):
            if perm[i] == perm[i + 1]:
                is_lucky = False
                break
        if is_lucky:
            lucky_strings.add(''.join(perm))

    print(len(lucky_strings))

solve()