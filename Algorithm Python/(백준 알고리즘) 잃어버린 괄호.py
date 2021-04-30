#본 코드 시작
expression = input().split('-') #-의 단위로 문자열을 나눈다.
result = 0 #결과값

for i in map(int, expression[0].split('+')):
    result += i

for i in expression[1:]: #인덱스 1 이후
    result -= sum(map(int, i.split('+')))

print(result) #결과값 출력
