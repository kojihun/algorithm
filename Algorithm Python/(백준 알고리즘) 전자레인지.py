#본 코드 시작
n = int(input()) #입력받은 요리시간 
data = [300, 60, 10] #차례대로 5분, 1분, 10초로 분단위를 초단위로 변경하였음
button = [] #버튼을 누른 수를 카운트하기 위해 리스트 생성

for i in data:
  if n >= i:
    button.append(n//i)
    n = n % i
    if n == 0:
      break
  else:
    button.append(0)

for i in button:
  if(n == 0):
    print(i, end=" ")
  else:
    print(-1)
    break
