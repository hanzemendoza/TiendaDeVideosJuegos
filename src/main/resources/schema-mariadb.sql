create table videojuego(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);

insert into videojuego
() values
('Super Mario Bros', 'Primer juego ya siendo el fontanero plataformero','img/mario1.jpg'),
('Super Mario Bros 2', 'Segundo juego ya siendo el fontanero plataformero','img/mario2.jpg'),
('Super Mario Bros 3', 'Tercer juego ya siendo el fontanero plataformero','img/mario3.jpg'),
('Super Mario World', 'Cuarto juego ya siendo el fontanero plataformero','img/marioworld.jpg');