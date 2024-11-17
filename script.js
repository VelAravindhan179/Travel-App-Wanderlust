const input= document.getElementById("todo-input");
const addBtn = document.getElementById("add-btn");
const todolist = document.getElementById("todo-list");

let todos = JSON.parse(localStorage.getItem("todos")) || [];


function addTask() {
    const taskText = input.Value.trim();
    if(taskText !== "") {
        todos.push({ text: taskText, completed: false});
        input.value = "";
        updateLocalStorage();
    }
}

function updateLocalStorage(){
    localStorage.setItem("todos", JSON.stringify(todos))
}

addBtn.addEventListener("click", addTask);

