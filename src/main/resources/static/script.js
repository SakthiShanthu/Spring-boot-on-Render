document.getElementById('fetchData').addEventListener('click', function() {
    // URL of your Spring Boot API
    const apiUrl = 'http://localhost:1234/render/get';

    fetch(apiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error('Server is down');
            }
            return response.text();
        })
        .then(data => {
            // Handle the API response here
            const outputDiv = document.getElementById('output');
            outputDiv.textContent = data;
        })
        .catch(error => {
            // Handle the error here
            const outputDiv = document.getElementById('output');
            outputDiv.textContent = 'Server is down';
            console.error('Error:', error);
        });
});

// Function to perform the mathematical operation
function performOperation(operation) {
    const value1 = parseFloat(document.getElementById('value1').value);
    const value2 = parseFloat(document.getElementById('value2').value);

    // Check if input values are valid numbers
    if (isNaN(value1) || isNaN(value2)) {
        document.getElementById('Response').textContent = 'Please enter valid numbers.';
        return;
    }

    // URL of your Spring Boot API for mathematical operations
    const apiUrl = `http://localhost:1234/render/operation/${operation}?value1=${value1}&value2=${value2}`;

    fetch(apiUrl, { method: 'POST' })
        .then(response => {
            if (!response.ok) {
                throw new Error('Server is down or operation not supported');
            }
            return response.text();
        })
        .then(data => {
            // Display the result
            const responseDiv = document.getElementById('Response');
            responseDiv.textContent = `Result: ${data}`;
        })
        .catch(error => {
            // Handle the error
            const responseDiv = document.getElementById('Response');
            responseDiv.textContent = error.message;
            console.error('Error:', error);
        });
}

// Event listeners for each operation button
document.getElementById('add').addEventListener('click', () => performOperation('add'));
document.getElementById('sub').addEventListener('click', () => performOperation('sub'));
document.getElementById('multiply').addEventListener('click', () => performOperation('multiply'));
document.getElementById('divide').addEventListener('click', () => performOperation('divide'));
