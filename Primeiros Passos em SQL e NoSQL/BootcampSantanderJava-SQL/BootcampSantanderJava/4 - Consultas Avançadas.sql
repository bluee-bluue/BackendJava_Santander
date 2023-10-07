use SantanderBootcampJava;

insert into USUARIOS(nome, email, data_nascimento, rua, numero, bairro, estado)
values ('Maria da Paz', 'mariapaz@gmail.com', '2000-02-04', 'Rua Maringa', '63', 'Bairo Vila Vinga', 'SP');
insert into USUARIOS(nome, email, data_nascimento, rua, numero, bairro, estado)
values ('José Bezerra', 'joseb@gmail.com', '2001-06-17', 'Rua das Massas', '98', 'Bairo do Gato', 'RJ');
insert into USUARIOS(nome, email, data_nascimento, rua, numero, bairro, estado)
values ('Victoria Oliveira', 'vicoliveira@gmail.com', '1999-12-28', 'Rua Paulista', '85', 'Bairo Cidades', 'SP');

select * from USUARIOS

insert into RESERVAS(id_usuario, id_destino, data_reserva, status_reserva)
values (3, 1, '2023-10-05', 'pendente');

insert into DESTINOS(nome, descricao)
values ('Santos', 'Praia comum de SP');

-- INNER JOIN - Usuários com reservas e destinos
select * from USUARIOS us
inner join RESERVAS rs on us.id = rs.id_usuario
inner join DESTINOS dn on rs.id_destino = dn.id;

-- LEFT JOIN - Usuários com ou sem reservas
select * from USUARIOS us
left join RESERVAS rs on us.id = rs.id_usuario;

-- RIGHT JOIN - Destinos com ou sem reservas
select * from RESERVAS rs
right join DESTINOS ds on rs.id_destino = ds.id;

-- WHERE - Destinos sem reservas
select * from DESTINOS
where id not in (select id_destino from RESERVAS);

-- WHERE - Usuários sem reservas
select * from USUARIOS
where id not in (select id_usuario from RESERVAS);

-- COUNT
select count(*) from USUARIOS;

-- COUNT - Contando usuários com reservas
select count(*) as total_usuarios from USUARIOS us
inner join RESERVAS rs on us.id = rs.id_usuario;

-- MAX - Usuário mais velho
select max(datediff(year, data_nascimento, getdate())) as [Usuario mais velho tem:]
from USUARIOS;

-- GROUP BY - Quantidade de reservas para cada destino
select count(*) as [Quantidade de Reservas], id_destino from RESERVAS
group by id_destino;

-- ORDER BY - Quantidade de reservas ordenada para cada destino
select count(*) as [Quantidade de Reservas], id_destino from RESERVAS
group by id_destino
order by [Quantidade de Reservas] asc;

select count(*) as [Quantidade de Reservas], id_destino from RESERVAS
group by id_destino
order by [Quantidade de Reservas] desc;

select count(*) as [Quantidade de Reservas], id_destino from RESERVAS
group by id_destino
order by [Quantidade de Reservas], id_destino desc;

select count(*) as [Quantidade de Reservas], id_destino from RESERVAS
group by id_destino
order by [Quantidade de Reservas] desc, id_destino desc;
