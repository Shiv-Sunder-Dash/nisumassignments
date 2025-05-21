let users = [];

fetch('https://jsonplaceholder.typicode.com/users')
  .then(res => res.json())
  .then(data => {
    users = data;

    const citySelect = document.getElementById('citySelect');
    const cities = [...new Set(users.map(user => user.address.city))];

    cities.forEach(city => {
      const option = document.createElement('option');
      option.value = city;
      option.textContent = city;
      citySelect.appendChild(option);
    });
  });

document.getElementById('citySelect').addEventListener('change', function () {
  const selectedCity = this.value;
  const filtered = users.filter(user => user.address.city === selectedCity);
  const list = document.getElementById('filteredUsers');
  list.innerHTML = '';
  filtered.forEach(user => {
    const li = document.createElement('li');
    li.textContent = `${user.name} - ${user.email}`;
    list.appendChild(li);
  });
});
