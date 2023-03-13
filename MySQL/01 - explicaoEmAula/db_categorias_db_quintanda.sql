CREATE TABLE tb_categorias(
 id bigint auto_increment,
 descricao varchar(255) not null,
 primary key (id)
);

SELECT * FROM tb_categorias;

INSERT INTO tb_categorias (descricao ) VALUE ("Fruta");
INSERT INTO tb_categorias (descricao ) VALUE ("Verdura");
INSERT INTO tb_categorias (descricao ) VALUE ("Legumes");
INSERT INTO tb_categorias (descricao ) VALUE ("Grãos");

SELECT * FROM tb_categorias;


ALTER TABLE tb_produtos ADD categorias_id bigint;

ALTER TABLE tb_produtos ADD CONSTRAINT fk_produtos_categorias
FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id);

SELECT * FROM tb_produtos;

ALTER TABLE tb_produtos MODIFY preco decimal(6,2);