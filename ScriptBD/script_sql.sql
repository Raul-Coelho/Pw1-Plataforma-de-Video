--CREATE DATABASE IFchannelVideo;

CREATE TABLE usuario(
    id serial,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    sexo CHARACTER(1),
    fotoperfil VARCHAR NOT NULL,
    rua VARCHAR(50),
    numero VARCHAR(10),
    cidade VARCHAR(50),
    estado CHARACTER(2),
    cep VARCHAR(15),
    telefone VARCHAR(20),
    CONSTRAINT usuario_pkey PRIMARY KEY (id),
    CONSTRAINT usuario_email_key UNIQUE (email)
)