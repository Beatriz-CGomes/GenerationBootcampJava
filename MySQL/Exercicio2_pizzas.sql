CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias(
id bigint auto_increment,
tipo varchar(50) not null,
tamanho varchar(50) not null,
PRIMARY KEY (id)
);

INSERT INTO tb_categorias (tipo, tamanho) 
VALUE ("Doce ", "Grande ");

INSERT INTO tb_categorias (tipo, tamanho) 
VALUE ("Salgada ", "Grande ");

INSERT INTO tb_categorias (tipo, tamanho) 
VALUE ("Salgada ", "Pequena ");

INSERT INTO tb_categorias (tipo, tamanho) 
VALUE ("Doce ", "Pequena ");

SELECT * FROM tb_categorias;

CREATE TABLE tb_pizzas (
id bigint auto_increment,
nome varchar(200) not null,
quantidade int,
preco float not null,
sabor varchar(200) not null,
PRIMARY KEY (id)
);

ALTER TABLE tb_pizzas ADD categorias_id bigint;
ALTER TABLE tb_pizzas ADD CONSTRAINT fk_pizzas_categorias
FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id);


INSERT INTO tb_pizzas (nome, quantidade, preco, sabor, categorias_id) 
VALUE ("Portuguesa", 2, 40.89, "Mussarela, ovos e oregano", 2);

INSERT INTO tb_pizzas (nome, quantidade, preco, sabor, categorias_id) 
VALUE ("Baiana ", 1, 30.89, "Calabresa, pimenta e oregano", 2);

INSERT INTO tb_pizzas(nome, quantidade, preco, sabor, categorias_id) 
VALUE ("Frango com Queijo ", 1, 20.90, "Frango, Queijo e tomate", 1);

INSERT INTO tb_pizzas(nome, quantidade, preco, sabor, categorias_id) 
VALUE ("Prestigio ", 1, 50.89, "Chocolate com coco", 3);

INSERT INTO tb_pizzas(nome, quantidade, preco, sabor, categorias_id) 
VALUE ("Romeu e Julieta ", 1, 30.89, "Goiabada com Queijo", 2 );

INSERT INTO tb_pizzas (nome, quantidade, preco, sabor, categorias_id ) 
VALUE ("Brocolis ", 1 , 50.89, "Brocolis com Queijo",  4);

SELECT * FROM tb_pizzas;

SELECT * FROM tb_pizzas
INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categorias_id;

SELECT * FROM tb_pizzas
INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categorias_id
WHERE categorias_id = 2;

SELECT * FROM tb_personagens WHERE preco >  545;

SELECT * FROM tb_personagens WHERE preco BETWEEN  50 AND 100;

SELECT * FROM tb_categorias;