package main

import "fmt"

func main() {
	cards := newDeckFromFile("cards.md")
	cards.shuffle()
	fmt.Println("\nHand:")
	start := 0
	end := 9
	for index := range 5 {
		hand, remainingCards := dealCards(start, end, cards)
		start += 9
		end += 9
		fmt.Printf("\nPlayer %d:\n", index+1)
		hand.print()
		fmt.Println("\nRemaining cards:")
		remainingCards.saveToFile("rem_cards.md")
		remainingCards.print()
	}
}
