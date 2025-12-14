

/* 1) Determine the structure of the departments table. */

describe departments;

      

/* 2) Determine the structure of the employees table. */
   describe employees;   
  
/* 3) Write a query that displays the employee id, last name, job id, and hire date
      for each employee. Provide a column alias Startdate for the hire date. */
      
SELECT employee_id,job_id,hire_date AS StartDate
	FROM employees;
    
-- 4) Display all unique job ids in the employees table.
SELECT distinct job_id
		FROM employees;

   
      
/* 5) Display employee number, last name, salary, and salary with a $100 bonus multiplied by 12. 
	  Label the last column yearly_compensation. */
 SELECT employee_id,last_name,salary, (salary+100)*12 AS yearly_compensation
	FROM employees;