create database ToDoList
create table ToDoList.Usuarios(ID int not null, 
Nombre citext not null unique, 
PRIMARY KEY(ID))


create table ToDoList.Tareas(ID int not null,
UsuarioID int not null,
Descripcion text not null,
Status boolean not null,
FechaCreacion timestamp with timezone,
FechaCompletado timestamp with timezone,
PRIMARY KEY(ID),
FOREIGN KEY(UsuarioID) reference Usuarios(ID) );
