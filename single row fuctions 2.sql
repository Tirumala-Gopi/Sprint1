/* 
Look through Lesson 7b Single-Row Functions Part 2.sql and run the code examples there, then
   practice single-row functions with the excercises below: */
------------------------------------------------------------------------------------------------

use hr_sales;
/* 1) Show the last name, hire date, job id, and salary for any employee that was hired
		in the last four years. Write the query using DATE_ADD(), then rewrite it using DATE_SUB().*/
select last_name,hire_date,job_id,salary
from employees
where hire_date >= date_add('2019-11-16',interval -4 year);

select last_name,hire_date,job_id,salary
from employees
where hire_date >= date_sub('2019-11-16',interval 4 year);

	select max(hire_date) from employees;
	
	

/* 2) How many days have the employees worked here? Display each employee's first_name, last name, 
		hire date, days on the job. Label the column Days_on_the_Job. */
        select first_name,last_name,hire_date,datediff('2019-11-16' ,hire_date) as Days_on_the_job
        from employees;
		
		
       
/* 3) For each consultant display the first_name, last name, salary, and hire date. Show the 
		hire date in the format Monday, 08-05-23, where the first two digits are the day of the month, 
		the next two digits are the month, and the last two digits are the year. Label the column Hire_Date. 
        Order the output by the numeric day of the week starting with Sunday. */
        
        select first_name,last_name,salary,hire_date,date_format(hire_date,'%W, %d-%m-%y') as Hire_Date
        from consultants
        order by dayofweek(hire_date); 
		
		

/* 4) Calculate how many months each employee has been on the job. Display their last name, hire date,
		salary, manager id, and the number of months. Label the column Months_on_the_Job. */
        
         select last_name,hire_date,salary,manager_id, timestampdiff(month,hire_date,curdate())as MONTH_ON_THE_JOB
        from consultants;
		
		select hire_date from consultants;
		

/* 5) For each sale, show the sales id, the sales rep id, and the sales timestamp. In the next column,
		show the date portion of the sales timestamp in a separate column. Label the column Sales_Date.
        Then show the time portion of the sales timestamp. Label the column Sales_Time.
        Lastly, display the sales amount.       */
       
       select sales_id,sales_rep_id,sales_timestamp,date(sales_timestamp) as Sales_date,
										time(sales_timestamp) as Sales_time,sales_amt from sales;
       
	   
        
        
	/* 6) Display the last_name, hire_date, and the number of weeks each employee has worked
      in department 90. Label the column Tenure. Use the DATEDIFF() function.
      Truncate the number of weeks zero places past the decimal. Sort the result in descending 
      order of tenure. */
      
      select last_name,hire_date,department_id, truncate (datediff(curdate(),hire_date)/7,0) as Tenure
      from employees
      where department_id=90
      order by Tenure desc;
      
	  
	  
	  
	  
		
/* 7) Rewrite your answer to question 6 using TIMESTAMPDIFF(). There is no need to use TRUNCATE()
		as TIMESTAMPDIFF() only returns integers.  */
        
        
      select last_name,hire_date,department_id, timestampdiff(week,hire_date,curdate()) as Tenure
      from employees
      where department_id=90
      order by Tenure desc;
		
		
		
		
        
/* 8) Show last name, manager, job, hire date, and the date
        benefits began. Benefits begin on the first day of the month after hire. 
        Label the column Benefits_Start. */ 
        
        select last_name,manager_id,hire_date,job_id, adddate( LAST_DAY(hire_date),1) as Benefits_Start
        from employees;
        
		
		
		

/* 9)	Display any employees who were hired in the third quarter of the year. Show the first and last names, 
			Job id, hire_date, and manager id.  */
            
            select first_name,last_name,job_id,hire_date,manager_id
            from employees
            where quarter(hire_date)=3;
			
			

/* 10)	For each consultant, show the first and last names, salary, manager id, and the manager's last name.
		Using the CASE operator display the manager last name as follows:
		
        If the manager id is:			Display:
        145								Russell
        146								Partners
        147								Errazuriz
        148								Cambrault
        149								Zlotkey
        anything else					Other
        Label the column Manager. */
        
        select first_name,last_name,salary,manager_id,case manager_id when 145 then 'Russell' when 146 then 'partners' when '147' then 'Errazuriz'
when '148' then 'Cambrault' when'149' then 'Zlotkey'  else 'Other' end as Manager_last_name	
from consultants;	
			
	
			
			
			
			