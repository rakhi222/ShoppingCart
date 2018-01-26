  create table Catalog (
    SNo int(10) PRIMARY KEY,
    Product varchar2(40), 
    Price number(100),
    ProductDesc  varchar2(1000));
    
    
    INSERT INTO CATALOG VALUES(1, 'Black Tea', 30, '10 teabag in a pack');
    INSERT INTO CATALOG VALUES(2, 'Green Tea', 40, '10 teabag in a pack');
    INSERT INTO CATALOG VALUES(3, 'Coffee', 50, '10 Coffeebag in a pack');
    INSERT INTO CATALOG VALUES(4, 'Sugar', 20, '1kg pack');
    INSERT INTO CATALOG VALUES(5, 'Salt', 10, '1kg pack');
    INSERT INTO CATALOG VALUES(6, 'oil', 60, '1L pack');