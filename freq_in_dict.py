n = int(input("enter the number"))
nums = [5,4,3,5,3,2,4,4,4]
freq = {}

for i in range(len(nums)):
    freq[nums[i]] = freq.get(nums[i], 0) + 1

print("Frequency of", n, "=", freq.get(n, 0))
