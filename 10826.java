N=int(input())
fb=[0,1]

for i in range(N+1):
    if(i<2):
        fb[i]=i
    else:
        fb.append(fb[i-2]+fb[i-1])
        
print(fb[N])
