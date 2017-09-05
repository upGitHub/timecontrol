CREATE DATABASE IF NOT exists `timecontrol` CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE users (
  id_user INT NOT NULL UNIQUE AUTO_INCREMENT,
  username varchar(50) NOT NULL PRIMARY KEY,
  password varchar(260) NOT NULL,
  enabled  TINYINT NOT NULL)
  DEFAULT CHARSET=utf8;

CREATE TABLE authorities( 
    id_authority INT NOT NULL UNIQUE AUTO_INCREMENT,
    username varchar(50) NOT NULL PRIMARY KEY,
    authority   varchar (50) NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY 
    (username) REFERENCES users (username) ON DELETE CASCADE
       ON UPDATE CASCADE) DEFAULT CHARSET=utf8;

CREATE TABLE person( 
    id_person INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sha_key varchar(260),
    name varchar(300) NOT NULL) DEFAULT CHARSET=utf8;
    
CREATE TABLE records( 
    id_record BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    id_person INT NOT NULL,
    time_control BIGINT,
    device_control varchar(50),
    status_on_work TINYINT, 
    CONSTRAINT fk_records_person FOREIGN KEY 
    (id_person) REFERENCES person (id_person) ON DELETE CASCADE
       ON UPDATE CASCADE ) DEFAULT CHARSET=utf8;    
        
