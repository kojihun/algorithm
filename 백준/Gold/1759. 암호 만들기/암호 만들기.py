import itertools

def is_valid(password):
    vowels = 0
    consonants = 0
    for char in password:
        if char in 'aeiou':
            vowels += 1
        else:
            consonants += 1
    return vowels >= 1 and consonants >= 2

L, C = map(int, input().split())
alphabets = sorted(input().split())

for password_tuple in itertools.combinations(alphabets, L):
    password = ''.join(password_tuple)
    if is_valid(password):
        print(password)