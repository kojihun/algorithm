#본 코드 시작
money = int(input()) #입력받은 금액
n = 1000 - money 
data = [500, 100, 50, 10, 5, 1] #차례대로 500엔 ~ 1엔

count = 0 #거스름돈 동전의 개수

for i in data:
  if n >= i:
    count += n // i
    n = n % i
    if n == 0:
      break;
    
print(count)
