-- psql -f /Users/maxim/Desktop/file.sql -d "postgres"


// psql -f /Users/maxim/Desktop/file.sql -d "postgres"
// psql -c "SELECT * FROM tableName"
// -l+ => plus d'infos taille bdd
// \du => show users
// \dt+ => show tables
// \dn => schemas
// dl => show databases
// ds => show table types


// CREATE DATABASE dataBaseName WITH ENCODING 'UTF-8' TEMPLATE templateName;
// createdb -T templateName dbName
// drop database databaseName

// alter database dbName owner to ownerName


// create table people (id int, name varchar(255));
// create table persons (id int, name varchar(255)) INHERITS (tableName)
// TRUNCATE TABLE tableName => vider une table
/*
    Create table temperature puis les partitions

    CREATE TABLE temperature_2020
    PARTITION OF temperature
    FOR VALUES FROM ('2017-09-03') TO ('2017-09-03')

*/

/*
INDEX

    CREATE INDEX

*/



//select * from cd.bookings a INNER JOIN cd.facilities F ON F.facid = a.facid

// Search by text
// select facid, name, membercost, guestcost, initialoutlay, monthlymaintenance from cd.facilities where name LIKE '%Tennis%';

/*

    select name,
        case when (monthlymaintenance > 100) then
            'expensive'
        else
            'cheap'
        end as cost
        from cd.facilities;
*/

//
ALTER TABLE
 Persons
ADD Birthday DATE
;


/*
    SELECT
    first_name,
    last_name,
    province_name
    FROM patients
    join province_names On province_names.province_id = patients.province_id;
*/
/*
    SELECT * from patients
    where first_name
    like '__r%'
    and gender = 'F'
    and weight between 60 and 80
    and city = 'Kingston'
    and patient_id % 2 is not 0
;

*/
/*
    select
      admissions.patient_id,
      first_name,
      last_name
    from admissions
      RIGHT join patients on patients.patient_id = admissions.patient_id
    where diagnosis = 'Dementia';
*/
/*
    select first_name
    from patients
    order by LENGTH(first_name), first_name asc;

*/
/*
SELECT
  (select count(*) from patients where gender = 'M') as male_count,
  (select count(*) from patients where gender = 'F')as female_count
;

*/
/*
    SELECT
      first_name,
      last_name,
      allergies
    from patients
    where allergies in('Penicillin', 'Morphine')
    order by allergies, first_name, last_name;
*/
/*
    select first_name, last_name, 'Patient' as role from patients
    union all
    select first_name, last_name, 'Doctor' as role from doctors;

*/
/*
select
CONCAT(upper(last_name), ",", lower(first_name)) AS new_name_format
from patients
order by first_name desc
;

*/
/*
select (MAX(weight) - MIN(weight)) as weight_delta
from patients
where last_name is 'Maroni';

*/
/**/
/**/


// Show all of the days of the month (1-31) and how many admission_dates occurred on that day.
// Sort by the day with most admissions to least admissions.
// day_number, number_of_admissions
// 11                   181
/*
    SELECT
        day(admission_date) as day_number,
        count(*) as number_of_admissions
    FROM admissions
    group by day(admission_date)
    order by number_of_admissions desc
*/


/*
    Show all columns for patient_id 542's most recent admission_date.
    select *
    from admissions
    where patient_id = 542
    group by patient_id
    having admission_date = max(admission_date)

*/
/*
    Show patient_id, attending_doctor_id, and diagnosis for admissions that match one of the two criteria:
    1. patient_id is an odd number and attending_doctor_id is either 1, 5, or 19.
    2. attending_doctor_id contains a 2 and the length of patient_id is 3 characters.
    SELECT patient_id, attending_doctor_id, diagnosis
    FROM admissions
    WHERE patient_id % 2 = 1 AND attending_doctor_id IN (1, 5, 19) OR patient_id LIKE '%2%' OR patient_id len(3)


    SELECT
      patient_id,
      attending_doctor_id,
      diagnosis
    FROM admissions
    WHERE
      (
        attending_doctor_id IN (1, 5, 19)
        AND patient_id % 2 != 0
      )
      OR
      (
        attending_doctor_id LIKE '%2%'
        AND len(patient_id) = 3
      )
*/

/*
    Show first_name, last_name, and the total number of admissions attended for each doctor.
    Every admission has been attended by a doctor.
    select first_name, last_name, count(*) as admissions_total
    from doctors
    inner join admissions ON doctors.doctor_id=admissions.attending_doctor_id
    group by attending_doctor_id

*/

/*
    For each doctor, display their id, full name, and the first and last admission date they attended.
    select distinct
    	doctor_id,
    	CONCAT(first_name, " ", last_name) AS full_name,
        min(admission_date) as first_admission_date,
        max(admission_date) as last_admission_date
    from doctors
    inner join admissions ON doctors.doctor_id=admissions.attending_doctor_id
    group by doctor_id
    order by doctor_id
*/
/*
    Display the total amount of patients for each province. Order by descending.

    select province_name, count(*) as patient_count
    from province_names
    inner join patients ON patients.province_id=province_names.province_id
    group by province_name
    order by patient_count desc
*/

/*
    For every admission, display the patient's full name, their admission diagnosis,
     and their doctor's full name who diagnosed their problem.
    SELECT
        CONCAT(patients.first_name, " ", patients.last_name) AS patient_name,
        diagnosis,
        CONCAT(doctors.first_name, " ", doctors.last_name) AS doctor_name
    FROM patients
    INNER JOIN admissions ON patients.patient_id = admissions.patient_id
    INNER JOIN doctors ON admissions.attending_doctor_id = doctors.doctor_id;
*/

--    display the number of duplicate patients based on their first_name and last_name.
    select first_name, last_name, count(*) as num_of_duplicates
    from patients
    group by concat(first_name, last_name)
    having num_of_duplicates > 1

 -- Create table
 drop table if exist
 create table categories (
    id integer primary key autoincrement,
    type text
 )
 create table if not exist recipes (
    id integer primary key autoincrement,
    title varchar(150) not null,
    slug varchar(150) not null unique,
    content text default "Maxim"
    category_id INTEGER references categories(id) on delete cascade
    FOREIGN KEY(category_id) -- set null
 )


 BEGIN TRANSACTION

 SELECT * FROM recipes

 DELETE FROM recipes where id = 1

 SELECT * FROM recipes

 ROLLBACK TRANSACTION
 COMMIT TRANSACTION

 SELECT * FROM recipes


 CREATE TRIGGER trigger_name
 AFTER INSERT tableName


--Display patient's full name,
--height in the units feet rounded to 1 decimal,
--weight in the unit pounds rounded to 0 decimals,
--birth_date,
--gender non abbreviated.
--
--Convert CM to feet by dividing by 30.48.
--Convert KG to pounds by multiplying by 2.205.


select
	concat(first_name, " ",  last_name) patient_name,
    round(height / 30.48, 1) as 'height "Feet"',
    round(weight * 2.205) as 'weight "Pounds"',
    birth_date,
    case gender
    	when 'M' then 'MALE'
        WHEN 'F' THEN 'FEMALE'
    END gender_type

from patients
