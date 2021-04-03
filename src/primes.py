# A school method based Python3 program
# to check if a number is prime

from time import perf_counter

# function check whether a number
# is prime or not

 
def isPrime(n):
 
    # Corner case
    if (n <= 1):
        return False
 
    # Check from 2 to n-1
    for i in range(2, n):
        if (n % i == 0):
            return False
 
    return True
 
 
# Driver Code
start = perf_counter()

max_val = 1000000
primes = []
for i in range (1, max_val):
    if isPrime(i):
        print(i, ": true")
        primes.append(i)
    else:
        print(i, ": false")

for val in primes:
    print(val) 

end = perf_counter()
execution_time = (end - start)

print("Duration: ", execution_time, " ms")
# This code is contributed by Sachin Bisht