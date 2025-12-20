nums=[55,67,-90,2,33]
largest=float("-inf")
n=len(nums)
for i in range(0,n):
  largest=max(largest,nums[i])
print("largest number",largest)
