Yara Tarek Fathy Hamed Mohamed      ID:6445
Nour Mohamed Gaber Mohamed ElSayed  ID:6392



When the program first starts a login screen will appear for the user to enter his username and password, if he entered wrong credentials an error message will appear warning him and he will be given the chance to enter his username and password again.
If he entered a correct username and password a screen will appear based on the user's role.
The project contains 2 xml files:
1.data.xml:
This file is the original file in the pdf but we added a boolean <reserved></reserved> field to the list of tables to allow the user to choose his dishes only if a the table he wants to reserve is available for reservation.
2.Orders.xml:
This file contains the reservations for the day including the customer name, the number of table he reserved , the customer's orders with the quantity of each ordered dish and the order bill after adding taxes.

If the user enters the username and password for the manager,the user will be able to view the manager's screen.In the manager's screen the user will be able to choose from the buttons. These buttons will view the staff(cookers and waiters),the reservations which includes the order's details,the avalaible and reserved tables. The statistics are viewed in form of pie charts. These pie charts are calculated according to the customer's orders and reservations.Also, the manager will be able to view the total money earned with and without taxes.

If the user enters the username and password for the waiter,the user will be able to view the customer's name and the table the customer reserved.

If the user enters the username and password for the customer, the user will be able to make a reservation and to choose a smoking or a non smoking table and the number of seats.If the user's choices are available, the user will be allowed to make his order from the predefined menu.


If the user enters the username and password for the cooker, the user will be able to view the order according to their priority (where order number 1 is the first order placed )and the number of the table ordering it.


Note:Please find attached jfree library added for the pie charts included.



Division of labor:
We both worked on the classes that load from the file (the files in the xml package) and we both worked on the classes of inheritance from the User (in the Major package).
For the screens:
The Client and Cooker screens were implemented by Yara and the Manager and Waiter screens were implemented by Nour.
Note : Please add a copy of Orders.xml inside the dist folder to run the jar.


  


