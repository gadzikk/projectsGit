1.DodawanieUzytkownika(adding an user) 

2.ProducerAndConusmer

3.RestaurantWithHistory

4.SafeSingleton(swimming pool)

#RestaurantWithHistory
To test a program we compile it and after displaying user interface we move it in place we can also see the console
Next we write the amount of meals we want to order and click TAKE ORDER button
Tasks for employees are placed in order -  method execute() is launched every time when the meal is ready , each object has its own implementation of execute() method . Employee notifies that meal is ready by EXECUTE button and the task is removed from task list .
It is possible to check the history of ordered meals by SHOWHISTORY button , History of meals is generated manually – on demand , while tasks for employees are automatically updated after every order(observer design pattern implementation) .
At the bottom we can see data about ordered meals
By X button we can remove History and data , this button does not  affect tasks for employees
#DodawanieUzytkownika(adding an user) 
After adding project to eclipse we set configuration database on properities approximate in your computer in file : src//main/webapp//WEB-INF/spring/appServlet/servlet-context.xml , in the place :: bean id="dataSource..."
We lunch the project on the tomcat server and we write an address in Mozilla firefox :: http://localhost:8080/DodawanieUzytkownika/
