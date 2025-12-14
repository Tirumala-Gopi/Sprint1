/*Look through Lesson 05b Where and Order By.sql and run the code examples there, then
   practice restricting and sorting data with the excercises below:
*/

use hr_sales;
-- 1) Show the last name and salary of those employees who earn  more than $12000.
SELECT last_name,salary
	FROM employees
   WHERE salary>12000;
		


-- 2) Display the last name and department number of employee 176.
SELECT last_name,department_id,employee_id
	FROM employees
		WHERE employee_id=176;
		 


/* 3)Display the last name and salary of those employees whose salary is not in 
    the range of $5,000 to $12,000. */
SELECT last_name,salary
	FROM employees
    WHERE salary NOT between 5000 AND 12000
    ORDER BY salary;


/* 4) Show the first and last name, salary, and hire date for employees with 
      the last names Matos or Taylor. */
		SELECT last_name,salary,hire_date
			FROM employees
			where last_name LIKE 'Matos'
				OR last_name LIKE 'Taylor';
			

/* 5) Display the last name and department id of all employees in departments 20
      and 50. Sort the result by last name. */ 
      SELECT last_name,department_id
		FROM employees
        where department_id BETWEEN 20 AND 50
        ORDER BY last_name;

		

            
/* 6) Display the last name, salary, and department of employees who earn 
      between $5,000 and $10,000 and are in department 60 or 80. Label the 
      columns Employee and monthly_salary. */
       SELECT last_name as Employee,salary as monthly_salary,department_id
		FROM employees
        where salary BETWEEN 5000 AND 10000 AND department_id BETWEEN 60 AND 80	;    
    
-- 7) Show the last name and hire date for all emplyees hired in 2004
      
      SELECT last_name,hire_date
		FROM employees
		where hire_date  like '2004%';
  
  
-- 8) Show the last name and job id of all employees who do not have a manager.
	select last_name,job_id,manager_id
    from employees
    where manager_id IS NULL;
		


/* 9) Display the last_name, salary, and commission of all employees who earn
      a commission. Sort the result in descending order of salary and commission.
      Use the columns' numeric position in the order by clause. */
      select last_name,salary,commission_pct
      from employees
      where commission_pct IS NOT NULL
      ORDER BY salary DESC,commission_pct DESC;
		
      
      
/*  10) Show the last name and salary of employees who earn more than $10000. */
        select last_name,salary
      from employees
        where salary>10000;
    
/*  11) Write a query that  generates employee id, last name, salary, manager_id, and department 
		for the employees of manager 120. Sort the report by the first selected column. */
         select employee_id, last_name,salary,manager_id,department_id
      from employees
        where manager_id=120
        order by employee_id;
        
--  12) Show all last names that have "a" as the third letter.
select last_name
from employees
where last_name like '__a%';
		


/*  13) Display all last names of employees who have both an "a" and an "e" 
        in their last name. */
select last_name
from employees
where last_name like '%a%'and last_name like '%e%';




/*  14) Show the last name, job, and salary for all employees who are either a
        sales representative or stock clerk, and whose salary is not $2,500, 
        $3,500, or $7,000. Order the result by salary within job. ,*/
        
        select last_name,job_id,salary
        from employees
        where (job_id='ST_CLERK' OR job_id='SA_REP') AND salary not in(2500,3500.7000)
        ORDER BY salary;
		  

        
        
/*  15) Show the last name, salary and commission of those employees whose 
        commission is 20%. */
        
 select last_name,salary,commission_pct
      from employees
      where commission_pct =0.20;
     
			
  


/* 16) In the locations table, display street address, city, state/province, postal code, and country id for 
		any location that has a state/province value. Sort the result by country and postal code. 
        */
        select location_id,street_address,city,postal_code,country_id,state_province
        from locations
        where state_province is not null
        order by country_id,postal_code;
        
			
          
-- 17) Show the the last name, job id, department id, and salary of the top 10 highest paid employees.       
select last_name,job_id,salary,department_id
        from employees
        order by salary desc
        LIMIT 10;
        
          