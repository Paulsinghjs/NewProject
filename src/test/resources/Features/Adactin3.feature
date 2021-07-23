Feature: Verify Login Functionality
Scenario Outline: verify user could enter with valid credentials
Given user should enter the login page
When user should enter the "<mailid>" and "<pwd>" and click login button
And select "<location>","<hotels>","<roomType>","<roomNos>","<checkInDate>","<checkOutDate>","<adultRoom>","<childRoom>" and click submit
And select the hotel and click confirm
And enter the "<firstName>","<lastName>","<address>","<ccNum>","<ccType>","<ccMonth>","<ccYear>","<cvv>" and click book now
And verify if user is able to cancel the order
Then verify user gets order cancel message

Examples:
|mailid|pwd|location|hotels|roomType|roomNos|checkInDate|checkOutDate|adultRoom|childRoom|firstName|lastName|address|ccNum|ccType|ccMonth|ccYear|cvv|
|pauljs777|91JVG0|Paris|Hotel Creek|Double|2 - Two|20/07/2021|21/07/2021|3 - Three|2 - Two|paul|js|abcd,sydney|1458896514587765|VISA|February|2014|234|

Scenario Outline: verify user could enter with valid credentials
Given user should enter the login page and enter "<username>" and "<pwd>" and login
When verify if user could enter the booked "<orderid>" and is able to cancel the order
Then verify user gets order cancel message

Examples:
|username|pwd|orderid|
|pauljs777|91JVG0|MZ31SN61X4|
 


