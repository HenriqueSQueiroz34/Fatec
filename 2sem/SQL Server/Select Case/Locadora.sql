use Filmes

select f.id,f.ano,
	case when(len(f.titulo)>10)
		then substring(f.titulo,1,10) + '...'
		else f.titulo
	end as titulo_filme
from filme f inner join dvd
on dvd.filme_id = f.id
where convert(char(10),dvd.data_fabricacao,103) > '01/01/2020'

select d.num,d.data_fabricacao,
datediff(month,d.data_fabricacao,getdate()) as qtd_meses_desde_fabricacao
from dvd d inner join filme f
on d.filme_id = f.id
where f.titulo = 'Interestelar'

select l.dvd_num,l.data_locacao,l.data_devolucao,
datediff(day,l.data_locacao,l.data_devolucao) as dias_alugados
from locacao l inner join cliente c
on l.cliente_num = c.num_cadastro
where c.nome like 'Rosa%'

select c.nome,
(c.logradouro + ', ' + c.num) as endereco,
substring(c.cep,1,5) + '-' + substring(c.cep,6,8) as cep
from cliente c inner join locacao l
on c.num_cadastro = l.cliente_num
where l.dvd_num = 2
