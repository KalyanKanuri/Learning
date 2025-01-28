package cmd

import (
	"math/rand"

	"github.com/spf13/cobra"
)

var gen = &cobra.Command{
	Use:   "gen",
	Short: "Generate a Random Password",
	Long:  "Generate a password with custom options",

	Run: GeneratePassword,
}

func init() {
	rootCmd.AddCommand(gen)

	gen.Flags().IntP("length", "l", 8, "Password length")
	gen.Flags().BoolP("digits", "d", false, "Include digits")
	gen.Flags().BoolP("special", "s", false, "Include special characters")
}

func GeneratePassword(cmd *cobra.Command, args []string) {
	chars := "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
	digits := "1234567890"
	special := "!@#$%^&*()-_=+[]{}|;:,.<>?/`~"

	length, _ := cmd.Flags().GetInt("length")
	isDigits, _ := cmd.Flags().GetBool("digits")
	isSpecial, _ := cmd.Flags().GetBool("special")

	if isDigits {
		chars += digits
	}

	if isSpecial {
		chars += special
	}

	password := make([]byte, length)

	for i := range password {
		password[i] = chars[rand.Intn(len(chars))]
	}
	cmd.Println(string(password))
}
