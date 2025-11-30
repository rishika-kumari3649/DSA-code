n=int(input("Enter a number"))
num=n
total=0
nod=len(str(n))
while num>0:
    digit=num%10
    total=total+(digit**nod)
    num=num//10
if total==n:
    print(n,"is a Armstromg number")

else:
    print(n,"not a armstrong")

