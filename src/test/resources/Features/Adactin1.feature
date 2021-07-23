Feature: user searches for hotel
Scenario Outline: verify user is able to search by selecting all fields
Given verify user should login 
When user should enter the "<mailid>" and "<pwd>" and click login button
And select "<location>","<hotels>","<roomType>","<roomNos>","<checkInDate>","<checkOutDate>","<adultRoom>","<childRoom>" click submit
Then verify user is able to navigate to select hotel page

Examples:
|mailid|pwd|location|hotels|roomType|roomNos|checkInDate|checkOutDate|adultRoom|childRoom|
|pauljs777|91JVG0|Paris|Hotel Creek|Double|2 - Two|20/07/2021|21/07/2021|3 - Three|2 - Two|

Scenario Outline: verify user is able to search by selecting all fields
Given verify user should login 
When user should enter the "<mailid>" and "<pwd>" and click login button
And verify if user select the mandatory fields "<location>","<roomNos>","<checkInDate>","<checkOutDate>","<adultRoom>" click submit
Then verify user is able to navigate to select hotel page

Examples:
|mailid|pwd|location|roomNos|checkInDate|checkOutDate|adultRoom|
|pauljs777|91JVG0|Paris|2 - Two|20/07/2021|21/07/2021|3 - Three|

Scenario Outline: verify user is able to search by selecting all fields
Given verify user should login 
When user should enter the "<mailid>" and "<pwd>" and click login button
And verify if user enters mismatching checkin and checkout dates all fields "<location>","<hotels>","<roomType>","<roomNos>","<checkInDate>","<checkOutDate>","<adultRoom>","<childRoom>" click submit
Then verify user is able to navigate to select hotel page

Examples:
|mailid|pwd|location|hotels|roomType|roomNos|checkInDate|checkOutDate|adultRoom|childRoom|
|pauljs777|91JVG0|Paris|Hotel Creek|Double|2 - Two|21/07/2021|20/07/2021|3 - Three|2 - Two|

Scenario Outline: verify user is able to search by selecting all fields
Given verify user should login 
When user should enter the "<mailid>" and "<pwd>" and click login button
And verify if user select "<location>" and click submit
Then verify user is able to navigate to select hotel page

Examples:
|mailid|pwd|location|
|pauljs777|91JVG0|Paris|