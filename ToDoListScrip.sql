create table Usuarios(ID int not null, 
			Nombre citext not null unique, 
			PRIMARY KEY(ID));


create table Tareas(ID int not null,
			UsuarioID int not null,
			Descripcion text not null,
			Status boolean not null,
			FechaCreacion timestamp with timezone,
			FechaCompletado timestamp with timezone,
			PRIMARY KEY(ID),
			FOREIGN KEY(UsuarioID) reference Usuarios(ID) );

create user 'develop'@'localhost' identified by 'passDevelop01!';
grant insert, update, select, privileges on ToDoList to 'develop'@'localhost';

create user 'superadmin'@'localhost' identified by 'passsuperadmin01!';
grant all privileges on ToDoList to 'superadmin'@'localhost';