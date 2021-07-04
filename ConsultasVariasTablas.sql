use ferreteria

select pe.idpedido,pr.nombre,pr.tocks,dp.cantidad 
from producto as pr inner join detallepedido as dp on pr.idproducto=dp.idproducto 
inner join pedido as pe on pe.idpedido=dp.idpedido
where pe.idpedido='2';

select pedido.idpedido,producto.nombre,producto.tocks
from producto inner join detallepedido on producto.idproducto=detallepedido.idproducto 
inner join pedido on pedido.idpedido=detallepedido.idpedido
where pedido.idpedido='2';


insert into detallepedido (idpedido,idproducto,cantidad)
select pedido.idpedido,producto.idproducto,producto.tocks from pedido ,producto 
where pedido.idpedido = '2' and producto.tocks <=50
;

delete detallepedido
delete pedido 