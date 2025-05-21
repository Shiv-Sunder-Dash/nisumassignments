async function fetchAPIs() {
  try {
    const response = await fetch('https://api.publicapis.org/entries');
    if (!response.ok) throw new Error('Network response was not ok');
    const data = await response.json();
    const list = document.getElementById('apiList');
    data.entries.slice(0, 5).forEach(api => {
      const li = document.createElement('li');
      li.textContent = `${api.API} - ${api.Description}`;
      list.appendChild(li);
    });
  } catch (error) {
    console.error('Fetch failed:', error);
  }
}

fetchAPIs();
