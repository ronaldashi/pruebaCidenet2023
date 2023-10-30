CREATE TABLE root.empleado
( id       NUMBER NOT NULL,
  name     VARCHAR2(200) NOT NULL,
  user    VARCHAR2(100),
  password VARCHAR2(50),
  dni      VARCHAR2(11),
  email    VARCHAR2(100),  
  CONSTRAINT pk PRIMARY KEY (id)
);

CREATE TABLE root.task
( task_id            NUMBER NOT NULL,
  task_name          VARCHAR2(250) NOT NULL,
  id             NUMBER,
  task_dateini       DATE,
  task_date_end      DATE,
  task_status        NUMBER,   -- 0 No iniciada, 1 En proceso, 2 Finalizada  
  CONSTRAINT task_pk PRIMARY KEY (task_id)
);


-- Creacion de seccuencias 
CREATE SEQUENCE root.seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
 CREATE SEQUENCE root.task_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;

--Insert Table empleado
insert into root.empleado(id, name, user, password, dni, email)
       values (root.seq.nextval,'Daniel Camilo Pineros','ronaldashi','12345','12345678901','daniel.pineros@gmail.com');
insert into root.empleado(id, name, user, password, dni, email)
       values (root.seq.nextval,'Gabriel Murillo','gmurillo01','54321','54321678901','gabriel.murillo@gmail.com'); 
--Insert Table task
insert into root.task(task_id, task_name, id, task_dateini, task_date_end, task_status)
       values (root.task_seq.nextval,'Instalar Windows 10',1,sysdate,trunc(sysdate) + 3,0);       
insert into root.task(task_id, task_name, id, task_dateini, task_date_end, task_status)
       values (root.task_seq.nextval,'Instalar Office 2022',1,trunc(sysdate)+4,trunc(sysdate)+7,0);    
insert into root.task(task_id, task_name, id, task_dateini, task_date_end, task_status)
       values (root.task_seq.nextval,'Instalar Oracle 12g',2,sysdate,trunc(sysdate)+2,0);        
COMMIT;                  
