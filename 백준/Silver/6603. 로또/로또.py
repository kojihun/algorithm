while True:
    # K와 집합 S를 입력 받음
    S = list(map(int, input().split()))

    # K
    K = S[0]

    # K가 0이면 반복문 종료
    if K == 0:
        break

    # 리스트에서 첫 번째 원소 삭제
    del S[0]

    # 반복문 수행
    for i in range(K):
        for j in range(i + 1, K):
            for q in range(j + 1, K):
                for w in range(q + 1, K):
                    for e in range(w + 1, K):
                        for r in range(e + 1, K):
                            print(S[i], S[j], S[q], S[w], S[e], S[r])


    # 공백 줄 추가
    print()