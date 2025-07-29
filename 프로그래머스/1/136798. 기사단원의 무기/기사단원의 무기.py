def solution(number, limit, power):
    answer = 0
    
    for i in range(1, number + 1):
        count = get_divisors_optimized(i)
        answer += count if count <= limit else power
    
    return answer

def get_divisors_optimized(n):
    divisors = set()
    for i in range(1, int(n ** 0.5) + 1):
        if n % i == 0:
            divisors.add(i)
            divisors.add(n // i)
    return len(sorted(divisors))