use Filmes

select c.num_cadastro,c.nome,convert(char(10),l.data_locacao,103) as data_locacao,
/*qtd dias alugados*/
datediff(day,l.data_locacao,l.data_devolucao) as qtd_dias_alugados,
f.titulo,f.ano
from cliente c left join locacao l
on c.num_cadastro = l.cliente_num
inner join dvd d
on d.num = l.dvd_num
inner join filme f
on f.id = d.filme_id
where c.nome like 'Matilde %'
order by l.data_locacao asc

select f.titulo,e.nome,e.nome_real
from estrela e inner join filme_estrela fe
on e.id = fe.estrela_id
inner join filme f
on f.id = fe.filme_id
where f.ano = 2015
order by f.titulo asc

select f.titulo,convert(char(10),d.data_fabricacao,103) as data_fabricacao,
case when (cast(convert(char(2),getdate(),120) as int) - f.ano > 6)
then cast( cast(convert(char(4),getdate(),120) as int) - f.ano as char(3)) + ' anos'
else cast( cast(convert(char(4),getdate(),120) as int) - f.ano as char(3))
end as tempo_lancamento
from filme f inner join dvd d
on f.id = d.filme_id
order by titulo asc