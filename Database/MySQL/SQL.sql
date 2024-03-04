MySQL

DDL - Data Definition Language

SQL: create command

Creating a Database

CREATE DATABASE <DB_NAME>;

Example for creating Database
CREATE DATABASE Test;
------------------------------
Creating a Table
Following is the syntax,
CREATE TABLE <TABLE_NAME>
(
    column_name1 datatype1,
    column_name2 datatype2,
    column_name3 datatype3,
    column_name4 datatype4
);
Example for creating Table
CREATE TABLE Student(
    student_id INT, 
    name VARCHAR(100), 
    age INT);
CREATE TABLE Test.Student(
    student_id INT, 
    name VARCHAR(100), 
    age INT);
------------------------------
SQL: ALTER command
ALTER Command: Add a new Column
ALTER TABLE table_name ADD(
    column_name datatype);

ALTER TABLE student ADD(
    address VARCHAR(200)
);
-------------------------------------
ALTER Command: Add multiple new Columns
ALTER TABLE table_name ADD(
    column_name1 datatype1, 
    column-name2 datatype2, 
    column-name3 datatype3);
Here is an Example for this,

ALTER TABLE student ADD(
    father_name VARCHAR(60), 
    mother_name VARCHAR(60), 
    dob DATE); 
-------------------------------------
MySQL Drop a Column From Existing Table
Syntax
>> ALTER TABLE table_name DROP COLUMN exisiting_column_name;
-------------------------------------

ALTER Command: Add Column with default value

ALTER TABLE table_name ADD(
    column-name1 datatype1 DEFAULT some_value
);
Here is an Example for this,
ALTER TABLE student ADD(
    dob DATE DEFAULT '01-Jan-99'
);
-------------------------------------

ALTER Command: Modify an existing Column
ALTER TABLE table_name modify(
    column_name datatype
);
Here is an Example for this,
alter table mech modify column student_name varchar(17);
Remember we added a new column address in the beginning? The above command will modify the address column of the student table, to now hold upto 300 characters.
-------------------------------------

ALTER Command: Rename a Column
Using ALTER command you can rename an existing column. Following is the syntax,
ALTER TABLE table_name RENAME column 
    old_column_name TO new_column_name;

Here is an example for this,

alter table mech change old_column_name  new_column_name int(50);
---------------------------------------------------------------------------------------------------------

Truncate, Drop or Rename a Table

TRUNCATE TABLE table_name;

Here is an example explaining it,

TRUNCATE TABLE student;
-----------------------------------------
DROP command

DROP TABLE table_name;

Here is an example explaining it,

DROP TABLE student;

DROP DATABASE Test;
-----------------------------------------------------------------------------------------------------
How to Delete a row in MySQL

DELETE FROM `table_name` [WHERE condition];

HERE

DELETE FROM `movies` WHERE `movie_id` = 18;
--------------------------
RENAME query

RENAME TABLE student to students_info;

----------------------------
INSERT command

INSERT INTO table_name VALUES(data1, data2, ...);

Lets see an example,

INSERT INTO student(id, name) values(102, 'Alex'),(102, 'Alex'),(102, 'Alex');
-----------------------------------
Using UPDATE SQL command

UPDATE command

UPDATE table_name SET column_name = new_value WHERE some_condition;

UPDATE student SET age=18 WHERE student_id=102;
--------------------------------
Updating Multiple Columns

UPDATE student SET name='Abhi', age=17 where s_id=103; 

--------------------------------

UPDATE Command: Incrementing Integer Value

UPDATE student SET age = age+1; 

---------------------------------

Using DELETE SQL command

DELETE command is used to delete data fromWhen you ask any question in Studytonight's Forum it gets saved into a table. And using the Delete option, you can even delete a question asked by you. How do you think that works? Yes, using the Delete DML command.
Let's study about the syntax and the usage of the Delete command.
-----------------------------------
DELETE command a table

DELETE FROM table_name;

DELETE FROM student WHERE s_id=103;
-----------------------------------
TCL

COMMIT command
COMMIT command is used to permanently save any transaction into the database.

COMMIT;
-----------------------------------
ROLLBACK command

