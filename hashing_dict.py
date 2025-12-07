n = [5, 3, 2, 2, 1, 5, 5, 7, 5, 10]
m = [10, 11, 1, 9, 5, 6, 7, 2]
freq={}

for num in n:
    freq[num]=freq.get(num,0)+1
for num in m:
    print(freq.get(num,0))