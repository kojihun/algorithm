import datetime

def solution(a, b):
    day_of_week = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    day = datetime.date(2016, a, b).weekday()
    return day_of_week[day]