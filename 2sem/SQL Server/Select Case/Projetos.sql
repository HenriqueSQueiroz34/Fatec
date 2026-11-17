use Projetos

select id,nome,email,username,
	case when (password != '123mudar')
		then cast('********' as char(8))
		else password
	end as senha
from users u 

select p.nome,p.descricao,p.data,
dateadd(day,15,cast(p.data as date)) as data_final
from projects p inner join user_has_projects uhp
on p.id = uhp.projects_id
inner join users u
on uhp.users_id = u.id
where u.email = 'aparecido@empresa.com'

select u.nome,u.email
from users u inner join user_has_projects uhp
on u.id = uhp.users_id
inner join projects p
on p.id = uhp.projects_id 
where p.nome = 'Auditoria'

select p.nome,p.descricao,p.data,
cast('2014-09-16' as date) as data_final,
cast(DATEDIFF(day,p.data,cast('2014-09-16' as date)) * 79.85 as decimal(7,2)) as Custo_total
from projects p 
where p.nome like 'Manutenção%'
