async function runTasksSequentially(tasks) {
  const results = [];

  for (const task of tasks) {
    try {
      const result = await task();
      results.push(result);
    } catch (error) {
      console.error(error); // Log the rejected reason
    }
  }

  return results;
}

// Example usage:
const tasks = [
  () => Promise.resolve('Task 1 done'),
  () => Promise.reject('Task 2 failed'),
  () => Promise.resolve('Task 3 done')
];

runTasksSequentially(tasks).then(console.log);

// Expected output:
// Task 2 failed
// ['Task 1 done', 'Task 3 done']
