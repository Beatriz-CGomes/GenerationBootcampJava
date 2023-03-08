CREATE DATABASE db_Escola;
USE db_Escola;

CREATE TABLE tb_Escola(
id bigint auto_increment,
nome varchar(90) not null,
numeroChamada int,
serie  int not null,
mediaNotas float not null,
PRIMARY KEY (id)
);

INSERT INTO tb_Escola(nome, numeroChamada, serie, mediaNotas)
VALUES ("Alice", 3, 5, 7.0);

INSERT INTO tb_Escola(nome, numeroChamada, serie, mediaNotas)
VALUES ("Bruno", 10, 7, 9.0);

INSERT INTO tb_Escola(nome, numeroChamada, serie, mediaNotas)
VALUES ("Marcela", 17, 2, 5.0);

INSERT INTO tb_Escola(nome, numeroChamada, serie, mediaNotas)
VALUES ("Ana Paula", 1, 7, 10.0);

INSERT INTO tb_Escola(nome, numeroChamada, serie, mediaNotas)
VALUES ("Jordana", 13, 8, 7.3);

SELECT * FROM tb_Escola WHERE mediaNotas > 7;

SELECT * FROM tb_Escola WHERE mediaNotas < 7;

-- Atualização e Deleção --

UPDATE tb_Escola SET nome = "Jordana", mediaNotas = 7.8 WHERE id = 5;

SELECT * FROM  tb_Escola;
