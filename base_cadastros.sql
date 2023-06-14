create database banco_de_cadastro; 

use banco_de_cadastro; 

create table usuario (
	id  		integer auto_increment primary key, 
  	titular 	varchar(200) not null, 
    cpf_conta 	varchar (200) not null unique , 
    profisao 	varchar (200) not null unique , 
    senha 		text not null ,
    telefone 	varchar(15) not null,
);	

insert into usuario values (null, 'Joao','70257409424','developer', '123','00000000')

select * from usuario;