create table participacion(
    pn_id int (11) primary key,
    pn_user char(40),
    pn_concurso int(11),
    pn_actuacion char(30),
    pn_fecha datetime,
    foreign key (pn_user) references participante (par_login),
    foreign key (pn_concurso) references concurso (con_id)
);
insert into participacion values (1001,"rortiz",1,"Amiga",'2021-08-10 20:00:00');
insert into participacion values (1002,"rortiz",1,"Tu",'2021-08-15 18:30:00');
insert into participacion values (1003,"rortiz",2,"Salsa",'2021-08-20 20:30:18');
insert into participacion values (1004,"pabloper",1,"Amiga",'2021-08-10 20:30:00');
insert into participacion values (1005,"nataper",1,"Gracias",'2021-08-14 20:30:00');
insert into participacion values (1006,"nataper",2,"Cumbia",'2018-08-15 21:30:00');
insert into participacion values (1007,"nataper",2,"Las locuras mias",'2021-08-14 15:30:00');
insert into participacion values (1008,"jaironi",2,"Cumbia",'2021-08-14 15:30:00');
insert into participacion values (1009,"jaironi",2,"Samba",'2021-08-13 18:30:00');
insert into participacion values (1010,"jairve",2,"Break dance",'2021-08-16 20:30:00');
insert into participacion values (1011,"jairve",2,"Salsa",'2021-08-14  18:30:20');
insert into participacion values (1012,"jairve",2,"Flamenco",'2021-08-14 18:30:00');
insert into participacion values (1013,"renego",2,"Danza irlandesa",'2021-08-12 21:30:00');
insert into participacion values (1014,"camiru",1,"Las locuras mias",'2021-08-13 17:30:00');
insert into participacion values (1015,"camiru",1,"Tu",'2021-08-15 18:30:00');
insert into participacion values (1016,"camiru",1,"La gata bajo la lluvia",'2021-08-16 18:30:00');
