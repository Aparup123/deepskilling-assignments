CREATE TABLE CUSTOMERS IF NOT EXISTS(
    ID NUMBER PRIMARY KEY,
    NAME VARCHAR2(50),
    AGE NUMBER,
    BALANCE NUMBER(10,2),
    RATE NUMBER(5,2),          
    DUEDATE DATE,             
    ISVIP VARCHAR2(5)              
);

INSERT INTO CUSTOMERS VALUES (1, 'Amit Roy', 65, 12000, 8.5, SYSDATE + 10, NULL),
(2, 'Sneha Das', 45, 8500, 9.0, SYSDATE + 40, NULL),
(3, 'Ravi Kumar', 70, 15000, 7.5, SYSDATE + 5, NULL),
(4, 'Priya Sen', 30, 9500, 10.0, SYSDATE + 15, NULL),
(5, 'Anil Mehta', 62, 11000, 8.2, SYSDATE + 90, NULL),
(6, 'Kiran Rao', 58, 7000, 9.1, SYSDATE + 25, NULL),
(7, 'Mohan Singh', 66, 13000, 7.8, SYSDATE + 3, NULL),
(8, 'Ritika Paul', 40, 4500, 9.7, SYSDATE + 60, NULL),
(9, 'Geeta Iyer', 75, 20000, 6.9, SYSDATE + 20, NULL),
(10, 'Suresh Das', 59, 10000, 8.8, SYSDATE + 27, NULL);
