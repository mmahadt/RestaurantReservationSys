# RestaurantReservationSys

A simple restaurant reservation system for a medium-sized suburban restaurant.

<h2>Introduction</h2>
In this task we have to design and implement a restaurant reservation system for a medium sized restaurant.
Following are the requirements specifications:
The restaurant has the following tables available:
1.	1 extra-large table with max capacity of 12 people.
2.	3 large tables with max capacity of 6 people.
3.	8 medium tables with max capacity of 4 people.
4.	4 small tables with max capacity of 2 people.

<h2>Assumption:</h2> 
I researched on the internet and found out that 90 minutes timeslot is just fine for one reservation.

So, I take this assumption and customers are advised to eat within this timeframe. Also, the menu is available along with the reservation system. So customers decide the menu before coming to the restaurant and as soon as they arrive they order their meals. So that cook time of 30 minutes start as soon as they reach there. And they get maximum time to enjoy their meals i.e. 60 minutes.
Assuming 90 minutes time slots, in one day, we have,
11 am – 10 pm which is 11 hours 
11 hours / 1.5 hours = 7.33 approximately equals, 7 time slots per table (excluding the extra-large table) per day.	

<h2>Approach</h2>

I used object oriented approach to break down the system into set of objects.

<h2>Design</h2>
There are separate classes for each type of table i.e. SmallTable, MediumTable and LargeTable etc.
Table is an interface and all tables implement this interface.

<h2>How to Run</h2>
It is a simple command line tool. In order to run it, open the code in netbeans. To run tests use Alt+F6. To run the code, click the run button of IDE.

<h2>Analysis</h2>
This approach does not use data structures such as hashmap and tables.