ROLLBACK TO savepoint_name;
-------------------------------------
SAVEPOINT command

SAVEPOINT savepoint_name;

Example of TCl

START TRANSACTION;

COMMIT;

UPDATE class SET name = 'Abhijit' WHERE id = '5';

SAVEPOINT A;

INSERT INTO class VALUES(6, 'Chris');

SAVEPOINT B;

INSERT INTO class VALUES(7, 'Bravo');

SAVEPOINT C;

SELECT * FROM class;
NOTE: SELECT statement is used to show the data stored in the table.
The resultant table will look like,
id	name
1	Abhi
2	Adam
4	Alex
5	Abhijit
6	Chris
7	Bravo

Now let's use the ROLLBACK command to roll back the state of data to the savepoint B.

ROLLBACK TO B;

SELECT * FROM class;

Now our class table will look like,
id	name
1	Abhi
2	Adam
4	Alex
5	Abhijit
6	Chris

Now let's again use the ROLLBACK command to roll back the state of data to the savepoint A
ROLLBACK TO A;

SELECT * FROM class;
Now the table will look like,
id	name
1	Abhi
2	Adam
4	Alex
5	Abhijit
So now you know how the commands COMMIT, ROLLBACK and SAVEPOINT works.
-------------------------------------
Using GRANT and REVOKE

•	GRANT: Used to provide any user access privileges or other priviliges for the database.
•	REVOKE: Used to take back permissions from any user.

--------------------------------------

SELECT SQL Query

SELECT 
    column_name1, 
    column_name2
    FROM table_name;
--------------------------------------
Particular Column 

SELECT s_id, name, age FROM student;

---------------------------------------
Select a particular record based on a condition

We can use the WHERE clause to set a condition,

SELECT * FROM student WHERE name = 'Abhi';
-------------------------------------
Performing Simple Calculations using SELECT Query

SELECT eid, name, salary+3000  FROM employee;

---------------------------------------
Using the WHERE SQL clause

SELECT s_id, 
    name, 
    age, 
    address 
    FROM student WHERE s_id = 101;
----------------------
WHERE Clause with AND & OR operator

SELECT * FROM Emp WHERE salary < 10000 AND age > 25

________________________________________
Example of OR operator

SELECT * FROM Emp WHERE salary > 10000 OR age > 25 

---------------------------------------
Operators for WHERE clause condition
 
SELECT * FROM `movies` WHERE `category_id` = 2 AND `year_released` = 2008;
 
 
SELECT * FROM `movies` WHERE `category_id` = 1 OR `category_id` = 2;
-------------------------------------- 
WHERE clause combined with - IN Keyword
 
SELECT * FROM `members` WHERE `membership_number` IN (1,2,3);
 
WHERE clause combined with - NOT IN Keyword
 
SELECT * FROM `members` WHERE `membership_number` NOT IN (1,2,3);
--------------------------------------
 
WHERE clause combined with - COMPARISON OPERATORS

SELECT * FROM `members` WHERE `gender` = 'Female';

SELECT * FROM `payments` WHERE `amount_paid` >2000;

SELECT * FROM `movies` WHERE `category_id`<> 1;
--------------------------------------------------------------------------------------------------------
SQL BETWEEN Operator

SELECT * FROM Products
WHERE Price BETWEEN 10 AND 20;

------------------------------------

NOT BETWEEN Example

SELECT * FROM Products
WHERE Price NOT BETWEEN 10 AND 20;
------------------------------------
BETWEEN with IN Example

SELECT * FROM Products
WHERE Price BETWEEN 10 AND 20
AND CategoryID NOT IN (1,2,3);
________________________________________
BETWEEN Text Values Example

SELECT * FROM Products
WHERE ProductName BETWEEN 'Carnarvon Tigers' AND 'Mozzarella di Giovanni'
ORDER BY ProductName;

Example

SELECT * FROM Products
WHERE ProductName BETWEEN "Carnarvon Tigers" AND "Chef Anton's Cajun Seasoning"
ORDER BY ProductName;
________________________________________
NOT BETWEEN Text Values Example

