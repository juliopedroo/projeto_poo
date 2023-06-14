const formulario = document.querySelector("form");

const InumeroConta = document.querySelector(".numeroConta")
const Iagencia = document.querySelector(".agencia")
const Isenha = document.querySelector(".senha")

function entrar(){
    fetch(
        "http://localhost:8080/conta",
    {
        Headers:{
            'Accept' : 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body:  JSON.stringify({
            numeroConta : InumeroConta.value,
            agencia : Iagencia.value, 
            senha : Isenha.value})
    })
    .then(function (res) { console.log(res) })
    .catch(function (res) { console.log(res) })
}

function limpar() { 
        InumeroConta.value = "",
        Iagencia.value = "", 
        Isenha.value = ""
        ItipoConta.value = ""
}


formulario.addEventListener('submit', function(event){
    event.preventDefault();

    entrar();
    limpar();

})