import math

def solution(n, m):
    return [gcd(n, m), lcm(n, m)]

def gcd(a, b):
    return math.gcd(a, b)

def lcm(a, b):
    return a * b // math.gcd(a, b)