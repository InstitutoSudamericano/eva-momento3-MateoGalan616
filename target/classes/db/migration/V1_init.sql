CREATE TABLE Film (
                      id INT PRIMARY KEY,
                      title VARCHAR(255),
                      director VARCHAR(255),
                      duration INT

);

CREATE TABLE Scene (
                       id INT PRIMARY KEY,
                       description TEXT,
                       budget DECIMAL(10, 2),
                       minutes INT,
                       film_id INT,
                       location varchar(300)
                       FOREIGN KEY (film_id) REFERENCES Film(id)

);

CREATE TABLE Character (
                           id INT PRIMARY KEY,
                           description TEXT,
                           cost DECIMAL(10, 2),
                           stock INT,
                           var actorName Null,
                           scene_id INT,
                           FOREIGN KEY (scene_id) REFERENCES Scene(id)

);
