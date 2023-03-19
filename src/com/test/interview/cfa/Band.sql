create table band
(
    id    integer not null
        primary key,
    name  varchar(128),
    genre varchar(128)
);
create table member
(
    id         integer not null
        constraint members_pkey
            primary key,
    band_id    integer
        constraint band_fk
            references band,
    first_name varchar(128),
    last_name  varchar(128),
    role       varchar(128),
    gender     varchar(128)
);

-- Insert Bands
INSERT INTO band (id, name, genre) VALUES (1, 'Metallica', 'Heavy Metal');
INSERT INTO band (id, name, genre) VALUES (2, 'Foo Fighters', 'Rock');
INSERT INTO band (id, name, genre) VALUES (3, 'Paramore', 'Rock');

-- Insert Band 2 members
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (1, 1, 'James', 'Hetfield', 'vocalist', 'male');
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (2, 1, 'Kirk', 'Hammett', 'lead guitar', 'male');
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (3, 1, 'Lars', 'Ulrich', 'drums', 'male');

-- Insert Band 2 members
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (4, 2, 'Dave', 'Grohl', 'vocalist', 'male');
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (5, 2, 'Pat', 'Smear', 'rhythm guitar', 'male');
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (6, 2, 'Nate', 'Mendel', 'bass guitar', 'male');

-- Insert Band 3 members
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (7, 3, 'Hayley', 'Williams', 'vocalist', 'female');
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (8, 3, 'Taylor', 'York', 'guitar', 'male');
INSERT INTO member (id, band_id, first_name, last_name, role, gender) VALUES (9, 3, 'Zac', 'Farro', 'drums', 'male');






