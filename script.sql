create database bd_juegos;
use bd_juegos;

create table genero(
    id int auto_increment,
    nombre varchar(200),
    primary key(id)
);

insert into genero values(null,'Sandbox');
insert into genero values(null,'RPG');
insert into genero values(null,'Deportes');
insert into genero values(null,'Acción');
insert into genero values(null,'FPS');
insert into genero values(null,'Estrategia');
insert into genero values(null,'Arcade');

create table juego(
    id int auto_increment,
    nombre varchar(200),
    stock int,
    precio int,
    genero int,
    primary key(id),
    foreign key(genero) references genero(id)
);

insert into juego values(null, 'Minecraft','100','19990','1');
insert into juego values(null, 'Dark Souls III','100','26000','2');
insert into juego values(null, 'Undertale','200','5000','2');
insert into juego values(null, 'GTA V','20','29990','1');
insert into juego values(null, 'Halo','1','1000','5');
insert into juego values(null, 'Age of empires II','20','19990','6');
insert into juego values(null, 'Hunie pop','20','5000','4');

select * from genero;
select * from juego;

delete from juego;
delete from tipo;

drop table juego;
drop table tipo;

drop database bd_juegos;

/*1.- Ordenar los juegos por precio de forma ascendente*/
select * from juego order by precio asc;

/*2.- Ordenar los juegos por stock de forma descendente*/
select * from juego order by stock desc;

/*3.- Lista de nombres, generos y precios de todos los juegos*/
select j.nombre as 'Juego', 
g.nombre as 'Genero', 
j.precio as 'Precio'
from juego j, genero g
where j.genero = g.id and
j.precio > 10000
order by j.precio asc;



