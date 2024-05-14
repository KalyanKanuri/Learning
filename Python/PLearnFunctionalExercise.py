# 1 Capitalize all of the pet names and print the list

pet_names = ["Tom", "Oggy", "Jerry", "Jack"]

def Cap(item):
    return item.upper()

print(list(map(Cap, pet_names)))

# 2 Zip the 2 lists into a list of tuples, but sort the numbers from lowest to highest.

my_string = ["a", "b", "c", "d"]

my_ints = [1, 2, 3, 4]
my_ints.sort()

print(list(zip(my_string, my_ints)))

# 3 Filter the scores that pass over 50%

scores = [73, 20, 65, 19, 76, 100, 88]

def max_score(item):
    return item > 50

print(list(filter(max_score, scores)))

# 4 Combine all of the numbers that are in a list on this file using reduce (my_numbers and scores). What is the total?

from functools import reduce

numbers = my_ints + scores

def accumulator(acc, item):
    return acc + item

print(reduce(accumulator, numbers, 0))