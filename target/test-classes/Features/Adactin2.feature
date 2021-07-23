Feature: Verify Login Functionality
Scenario Outline: verify user could enter with valid credentials
Given user should enter the login page
When user should enter the "<mailid>" and "<pwd>" and click login button
And select "<location>","<hotels>","<roomType>","<roomNos>","<checkInDate>","<checkOutDate>","<adultRoom>","<childRoom>" and click submit
And select the hotel and click confirm
And enter the "<firstName>","<lastName>","<address>","<ccNum>","<ccType>","<ccMonth>","<ccYear>","<cvv>" and click book now
Then print the orderId 

Examples:
|mailid|pwd|location|hotels|roomType|roomNos|checkInDate|checkOutDate|adultRoom|childRoom|firstName|lastName|address|ccNum|ccType|ccMonth|ccYear|cvv|
|pauljs777|91JVG0|Paris|Hotel Creek|Double|2 - Two|20/07/2021|21/07/2021|3 - Three|2 - Two|paul|js|abcd,sydney|1458896514587765|VISA|February|2014|234|

Scenario Outline: verify user could enter with valid credentials
Given user should enter the login page
When user should enter the "<mailid>" and "<pwd>" and click login button
And select "<location>","<hotels>","<roomType>","<roomNos>","<checkInDate>","<checkOutDate>","<adultRoom>","<childRoom>" and click submit
And select the hotel and click confirm
Then verify what happens when user clicks book now without entering the credentials and verify the error msg
 

Examples:
|mailid|pwd|location|hotels|roomType|roomNos|checkInDate|checkOutDate|adultRoom|childRoom|
|pauljs777|91JVG0|Paris|Hotel Creek|Double|2 - Two|20/07/2021|21/07/2021|3 - Three|2 - Two|

