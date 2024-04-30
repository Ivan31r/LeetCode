SELECT e.name as "Employee"
FROM employee e
         JOIN employee em ON e.managerId = em.id
WHERE e.salary > em.salary;