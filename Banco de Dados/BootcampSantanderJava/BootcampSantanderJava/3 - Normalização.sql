use SantanderBootcampJava;

alter table USUARIOS
add rua varchar(100),
numero varchar(10),
bairro varchar(50),
estado varchar(20);

select * from USUARIOS

update USUARIOS
set rua = parsename(replace(endereco, ',', '.'), 4),
numero = parsename(replace(endereco, ',', '.'), 3),
bairro = parsename(replace(endereco, ',', '.'), 2),
estado = parsename(replace(endereco, ',', '.'), 1);

alter table USUARIOS
drop column endereco;
