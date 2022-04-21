function generateEmail(form) {
    document.getElementById("email").innerHTML = 
        form.elements["first"].value + "." +
        form.elements["last"].value + "@uw.edu";
    form.reset();
    form.elements["first"].focus();
}