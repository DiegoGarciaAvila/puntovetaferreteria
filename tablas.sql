use ferreteria
--Tabla 1
create table proveedor(
idproveedor varchar(30) primary key ,
nombre varchar(30),
ap varchar(30),
am varchar(30),
contacto varchar(30));

--Tabla2
delete producto
create table producto(
idproducto varchar(30) primary key,
nombre varchar(30),
precioventa float,
preciocompra float,
tocks float,
idproveedor varchar(30),
foreign key(idproveedor) references proveedor(idproveedor));

--Tabla 3
create table encargos(
idencargo varchar(30) primary key,
nombre varchar(30),
fecharealizado varchar(30),
total float,
);

--Consultas tabla 3
UPDATE encargos SET 
encargos.total = (SELECT SUM(detalleencargos.subtotal) from detalleencargos where detalleencargos.idencargo='3')
where encargos.idencargo='3';

delete from encargos


--Tabla 4
create table detalleencargos(
idencargo varchar(30),
idproducto varchar(30),
cantidad float,
preciopieza float,
subtotal as (cantidad*preciopieza) Persisted,
foreign key(idproducto) references producto(idproducto),
foreign key(idencargo) references encargos(idencargo));

--Consultas para tabla 4
insert into detalleencargos (idencargo,idproducto,cantidad,preciopieza) values(
'1','1','3',(select(producto.preciocompra) from producto where producto.idproducto='1'));

select detalleencargos.idencargo, producto.nombre,detalleencargos.cantidad, detalleencargos.preciopieza, detalleencargos.subtotal
from detalleencargos inner join producto on detalleencargos.idproducto=producto.idproducto inner join encargos on detalleencargos.idencargo=encargos.idencargo
where detalleencargos.idencargo = '2' ;

delete detalleencargos 
from detalleencargos  join producto on detalleencargos .idproducto = producto.idproducto
where detalleencargos.idencargo='2' and producto.nombre='Hacha';


select sum(subtotal)
from detalleencargos
where idencargo = '1';

select* from detalleencargos where idencargo='1';

--Tabla 5
create table pedido(
idpedido varchar(30) primary key,
fecha varchar(30));

delete from pedido

--Tabla 6
create table detallepedido(
idpedido varchar(30),
idproducto varchar(30),
cantidad float,
foreign key(idpedido) references pedido(idpedido),
foreign key(idproducto) references producto(idproducto));

--Tabla 7
create table personal(
idpersonal varchar(30) primary key,
nombre varchar(30),
am varchar(30),
ap varchar(30),
salario float,
contra varchar(30),
cargo varchar(30),
telefono varchar(30));

--Tabla 8
create table ventas(
idventa varchar(30) primary key,
total float,
fecha varchar(30),
idpersonal varchar(30),
foreign key(idpersonal) references personal(idpersonal));

--Consultas tabla 8
UPDATE ventas SET 
ventas.total = (SELECT SUM(detalleventa.subtotal) from detalleventa where detalleventa.idventa='1')
where ventas.idventa='1';

insert into ventas(idventa,fecha,idpersonal) values('1','25/06/2020','1');

delete from ventas;
--Tabla 9

create table detalleventa(
idventa varchar(30) ,
idproducto varchar(30) ,
cantidad float,
preciopieza float,
subtotal as (cantidad *preciopieza) PERSISTED,
foreign key(idventa) references ventas(idventa),
foreign key(idproducto) references producto(idproducto));

--Consultas tabla 9
select detalleventa.idventa, producto.nombre,detalleventa.cantidad, detalleventa.preciopieza, detalleventa.subtotal
from detalleventa inner join producto on detalleventa.idproducto=producto.idproducto inner join ventas on detalleventa.idventa=ventas.idventa
where detalleventa.idventa = '1' ;

insert into detalleventa (idventa,idproducto,cantidad,preciopieza) values(
'2','2','3',(select(producto.preciocompra) from producto where producto.idproducto='2'))

delete detalleventa 
from detalleventa join producto on detalleventa.idproducto = producto.idproducto
where detalleventa.idventa='1' and producto.nombre='Foco';


--Tabla 10
create table notas(
idnotas varchar(30) primary key,
descripcion varchar(70),
idpersonal varchar(30),
foreign key(idpersonal) references personal(idpersonal));

--Consultas tabla 10
select notas.idnotas,notas.descripcion, personal.nombre 
from notas,personal where notas.idpersonal=personal.idpersonal;

--Para la siguiente
--Tabla 11
create table detalleganancias(
iddetalleganancias varchar(30) primary key,
idproducto varchar(30),
subganancias float,
idventa varchar(30),
foreign key(idventa) references ventas(idventa));

create table ganancias(
idganancias varchar(30) primary key,
iddetalleganancias varchar(30),
pagosempleados float,
total float,
fechainicio date,
fechafianl date,
foreign key(iddetalleganancias) references detalleganancias(iddetalleganancias));


create table detallecontruccionbasica(
iddetallecontruccionbasica varchar(30) primary key,
idproducto varchar(30),
cantidad float,
subtotal float,
foreign key(idproducto) references producto(idproducto));

create table contruccionbasica(
idcontruccionbasica varchar(30) primary key,
nombre varchar(30),
total float,
iddetallecontruccionbasica varchar(30),
foreign key(iddetallecontruccionbasica) references detallecontruccionbasica(iddetallecontruccionbasica));