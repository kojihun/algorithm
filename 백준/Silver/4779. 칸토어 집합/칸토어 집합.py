# 문제 해결 IDEA
# 입력: 입력을 여러 줄로 이루어져 있다. 각 줄에 N이 주어진다. 파일의 끝에서 입력을 멈춘다. N은 0보다 크거나 같고, 12보다 작거나 같은 정수이다.
# 출력: 입력으로 주어진 N에 대해서, 해당하는 칸토어 집합의 근사를 출력한다.

# 1. 칸토어 함수 정의
def cantor(input_line):
    # 기저 조건(바의 길이 중 최대 길이가 1일 떄 더 이상 나눌 수 없으므로 라인 출력)
    if len(input_line) == 1:
        return input_line

    segment_length = len(input_line) // 3
    first_part = input_line[:segment_length]
    middle_part = " " * segment_length
    last_part = input_line[2 * segment_length:]

    return cantor(first_part) + middle_part + cantor(last_part)

while True:
    try:
        # 2. n을 입력받는다.
        n = int(input())
    
        # 3. 3의 n승으로 만든다.
        base_number = 3
        line = "-" * (base_number ** n)
    
        # 4. 결과 출력
        print(cantor(line))
    except EOFError:
        break