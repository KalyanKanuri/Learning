package main

import (
	"fmt"
	"os"

	cli "github.com/urfave/cli/v2"
)

func main() {
	fmt.Println(os.Args)
	app := &cli.App{
		Name:  "Learn Urfave",
		Usage: "Learn How to Build CLI apps Using Urfave CLI",
		// Commands is a slice of Command objects
		Commands: []*cli.Command{
			{
				// Name is the name of the command
				Name: "greet",
				// Aliases is a list of alternative names for the command
				Aliases: []string{"g"},
				// Description is a one-line description of the command
				Description: "greet a person",
				// Action is a function that is called when the command is run
				Action: func(ctx *cli.Context) error {
					// Get the first argument from the context
					arg := ctx.Args().Get(0)
					// Print a greeting message
					fmt.Println("Hi", arg)
					// Return nil to indicate success
					return nil
				},
			},
		},
	}
	// Run the app with the arguments from os.Args
	if err := app.Run(os.Args); err != nil {
		fmt.Println(err)
	}
}
