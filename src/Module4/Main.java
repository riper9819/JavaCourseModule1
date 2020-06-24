/*
 * Class name: Main
 *
 * @version 1.0
 *
 * 24-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    LogFileExtractor.java is a class used for log file parsing

    Multithreading

    1. Use the file from the previous task - logs.txt.
    2. Create a class that manages logs in this file.
    3. Create a method that finds all the ERROR logs for a specific date and write them into a specific file (name = ERROR  + Date  + .log).
    4. In your main class develop a functionality to create  5 such a files for 5 different days. Launch them in consistent way (one after another).
    5. Repeat the above  task in parallel way. Multi-threading.
    6. Compare the results.
 */

package Module4;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

/**
 * LogFileExtractor class
 * @author Bohdan Mandych
 * @version 1.0 24-Jun-2020
 */
public class Main {

    static class LogThread extends Thread {

        private final String date; //date to search
        private Path path; //path of the file

        /**
         * Constructor of thread object
         * @param date String representation of date
         * @param path Path of the file
         */
        LogThread(String date, Path path) {
            this.date = date;
            this.path = path;
        }

        /**
         * Method that is used to search
         * specific events in log file
         */
        @Override
        public void run() {
            LogsManagerServiceImpl logsManager = new LogsManagerServiceImpl();
            try {
                logsManager.writeLogsByDateAndTypeToFile(this.date,
                        "WARN", this.path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException,
            InterruptedException {

        //Implementing log file service
        LogsManagerServiceImpl logsManager = new LogsManagerServiceImpl();

        //Setting path of the file
        Path path = Paths.get("src/Module4/logs.txt");

        //Creating Array of dates to check
        List<String> dates = new ArrayList<>(Arrays.asList(
                "2019-12", "2019-11", "2019-10", "2020-01", "2020-02"));

        System.out.println("--------------Consistent Log File Parsing------------------\n");

        //start time mark
        LocalDateTime consistentStart = LocalDateTime.now();

        //calling method for error log file parsing
        for (String date: dates) {
            logsManager.writeLogsByDateAndTypeToFile(date,
                    "ERROR",  path);
        }

        //finish time mark
        LocalDateTime consistentFinish = LocalDateTime.now();

        //Counting time difference
        long timeConsistent = ChronoUnit.MILLIS.between(consistentStart, consistentFinish);

        System.out.println("-------------Multithreading Log File Parsing------------------\n");

        //start time mark
        LocalDateTime multithreadingStart = LocalDateTime.now();

        //calling method for error log file parsing
        for (String date: dates) {
            new LogThread(date, path).start();
        }

        //finish time mark
        LocalDateTime multithreadingFinish = LocalDateTime.now();

        //Counting execution time
        long timeMultithreading = ChronoUnit.MILLIS.between(multithreadingStart, multithreadingFinish);

        // Make delay to output final message
        TimeUnit.MILLISECONDS.sleep(10000);

        //Printing counted execution time
        System.out.println("Parsing log file in consistent way took: " + timeConsistent + " ms");
        System.out.println("Parsing log file with multithreading took: " + timeMultithreading + " ms");

        //Comparing counted execution time for
        //consistent and multithreading ways of log file parsing
        System.out.println(timeConsistent > timeMultithreading ? "Multithreading parsing is faster!" : "Consistent parsing is faster!");
    }
}