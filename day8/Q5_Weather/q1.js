const countryInput = document.getElementById('countryInput');
const weatherDetails = document.getElementById('weatherDetails');

const weatherData = {
  India: { city: 'Bhubaneswar', temp: '31°C', condition: 'Sunny' },
  USA: { city: 'New York', temp: '16°C', condition: 'Cloudy' },
  Japan: { city: 'Tokyo', temp: '22°C', condition: 'Rainy' },
  Germany: { city: 'Berlin', temp: '14°C', condition: 'Windy' }
};

countryInput.addEventListener('keypress', function (e) {
  if (e.key === 'Enter') {
    const input = countryInput.value.trim();
    const data = weatherData[input];
    if (data) {
      weatherDetails.innerHTML = `
        <h2>Current Weather</h2>
        <p>City: ${data.city}</p>
        <p>Temperature: ${data.temp}</p>
        <p>Condition: ${data.condition}</p>
      `;
    } else {
      weatherDetails.innerHTML = `
        <h2>Current Weather</h2>
        <p>Data not available for "${input}"</p>
      `;
    }
  }
});
