#본 코드 시작
n = int(input()) 
data = list(map(int, input().split()))
data.sort()

result = 0 
count = 0 

for i in data:
  count += i
  result += count

print(result)
