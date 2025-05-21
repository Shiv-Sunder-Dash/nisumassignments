const taskInput = document.getElementById('taskInput');
const addBtn = document.getElementById('addBtn');
const todoList = document.getElementById('todoList');

function loadTasks() {
  const tasks = JSON.parse(localStorage.getItem('tasks')) || [];
  todoList.innerHTML = '';
  tasks.forEach((task, index) => {
    const li = document.createElement('li');
    li.textContent = task.text;
    li.style.textDecoration = task.done ? 'line-through' : 'none';

    li.addEventListener('click', () => {
      tasks[index].done = !tasks[index].done;
      localStorage.setItem('tasks', JSON.stringify(tasks));
      loadTasks();
    });

    li.addEventListener('contextmenu', e => {
      e.preventDefault();
      tasks.splice(index, 1);
      localStorage.setItem('tasks', JSON.stringify(tasks));
      loadTasks();
    });

    todoList.appendChild(li);
  });
}

addBtn.addEventListener('click', () => {
  const text = taskInput.value.trim();
  if (text) {
    const tasks = JSON.parse(localStorage.getItem('tasks')) || [];
    tasks.push({ text, done: false });
    localStorage.setItem('tasks', JSON.stringify(tasks));
    taskInput.value = '';
    loadTasks();
  }
});

loadTasks();
