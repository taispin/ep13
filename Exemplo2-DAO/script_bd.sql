create table contatos (
  id serial,      -- inteiro, autoincrementado
  nome VARCHAR(255),
  email VARCHAR(255),
  endereco VARCHAR(255),
  dataNascimento DATE,
  primary key (id)
);