Example
SELECT * FROM Products
WHERE ProductName NOT BETWEEN 'Carnarvon Tigers' AND 'Mozzarella di Giovanni'
ORDER BY ProductName;

----------------------------------------s
SQL MIN() and MAX() Functions

SELECT MIN(Price) AS SmallestPrice
FROM Products;
--------------------------------------
SELECT MAX(Price) AS LargestPrice
FROM Products;
--------------------------
Test SQL COUNT(), AVG() and SUM() Functions

SELECT COUNT(ProductID)
FROM Products;
---------------------------
SELECT AVG(Price)
FROM Products;
---------------------------
SELECT SUM(Quantity)
FROM OrderDetails;


----------------------------------------------------------------------------------------------------
SQL UNION Operator
The SQL UNION Operator
The UNION operator is used to combine the result-set of two or more SELECT statements.
•	Each SELECT statement within UNION must have the same number of columns
•	The columns must also have similar data types
•	The columns in each SELECT statement must also be in the same order
_______________________________________
SQL UNION Example
The following SQL statement returns the cities (only distinct values) from both the "Customers" and the "Suppliers" table:
Example
SELECT City FROM Customers
UNION
SELECT City FROM Suppliers
ORDER BY City;
Note: If some customers or suppliers have the same city, each city will only be listed once, because UNION selects only distinct values. Use UNION ALL to also select duplicate values!
________________________________________
SQL UNION ALL Example
The following SQL statement returns the cities (duplicate values also) from both the "Customers" and the "Suppliers" table:
Example
SELECT City FROM Customers
UNION ALL
SELECT City FROM Suppliers
ORDER BY City;
________________________________________
SQL UNION With WHERE
The following SQL statement returns the German cities (only distinct values) from both the "Customers" and the "Suppliers" table:
Example
SELECT City, Country FROM Customers
WHERE Country='Germany'
UNION
SELECT City, Country FROM Suppliers
WHERE Country='Germany'
ORDER BY City;
________________________________________
SQL UNION ALL With WHERE
The following SQL statement returns the German cities (duplicate values also) from both the "Customers" and the "Suppliers" table:
Example
SELECT City, Country FROM Customers
WHERE Country='Germany'
UNION ALL
SELECT City, Country FROM Suppliers
WHERE Country='Germany'
ORDER BY City; 
________________________________________
Another UNION Example
The following SQL statement lists all customers and suppliers:
Example
SELECT 'Customer' AS Type, ContactName, City, Country
FROM Customers
UNION
SELECT 'Supplier', ContactName, City, Country
FROM Suppliers;
------------------------------------------------------------------------------------------------------
SQL CASE Statement

SELECT OrderID, Quantity,
CASE
    WHEN Quantity > 30 THEN 'The quantity is greater than 30'
    WHEN Quantity = 30 THEN 'The quantity is 30'
    ELSE 'The quantity is under 30'
END 
AS QuantityResult
FROM OrderDetails;
----------------------------------------------------------------------------

MySQL ORDER BY
A)
SELECT
	contactLastname,
	contactFirstname
FROM
	customers
ORDER BY
	contactLastname DESC;
B) Using MySQL ORDER BY clause to sort values in multiple columns example
SELECT
	contactLastname,
	contactFirstname
FROM
	customers
ORDER BY
	contactLastname DESC,
	contactFirstname ASC;

----------------------------------------------------
SQL Constraints
•	NOT NULL - Ensures that a column cannot have a NULL value
•	UNIQUE - Ensures that all values in a column are different
•	PRIMARY KEY - A combination of a NOT NULL and UNIQUE. Uniquely identifies each row in a table
•	FOREIGN KEY - Uniquely identifies a row/record in another table
•	CHECK - Ensures that all values in a column satisfies a specific condition
•	DEFAULT - Sets a default value for a column when no value is specified
•	INDEX - Used to create and retrieve data from the database very quickly
-------------------------
SQL NOT NULL Constraint

Example
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255) NOT NULL,
    Age int
);
------------------------------------------
SQL NOT NULL on ALTER TABLE

ALTER TABLE Persons
MODIFY Age int NOT NULL;

