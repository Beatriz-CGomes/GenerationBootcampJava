CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
id bigint auto_increment,
tarjaPreta boolean,
PRIMARY KEY (id)
);

INSERT INTO tb_categorias (tarjaPreta)
VALUE (True);

INSERT INTO tb_categorias (tarjaPreta)
VALUE (False);

SELECT * FROM tb_categorias;

CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varchar(200) not null,
quantidade int,
preco float not null,
popular boolean,
PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, quantidade, preco, popular, categoria_id)
VALUE ("Dipirona", 12, 2.90, True, 2);

INSERT INTO tb_produtos(nome, quantidade, preco, popular, categoria_id)
VALUE ("Ibuprofeno", 17, 5.90, True, 2);

INSERT INTO tb_produtos(nome, quantidade, preco, popular, categoria_id)
VALUE ("Clorazepato", 7, 75.90, False, 1);

INSERT INTO tb_produtos(nome, quantidade, preco, popular, categoria_id)
VALUE ("Tramadol", 6, 175.90, False, 1);

INSERT INTO tb_produtos(nome, quantidade, preco, popular, categoria_id)
VALUE ("Dorflex", 16, 3.90, True, 2);

INSERT INTO tb_produtos(nome, quantidade, preco, popular, categoria_id)
VALUE ("Buscopan", 20, 9.90, True, 2);

INSERT INTO tb_produtos(nome, quantidade, preco, popular, categoria_id)
VALUE ("Prednisona", 10, 29.90, True, 2);

INSERT INTO tb_produtos(nome, quantidade, preco, popular, categoria_id)
VALUE ("Diazepam", 3, 145.90, False, 1);

SELECT * FROM tb_produtos;

ALTER TABLE tb_produtos ADD categoria_id bigint;
ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categoria FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id);

SELECT * FROM tb_produtos WHERE preco >  50;

SELECT * FROM tb_produtos WHERE preco BETWEEN  5 AND 60;

SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id WHERE categoria_id = 1;

