function checkPalindrome() {
  const input = document.getElementById('word').value.trim().toLowerCase();
  const reversed = input.split('').reverse().join('');
  const result = document.getElementById('result');
  result.textContent = input === reversed
    ? `"${input}" is a palindrome.`
    : `"${input}" is not a palindrome.`;
}
