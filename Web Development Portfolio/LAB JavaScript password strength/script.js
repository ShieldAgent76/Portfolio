// Your solution goes here 
function isStrongPassword(thePassword) {
    
    if (thePassword.length < 8) {
        return false;
    }
    else if (thePassword.includes("password")) {
        return false;
    }
    else if (thePassword.charAt >=65 && thePassword.charAt <= 90) {
        return false;
    }
    else {
        return true;
    }
    
}