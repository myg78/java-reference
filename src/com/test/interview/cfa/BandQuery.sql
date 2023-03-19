select * from band;

-- Select all Bands
select * from band;

-- Select names of all band members
select first_name, last_name, role, b.name from band b join member m on m.band_id = b.id;

-- Select names of all male
select first_name, last_name from band b join member m on m.band_id = b.id where m.gender = 'male';

-- Count how many members per role
select m.role, count(*) from band b join member m on m.band_id = b.id group by m.role;

-- Count how many members per role ordered
