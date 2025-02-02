package main

import (
	"fmt"

	"gorm.io/driver/sqlite"
	"gorm.io/gorm"
	_ "modernc.org/sqlite"
)

var models = []interface{}{
	&User{},
	&Task{},
}

func ConnectDB() *gorm.DB {
	dialector := sqlite.Dialector{
		DriverName: "sqlite",
		DSN:        "test.db",
	}

	db, err := gorm.Open(dialector, &gorm.Config{})
	if err != nil {
		panic("failed to connect database")
	}

	return db
}

func MigrateDB(db *gorm.DB) {
	for _, model := range models {
		db.AutoMigrate(model)
	}
}

func CloseDB(db *gorm.DB) {
	sqliteDB, err := db.DB()

	if err != nil {
		panic("failed to close database")
	}

	sqliteDB.Close()
	fmt.Println("Database closed successfully")
}
