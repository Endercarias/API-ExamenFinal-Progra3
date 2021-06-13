insert into paciente (id, PRIMERNOMBRE, SEGUNDONOMBRE, APELLIDO, SEGUNDOAPELLIDO, EDAD) values (1, 'Walter', 'Rene', 'Carias', 'Cervantes', 15);
insert into paciente (id, PRIMERNOMBRE, SEGUNDONOMBRE, APELLIDO, SEGUNDOAPELLIDO, EDAD) values (2, 'Maria', 'Jose', 'Gonzalez', 'Perez', 19);
insert into paciente (id, PRIMERNOMBRE, SEGUNDONOMBRE, APELLIDO, SEGUNDOAPELLIDO, EDAD) values (3, 'Estuardo', 'Daniel', 'Chicas', 'Cardona', 20);
insert into citas (id, fecha, hora, paciente, estado, observaciones) values (1, '2021-06-12', '19horas', 2, 'PENDIENTE', 'Paciente pendiente de pagar');
insert into citas (id, fecha, hora, paciente, estado, observaciones) values (2, '2021-06-13', '22horas', 1, 'ACEPTADA', 'El paciente esta muy enfermo');
insert into citas (id, fecha, hora, paciente, estado, observaciones) values (3, '2021-06-14', '10horas', 3, 'CANCELADA', 'El paciente muy violento');