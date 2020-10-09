DROP database if exists QLUV;
CREATE DATABASE QLUV;
USE QLUV;
DROP TABLE IF exists project;
CREATE TABLE  project (
 projectId INT ,
    teamSize int,
    idManager int,
    idEmployee int,
    PRIMARY KEY (projectId)
    
    );


CREATE TABLE  users (
	id INT AUTO_INCREMENT,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    phone VARCHAR(12) NOT NULL,
    email VARCHAR(100) NOT NULL,
    pass VARCHAR(100) NOT NULL,
    expInYear TINYINT,
    projectName VARCHAR(100),
    proSkill VARCHAR(50),
     idManager int,
     idEmployee int,
     projectId INT,
    
    PRIMARY KEY (id),
    UNIQUE KEY (email),
	FOREIGN KEY(projectId) REFERENCES project(projectId)
  
    
);
