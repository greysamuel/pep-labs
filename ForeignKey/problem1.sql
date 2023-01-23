CREATE TABLE post (
   id SERIAL PRIMARY KEY,
   posst varchar(255),
   user_fk int REFERENCES user(id)
  );