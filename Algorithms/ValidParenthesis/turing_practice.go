/*
Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:
Input: s = "()"
Output: valid

Example 2:
Input: s = "()[]{}"
Output: valid

Example 3:
Input: s = "(]"
Output: invalid

Example 4:
Input: s = "([)]"
Output: invalid

Example 5:
Input: s = "{[]}"
Output: valid
*/

package main

import "fmt"

func isValid(s string) bool {
	var (
		stack []string
		result bool = true
	)

	for _, char := range s{
		if char == '(' || char == '[' || char == '{' {
			stack = append(stack, string(char))
		} else {
			if len(stack) == 0 {
				result = false
			}
			if char == ')' && stack[len(stack)-1] == string('(') {
				stack = stack[:len(stack)-1]
			} else if char == ']' && stack[len(stack)-1] == string('[') {
				stack = stack[:len(stack)-1]
			} else if char == '}' && stack[len(stack)-1] == string('{') {
				stack = stack[:len(stack)-1]
			} else {
				result = false
			}
		}
	}
	return result
}

func main(){
	fmt.Println(isValid("()")) // true
	fmt.Println(isValid("()[]{}")) // true
	fmt.Println(isValid("(]")) // false
	fmt.Println(isValid("([)]")) // false
	fmt.Println(isValid("{[]}")) // true
}
