create table cantante(
    can_id  int (11) primary key,
    can_nombre  char(20),
    can_apellido char(20),
    can_nacionalidad  char(40)
);
insert into cantante values (101, "Miguel","Bose", "español");
insert into cantante values (102, "Silvestre", "Dangond", "colombiano");
insert into cantante values (103, "Jeison", "Jiménez", "colombiano");
insert into cantante values (104, "Carin", "León", "mexicano");
insert into cantante values (105, "Roció", "Dúrcal", "española");