----------------------------------------------
SQL UNIQUE Constraint

CREATE TABLE Persons (
    ID int NOT NULL UNIQUE,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);

MySQL:
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    UNIQUE (ID)
);
To name a UNIQUE constraint, and to define a UNIQUE constraint on multiple columns, use the following SQL syntax:
MySQL / SQL Server / Oracle / MS Access:
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CONSTRAINT UC_Person UNIQUE (ID,LastName)
);
------------------------------------

SQL UNIQUE Constraint on ALTER TABLE

ALTER TABLE Persons
DROP CONSTRAINT UC_Person;
-----------------------------------------
SQL PRIMARY KEY Constraint

CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (ID)
);

----------------------------------------
SQL Server / Oracle / MS Access:
CREATE TABLE Persons (
    ID int NOT NULL PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);

MySQL / SQL Server / Oracle / MS Access:
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CONSTRAINT PK_Person PRIMARY KEY (ID,LastName)
);
________________________________________
SQL PRIMARY KEY on ALTER TABLE

ALTER TABLE Persons
ADD CONSTRAINT PK_Person PRIMARY KEY (ID,LastName);
________________________________________
DROP a PRIMARY KEY Constraint

ALTER TABLE Persons
DROP PRIMARY KEY;
--------------------------------------

SQL FOREIGN KEY Constraint

MySQL:
CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
);
SQL Server / Oracle / MS Access:
CREATE TABLE Orders (
    OrderID int NOT NULL PRIMARY KEY,
    OrderNumber int NOT NULL,
    PersonID int FOREIGN KEY REFERENCES Persons(PersonID)
);

MySQL / SQL Server / Oracle / MS Access:
CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    CONSTRAINT FK_PersonOrder FOREIGN KEY (PersonID)
    REFERENCES Persons(PersonID)
);
________________________________________
SQL FOREIGN KEY on ALTER TABLE

ALTER TABLE Orders
ADD FOREIGN KEY (PersonID) REFERENCES Persons(PersonID);
________________________________________
DROP a FOREIGN KEY Constraint

ALTER TABLE Orders
DROP FOREIGN KEY FK_PersonOrder;
------------------------------------------------
MySQL – ON DELETE CASCADE Constraint

Step 1: Create the Student table
CREATE TABLE Student (
    sno INT PRIMARY KEY,
    sname VARCHAR(20),
    age INT

);

Step 2: Insert rows into the Student table
INSERT INTO Student(sno, sname,age) 
 VALUES(1,'Ankit',17),
       (2,'Ramya',18),
       (3,'Ram',16);

Step 3: Execute the SELECT query to check the data in the STUDENT table.
SELECT *
FROM Student;
Output:
sno	sname	age
1	Ankit	17
2	Ramya	18
3	Ram	16

Step 4: Create the Course table
CREATE TABLE Course (
    cno INT PRIMARY KEY,
    cname VARCHAR(20)
);

Step 5: Insert rows into the Course table
INSERT INTO Course(cno, cname) 
 VALUES(101,'c'),
       (102,'c++'),
       (103,'DBMS');

Step 6: Execute the SELECT query to check the data in the Course table.
SELECT *
FROM Course;
Output:
cno	cname
101	c
102	c++
103	DBMS

Step 7: Create the Enroll table 
CREATE TABLE Enroll (
    sno INT,
    cno INT,
    jdate date,
    PRIMARY KEY(sno,cno),
    FOREIGN KEY(sno) 
        REFERENCES Student(sno)
        ON DELETE CASCADE
    FOREIGN KEY(cno) 
        REFERENCES Course(cno)
        ON DELETE CASCADE
);

Step 8: Insert rows into the Enroll table
INSERT INTO Enroll(sno,cno,jdate) 
 VALUES(1, 101, '5-jun-2021'),
       (1, 102, '5-jun-2021'),
       (2, 103, '6-jun-2021');


Step 9: Execute the SELECT query to check the data in the Enroll table.
SELECT *
FROM Enroll;
Output:
sno	cno	jdate
1	101	5-jun-2021
1	102	5-jun-2021
2	103	6-jun-2021


