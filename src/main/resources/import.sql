insert into tb_customer(name, email, phone, birthdate) values('Alexandre Vogel', 'alexandre@gmail.com', '11 947252249', '23/03/1983');
insert into tb_customer(name, email, phone, birthdate) values('João Felipe', 'joao@gmail.com', '11 988587777', '06/12/1952');


--insert into tb_theater_room(screen, name) values('2D', 'namoradeira');

insert into tb_cep_response(cep, logradouro, complemento, bairro, localidade, uf, ibge) values('04125-050', 'rua Almeida Lisboa', 'casa', 'vila Firmiano', 'São Paulo', 'SP', 'teste');

--insert into tb_cep_response(theater_room_id, cep, logradouro, complemento, bairro, localidade, uf, ibge) values(2, '04297-000', 'rua Timbira', 'casa', 'vila fui', 'São Paulo', 'SP', 'teste 2');

insert into tb_theater_room(cep_response_id, screen, name) values(1, '3D', 'normal');