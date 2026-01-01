# TD1 Java

This repository contains the TD1 Java exercises.  
Each exercise includes a problem description, solution explanation, and execution screenshots.

---

## Exercise 1 – Grades Management
**Problem:**  
Store student grades in an array and allow sorting, average calculation, min/max display, and counting a specific grade.

**Solution:**  
- Used a `double[]` array to store grades.  
- Used `Arrays.sort()` to sort grades.  
- Calculated average, minimum, and maximum using loops.  
- Counted occurrences of a specific grade entered by the user.

**Execution screenshot:**  
![Exercise 1](screenshots/ex1.png)

---

## Exercise 2 – French Verb Conjugation
**Problem:**  
Read a French first-group verb and display its conjugation in the present tense.

**Solution:**  
- Checked that the verb ends with `"er"`.  
- Extracted the verb root using `substring()`.  
- Handled special cases (`-ger`, `-cer`, `-eler`, `-eter`).  

**Execution screenshot:**  
![Exercise 2](screenshots/ex2.png)

---

## Exercise 3 – String Operations Menu
**Problem:**  
Menu-based program to enter a string, display it, reverse it, and count words.

**Solution:**  
- Used a `while` loop to display the menu.  
- Stored the string in a variable.  
- Used `StringBuilder` to reverse the string.  
- Used `split("\\s+")` to count words.

**Execution screenshot:**  
![Exercise 3](screenshots/ex3.png)

---

## Exercise 4 – Letter Occurrence Counter
**Problem:**  
Count occurrences of each letter in a string ignoring case.

**Solution:**  
- Converted the string to uppercase.  
- Used an `int[26]` array to store occurrences.  
- Displayed only letters that appear at least once.

**Execution screenshot:**  
![Exercise 4](screenshots/ex4.png)