Step 10: Here the parent tables are Student and Course whereas the child table is Enroll. If a student drops from the course or a course is removed from the offering list it must affect the child table also. 
DELETE FROM Student
WHERE sname="Ramya";


Step 11: Execute the SELECT query to check the data.
Select * from Student;
Output: 
sno	sname	age
1	Ankit	17
3	Ram	16
Select * from Enroll;
Output:
sno	cno	jdate
1	101	5-jun-2021
1	102	5-jun-2021
As you delete the contents of sno=2 in the parent table it automatically deletes the details of sno=2 from the child table also. In the same way, if you remove a course from the Course table it automatically deletes the rows of that course in the child table Enroll. This works out because the foreign key constraint ON DELETE CASCADE is specified.

----------------------------------------------------------------
CHECK Constraint

Example: CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CHECK (Age>=18)
);

ALTER TABLE Persons	
ADD CHECK (Age>=18);
--------------------------------------
DEFAULT Constraint

Example: CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    City varchar(255) DEFAULT 'Sandnes'
);

-------------------------------------------------------------------------------------------------------
SQL Aliases

SELECT CustomerID AS ID, CustomerName AS Customer
FROM Customers;
----------------------------

SQL LIKE clause

Wildcard operators
•	Percent sign %: represents zero, one or more than one character.
•	Underscore sign _: represents only a single character.

SELECT * FROM Student WHERE s_name LIKE '_d%';
________________________________________
Using % only
SELECT * FROM Student WHERE s_name LIKE '%x';
--------------------------------------------------------------------------------------------------------
SQL CREATE VIEW Statement

Example

CREATE VIEW [Brazil Customers] AS
SELECT CustomerName, ContactName
FROM Customers
WHERE Country = 'Brazil';

SELECT * FROM [Brazil Customers];
________________________________________
SQL Updating a View

CREATE OR REPLACE VIEW [Brazil Customers] AS
SELECT CustomerName, ContactName, City
FROM Customers
WHERE Country = 'Brazil';


SQL Dropping a View

DROP VIEW [Brazil Customers];
------------------------------------------------------------------------------------------------------
ORDER BY Clause

SELECT * FROM Emp ORDER BY salary;
_______________
Using Order by DESC

SELECT * FROM Emp ORDER BY salary DESC;
------------------------------------------------------------------------------------------------------

DISTINCT keyword

SELECT DISTINCT salary FROM Emp;

------------------------------------------------------------------------------------------------------
SQL GROUP BY Statement

Example
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country;

Example
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country
ORDER BY COUNT(CustomerID) DESC;

---------------------------------------------------------------------------------------------------------
SQL HAVING Clause

Demo Database

Example 
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerID) > 5;

Example 
SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerID) > 5
ORDER BY COUNT(CustomerID) DESC;
---------------------------------------------------------------------------------------------------------
MySQL subquery 

Example
SELECT 
    customerNumber, 
    checkNumber, 
    amount
FROM
    payments
WHERE
    amount = (SELECT MAX(amount) FROM payments);
---------------------------------------------------------------------------------------------------------

SQL JOIN

Cross JOIN or Cartesian Product

Example of Cross JOIN

Cross JOIN query will be,
SELECT * FROM 
class CROSS JOIN class_info;
-------------------------------------

INNER Join or EQUI Join

SELECT * from class INNER JOIN class_info where class.id = class_info.id;

________________________________________
Natural JOIN

SELECT * from class NATURAL JOIN class_info; 

________________________________________
OUTER JOIN
Outer Join is based on both matched and unmatched data. Outer Joins subdivide further into,
1.	Left Outer Join
2.	Right Outer Join
3.	Full Outer Join
________________________________________
LEFT Outer Join
 
SELECT * FROM class LEFT OUTER JOIN class_info ON (class.id = class_info.id);

________________________________________
RIGHT Outer Join

SELECT * FROM class RIGHT OUTER JOIN class_info ON (class.id = class_info.id);

________________________________________
Full Outer Join
SELECT * FROM class FULL OUTER JOIN class_info ON (class.id = class_info.id);

---------------------------------------------------------------------------------------------------------

