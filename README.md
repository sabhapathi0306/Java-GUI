# VaccineBooking-Java-GUI

GUI for booking slots for vaccination and the data of the user will be saved to database and the saved data can be retreived from other GUI portal 
to see the user registered details and once vaccination done with that portal only data updated to another database. User and vaccinated user data is
easly seperated and saved in different database.User easly can register for vaccination no need to wait infront of vaccination centers for booking
once user register unique refrenece number will be generated and it is shared with user,with help refrence number doctor can retrive the data and can move
according to it.

GUI is created with Java-swings:Building Graphical User Interface in Java requires the use of Swings. Swing Framework contain a large set of components which 
allow high level of customization and provide rich functionalities, and is used to create window based applications.Java swing components are lightweight, 
platform independent, provide powerful components like tables, scroll panels, buttons, list, color chooser, etc.

user GUI:
![pic1](https://user-images.githubusercontent.com/70704151/122743862-0cbbc080-d2a5-11eb-9666-b7034f4bffb3.PNG)

Doctor portal GUI:
![pic10](https://user-images.githubusercontent.com/70704151/122747539-ccf6d800-d2a8-11eb-875c-94432f1b9445.PNG)

# procedure to run code
* first create the database in desire server
* change database name and password in code 
* once database is ready run the VaccineBooking.java code
* same procedure with doctor.java code
* to see the user details copy the refrence number(Ref_number) paste it in doctor GUI.

# Error measages :
1. if aadhar number is not equal to 12 it popup error msg window even same with mobile number
2. empty box error
3. data formate error
4. if aadhar number already exits in database it popup error message window
5. aadhar and mobile validation not yet done

Any comments and changes are welocme 
Thank you.....
