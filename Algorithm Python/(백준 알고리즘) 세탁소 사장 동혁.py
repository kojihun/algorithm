#본 코드 시작
for _ in range(int(input())):
  coin = int(input())
  money = [25, 10, 5, 1]
  li = []

  for i in money:
    li.append(coin//i)
    coin = coin %i
  print(*li)
