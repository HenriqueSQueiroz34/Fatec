create database Clinica
use Clinica

create table especialidade(
id int identity(1,1),
especialidade varchar(100) not null,
primary key(id)
)
go
create table medico(
codigo int identity(100000,1),
especialidadeID int not null,
nome varchar(100) not null,
logradouro varchar(200) not null,
numero int not null,
cep char(8) not null,
complemento varchar(255) not null,
contato varchar(11) not null,
primary key(codigo),
foreign key(especialidadeID) references especialidade(id)
)
go
create table paciente(
num_beneficiario int identity(1000000,1),
nome varchar(100) not null,
logradouro varchar(200) not null,
numero int not null,
cep char(8) not null,
complemento varchar(255) not null,
telefone varchar(11) not null,
primary key(num_beneficiario)
)
go
create table consulta(
pacienteNum_beneficiario int not null,
medicoCodigo int not null,
data_hora timestamp not null,
observacao varchar(255),
primary key(pacienteNum_beneficiario,medicoCodigo,data_hora),
foreign key(pacienteNum_beneficiario) references paciente(num_beneficiario),
foreign key(medicoCodigo) references medico(codigo)
)

insert into paciente values 
('Washington Silva','R. Anhaia',150,'02345000','Casa','92229999'),
('Luis Ricardo','R. Voluntários da Pátria',2251,'03254010','Bloco B. Apto 25','923450987'),
('Maria Elisa','Av. Aguia de Haia',1188,'06987020','Apto 1208','912348765'),
('José Araujo','R. XV de Novembro',18,'03678000','Casa','945674312'),
('Joana Paula','R. 7 de Abril',97,'01214000','Conjunto 3 - Apto 801','912095674')

insert into especialidade values
('Otorrinolaringologista'),
('Urologista'),
('Geriatra'),
('Pediatra')

insert into medico values
(1,'Ana Paula','R. 7 de Setembro',256,'03698000','Casa','915689456'),
(1,'Maria Aparecida','Av. Brasil',32,'02145070','Casa','923235454'),
(2,'Lucas Borges','Av. dos Estados',3210,'05241000','Apto 205','963698585'),
(3,'Gabriel Oliveira','Av. Dom Helder Camara',350,'03145000','Apto 602','932458745') 

insert into consulta 
(pacienteNum_beneficiario,
medicoCodigo,
observacao)
values
(1000000,100001,'2021-09-04 13:20','Infecção Urina'),
(1000001,100002,'2021-09-04 13:15','Gripe'),
(1000000,100001,'2021-09-04 12:30','Infecção Garganta')

update medico 
set dia_atendimento = 5
where codigo = 100004
go
alter table medico
add constraint atendeEm check(convert(int,dia_atendimento) > 0 and convert(int,dia_atendimento) < 8)

delete from especialidade where especialidade = 'Pediatria'

exec sp_rename 'dbo.medico.dia_atendimento','dia_semana_atendimento','column'

update medico 
set logradouro = 'Av. Bras Leme',numero = 876,cep = '02122000',complemento = 'apto 504'
where nome = 'Lucas Borges'

alter table consulta
alter column observacao varchar(200) not null
