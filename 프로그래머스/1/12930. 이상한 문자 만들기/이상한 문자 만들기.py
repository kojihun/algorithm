def solution(s):
    answer = []
    for word in s.split(" "):
        transformed = ''
        for i in range(len(word)):
            if i % 2 == 0:
                transformed += word[i].upper()
            else:
                transformed += word[i].lower()
        answer.append(transformed)
    return ' '.join(answer)