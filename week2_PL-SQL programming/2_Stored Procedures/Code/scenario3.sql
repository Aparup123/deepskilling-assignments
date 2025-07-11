CREATE OR REPLACE PROCEDURE TransferFunds(
    SENDERID IN CUSTOMERS.ID%TYPE, 
    RECIEVERID IN CUSTOMERS.ID%TYPE, 
    AMOUNT IN CUSTOMERS.BALANCE%TYPE
)
IS
SENDER CUSTOMERS.NAME%TYPE;
RECIEVER CUSTOMERS.NAME%TYPE;
SENDER_BALANCE CUSTOMERS.BALANCE%TYPE;
BEGIN
    SELECT NAME, BALANCE INTO SENDER, SENDER_BALANCE FROM CUSTOMERS WHERE ID=SENDERID;
    SELECT NAME INTO RECIEVER FROM CUSTOMERS WHERE ID=RECIEVERID;
    IF SENDER_BALANCE>=AMOUNT THEN
        UPDATE CUSTOMERS SET BALANCE=BALANCE-AMOUNT WHERE ID=SENDERID;
        UPDATE CUSTOMERS SET BALANCE=BALANCE+AMOUNT WHERE ID=RECIEVERID;
        DBMS_OUTPUT.PUT_LINE('AMOUNT ' || AMOUNT || ' IS SUCCESSFULLY TRANSFERRED FROM ' || SENDER || ' TO ' || RECIEVER);
    ELSE
        DBMS_OUTPUT.PUT_LINE('SENDER DOES NOT HAVE SUFFICIENT MONEY TO TRANSFER.');
    END IF;
END;

BEGIN
    TransferFunds(2, 7, 500);
END;