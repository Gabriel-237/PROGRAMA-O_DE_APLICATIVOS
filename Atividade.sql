CREATE TABLE clientes(
  idcliente integer primary key,
  Nome varchar (254) NOT null,
  cpf char (14) NOT null,
  Email varchar (254) NOT null
);

INSERT INTO clientes VALUES (01, 'Gabriel', '86202218509', 'gabriel@gamil' );

SELECT * FROM clientes;

CREATE TABLE carros(
  IDcarro INT,
  idcliente INT,
  Modelo varchar (254) NOT null,
  Cor varchar(254)  NOT null,
  Preço char (254)  NOT null,
  primary key (IDcarro),
  foreign KEY (idcliente) references  clientes (idcliente)
);

INSERT INTO carros VALUES (01, 01, 'civic', 'branco', '30000');
select * from carros;
