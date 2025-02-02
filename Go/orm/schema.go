package main

import "gorm.io/gorm"

type User struct {
	gorm.Model
	ID   int    `gorm:"primaryKey; autoIncrement; not null"`
	Name string `gorm:"unique; not null"`
	Age  int    `gorm:"not null"`
}

type Task struct {
	gorm.Model
	ID     int    `gorm:"primaryKey; autoIncrement; not null"`
	Title  string `gorm:"not null"`
	Status string `gorm:"not null"`
	UserID int    `gorm:"not null"`
	User   User   `gorm:"foreignKey:UserID"`
}
