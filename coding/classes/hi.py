a=1
b=1
for i in range(25):
    print(a,end="")
    a=a+b
    if(a==5 or a==1):
        b=b*(-1)