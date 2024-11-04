insert into tb_customer(name, email, phone, birthdate) values('Alexandre Vogel', 'alexandre@gmail.com', '11 947252249', '23/03/1983');
insert into tb_customer(name, email, phone, birthdate) values('João Felipe', 'joao@gmail.com', '11 988587777', '06/12/1952');

insert into tb_cep_response(cep, logradouro, complemento, bairro, localidade, uf, ibge) values('04125-050', 'rua Almeida Lisboa', 'casa', 'vila Firmiano', 'São Paulo', 'SP', 'teste');
insert into tb_theater_room(cep_response_id, name, screen) values(1, 'normal', '3D');