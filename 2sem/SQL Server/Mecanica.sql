create database Mecanica
use Mecanica

create table cliente(
id int identity(3401,15),
nome varchar(100) not null,
logradouro varchar(200) not null,
numero int not null,
cep char(8) not null,
complemento varchar(255),
primary key(id),
constraint chk_numero_cliente check(numero > 0),
constraint chk_cep_cliente check(len(cep) = 8)
)

create table telefone_cliente(
clienteID int not null,
telefone varchar(11) not null,
primary key(clienteID,telefone),
foreign key(clienteID) references cliente(id)
)

create table peca(
id int identity(3411,7),
nome varchar(30) not null unique,
preco decimal(4,2) not null,
estoque int not null,
primary key(id),
constraint chk_preco_peca check(preco > 0.0),
constraint chk_estoque check(estoque >= 10)
)

create table veiculo(
placa char(7) not null,
marca varchar(30) not null,
modelo varchar(30) not null,
cor varchar(15) not null,
ano_fabricacao int not null,
ano_modelo int not null,
data_aquisicao date not null,
clienteID int not null,
primary key(placa),
foreign key(clienteID) references cliente(id),
constraint chk_placa check(len(placa) = 7),
constraint chk_ano_fabricacao check(ano_fabricacao > 1997),
constraint chk_ano_modelo check(ano_modelo > 1997),
constraint chk_ano_diferenca check(ano_modelo = ano_fabricacao or ano_modelo+1 = ano_fabricacao),
constraint chk_aquisicao check(data_aquisicao <= convert(char(4),getdate(),120))
)

create table categoria(
id int identity(1,1),
categoria varchar(10) not null,
valor_hora decimal(4,2) not null,
primary key(id),
constraint chk_categoria check((categoria = 'Estagiário' and valor_hora > 15.00) or
								(categoria = 'Nível 1' and valor_hora > 25.00) or
								(categoria = 'Nível 2' and valor_hora > 35.00) or
								(categoria = 'Nível 3' and valor_hora > 50.00))
)

create table funcionario(
id int identity(101,1),
nome varchar(100) not null,
logradouro varchar(200) not null,
numero int not null,
telefone char(11) not null,
categoria_habilitacao char(1) not null,
categoriaID int not null,
primary key(id),
foreign key(categoriaID) references categoria(id),
constraint chk_numero_funcionario check(numero > 0),
constraint chk_telefone_funcionario check(len(telefone) = 11),
constraint chk_hab_categoria check(categoria_habilitacao = 'A' or
									categoria_habilitacao = 'B' or
									categoria_habilitacao = 'C' or
									categoria_habilitacao = 'D' or
									categoria_habilitacao = 'E')
)

create table reparo(
veiculo_placa char(7) not null,
funcionarioID int not null,
pecaID int not null,
data_reparo date default getdate(),
custo_total decimal(4,2) not null,
tempo int not null,
primary key(veiculo_placa,funcionarioID,pecaID,data_reparo),
foreign key(veiculo_placa) references veiculo(placa),
foreign key(funcionarioID) references funcionario(id),
foreign key(pecaID) references peca(id),
constraint chk_custo_total check(custo_total > 0.0),
constraint chk_tempo check(tempo > 0)
)
