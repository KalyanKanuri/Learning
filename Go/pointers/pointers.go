package main

import "fmt"

type BankAccount struct {
	AccountNumber string
	AccountHolder string
	Balance       float64
}

func (account *BankAccount) Deposit(amount float64) {
	account.Balance += amount
}

func (account *BankAccount) Withdraw(amount float64) error {
	if account.Balance < amount {
		return fmt.Errorf("insufficient funds")
	}
	account.Balance -= amount
	return nil
}

func (account *BankAccount) CheckBalance() {
	fmt.Printf("Current Balance: %.2f\n", account.Balance)
}

func main() {
	account := BankAccount{
		AccountNumber: "123456789",
		AccountHolder: "John Doe",
		Balance:       1000,
	}

	account.Deposit(500)
	account.Withdraw(200)
	account.CheckBalance()
}
