# Final Course Task

## Task 1. GLOSSARY - 10 points

1.1. Download a text about Harry Potter.\
1.2. For each distinct word in the text calculate the number of occurrence.\
1.3. Use RegEx.\
1.4. Sort in the DESC mode by the number of occurrence.\
1.5. Find  the first 20 pairs.\
1.6. Find all the proper names.\
1.7.  Count them and arrange in alphabetic order.\
1.8.   First 20 pairs and names write into to a file test.txt\
1.9.  Create a fine header for the file.\
1.10  Use Java  Collections to demonstrate your experience (Map, List)

Show all your skills and experience.  All the tricks will be taken into account.

### Task solution
Class Glossary.java is the main class of the program.\
This class has solutions for all task items.\
It does glossary word filtering, counting of distinct word and name occurrences and performs file operations.\
First 20 pairs of distinct names occurrences are saved to "Harry names occurrence.txt" file.

### Results of comparison.
```
-----First 20 pairs of distinct words occurences-----

Word: "the" occurred: 3311 times
Word: "and" occurred: 1805 times
Word: "of" occurred: 1242 times
Word: "Harry" occurred: 1212 times
Word: "was" occurred: 1178 times
Word: "said" occurred: 793 times
Word: "you" occurred: 734 times
Word: "had" occurred: 697 times
Word: "that" occurred: 579 times
Word: "him" occurred: 494 times
Word: "He" occurred: 493 times
Word: "they" occurred: 433 times
Word: "with" occurred: 403 times
Word: "but" occurred: 373 times
Word: "out" occurred: 359 times
Word: "up" occurred: 358 times
Word: "for" occurred: 347 times
Word: "them" occurred: 324 times
Word: "were" occurred: 304 times
Word: "have" occurred: 288 times

-----First 20 pairs of distinct names occurences-----

Word: "Harry" occurred: 1212 times
Word: "Hagrid" occurred: 336 times
Word: "Hermione" occurred: 257 times
Word: "Professor" occurred: 180 times
Word: "Snape" occurred: 145 times
Word: "Dumbledore" occurred: 139 times
Word: "Dudley" occurred: 115 times
Word: "Malfoy" occurred: 109 times
Word: "Vernon" occurred: 105 times
Word: "Neville" occurred: 102 times
Word: "McGonagall" occurred: 95 times
Word: "Potter" occurred: 92 times
Word: "Quirrell" occurred: 90 times
Word: "Gryffindor" occurred: 81 times
Word: "Hogwarts" occurred: 76 times
Word: "Quidditch" occurred: 58 times
Word: "Petunia" occurred: 57 times
Word: "Dursley" occurred: 52 times
Word: "Slytherin" occurred: 48 times
Word: "Weasley" occurred: 47 times
```

## Task 2. COMPANY Service implementation - 15 points

The following text is a real  approbation task for Java Juniors in the EPAM company. No more explanation.

IMPLEMENT THE FOLLOWING CLASS AND INTERFACE.

<b>Class</b>
```
public class Company {
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;
}
```

<b>Interface</b>
```
public interface ICompanyService {
    /**
     * @param child - company for which we are searching the top level parent
     *                  (parent of parent of ...)
     * @return top level paren
     */
    Company getTopLevelParent(Company child);

    /**
     *
     * @param company  - company for which we are searching the count of employees
     *                 (count of this company employees +
     *                 count employees of all children and their children employees )
     * @param companies  - list of all available companies
     *
     * @return count of employees
     */
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
}

```

### Diagram of armed forces branches
![Screenshot](https://github.com/riper9819/JavaCourseModule1/blob/master/src/FinalCourseTask/Armed_forces_branches_diagram.png)

### Task solution
This program contains 3 classes and 1 interface:
1. Army.java is a main class of task.
2. ArmedForces.java is a class, that contains armed forces branches constructors and methods.
3. MilitaryServiceIMP.java is a class, that implements IMilitaryService interface methods.
4. IMilitaryService.java is an interface, that contains methods for parent and personnel operations.
