n = int(input("enter the no : "))
count = 0
for i in range(2,n+1):
    if n%i==0 :
        count+=1

if count>=2:
    print("composite no")
else :
    print("not composite no" )