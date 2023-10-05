create database SantanderBootcampJava;
use SantanderBootcampJava;

create table USUARIOS (
	id int, -- Identificador unico do usu�rio
	nome varchar(255) not null, -- Nome do usu�rio,
	email varchar(255) not null unique, -- Email do usu�rio,
	endereco varchar(50) not null, -- Endere�o do usu�rio,
	data_nascimento date not null, -- Data de Nascimento do usu�rio
);

create table DESTINOS(
	id int, -- Identificador unico do destino
	nome varchar(255) not null unique, -- Nome do destino
	descricao varchar(255) not null, -- Descri��o do destino
);

create table RESERVAS(
	id int, -- Identificador unico da reserva
	id_usuario int, -- Referencia ao id do usu�rio que fez a reserva
	id_destino int, -- Referencia ao id do destino da reserva
	data_reserva date, -- Data da reserva
	status_reserva varchar(255) default 'pendente' -- Status da reserva (confirmada, pendente, cancelada)
);
