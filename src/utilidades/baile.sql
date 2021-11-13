create table baile(
    bai_id int ,
    bai_nombre char (30),
    bai_antiguedad int,
    bai_duracion int,
    foreign key (bai_id) references concurso (con_id)
);
insert into baile values (2,"Cumbia",40,5);
insert into baile values (2,"Samba",50,5);
insert into baile values (2,"Break dance",30,4);
insert into baile values (2,"Salsa",30,4);
insert into baile values (2,"Danza irlandesa",34,7);
insert into baile values (2,"Polca",50,6);
insert into baile values (2,"Danza clasica",56,5);
INSERT INTO baile VALUES(2,"Arrow",35,6);