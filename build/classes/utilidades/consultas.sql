Select 'Consulta 1';
SELECT bai_nombre FROM baile UNION ALL SELECT ca_nombre FROM cancion ORDER BY bai_nombre ASC;
Select 'Consulta 2';
SELECT ca_nombre, ca_genero, ca_anio FROM cancion WHERE  ca_anio > "2000" ORDER BY ca_nombre;
Select 'Consulta 3';
SELECT cancion.ca_nombre FROM cancion INNER JOIN cantante ON(cantante.can_id = cancion.ca_cantante) WHERE cantante.can_nombre = "Roció";
Select 'Consulta 4';
SELECT participacion.pn_actuacion FROM participacion WHERE pn_user = "rortiz" ORDER BY pn_actuacion;
Select 'Consulta 5';
SELECT par_login,par_nombre,par_apellido FROM participante INNER JOIN participacion on (participante.par_login = participacion.pn_user) WHERE participacion.pn_actuacion = "Las locuras mias";
Select 'Consulta 6';
SELECT COUNT(ca_nombre) FROM cancion WHERE  ca_anio <= "2020";
