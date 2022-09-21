use ustdb;
Create table Worker(WORKER_ID int not null,FIRST_NAME varchar(50) not null,
LAST_NAME varchar(50) not null,SALARY int not null,JOINING_DATE varchar(50) not null,
DEPARTMENT varchar(50) not null);
 
 insert into Worker values 
 (001,"Monika","Arora","100000","02/20/14 9:00:00","HR"),
 (002,"Niharika","Verma",80000,"02/20/14 9:00:00","Admin"),
 (003,"Vishal","Singhal","300000","02/20/14 9:00:00","HR"),
 (004,"Amitabh", "Singh",500000,"02/20/14 9:00:00","Admin"),
 (005,"Vivek","Bhati",500000,"06/11/14 9:00:00","Admin"),
 (006,"Vipul","Diwan",200000,"06/11/14 9:00:00","Account"),
 (007,"Satish","Kumar",75000,"01/20/14 9:00:00","Account"),
 (008,"Geetika","Chauhan",90000,"04/11/14 9:00:00","Admin");
 
 Select FIRST_NAME as worker_name from Worker;

Select * from Worker where mod(WORKER_ID,2)<>0;

Select * from Worker where mod(WORKER_ID,2)=0;

Select DEPARTMENT, count(WORKER_ID) as no_of_workers from Worker group by DEPARTMENT order by no_of_workers ;

Select *,count(WORKER_ID) as No_of_workers from Worker group by DEPARTMENT having count(WORKER_ID)>1;

Select FIRST_NAME,LAST_NAME from Worker where SALARY between 50000 and 100000;

Select DEPARTMENT,count(WORKER_ID) as no_of_workers from Worker group by DEPARTMENT order by no_of_workers desc;

Select count(*) from worker where DEPARTMENT='Admin';

Select upper(FIRST_NAME) as fname from Worker;

Select distinct DEPARTMENT from Worker;

Select substring(FIRST_NAME,1,3) from Worker;

Select position("a" in FIRST_NAME) as POSITIONOF_a from Worker where FIRST_NAME="Amitabh";

Select RTRIM(FIRST_NAME) from Worker;

Select LTRIM(DEPARTMENT) from Worker;

Select REPLACE(FIRST_NAME,"a","A") from Worker;

Select CONCAT(FIRST_NAME,' ',LAST_NAME) as Complete_name from Worker;

Select * from Worker order by FIRST_NAME asc;

Select * from Worker order by FIRST_NAME asc, DEPARTMENT desc;

Select * from Worker where FIRST_NAME in ("Vipul","Satish");

Select * from Worker where FIRST_NAME not in ("Vipul","Satish");

Select * from Worker where FIRST_NAME like '%a%';

Select * from Worker where FIRST_NAME like '%a';

Select * from Worker where first_name like '______h';






 
 