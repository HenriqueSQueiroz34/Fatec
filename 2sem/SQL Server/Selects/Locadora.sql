create database Filmes
use Filmes

create table estrela(
id int identity(1,1),
nome varchar(50) not null,
primary key(id)
)

create table filme(
id int identity(1,1),
titulo varchar(40) not null,
ano int,
primary key(id),
constraint chk_ano check(ano <= 2021)
)

create table filme_estrela(
filme_id int not null,
estrela_id int not null,
primary key(filme_id,estrela_id),
foreign key(filme_id) references filme(id),
foreign key(estrela_id) references estrela(id)
)

create table dvd(
num int identity(1,1),
data_fabricacao date not null,
filme_id int not null,
primary key(num),
foreign key(filme_id) references filme(id),
constraint chk_data_fabricacao check(data_fabricacao < convert(char(4),getdate(),120))
)

create table cliente(
num_cadastro int identity(1,1),
nome varchar(70) not null,
logradouro varchar(150) not null,
num int not null,
cep char(8),
primary key(num_cadastro),
constraint chk_num check(num > 0),
constraint chk_cep check(len(cep) = 8)
)

create table locacao(
dvd_num int not null,
cliente_num int not null,
data_locacao date default getdate(),
data_devolucao date not null,
valor decimal(7,2) not null,
primary key(dvd_num, cliente_num,data_locacao),
foreign key(dvd_num) references dvd(num),
foreign key(cliente_num) references cliente(num_cadastro),
constraint chk_valor check(valor > 0.0),
constraint chk_devolucao check(data_devolucao > data_locacao)
)

alter table filme
drop column titulo 

alter table filme
add titulo varchar(80) not null

alter table estrela
add nome_real varchar(50)

insert into filme(titulo,ano) values
('Whiplash',2015),
('Birdman',2015),
('Interestelar',2014),
('A Culpa é das Estrelas',2014),
('Alexandre e o Dia Terrível, Horrível, Espantoso e Horroroso',2014),
('Sing',2016)

insert into estrela values
('Michael Keaton','Michael John Douglas'),
('Emma Stone','Emily Jena Stone'),
('Miles Teller',null),
('Steve Carell','Steven John Carell'),
('Jennifer Garner', 'Jennifer Anne Garner')

insert into filme_estrela values
(2,1),
(2,2),
(1,3),
(5,4),
(5,5)

insert into dvd values
('2020-12-02',1),
('2019-10-18',2),
('2020-04-03',3),
('2020-12-02',1),
('2019-10-18',4),
('2020-04-03',2),
('2020-12-02',5),
('2019-10-18',2),
('2020-04-03',3)

insert into cliente values
('Matilde Luz','Rua Síria',150,'03086040'),
('Carlos Carreiro','Rua Bartolomeu Aires',1250,'04419110'),
('Daniel Ramalho','Rua Itajutiba',169,null),
('Roberta Bento','Rua Jayme Von Rusenburg',36,null),
('Rosa Cerqueira','Rua Arnaldo Simões Pinto',235,'02917110')


insert into locacao values
(1,2,'2021-02-18','2021-02-21',3.50),
(9,2,'2021-02-18','2021-02-21',3.50),
(2,3,'2021-02-18','2021-02-19',3.50),
(2,5,'2021-02-20','2021-02-23',3.00),
(4,5,'2021-02-20','2021-02-23',3.00),
(5,5,'2021-02-20','2021-02-23',3.00),
(1,1,'2021-02-24','2021-02-26',3.50),
(8,1,'2021-02-24','2021-02-26',3.50)


update cliente
set cep = '08411150'
where num_cadastro = 3

update cliente
set cep = '02918190'
where num_cadastro = 4

update locacao
set valor = 3.25
where cliente_num = 2
and data_locacao = '2021-02-18'

update locacao
set valor = 3.10
where cliente_num = 1
and data_locacao = '2021-02-24'

update dvd
set data_fabricacao = '2019-07-14'
where num = 5

update estrela
set nome_real = 'Miles Alexander Teller'
where nome = 'Miles Teller'

delete from filme
where titulo = 'Sing'

select * from filme where ano = 2014

select id,ano from filme where titulo = 'Birdman'

select id,ano from filme where titulo like '%plash%'

select id,nome,nome_real from estrela where nome like 'Steve%'

select filme_id,convert(char(10),data_fabricacao,103) as 'fab'
from dvd
where 'fab' > '01-01-2020'

select dvd_num,data_locacao,data_devolucao,valor,(valor+2.00) as 'valor_multa'
from locacao where cliente_num = 5

select logradouro,num,cep from cliente where nome = 'Matilde Luz'

select nome_real from estrela where nome = 'Michael Kaeton'

select num_cadastro,nome,(cep+': '+logradouro+', '+convert(char(4),num)) as end_comp
from cliente where num_cadastro >= 3
