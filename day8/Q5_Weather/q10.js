document.getElementById('form').addEventListener('submit', function (e) {
  e.preventDefault();

  let valid = true;

  const name = document.getElementById('name').value.trim();
  const email = document.getElementById('email').value.trim();
  const password = document.getElementById('password').value;

  document.getElementById('nameError').textContent = '';
  document.getElementById('emailError').textContent = '';
  document.getElementById('passwordError').textContent = '';

  if (!name) {
    document.getElementById('nameError').textContent = 'Name is required.';
    valid = false;
  }

  if (!email.match(/^[^@]+@[^@]+\.[^@]+$/)) {
    document.getElementById('emailError').textContent = 'Invalid email format.';
    valid = false;
  }

  if (password.length < 6) {
    document.getElementById('passwordError').textContent = 'Password must be at least 6 characters.';
    valid = false;
  }

  if (valid) {
    alert('Form submitted successfully!');
  }
});
