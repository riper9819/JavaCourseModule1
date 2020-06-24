# Module 4
In this module I used BufferedReader instead of strings, since the latter were causing OutOfMemoryError due to low performance of my system.

## Task 1 Files management.

1. Parse the file logs.txt (see the attachment).  Extract to a separate file all the logs.
2. Calculate the total number of logs (lines).
3. Calculate the total number of ERROR logs. Use previous skills - String.split
4. Calculate the total number of ERROR logs. Use Files.lines.
5. Compare two results.

### Task 1 solution
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

## Task 2 Multithreading

1. Use the file from the previous task - logs.txt.
2. Create a class, that manages logs in this file.
3. Create a method that finds all the ERROR logs for a specific date and write them into a specific file (name = ERROR  + Date  + .log).
4. In your main class develop a functionality to create  5 such a files for 5 different days. Launch them in consistent way (one after another).
5. Repeat the above  task in parallel way. Multi-threading.
6. Compare the results.

### Task 2 solution
This program contains 2 classes and 1 interface:
1. Class Main.java is main class of the program.
2. Class LogsManagerServiceImpl.java contains log file parsing methods.
3. ILogsManagerService.java is an interface that needs to be implemented for log file management.

### List of log files
ERROR events
```
ERROR_2019-10
ERROR_2019-11
ERROR_2019-12
ERROR_2020-01
ERROR_2020-02
```
WARN events

```
WARN_2019-10
WARN_2019-11
WARN_2019-12
WARN_2020-01
WARN_2020-02
```

### Results of log file parsing by consistent and multithreading ways.
```
--------------Consistent Log File Parsing------------------

Parsing log file for date 2019-12 took - 3427 ms
ERROR event lines in log file for date 2019-12 - 26

Parsing log file for date 2019-11 took - 1837 ms
ERROR event lines in log file for date 2019-11 - 50

Parsing log file for date 2019-10 took - 1517 ms
ERROR event lines in log file for date 2019-10 - 29

Parsing log file for date 2020-01 took - 1721 ms
ERROR event lines in log file for date 2020-01 - 129

Parsing log file for date 2020-02 took - 1508 ms
ERROR event lines in log file for date 2020-02 - 119

-------------Multithreading Log File Parsing------------------

Parsing log file for date 2020-01 took - 4221 ms
WARN event lines in log file for date 2020-01 - 52980

Parsing log file for date 2019-10 took - 4357 ms
WARN event lines in log file for date 2019-10 - 34778

Parsing log file for date 2019-12 took - 4444 ms
WARN event lines in log file for date 2019-12 - 71011

Parsing log file for date 2019-11 took - 4457 ms
WARN event lines in log file for date 2019-11 - 34911

Parsing log file for date 2020-02 took - 4488 ms
WARN event lines in log file for date 2020-02 - 55235

Parsing log file in consistent way took: 10036 ms
Parsing log file with multithreading took: 0 ms
Multithreading parsing is faster!
```