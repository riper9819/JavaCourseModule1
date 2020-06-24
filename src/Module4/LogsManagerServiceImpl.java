/*
 * Class name: LogManagerServiceImpl
 *
 * @version 1.0
 *
 * 24-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    LogManagerServiceImpl.java is a class that represents a service for
    log file parsing methods.

    Multithreading

    1. Use the file from the previous task - logs.txt.
    2. Create a class that manages logs in this file.
    3. Create a method that finds all the ERROR logs for a specific date and write them into a specific file (name = ERROR  + Date  + .log).
    4. In your main class develop a functionality to create  5 such a files for 5 different days. Launch them in consistent way (one after another).
    5. Repeat the above  task in parallel way. Multi-threading.
    6. Compare the results.
 */

package Module4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

    /**
     * Interface implementation for log management
     * @author  Bohdan Mandych
     * @version 1.0 24 Jun 2020
     */
    public class LogsManagerServiceImpl implements ILogsManagerService {

        /**
         * Method to write to a file specific log by type and date
         * @param date String representation of date
         * @param logError String type that is type of log event (ERROR, WARNING, INFO)
         * @param path String type that contains file path
         * @throws IOException Throws exception if file is invalid
         */
        @Override
        public void writeLogsByDateAndTypeToFile(
                String date,
                String logError,
                Path path) throws IOException {

            //start time mark
            LocalDateTime start = LocalDateTime.now();

            //Declaring and initializing file variable
            FileWriter logFile = new FileWriter(new File("src/Module4/LogFiles",logError +
                    "_" + date + ".log"));

            String lineBuffer; //line for comparison
            int errorBufferCounter = 0; //counter of errors

            //Declaring and initializing bufferedReader
            BufferedReader logsBuffer = Files.newBufferedReader(path, StandardCharsets.UTF_8);

            //Finding all log lines of a specific event
            while ((lineBuffer = logsBuffer.readLine()) != null)    {
                if (lineBuffer.contains(logError) && lineBuffer.contains(date)) {
                    errorBufferCounter++;
                    logFile.write(lineBuffer + System.lineSeparator());
                }
            }
            //Closing file
            logFile.close();

            //finish time mark
            LocalDateTime finish = LocalDateTime.now();

            //Counting execution time
            long bufferTime = ChronoUnit.MILLIS.between(start, finish);

            //Printing counted execution time
            System.out.println("Parsing log file for date " + date+ " took - " + bufferTime + " ms");
            System.out.println(logError + " event lines in log file for date " + date + " - " + errorBufferCounter + "\n");
        }
    }

