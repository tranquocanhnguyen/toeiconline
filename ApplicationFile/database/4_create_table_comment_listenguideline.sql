use toeiconline;

CREATE TABLE listenguideline (
  listenguidelineid BIGINT NOT NULL  PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(512) NULL ,
  image VARCHAR(255) NULL ,
  content TEXT null,
  createdate TIMESTAMP NULL ,
  modifiedate TIMESTAMP NULL
);

CREATE TABLE comment (
  commentid BIGINT NOT NULL  PRIMARY KEY AUTO_INCREMENT,
  content TEXT NULL ,
  userid BIGINT NULL ,
  listenguidelineid BIGINT NULL ,
  createdate TIMESTAMP NULL
)