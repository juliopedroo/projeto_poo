const formulario = document.querySelector("form");

const Ititular = document.querySelector(".titular")
const IcpfConta = document.querySelector(".cpfConta")
const Iprofissao = document.querySelector(".profissao")
const Isenha = document.querySelector(".senha")
const ItipoConta = document.querySelector(".tipoConta")

function criarConta(){
    fetch("http://localhost:8080/cliente",
    {
        Headers:{
            'Accept' : 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            titular: Ititular.value,
            cpfConta: IcpfConta.value,
            profissao: Iprofissao.value, 
            senha: Isenha.value,
        })
    })
    .then(function (res) { console.log(res.json) })
    .catch(function (res) { console.log(res.json) })
}

function limpar(){
        Ititular.value = "",
        IcpfConta.value = "",
        Iprofissao.value = "", 
        Isenha.value = "",
        ItipoConta.value = ""
}

formulario.addEventListener('submit', function(event){
    event.preventDefault();
    
    criarConta();
    limpar(); 
})