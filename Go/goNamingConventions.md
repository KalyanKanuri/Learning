| Category                   | Convention                              | Example                                             |
| -------------------------- | --------------------------------------- | --------------------------------------------------- |
| Package Names              | Lowercase, no underscores or mixed caps | `fmt`, `http`, `jsonparser`                         |
| File Names                 | Lowercase with underscores              | `user_handler.go`, `database_connection.go`         |
| Variables (internal)       | camelCase                               | `userID`, `emailAddress`                            |
| Variables (exported)       | PascalCase                              | `MaxRetryCount`, `DatabaseURL`                      |
| Constants (exported)       | PascalCase                              | `const MaxConnections = 100`                        |
| Constants (internal)       | ALL_CAPS (common but not strict)        | `const DB_TIMEOUT = 30`                             |
| Functions (internal)       | camelCase                               | `func calculateTotal()`                             |
| Functions (exported)       | PascalCase                              | `func ValidateUser()`                               |
| Methods                    | Same as functions                       | `func (u *User) Save()`                             |
| Interfaces                 | PascalCase, often ending with '-er'     | `type Reader interface`                             |
| Structs (exported)         | PascalCase                              | `type UserProfile struct`                           |
| Structs (internal)         | camelCase                               | `type dbConfig struct`                              |
| Error Variables (exported) | Start with 'Err', PascalCase            | `var ErrNotFound = errors.New("not found")`         |
| Error Variables (internal) | Start with 'err', camelCase             | `var errInvalidInput = errors.New("invalid input")` |
| Test Functions             | Start with 'Test'                       | `func TestValidateUser(t *testing.T)`               |
| Acronyms                   | All caps, but obey other rules          | `ServeHTTP`, `XMLHTTPRequest`                       |
| Getters                    | Just the property name                  | `func (u *User) Name() string`                      |
| Setters                    | Start with 'Set'                        | `func (u *User) SetName(name string)`               |
