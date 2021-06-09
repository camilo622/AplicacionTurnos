use turnos;


create table comercios(

id int AUTO_INCREMENT primary key,
aforo int not null);

create table servicios(

id int AUTO_INCREMENT primary key,
id_comercio int not null,
nombre varchar(100) not null,
horaApertura varchar(100) not null,
horaCierre varchar(100) not null,
duracion varchar(100) not null);


create table turnos(

id int AUTO_INCREMENT primary key,
id_servicio int not null,
fecha date not null,
horainicio varchar(100) not null,
horafin varchar(100) not null,
estado varchar(100) not null);

ALTER TABLE servicios
  ADD CONSTRAINT FOREIGN KEY (id_comercio) REFERENCES comercios (id);

ALTER TABLE turnos
  ADD CONSTRAINT FOREIGN KEY (id_servicio) REFERENCES servicios (id);