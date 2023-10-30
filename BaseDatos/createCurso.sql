-- Creacion de tablespaces
create tablespace pruebacidenet
    datafile 'pruebacidenet.dat'
    size 50M autoextend on;

-- Creacion de tablespace temporal    
create temporary tablespace pruebacidenet_temp
   tempfile 'pruebacidenet_temp.dat'
   size 7M autoextend on;

-- CReacion de esquema o usuario enlazado al tablespace creado anteriormente   
   create user root 
   identified by root
    default tablespace pruebacidenet
   temporary tablespace pruebacidenet_temp;
   
-- privilegios
   grant create session to root;
   grant create table to root;
   grant unlimited tablespace to root;   
