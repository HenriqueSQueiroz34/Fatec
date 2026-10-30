create database Livraria
use Livraria

create table autor(
id_autor int identity(2351,1),
nome varchar(100) not null unique,
data_nasc date not null,
pais_nasc varchar(50),
biografia varchar(255),
primary key(id_autor),
constraint chk_data check(data_nasc > convert(char(10), getdate(), 120)),
constraint chk_pais check(pais_nasc = 'Brasil' or pais_nasc = 'Estados Unidos'
							or pais_nasc = 'Inglaterra' or pais_nasc = 'Alemanha')
)

create table livro(
codigo int identity(100001,100),
nome varchar(200) not null,
lingua varchar(10) default('PT-BR'),
ano int not null,
primary key(codigo),
constraint chk_ano check(ano >= 1990)
)

create table livro_autor(
livro_codigo int not null,
autor_id int not null,
primary key(livro_codigo,autor_id),
foreign key(livro_codigo) references livro(codigo),
foreign key(autor_id) references autor(id_autor)
)

create table editora(
id_editora int identity(491,16),
nome varchar(70) not null,
telefone char(10) not null,
logradouro_end varchar(200) not null,
numero_end int not null,
cep char(8) not null,
complemento_end varchar(255),
primary key(id_editora),
constraint chk_num_end check(numero_end > 0)
)

create table edicao(
isbn char(13) not null,
preco decimal(4,2) not null,
ano int not null,
numero_paginas int not null,
qtd_estoque int not null,
primary key(isbn),
constraint chk_ano_edicao check(ano >= 1993),
constraint chk_paginas check(numero_paginas > 15),
constraint chk_qtd_estoque check(qtd_estoque >= 0)
)

