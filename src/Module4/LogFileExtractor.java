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
    LogFileExtractor.java is a class used for log file parsing

    IMPLEMENT THE FOLLOWING INTERFACE.

    public class Company
    public interface ICompanyService
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
 */

package Module4;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;

public class LogFileExtractor {
    public static void main(String[] args) throws IOException {
        //----------------------Parsing log file with BufferedReader----------------------
        System.out.println("---------Parsing log file with BufferedReader---------");
        //Start time mark
        LocalDateTime start = LocalDateTime.now();
        //Reading file with BufferedReader
        BufferedReader br = Files.newBufferedReader(Paths.get("src/Module4/logs.txt"), StandardCharsets.UTF_8);
        String errorLine = ""; //line with errors
        String lineBuffer; //line for comparison
        int linesCounter = 0; //counter of all log lines
        int errorBufferCounter = 0; //counter of errors

        //Finding all log lines and error lines
        while ((lineBuffer = br.readLine()) != null)    {
            if (lineBuffer.matches(".*\\b(INFO|ERROR|WARN)\\b.*")) {
                linesCounter++;
            }

            if (lineBuffer.contains("ERROR")) {
                errorBufferCounter++;
                errorLine += lineBuffer + System.lineSeparator();
            }

        }

        //Printing counted lines and error lines
        System.out.println("Log lines: " + linesCounter);
        System.out.println("Error log lines: " + errorBufferCounter);

        //Finish time mark
        LocalDateTime finish = LocalDateTime.now();

        //Counting time difference
        long bufferTime = ChronoUnit.MILLIS.between(start, finish);

        //Printing counted execution time
        System.out.println("Parsing log file with BufferedReader took " + bufferTime + " ms");

        //----------------------Parsing log file with stream----------------------
        System.out.println("\n---------Parsing log file with stream---------");

        //Start time mark
        start = LocalDateTime.now();

        //Reading file and counting error lines
        final long errorFilterCounter = Files.lines(Paths.get("src/Module4/logs.txt"))
                .filter(lineStream -> lineStream.contains("ERROR"))
                .count();

        //Printing counted error lines
        System.out.println("Error log lines: " + errorFilterCounter);

        //Finish time mark
        finish = LocalDateTime.now();

        //Counting time execution
        long filterTime = ChronoUnit.MILLIS.between(start, finish);

        //Printing counted execution time
        System.out.println("Parsing log file with stream filtering took " + filterTime + " ms");

        //Comparing execution time of BufferedReader and Stream method
        System.out.println((bufferTime - filterTime) > 0 ? "\nParsing log file with stream filtering was faster!" : "\nParsing log file with BufferedReader was faster!");

        //Writing error lines to new file
        Files.write(Paths.get("src/Module4/logsNew.txt"), errorLine.getBytes());
    }
}