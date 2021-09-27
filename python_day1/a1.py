# a = input("Enter the number students:\n")
num=5
fail_1subj= []
fail_2subj= []
fail=[]
avg_total=[]
dis=[]
first_dis=[]
second_dis=[]
fail2=[]
count =0
for i in range(num):
    name= input("Enter your name:\n")
    x= int(input("Enter the marks of the maths:\n"))
    y= int(input("Enter the marks of the physics:\n"))
    z= int(input("Enter the marks of the Chemistry:\n"))
    if x<59:
        count+=1
    if y<59:
        count+=1
    if z<59:
        count+=1

    if count==1:
        fail_1subj.append(name)
    elif count==2:
        fail_2subj.append(name)
    elif count==3:
        fail.append(name)
    avg = ((x+y+z)/300)*100
    avg_total.append(avg)
    if avg > 80:
        dis.append(name)
    elif avg > 60 and avg <79:
        first_dis.append(name)
    elif avg >50 and avg <59:
        second_dis.append(name)
    else:
        fail2.append(name)


# print(count)
print("Fail in 3 subj\n")
print(fail)
print("Fail in 2 subj\n")
print(fail_2subj)
print("Fail in 1 subj\n")
print(fail_1subj)

print("Student passed with distinction")
print(dis)
print("Student passed with First distinction")
print(first_dis)
print("Student passed with Second distinction")
print(second_dis)
print("Student passed with Second distinction")
print(fail2)

# performance= 0
for i in range(num):
    sum=0
    sum +=avg_total[i]
sum = sum/ num
print("average of the class")
print(sum)

    
