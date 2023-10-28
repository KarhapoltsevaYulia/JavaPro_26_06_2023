CREATE TABLE Homework (
ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(256) NOT NULL,
DESCRIPTION VARCHAR(256) NOT NULL
);

insert into homework(NAME, DESCRIPTION) values ('Anna', 'Student1');
insert into homework(NAME, DESCRIPTION) values ('Olga', 'Student2');
insert into homework(NAME, DESCRIPTION) values ('Roma', 'Student3');
select * from homework;

CREATE TABLE Lesson (
 ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 NAME VARCHAR(256) NOT NULL,
 updatedAt TIME NOT NULL

);
ALTER TABLE Lesson
    ADD homework_id INT;

alter table Lesson
    ADD foreign key (homework_id )  REFERENCES homework(ID);



insert into Lesson(name, updatedat) values ('Java',004500);
insert into Lesson(name, updatedat) values ('JavaPro',46);
insert into Lesson(name, updatedat) values ('JAVAExcellent',44);

SELECT *FROM Lesson;

CREATE TABLE Schedule (
ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(256) NOT NULL,
updatedAt TIME NOT NULL
);

ALTER TABLE Schedule ADD lessons  INT;
alter table Schedule
    Add   FOREIGN KEY Schedule(id) REFERENCES Lesson(id);

insert into Schedule(name, updatedat) values ('Java',004500);
insert into Schedule(name, updatedat) values ('JavaPro',46);
insert into Schedule(name, updatedat) values ('JAVAExcellent',44);
SELECT *FROM Schedule;

create  table Lessons(
id_Lesson int not null,
id_Schedule int not null,
FOREIGN KEY (id_Lesson) REFERENCES Schedule(ID),
FOREIGN KEY (id_Schedule) REFERENCES Lesson(ID)
);

SELECT *FROM Lessons;