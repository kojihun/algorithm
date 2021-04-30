#본 코드 시작
s = input()
change = [] #숫자를 비교하기 위한 리스트 생성
isOdd = False #홀수, 짝수를 비교하기 위한 변수

for i in range(1, len(s)):
  if s[i-1] != s[i]:
    change.append(i)
if len(change)%2 == 1:
  isOdd = True

result = len(change)//2
if isOdd:
  result += 1
print(result)
