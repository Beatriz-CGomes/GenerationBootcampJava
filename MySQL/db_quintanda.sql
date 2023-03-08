CREATE DATABASE db_quitanda;

USE db_quitanda;

CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
quantidade int,
preco decimal not null,
PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, quantidade, preco)
VALUES ("Alface", 20, 2.50);

INSERT INTO tb_produtos(nome, quantidade, preco)
VALUES ("Pera", 10, 2.95);

INSERT INTO tb_produtos(nome, quantidade, preco)
VALUES ("Maçã", 8, 5.00);

INSERT INTO tb_produtos(nome, quantidade, preco)
VALUES ("Pera", 18, 15.00);

INSERT INTO tb_produtos(nome, quantidade, preco, categorias_id)
VALUES ("Pimentão", 18, 6.0, 1);

INSERT INTO tb_produtos(nome, quantidade, preco, categorias_id)
VALUES ("Limão", 18, 6.0, 1);

INSERT INTO tb_produtos(nome, quantidade, preco, categorias_id)
VALUES ("Agrião", 18, 6.0, 2);

INSERT INTO tb_produtos(nome, quantidade, preco, categorias_id)
VALUES ("Cenoura", 18, 6.0, 3);

SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE id = 3;

SELECT * FROM tb_produtos WHERE id <5;

-- Atualização e Deleção -- 

UPDATE tb_produtos SET preco = 2900 WHERE id = 3;

UPDATE tb_produtos SET preco = 3900 WHERE id = 1;
DELETE FROM tb_produtos WHERE id =3;

SELECT * FROM tb_produtos;

ALTER TABLE tb_produtos MODIFY preco decimal(6,2);

SELECT nome, quantidade, preco, descricao FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categorias_id;

SELECT * FROM tb_produtos
LEFT JOIN tb_categorias ON tb_categorias.id = tb_produtos.categorias_id;

SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos
RIGHT JOIN tb_categorias ON tb_categorias.id = tb_produtos.categorias_id;
