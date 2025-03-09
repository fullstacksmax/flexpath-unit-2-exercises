
create table authors (
author_id int not null  auto_increment,
name varchar(255) not null,
birth_year  int not null,
country varchar(255) not null,
primary key (author_id)
);

create table genres (
genre_id    int not null auto_increment,
name    varchar(255) not null,
primary key (genre_id)
);

create table books (
book_id int not null auto_increment,
title VARCHAR(255),
author_id int,
genre_id int ,
publication_year int,
primary key (book_id),
foreign key (author_id) references authors(author_id),
foreign key (genre_id) references genres(genre_id)
);

CREATE TABLE members (
member_id int not null auto_increment,
name    varchar(255) not null,
join_date   DATE not null,
primary key (member_id)
);

create table loans (
loan_id     int not null auto_increment,
book_id     int not null,
member_id   int not null,
loan_date   date not null,
return_date     date null,
primary key (loan_id),
foreign key(book_id) references books(book_id),
foreign key(member_id) references members(member_id)
);


insert into genres
values
(1, 'Fiction'),
(2, 'Mystery'),
(3, 'Dystopian'),
(4, 'Romance'),
(5, 'Coming of Age');

insert into authors
values
(1, 'F. Scott Fitzgerald', 1896 , 'USA'),
(2, 'Harper Lee', 1926, 'USA'),
(3, 'George Orwell', 1903, 'UK'),
(4, 'Jane Austen', 1775, 'UK'),
(5, 'J.D. Salinger', 1919, 'USA');

insert into books
values
(1, 'The Great Gatsby', 1, 1, 1925),
(2, 'To Kill a Mockingbird', 2, 2, 1960),
(3, '1984', 3, 3, 1949),
(4, 'Pride and Prejudice', 4, 4, 1813),
(5, 'The Catcher in the Rye', 5, 5, 1951);



insert into members
values
(1, 'Alice Smith', '2020-01-01'),
(2, 'Bob Johnson', '2020-01-15'),
(3, 'Charlie Brown', '2020-02-01');

insert into loans
values
(1, 1, 1, '2020-01-01', '2020-01-15'),
(2, 2, 2, '2020-01-15', '2020-02-01'),
(3, 3, 3, '2020-02-01', null);





