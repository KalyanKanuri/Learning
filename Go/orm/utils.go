package main

import "fmt"

func NewUser(name string, age int) {
	db := ConnectDB()

	user := User{Name: name, Age: age}
	result := db.Create(&user)

	if result.Error != nil {
		fmt.Println("Failed to create user:", result.Error)
		return
	}
	fmt.Println("User created successfully", name, age)

	CloseDB(db)
}

func GetUser(id int) (*User, error) {
	db := ConnectDB()

	user := User{}
	result := db.Take(&user, "id = ?", id)

	if result.Error != nil {
		return nil, result.Error
	}
	return &user, nil
}

func GetUsers() []User {
	db := ConnectDB()

	var users []User
	db.Find(&users)

	CloseDB(db)
	return users
}

func DeleteUser(id int) {
	db := ConnectDB()

	result := db.Delete(&User{}, "id = ?", id)

	if result.Error != nil {
		fmt.Println("Failed to delete user:", result.Error)
		return
	}
	fmt.Println("User deleted successfully")
	CloseDB(db)
}

func UpdateUser(id int, name string, age int) {
	db := ConnectDB()

	updates := make(map[string]interface{})
	if name != "" {
		updates["name"] = name
	}
	if age != 0 {
		updates["age"] = age
	}

	result := db.Model(&User{}).Where("id = ?", id).Updates(updates)

	if result.Error != nil {
		fmt.Println("Failed to update user:", result.Error)
		return
	}
	fmt.Println("User updated successfully")
	CloseDB(db)
}

func NewTask(title string, status string, userID int) {
	db := ConnectDB()

	task := Task{Title: title, Status: status, UserID: userID}
	result := db.Create(&task)

	if result.Error != nil {
		fmt.Println("Failed to create task:", result.Error)
		return
	}
	fmt.Println("Task created successfully", title, status, userID)

	CloseDB(db)
}

func GetTasks() []Task {
	db := ConnectDB()

	var tasks []Task
	db.Find(&tasks)

	CloseDB(db)
	return tasks
}

func GetTask(id int) (*Task, error) {
	db := ConnectDB()

	task := Task{}
	result := db.Take(&task, "id = ?", id)

	if result.Error != nil {
		return nil, result.Error
	}
	return &task, nil
}

func DeleteTask(id int) {
	db := ConnectDB()

	result := db.Delete(&Task{}, "id = ?", id)

	if result.Error != nil {
		fmt.Println("Failed to delete task:", result.Error)
		return
	}
}

func UpdateTask(id int, title string, status string, userID int) {
	db := ConnectDB()

	updates := make(map[string]interface{})
	if title != "" {
		updates["title"] = title
	}
	if status != "" {
		updates["status"] = status
	}
	if userID != 0 {
		updates["user_id"] = userID
	}

	result := db.Model(&Task{}).Where("id = ?", id).Updates(updates)

	if result.Error != nil {
		fmt.Println("Failed to update task:", result.Error)
		return
	}
	fmt.Println("Task updated successfully")
	CloseDB(db)
}
