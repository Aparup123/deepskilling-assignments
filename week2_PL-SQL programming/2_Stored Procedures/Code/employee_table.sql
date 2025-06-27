CREATE TABLE IF NOT EXISTS EMPLOYEES (
    ID NUMBER PRIMARY KEY,
    NAME VARCHAR2(50),
    DEPT VARCHAR2(30),
    SALARY NUMBER(10,2)
);

INSERT INTO EMPLOYEES VALUES (1, 'Alice', 'HR', 50000),
(2, 'Bob', 'IT', 60000),
(3, 'Charlie', 'Finance', 55000),
(4, 'Diana', 'IT', 65000),
(5, 'Eve', 'HR', 52000),
(6, 'Frank', 'Finance', 58000),
(7, 'Grace', 'IT', 70000),
(8, 'Hank', 'HR', 53000),
(9, 'Ivy', 'Finance', 60000),
(10, 'Jack', 'IT', 72000);