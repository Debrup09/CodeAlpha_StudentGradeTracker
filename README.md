# 🎓 Student Grade Tracker
A simple, console-based Java application designed to manage student grades efficiently. This project allows users to input student names and their corresponding grades, and then generates a summary report with key statistics like average, highest, and lowest scores for each student.

## ✨ Features
**👨‍🎓 Add Students:** Easily add new students to the tracker by entering their names.

**📝 Add Grades:** Input multiple grades for each student.

**🧮 Automatic Calculations:** The application automatically calculates:

- Average Score

- Highest Score

- Lowest Score

**📊 Summary Report:** Display a neatly formatted report for all students, showing their grades and calculated statistics.

**💻 Menu-Driven Interface:** A user-friendly, command-line menu for easy navigation.

**✔️ Input Validation:** Basic checks to ensure valid numerical input for grades.

## 📂 Code Structure
The project is organized into three main classes, each with a specific responsibility:

**Student.java:** A model class that represents a single student. It holds the student's name and an ArrayList of their grades. It also contains methods to calculate the average, highest, and lowest grades.

**GradeTracker.java:** This is the core class that handles the application's logic. It manages the list of students, displays the user menu, and processes user input.

**Main.java:** The entry point for the application. Its sole purpose is to create an instance of GradeTracker and start the program.

## 🚀 Getting Started
Follow these instructions to get a copy of the project up and running on your local machine.

## Prerequisites
You will need the Java Development Kit (JDK) installed on your system.

## Installation & Execution
- Clone the repository or download the files. Place all three .java files (Main.java, GradeTracker.java, Student.java) in the same directory.

- Compile the source code. Open a terminal or command prompt, navigate to the project directory, and run:

  -- Bash

  -- javac Main.java GradeTracker.java Student.java
- Run the application. After a successful compilation, execute the following command:

  -- Bash

  -- java Main
- The application menu will then appear in your console.

📋 Example Usage
Here is a sample interaction with the application:

**OUTPUT**

--- Student Grade Tracker Menu ---
1. Add a new student and their grades
2. Display summary report for all students
3. Exit
------------------------------------
Enter your choice: 1
Enter student's name: John Doe
Enter grades for John Doe. Type -1 to finish.
Enter grade: 85
Enter grade: 92.5
Enter grade: 78
Enter grade: -1
Student John Doe and their grades have been added.

--- Student Grade Tracker Menu ---
1. Add a new student and their grades
2. Display summary report for all students
3. Exit
------------------------------------
Enter your choice: 2

--- Grade Summary Report ---
----------------------------
## Student: John Doe
  ### Grades: [85.0, 92.5, 78.0]
  ### Average Grade: 85.17
  ### Highest Grade: 92.50
  ### Lowest Grade:  78.00
----------------------------
## 🗺️ Future Enhancements
**This project serves as a solid foundation. Future improvements could include:
**
- Data Persistence: Save student data to a file (e.g., CSV, JSON) so it's not lost when the application closes.

- Edit/Delete Functionality: Add options to edit student details or remove a student entirely.

- GUI Implementation: Rebuild the application with a graphical user interface using Swing or JavaFX.

- Class-wide Statistics: Calculate and display statistics for the entire class.

## 🤝 Contributing
Contributions, issues, and feature requests are welcome! Feel free to check the issues page.
