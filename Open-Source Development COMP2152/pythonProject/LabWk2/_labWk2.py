# Conditional Statements by Using Equal Operators and Testing.

mB1 = True
mB2 = False
num1 = 10
num2 = 20
num3 = 30
s1 = "Hello"
s2 = "Bye"

print(mB1 == True)
print(mB2 == False)
print(mB2 != False)
print(mB1 == mB2)
print(mB1 != mB2)

print(s1 == s2)
print(s1 == "Hello")
print(s1 != s2)

print(num1 == 10)
print(num1 == 15)
print(num1 == num2)
print(num1 != num2)
print(num1 + num2 == num3)
print(num1 == num2 + num3)


# Relational Operators and Tests
num1 = 10
num2 = 20
num3 = 30
c1 = 'T'
c2 = 'W'

print(num1 > 10)
print(num1 > num2)
print(num1 <= 20)
print(num1 >= 15)

print(c1 <= 'C')
print(c1 > 'R')
print(c1 > c2)

print(c2 > 'T')
print(c2 >= 'X')
print(c2 > c1)

print(num1 < 20)
print(num2 > num1)
print(num2 >= 10)
print(num2 <= 15)

print(num1 + num2 > num3)
print(num1 - num2 < num3)
print(num2 / num3 < num1)
print(num2 * num3 < num3)

# Logical Operators

# "And" Keyword
mark = 75
print(70 <= mark <= 80)
mark1 = 50
mark2 = 70
mark3 = 90
print(mark1 < mark2 < mark3)

# "OR" Operator
color = "red"

print(color == "red" or color == "blue" or color == "green")

color = "blue"

print(len( color ) > 5 or color == "red")

color = "orange"

print('a' in color or len(color) == 3)

# "NOT" Operator
mark = 60

print(not mark == 60)

trueOfFalse = True

print(not trueOfFalse)

# IF statements

# One-way statements
myBool = True

if myBool:
    print("success")

# Two-way statements
i = -1

if i < 0:
    print("Number is negative")
else:
    print("Number is non-negative")

# Multi-way statements
i = 4
if i == 0:
    print("first")
elif i > 0 and i < 4:
    print("second")
elif i > 3 and i != 5:
    print("third")
else:
    print("fourth")

# Nested if statements
hourlyEmployee = True
hours = 50
bonus = 0
yearsEmployed = 5

if hourlyEmployee == True:
    if hours > 40:
        bonus = 500
    else:
        bonus = 100
else:
    if yearsEmployed > 10:
        bonus = 300
    else:
        bonus = 200

print("hourlyEmployrr:" , hourlyEmployee, "\n hours: ",
      hours, "\n bonus: ", bonus, "\n year")

