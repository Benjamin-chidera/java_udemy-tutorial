CREATE TABLE course (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    rating double NOT NULL,
    is_published BOOLEAN NOT NULL
);

INSERT INTO course (name, description, author, rating, is_published) 
VALUES ('PYTHON', 'Coding', 'Benjamin', 5.0, true);
INSERT INTO course (name, description, author, rating, is_published) 
VALUES ('JAVA', 'Spring Boot', 'Benjamin', 4.8, true);
