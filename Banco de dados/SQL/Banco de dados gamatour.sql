CREATE DATABASE GAMATOUR;
USE GAMATOUR;

CREATE TABLE Cliente(
idCliente int auto_increment primary key,
nomeCliente varchar(255) not null,
telefoneCliente varchar(255),
CpfCliente varchar(11) unique not null,
EmailCliente varchar(255)
);

CREATE TABLE Destino(
id_Destino int auto_increment primary key,
nome_destino varchar(255) not null
);

CREATE TABLE Promoção(
id_Promoção int auto_increment primary key,
desconto int
);

CREATE TABLE Passagem(
idPassagem int auto_increment primary key,
id_Destino int,
idCliente int,
id_Promoção int,
datapartida date not null,
dataretorno date not null,
preçoPassagem decimal,
numpassageiros int,
foreign key (id_Destino) references Destino(id_Destino),
foreign key (idCliente) references Cliente(idCliente),
foreign key (id_Promoção) references Promoção(id_Promoção)
);

INSERT INTO Cliente (nomeCliente, telefoneCliente, CpfCliente,EmailCliente) 
VALUES ('Kedma Freire','123-456-789','12348987085','kedmafreire@email.com');

INSERT INTO Destino(nome_destino)
 VALUES 
 ('Malivas'),
 ('Taj Mahal'),
 ('Hon Kong'),
 ('Machu Picchu'),
 ('Santorini-Grégia'),
 ('Aurora Boreal-Islândia');
 
 INSERT INTO Promoção (desconto)
 VALUES 
 ('10.00'),
 ('15.00'),
 ('25.00');
 
 INSERT INTO Passagem(id_Destino,idCliente,id_Promoção, datapartida, dataretorno, preçoPassagem, numpassageiros)
 VALUES
 (1, 1, 1, '2023-12-07', '2023-12-22', '350.00', '2');
 
 SELECT * FROM Destino;
 
 SELECT * FROM Cliente;

SELECT * FROM Passagem;

update Destino
set nome_destino = 'Hong Kong'
where nome_destino = 'Hon Kong';

 
 
 
 
 
 
 









