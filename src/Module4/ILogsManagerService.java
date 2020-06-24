/*
 * Class name: LogFileExtractor
 *
 * @version 1.0
 *
 * 24-Jun-2020
 *
 * @author Bohdan Mandych
 *
 * Description:
    ILogsManagerService.java is an interface that needs to be implemented for log file management

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
import java.nio.file.Path;

/**
 * ILogsManagerService interface
 * @author Bohdan Mandych
 * @version 1.0 24 Jun 2020
 */
public interface ILogsManagerService {

    /**
     * Method to write to a txt file log specified by event type and date
     * @param date String representation of date
     * @param logError String type that is type of log event (ERROR, WARNING, INFO)
     * @throws IOException Throws exception if file is invalid
     */

    void writeLogsByDateAndTypeToFile(
            String date,
            String logError,
            Path path) throws IOException;
}