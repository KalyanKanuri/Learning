package main

import (
	"fmt"
)

func main() {
	db := ConnectDB()
	MigrateDB(db)
	fmt.Println("Migrations completed successfully")

	// NewUser("Neymar", 24)

	users := GetUsers()
	fmt.Println(users)

	// UpdateUser(2, "Lionel Messi", 24)

	// NewTask("Learn Go", "In Progress", 1)
	// UpdateTask(1, "Learn Go", "Yet To Start", 1)
	tasks := GetTasks()
	fmt.Println(tasks)
}
