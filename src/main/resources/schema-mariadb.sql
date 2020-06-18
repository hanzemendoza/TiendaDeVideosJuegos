drop table if exists videojuego;
drop table if exists distribuidor;

create table videojuego(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);

insert into videojuego
(nombre,descripcion,imagen_url) values
('Super Mario Bros', 'Primer juego ya siendo el fontanero plataformero,','img/mario1.jpg'),
('Super Mario Bros Lost Level', 'Segundo juego en Japon, es conocido por ser mucho mas dificil que su predecesor','img/mariolost.png'),
('Super Mario Bros 2', 'Segundo juego en el resto del mundo, es un juego adaptado de otro titulo pero inncorpora a varios personajes','img/mario2.png'),
('Super Mario Bros 3', 'Tercer juego, mi favorito, excelente nivel de mundo para llegar a derrotar a Bowser','img/mario3.jpg'),
('Super Mario World', 'Cuarto juego y la aparicion de Yoshi','img/marioworld.jpg'),
('Yoshi Island', 'Quinto juego, bebe mario y Luigi son raptados por Kamek, gran final con bebe Bowser','img/yoshiisland.jpg'),
('Mario 64', 'Sexta entrega del fontanero primer juego en 3D de la franquicia','img/mario64.jpg'),
('Mario Sunshine', 'Septima entrega de Mario esta vez con la aparicion de Bowsy (Bowser jr)','img/mariosunshine.jpg');

create table distribuidor (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    sitio_web varchar(500)
);

insert into distribuidor
(id, nombre, sitio_web) values
(1,'2K','http://2k.com'),
(2,'Focus Home Interactivo','http://www.focus-home.com'),
(3,'Thekla',null),
(4,'Number ONe',null),
(5,'SOS Game','https://sosgame.com'),
(6,'Unknown World Entertainment','https://unknownworlds.com'),
(7,'Campo Santo','https://www.camposanto.com');

alter table videojuego
add column distribuidor_id int,
add foreign key (distribuidor_id) references distribuidor(id);

update videojuego set distribuidor_id = 1 where id in (1,5);
update videojuego set distribuidor_id = 2 where id in (2);
update videojuego set distribuidor_id = 3 where id in (3);
update videojuego set distribuidor_id = 4 where id in (4);
update videojuego set distribuidor_id = 5 where id in (6);
update videojuego set distribuidor_id = 6 where id in (7);
update videojuego set distribuidor_id = 7 where id in (8);

alter table videojuego
modify distribuidor_id int not null;