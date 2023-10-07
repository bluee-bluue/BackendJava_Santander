use SantanderBootcampJava

-- Inserindo valores

insert into USUARIOS(id, nome, email, data_nascimento, endereco)
values (1, 'Caique Silva', 'scaique080@gmail.com', '2002-09-14', 'Rua Testes, 100, Bairo Banco de Dados, SP');

insert into DESTINOS(id, nome, descricao) 
values (1, 'Maresias', 'Uma das melhores praias de SP');

insert into RESERVAS(id, id_usuario, id_destino, data_reserva, status_reserva)
values (1, 1, 1, '2023-10-05', 'pendente');


-- Visualizando tabelas

select *
from USUARIOS;
select *
from DESTINOS;
select *
from RESERVAS;


-- Atualizando tabelas
-- Adicionando IDENTITY

create table USUARIOS_nova (
	id int identity(1,1), -- Identificador unico do usuário
	nome varchar(255) not null, -- Nome do usuário,
	email varchar(255) not null unique, -- Email do usuário,
	endereco varchar(100) not null, -- Endereço do usuário,
	data_nascimento date not null, -- Data de Nascimento do usuário
);

create table DESTINOS_nova(
	id int identity(1,1), -- Identificador unico do destino
	nome varchar(255) not null unique, -- Nome do destino
	descricao varchar(255) not null, -- Descrição do destino
);

create table RESERVAS_nova(
	id int identity(1,1), -- Identificador unico da reserva
	id_usuario int, -- Referencia ao id do usuário que fez a reserva
	id_destino int, -- Referencia ao id do destino da reserva
	data_reserva date, -- Data da reserva
	status_reserva varchar(255) default 'pendente' -- Status da reserva (confirmada, pendente, cancelada)
);

set identity_insert USUARIOS_nova on;

insert into USUARIOS_nova(id, nome, email, endereco, data_nascimento)
select id, nome, email, endereco, data_nascimento
from USUARIOS;

set identity_insert USUARIOS_nova off;

set identity_insert DESTINOS_nova on;

insert into DESTINOS_nova(id, nome, descricao)
select id, nome, descricao
from DESTINOS;

set identity_insert DESTINOS_nova off;

set identity_insert RESERVAS_nova on;

insert into RESERVAS_nova(id, id_usuario,  id_destino, data_reserva, status_reserva)
select id, id_usuario,  id_destino, data_reserva, status_reserva
from RESERVAS;

set identity_insert RESERVAS_nova off;

drop table USUARIOS;
drop table DESTINOS;
drop table RESERVAS;

exec sp_rename USUARIOS_nova, USUARIOS;
exec sp_rename DESTINOS_nova, DESTINOS;
exec sp_rename RESERVAS_nova, RESERVAS;

alter table USUARIOS
add constraint PK_USUARIOS primary key(id);
alter table DESTINOS
add constraint PK_DESTINOS primary key(id);
alter table RESERVAS
add constraint PK_RESERVAS primary key(id);

alter table RESERVAS
add constraint FK_RESERVAS_USUARIOS
foreign key(id_usuario) references USUARIOS(id);
alter table RESERVAS
add constraint FK_DESTINOS_USUARIOS
foreign key(id_destino) references DESTINOS(id);

insert into USUARIOS(nome, email, data_nascimento, endereco)
values ('Felipe Silva', 'felipe@gmail.com', '2003-05-25', 'Rua Mais Testes, 80, Bairo Banco de Dados SQL, RJ');
insert into DESTINOS(nome, descricao) 
values ('Ubatuba', 'Uma das melhores praias de SP');
insert into RESERVAS (id_usuario, id_destino, data_reserva)
values (2, 2, '2023-10-05');

select *
from USUARIOS;
select *
from DESTINOS;
select *
from RESERVAS;
