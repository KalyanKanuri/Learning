# --------------------------------------------------------------------------------------------------------------------
# Given the participants' score-sheet for your University Sports Day, you are required to find the runner-up score.
# You are given scores.
# Store them in a list and find the score of the runner-up.
#
# Input Format
#
# The first line contains.
# The second line contains an array of integers each separated by a space.
#
# Constraint
#
# Output Format
#
# Print the runner-up score.
# --------------------------------------------------------------------------------------------------------------------

n = int(input("Enter number of integers: "))
Li = input("Enter the list here: ").split()

Li = [int(x) for x in Li]
sorted_li = sorted(Li)
maxi = sorted_li.pop()
sec_max = 0

for i in sorted_li:
    if maxi != i:
        sec_max = i
print(sec_max)
