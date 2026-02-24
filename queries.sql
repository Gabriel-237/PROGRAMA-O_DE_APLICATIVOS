
-- create
CREATE TABLE usuario (
  id int PRIMARY KEY,
  name varchar(254) NOT NULL,
  cpf char(14) NOT NULL,
  data date NOT NULL,
  email varchar(254) NOT NULL
);

-- insert
INSERT INTO usuario VALUES (0001, 'Gabriel', '86202218509', '2009/10/05', 'gabriel@gamil' );

-- fetch 
SELECT * FROM usuario;



CREATE TABLE endereço (
  id int,
  user_id int,
  PRIMARY KEY (id),
  foreign KEY (user_id) references  usuario (id)
);


INSERT INTO endereço VALUES (01, 01);
select * from endereço;