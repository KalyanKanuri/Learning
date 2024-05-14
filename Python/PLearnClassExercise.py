#----------------------------------------------------------------------------------------------------------- 
# Given the below class:
# class Cat:
#     species = 'mammal'
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age
#
# 1 Instantiate the Cat object with 3 cats
#
# 2 Create a function that finds the oldest cat
#
# 3 Print out: "The oldest cat is x years old.". x will be the oldest cat age by using the function in #2
#-----------------------------------------------------------------------------------------------------------

class cat:
    species = 'mammal'
    def __init__(self, name, age):
        self.name = name
        self.age = age
        
cat1 = cat("Tom", 5)
cat2 = cat("Oggy", 7)
cat3 = cat("Jack", 10)

def OldCat( *args):
    return(max(args))

print(f'The oldest cat is {OldCat(cat1.age, cat2.age, cat3.age)} years old')