document.getElementById('student-form').addEventListener('submit', function(event) {
    event.preventDefault();
    
    // Get form values
    var name = document.getElementById('name').value;
    var weight = document.getElementById('weight').value;
    var height = document.getElementById('height').value;
    var hairColor = document.getElementById('hair-color').value;
    var gpa = document.getElementById('gpa').value;

    // Add student to table
    var tableBody = document.querySelector('#student-table tbody');
    var newRow = tableBody.insertRow();
    newRow.innerHTML = `
        <td>${name}</td>
        <td>${weight}</td>
        <td>${height}</td>
        <td>${hairColor}</td>
        <td>${gpa}</td>
        <td><button class="delete-btn">Delete</button></td>
    `;

    // Clear form inputs
    document.getElementById('name').value = '';
    document.getElementById('weight').value = '';
    document.getElementById('height').value = '';
    document.getElementById('hair-color').value = '';
    document.getElementById('gpa').value = '';
});

// Event delegation to handle delete button click
document.getElementById('student-table').addEventListener('click', function(event) {
    if (event.target.classList.contains('delete-btn')) {
        var row = event.target.closest('tr');
        row.parentNode.removeChild(row);
    }
});
