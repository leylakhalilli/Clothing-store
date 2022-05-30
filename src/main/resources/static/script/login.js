const container = document.querySelector(".account > .container"),
    signUp = document.querySelector(".signup-link"),
    login = document.querySelector(".login-link");

signUp.addEventListener("click", _ => {
    container.classList.add("active");
})
login.addEventListener("click", _ => {
    container.classList.remove("active");
})