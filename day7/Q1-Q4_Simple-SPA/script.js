function showSection(id) {
  const sections = document.querySelectorAll('section');
  sections.forEach(section => {
    section.classList.remove('visible');
  });
  document.getElementById(id).classList.add('visible');
}