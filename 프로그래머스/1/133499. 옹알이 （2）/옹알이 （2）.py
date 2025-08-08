def solution(babbling):
    answer = 0
    words = ["aya", "ye", "woo", "ma"]

    for bab in babbling:
        print('before:', bab)

        # 반복된 단어가 있으면 무효
        if any(word + word in bab for word in words):
            print('invalid: repeated word')
            continue

        temp = bab
        for word in words:
            temp = temp.replace(word, " ")

        temp = temp.strip().replace(" ", "")
        print('after:', temp)

        if not temp:
            answer += 1

    return answer