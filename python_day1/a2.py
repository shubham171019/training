rows = int(input("Enter number of rows: "))

k = 0
odd=1
for i in range(1, rows+1):
    
    for j in range(1, (rows-i)):
        print(end="  ")
   
    while k!=(2*i-1):
        print(odd," ", end="")
        k += 1
   
    k = 0
    odd+=2
    print()
odd=1
for i in range(1, rows+1):
    print(i * odd)
    odd+=2