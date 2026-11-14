use Projetos
go
select us.id,us.nome,us.email,p.id,p.nome,p.descricao,p.data
from users us inner join user_has_projects uhp
on us.id = uhp.users_id
inner join projects p
on p.id = uhp.projects_id
where p.nome = 'Re-folha'
go
select p.nome as projetos_vazios
from projects p inner join user_has_projects uhp
on p.id = uhp.projects_id
where uhp.users_id is null
order by p.id desc
go
select u.id as sem_projeto
from users u left join user_has_projects uhp 
on u.id = uhp.users_id 
where uhp.users_id is null
order by u.id desc
