-- MySQL Workbench Synchronization
-- Generated: 2018-02-14 20:25
-- Model: desafio-db
-- Version: 1.0
-- Project: Desafio
-- Author: Diego Dalto
-- Carga de Dados, para o banco desafio-db.

USE `desafio-db`;

/*****************************************************************************************
Carga Municipio
******************************************************************************************/
ALTER TABLE tb_municipio AUTO_INCREMENT = 1;
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (1, 'Coxim', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (2, 'Corumbá', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (3, 'Porto Murtinho', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (4, 'Ribas do Rio Pardo', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (5, 'Aquidauana', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (6, 'Água Clara', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (7, 'Três Lagoas', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (8, 'Rio Verde de Mato Grosso', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (9, 'Campo Grande', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (10, 'Camapuã', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (11, 'Santa Rita do Pardo', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (12, 'Brasilândia', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (13, 'Inocência', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (14, 'Costa Rica', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (15, 'Miranda', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (16, 'Paranaíba', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (17, 'Ponta Porã', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (18, 'Maracaju', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (19, 'Sidrolândia', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (20, 'Bonito', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (21, 'Bela Vista', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (22, 'Figueirão', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (23, 'Nova Andradina', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (24, 'Alcinópolis', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (25, 'Amambai', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (26, 'Dourados', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (27, 'Sonora', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (28, 'Nova Alvorada do Sul', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (29, 'Rio Brilhante', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (30, 'São Gabriel do Oeste', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (31, 'Chapadão do Sul', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (32, 'Pedro Gomes', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (33, 'Cassilândia', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (34, 'Anaurilândia', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (35, 'Selvíria', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (36, 'Naviraí', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (37, 'Bandeirantes', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (38, 'Anastácio', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (39, 'Jardim', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (40, 'Caracol', 12);
/*outros estados*/
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (41, 'Rio Branco', 1);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (42, 'Maceió', 2);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (43, 'Macapá', 3);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (44, 'Manaus', 4);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (45, 'Salvador', 5);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (46, 'Fortaleza', 6);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (47, 'Brasília', 7);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (48, 'Vitória', 8);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (49, 'Goiânia', 9);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (50, 'São Luís', 10);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (51, 'Cuiabá', 11);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (52, 'Belo Horizonte', 18);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (53, 'Belém', 13);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (54, 'João Pessoa', 14);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (55, 'Curitiba', 15);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (56, 'Recife', 16);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (57, 'Teresina', 17);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (58, 'Rio de Janeiro', 19);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (59, 'Natal', 20);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (60, 'Porto Alegre', 21);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (61, 'Porto Velho', 22);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (62, 'Boa Vista', 23);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (63, 'Florianópolis', 24);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (64, 'São Paulo', 25);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (65, 'Aracaju', 26);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (66, 'Palmas', 27);

/*****************************************************************************************
Carga Instituicao
******************************************************************************************/
ALTER TABLE tb_usuario AUTO_INCREMENT = 1;
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Universidade Federal de Mato Grosso Do Sul - Câmpus de Coxim', 'cpcx@ufms.com.br', 'user', '123', STR_TO_DATE("31/05/2014", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Escola Estadual Silvio Feirreira', 'ufms1@com.br', 'user1', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Unopar', 'ufms2@com.br', 'user2', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('CESQP - Centro de Ensino Superior e Qualificação Profissional', 'ufms3@com.br', 'user3', '123',STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('UEMS - Campus Coxim', 'ufms4@com.br', 'user4', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Escola Estadual Padre Nunes', 'ufms5@com.br', 'user5', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Escola Novo Mundo', 'ufms6@com.br', 'user6', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('IFMS - Instituto Federal de Mato Grosso do Sul', 'ufms7@com.br', 'user7', '123',STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Escola Municipal Marechal Rondon', 'ufms8@com.br', 'user8', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Faculdades Integradas de Coxim - Fico', 'ufms9@com.br', 'user9', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual DE 1º E 2º GRAUS Sílvio Ferreira', 'ufms10@com.br', 'user10', '123',STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('EM Estudante William Tavares de Oliveira - Pólo', 'ufms11@com.br', 'user11', '123',STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Damásio Educacional e Ibmec - Coxim', 'ufms12@com.br', 'user12', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Colégio PROFª. Julieta Mota Dos Santos', 'ufms13@com.br', 'user13', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Professora Clarice Rondon dos Santos', 'ufms14@com.br', 'user14', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"),'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Escola Estadual Viriato Bandeira', 'ufms15@com.br', 'user15', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Semiramis da Rocha', 'ufms16@com.br', 'user16', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Particular Santa Teresa', 'ufms17@com.br', 'user17', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Pedro Mendes Fontoura', 'ufms18@com.br', 'user18', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 'INSTITUICAO');

/* carga de endereços */
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (1, 'Rua 13 de Maio', '231', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio) VALUES (2, 'Rua Minas Gerais', '162', FALSE, 'casa residencial', 'Santa Maria', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (3, 'Rua Star wars', '231', FALSE, 'casa residencial', 'Vila Bela', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (4, 'Rua Game of Thornes', '231', FALSE, 'casa residencial', 'Vila Da Barra', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (5, 'Rua Pedro Abreu', '231', FALSE, 'casa residencial', 'Jardim Pequi 1', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (6, 'Rua Santo Agostinho', '231', FALSE, 'casa residencial', 'Centro', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (7, 'Rua Brother Wincherster', '231', FALSE, 'casa residencial', 'Nova Coxim', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (8, 'Rua Metamorfose Ambulante', '231', FALSE, 'casa residencial', 'Piracema', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (9, 'Rua 6 de Julho', '231', FALSE, 'casa residencial', 'Planalto', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (10, 'Rua Senhor Divino', '231', FALSE, 'casa residencial', 'Zona Rural', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (11, 'Rua Hoje em Dia', '231', FALSE, 'casa residencial', 'Eldorado', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (12, 'Rua Santa Catarina', '231', FALSE, 'casa residencial', 'Mato Grosso', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (13, 'Rua 10 de Dezembro', '231', FALSE, 'casa residencial', 'Santo André', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (14, 'Rua João Pessoa', '231', FALSE, 'casa residencial', 'Centro', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (15, 'Rua Governador Pedro', '231', FALSE, 'casa residencial', 'Centro', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (16, 'Av. Viriginia Ferreira', '231', FALSE, 'casa residencial', 'Pontal', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (17, 'Rua Filinto Miller', '231', FALSE, 'casa residencial', 'Vila Bela', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (18, 'Rua Gaspar Rias Coelho', '231', FALSE, 'casa residencial', 'Flávio Garcia', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (19, 'Rua Antônio João', '231', FALSE, 'casa residencial', 'Prevesul', '7940000', 1);

/* carga de telefones */
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (1, 1, '2065493048', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (2, 1, '1551631233', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (3, 1, '3154441046', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (4, 2, '1245545664', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (5, 1, '6825138860', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (6, 1, '7241776023', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (6, 2, '8387624588', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (8, 1, '2716097609', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (9, 1, '1649415781', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (10, 3, '6105178144', FALSE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (11, 1, '9016432056', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (12, 1, '5864234446', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (13, 3, '3532835165', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (14, 1, '8582069261', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (15, 1, '8866961948', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (16, 3, '2933570150', FALSE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (17, 1, '2684137283', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (18, 1, '8638760448', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (19, 2, '5227242750', TRUE);

INSERT INTO tb_instituicao (id, tipo) VALUES (1, 3);
INSERT INTO tb_instituicao (id, tipo) VALUES (2, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (3, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (4, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (5, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (6, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (7, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (8, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (9, 1);
INSERT INTO tb_instituicao (id, tipo) VALUES (10, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (11, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (12, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (13, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (14, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (15, 1);
INSERT INTO tb_instituicao (id, tipo) VALUES (16, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (17, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (18, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (19, 2);

/*****************************************************************************************
Carga Aluno
******************************************************************************************/
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Diego Armando Maradona', 'diego.maradona@ufms.br', 'dieguito', '2424', STR_TO_DATE("08/03/2018", "%d/%m/%Y"), 'ALUNO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Cunha Afonso da Silva', 'afonso.123@ufms.br', 'afonso123', '2294', STR_TO_DATE("08/03/2018", "%d/%m/%Y"), 'ALUNO');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Marcos Pedro Bezerra', 'marcos.pedro@ufms.br', 'megaware', '6294', STR_TO_DATE("08/03/2018", "%d/%m/%Y"), 'ALUNO');

INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio) VALUES (20, 'Rua 13 de Maio', '231', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio) VALUES (21, 'Rua 13 de Maio', '231', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 3);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio) VALUES (22, 'Rua 13 de Maio', '231', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 2);

INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (20, 1, '2065493048', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (21, 1, '6065793348', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (22, 1, '9035443748', TRUE);

INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (20, STR_TO_DATE("19/12/1994", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (21, STR_TO_DATE("21/04/1995", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (22, STR_TO_DATE("13/02/2000", "%d/%m/%Y"), 1);

INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(20, 1, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(21, 1, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(22, 1, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));

/*****************************************************************************************
Carga Professor
******************************************************************************************/
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Kleber Kruger', 'kleber.kruger@ufms.br', 'kleberkruguer', 'senha123',STR_TO_DATE("08/03/2018", "%d/%m/%Y"),'PROFESSOR');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Zézão', 'ze@ufms.br', 'ze', 'ze123',STR_TO_DATE("08/03/2018", "%d/%m/%Y"), 'PROFESSOR');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Vinnicius Marques', 'vini.marq@ufms.br', 'marq123', '123marq',STR_TO_DATE("08/03/2018", "%d/%m/%Y"), 'PROFESSOR');

INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (23, 'Rua 13 de Maio', '231', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (24, 'Rua 13 de Maio', '231', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (25, 'Rua 13 de Maio', '231', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);

INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (23, 1, '2065493048', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (24, 1, '2065493048', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (25, 1, '2065493048', TRUE);

INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (23, STR_TO_DATE("31/01/2012", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (24, STR_TO_DATE("31/01/2012", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (25, STR_TO_DATE("31/01/2012", "%d/%m/%Y"), 1);

INSERT INTO tb_professor(id, titulacao) VALUES (23, 1);
INSERT INTO tb_professor(id, titulacao) VALUES (24, 1);
INSERT INTO tb_professor(id, titulacao) VALUES (25, 1);

/*****************************************************************************************
Carga Responsavel
******************************************************************************************/
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Júlia', 'julia@ufms.com.br', 'juliauser', '123', STR_TO_DATE("08/03/2018", "%d/%m/%Y"), 'RESPONSAVEL');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Sofia', 'sofia@ufms.com.br', 'sofiauser', '123', STR_TO_DATE("08/03/2018", "%d/%m/%Y"), 'RESPONSAVEL');
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)VALUES ('Alice', 'alice@ufms.com.br', 'aliceuser', '123', STR_TO_DATE("08/03/2018", "%d/%m/%Y"), 'RESPONSAVEL');

INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (26, 'Rua muse elf', '123', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (27, 'Rua dark lord', '235', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)VALUES (28, 'Rua soul master', '246', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);

INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (26, 1, '2065493048', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (27, 1, '2065493048', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (28, 1, '2065493048', TRUE);

INSERT INTO tb_responsavel(id, cpf) VALUES (26, '001');
INSERT INTO tb_responsavel(id, cpf) VALUES (27, '002');
INSERT INTO tb_responsavel(id, cpf) VALUES (28, '003');


/*****************************************************************************************
Carga Turma
******************************************************************************************/
INSERT INTO tb_turma(id, professor_id, instituicao_id, nome, periodo) VALUES (1, 23, 1, 'turma a', 'MATUTINO');
INSERT INTO tb_turma(id, professor_id, instituicao_id, nome, periodo) VALUES (2, 24, 2, 'turma b', 'VESPERTINO');
INSERT INTO tb_turma(id, professor_id, instituicao_id, nome, periodo) VALUES (5, 25, 3, 'turma c', 'NOTURNO');

/*****************************************************************************************
Carga Serie
******************************************************************************************/
INSERT INTO tb_serie(aluno_id, ano, nivel) VALUES (20, '1º ano', 'FUNDAMENTAL');
INSERT INTO tb_serie(aluno_id, ano, nivel) VALUES (21, '2º ano', 'SUPERIOR');
INSERT INTO tb_serie(aluno_id, ano, nivel) VALUES (22, '3º ano', 'MEDIO');