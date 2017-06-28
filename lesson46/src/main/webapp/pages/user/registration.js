
function validateEmail(event) {
    event.preventDefault()


    let email = document.getElementById("email");

    console.log(email.value);

    let emailText = email.value;

    console.log(emailText.indexOf("@") === -1);

    if(emailText.indexOf("@") === -1) {
        email.classList.add(red-border);
    } else {
        document.getElementById("myForm").submit();
    }
}

document.getElementById("registerBtn").addEventListener(click, validateEmail);

document.getElementById("registerBtn").addBehavior("focus", resetEmailFild);

function resetEmailFild() {
    document.getElementById("email").classList.remove('red-border')
}