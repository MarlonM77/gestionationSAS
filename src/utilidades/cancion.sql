create table cancion(
    ca_id int,
    ca_nombre char(250),
    ca_genero char(250),
    ca_anio int,
    ca_cantante int,
    foreign key (ca_id) references concurso (con_id),
    foreign key (ca_cantante) references cantante (can_id)
);
insert into cancion values (1,"Amiga","Balada",1990,101);
insert into cancion values (1,"Las locuras mias","vallenato",2019,102);
insert into cancion values (1,"Gracias a ti","popular",2020,103);
insert into cancion values (1,"Tu","popular",2019,104);
insert into cancion values (1,"La gata bajo la lluvia","popular",1999,105);

