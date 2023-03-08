CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_personagens(
id bigint auto_increment,
nome varchar(255) not null,
desefa int not null,
ataque int not null,
genero varchar (255) not null,
 primary key (id)
);

INSERT INTO tb_personagens(nome, desefa, ataque, genero, classes_id)
VALUES ("Kratos", 1500, 2500, "Battle Royale", 1 );

INSERT INTO tb_personagens(nome, desefa, ataque, genero, classes_id)
VALUES ("Geraldo de Rivia", 3500, 3500, "PVP", 2);

INSERT INTO tb_personagens(nome, desefa, ataque, genero, classes_id)
VALUES ("Cebolinha", 1000, 1000, "RGP", 3);

INSERT INTO tb_personagens(nome, desefa, ataque, genero, classes_id)
VALUES ("Ellie", 3000, 5000, "FPA", 4);

INSERT INTO tb_personagens(nome, desefa, ataque, genero, classes_id)
VALUES ("Link", 2300, 900, "RTS", 5);

INSERT INTO tb_personagens(nome, desefa, ataque, genero, classes_id)
VALUES ("Fifa", 2300, 900, "RTS", 2);

INSERT INTO tb_personagens(nome, desefa, ataque, genero, classes_id)
VALUES ("Mario", 2300, 900, "RTS", 3);


CREATE TABLE tb_classes(
 id bigint auto_increment,
 nome varchar(255) not null,
 tipo varchar(255) not null,
 primary key (id)
);

INSERT INTO tb_classes (nome, tipo)
VALUE ("Call of Duty: Warzon", "Tiro"); 

INSERT INTO tb_classes (nome, tipo)
VALUE ("Penguin Diner", "Ação"); 

INSERT INTO tb_classes (nome, tipo)
VALUE ("Gran Turismo 7 ", "Corrida"); 

INSERT INTO tb_classes (nome, tipo)
VALUE ("Valorant", "Ação"); 

SELECT * FROM tb_classes;

SELECT * FROM tb_personagens;

ALTER TABLE tb_personagens ADD classes_id bigint;
ALTER TABLE tb_personagens ADD CONSTRAINT fk_personagens_classes FOREIGN KEY (classes_id) REFERENCES tb_classes(id);

SELECT * FROM tb_personagens WHERE ataque >  2000;

SELECT * FROM tb_personagens WHERE desefa BETWEEN  1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome LIKE "C%";

SELECT * FROM tb_personagens;

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id;

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id WHERE preco > 50;