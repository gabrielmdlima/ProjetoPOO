-- Criação da database
create database if not exists projetopoo;
use projetopoo;

create table if not exists veiculo(
	id bigint(20) primary key auto_increment,
    placa varchar(20) not null,
    modelo varchar(20) not null,
    marca varchar(20) not null,
    ano int(4) not null
);

create table if not exists financas(
	id bigint(20) primary key auto_increment,
    idVeiculo bigint(20) not null,
    valorLeilao float(10) not null,
    consertoEstimado float(10) not null,
    fipe float(10) not null,
    lucroEstimado float(10),
    consertoReal float(10) not null,
    valorVenda float(10) not null,
    lucroReal float(10),
    foreign key (idVeiculo) references veiculo (id)
);

-- drop database projetopoo;

insert into veiculo values (null, "ABC-1234", "Punto", "Fiat", 2010);
insert into financas values (null, 1, 10000.00, 2000.00, 25000.00, null, 2000.00, 24000.00, null);

/* select v.placa 
from veiculo v
inner join investidor i
on v.id = i.idCarro
where i.id = 1; */

select*from financas;

select*from veiculo;