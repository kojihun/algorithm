# (이것이 코딩 테스트다) 문자열 재정렬
# author kojihun

data = input()
result = []
value = 0

for x in data:
    if x.isalpha():
        result.append(x)
    else:
        value += int(x)

# 알파벳 오름차순 정렬
result.sort()

if value != 0:
    result.append(str(value))

print(''.join(result))