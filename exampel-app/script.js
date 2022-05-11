const username = document.getElementById('username')
const password = document.getElementById('password')
const form = document.getElementById('form')
const errorElement = document.getElementById('error')

form.addEventListener('submit', (e) => {
    let messages = []
    if (username.value === '' || username.value == null) {
        messages.push('Name kudu diisi')
    }

    if (messages.length > 0){
        e.preventDefault()
        errorElement.innerText = messages.join('. ')
    }

})