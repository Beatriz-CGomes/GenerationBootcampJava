CREATE DATABASE db_Estoque;

Use db_Estoque;

CREATE TABLE tb_produtos (
 id bigint auto_increment,
 nome varchar(50) not null,
 descricao varchar(225),
 sku int not null,
 ean int not null, 
 preco float not null,
 PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, descricao, sku, ean, preco)
VALUE ("Notebook Acer", "Notebook Acer i5 10°geração", 8898909, 13122121, 2999);

INSERT INTO tb_produtos(nome, descricao, sku, ean, preco)
VALUE ("Iphone 11", "Iphone 11 64GB Preto", 8679009, 113212451, 2699);

INSERT INTO tb_produtos(nome, descricao, sku, ean, preco)
VALUE ("Xiaomi Redmi Note 11", "Xiaomi Redmi Note 11 Preto 128GB", 449009, 323213231, 1229);

INSERT INTO tb_produtos(nome, descricao, sku, ean, preco)
VALUE ("Fritadeira Air Fry", "Fritadeira Air Fry Over Philco", 56523009, 376813231, 880);

INSERT INTO tb_produtos(nome, descricao, sku, ean, preco)
VALUE ("Impressora a cor HP", "Impressora a cor multifuncional HP", 2353239, 3238932, 388);

SELECT * FROM tb_produtos WHERE preco > 500;

SELECT * FROM tb_produtos WHERE preco < 500;

-- Atualização e Deleção --

UPDATE tb_Escola SET nome = "Fritadeira Air Fry", preco = 405 WHERE id = 3;

SELECT * FROM  tb_produtos;