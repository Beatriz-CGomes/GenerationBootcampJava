CREATE DATABASE  db_cidade_das_carnes;
USE db_cidade_das_carnes;

CREATE TABLE tb_categorias (
id bigint auto_increment,
validadeProxima boolean,
carneVermelha boolean,
PRIMARY KEY (id)
);

INSERT INTO tb_categorias ( validadeProxima, carneVermelha)
VALUE (True, False);

INSERT INTO tb_categorias ( validadeProxima, carneVermelha)
VALUE (True, True);

INSERT INTO tb_categorias ( validadeProxima, carneVermelha)
VALUE (False, True);

INSERT INTO tb_categorias ( validadeProxima, carneVermelha)
VALUE (False, False);

 SELECT * FROM tb_categorias;

CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varchar(200) not null,
quantidade int,
preco float not null,
tipo varchar(50) not null,
PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, quantidade, preco, tipo, categoria_id)
VALUES ("Coelho", 3, 23.99, "Carne Branca", 1);

INSERT INTO tb_produtos(nome, quantidade, preco, tipo, categoria_id)
VALUES ("Ganso", 2, 43.99, "Carne Branca", 1);

INSERT INTO tb_produtos(nome, quantidade, preco, tipo, categoria_id)
VALUES ("Barriga", 12, 23.99, "Carne suína", 2);

INSERT INTO tb_produtos(nome, quantidade, preco, tipo, categoria_id)
VALUES ("Fraldinha", 2, 33.99, "Carne suína", 2);

INSERT INTO tb_produtos(nome, quantidade, preco, tipo, categoria_id)
VALUES ("Picanha", 12, 73.99, "Carne bovina", 3);

INSERT INTO tb_produtos(nome, quantidade, preco, tipo, categoria_id)
VALUE ("Coxão mole", 20, 53.99, "Carne bovina", 3);

INSERT INTO tb_produtos(nome, quantidade, preco, tipo, categoria_id)
VALUES ("Frango", 23, 23.99, "Carne Branca", 4);

INSERT INTO tb_produtos(nome, quantidade, preco, tipo, categoria_id)
VALUES ("Peixe", 12, 43.99, "Carne Branca", 4);

SELECT * FROM tb_produtos;

ALTER TABLE tb_produtos ADD categoria_id bigint;
ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categoria FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id);

SELECT * FROM tb_produtos WHERE preco >  50;

SELECT * FROM tb_produtos WHERE preco BETWEEN  50 AND 150;

SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id WHERE categoria_id = 2;