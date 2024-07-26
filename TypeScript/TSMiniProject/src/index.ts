const inpForm = document.getElementById("todo-form");
const inpInput = document.getElementById("todo-input") as HTMLInputElement;
const todoList = document.getElementById("todo-list");

interface Todo {
  text: string;
  completed: boolean;
}

const todos: Todo[]  = readTodos();
todos.forEach(createTodoElement);

function readTodos(): Todo[] {
  const todoJson = localStorage.getItem("todos");
  if(todoJson == null) return [];
  const todo = JSON.parse(todoJson)
  return todo;
}

function saveTodos(todos: Todo[]) {
  localStorage.setItem("todos", JSON.stringify(todos)); 
}

function createTodoElement(todo: Todo) {
  const todoElement = document.createElement("li");
  const todoText = todo.text;
  const checkBox = document.createElement("input");
  checkBox.type = "checkbox";
  checkBox.checked = todo.completed;
  checkBox.addEventListener("change", () => {
    if(!todo.completed) {
      todo.completed = true;
    };
    saveTodos(todos);
  })
  todoElement.appendChild(checkBox);
  todoElement.appendChild(document.createTextNode(todoText));
  todoList?.appendChild(todoElement);
}

function handleSubmission(event: Event) {
  event.preventDefault();
  const newTodo: Todo = {
    text: inpInput.value,
    completed: false,
  };
  todos.push(newTodo);
  saveTodos(todos);
  createTodoElement(newTodo);
  inpInput.value = "";
}

inpForm?.addEventListener("submit", handleSubmission);
