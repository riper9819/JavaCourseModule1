# Module 3

## Task 1 Files management.

1. Parse the file logs.txt (see the attachment).  Extract to a separate file all the logs.
2. Calculate the total number of logs (lines).
3. Calculate the total number of ERROR logs. Use previous skills - String.split
4. Calculate the total number of ERROR logs. Use Files.lines.
5. Compare two results.

### Task solution
Class LogFileExtractor.java performs log file event lines extraction and analyzing.\
On each step there is an execution time measurement.

### Results of log file parsing and execution time comparison.
```
---------Parsing log file with BufferedReader---------
Log lines: 2494699
Error log lines: 361
Parsing log file with BufferedReader took 14122 ms

---------Parsing log file with stream---------
Error log lines: 361
Parsing log file with stream filtering took 2087 ms

Parsing log file with stream filtering was faster!
```

## Laboratory work 2

Laboratory work 2. Object-oriented programming. JavaCollectionFramework.\
Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.\
Six methods must be written like in the following example. A point for each one.

Subject: Cafe - standard lunch and ordering.

### Laboratory work solution
This program contains 4 classes:
1. Class Cafe.java is main class of the program.
2. Class Customer.java contains Customer object constructor and customer methods.
3. Class Meal.java contains Meal object constructor and meal methods.
4. Class IMeal contains Meal object methods.
