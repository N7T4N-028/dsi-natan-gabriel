CREATE DATABASE estacionamento;
USE estacionamento;
CREATE TABLE carro (
    placa CHAR(7) NOT NULL PRIMARY KEY,
    cor VARCHAR(20),
    descricao VARCHAR(100)
);
SELECT * FROM carr	o;