#  Missing number in the list

set1= [0,1,2,5]
num = set1[-1]
j=0
e_set=[]
for i in range(num+1):
   
    if i == set1[j]:
        j+=1
    else:
        e_set.append(i)
  
print(e_set)