def solution(answers):
    person1 = [1, 2, 3, 4, 5]
    person2 = [2, 1, 2, 3, 2, 4, 2, 5]
    person3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    scores = [0, 0, 0]

    for i in range(len(answers)):
        if answers[i] == person1[i % len(person1)]:
            scores[0] += 1
        if answers[i] == person2[i % len(person2)]:
            scores[1] += 1
        if answers[i] == person3[i % len(person3)]:
            scores[2] += 1
    
    max_score = max(scores)

    result = []
    for i in range(len(scores)):
        if scores[i] == max_score:
            result.append(i + 1)

    return result