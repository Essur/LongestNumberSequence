# Longest number sequence finder

This is a Java application designed to find the longest sequence (puzzle) of numbers within a given input. It uses various algorithms to process the numbers and return the optimal solution for the given puzzle.

## Features

- Find the longest sequence of numbers in the input data.
- User-friendly interface for file selection.
- Uses `JFileChooser` for easy file selection.

## Libraries Used

- **JFileChooser**: Part of the Java standard library (`javax.swing`), this component is used to allow the user to select input files easily.
```java
JFileChooser fileChooser = new JFileChooser();
int returnValue = fileChooser.showOpenDialog(null);
if (returnValue == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
}
```

## How to Use

1. Clone this repository to your local machine:
 ```bash
git clone https://github.com/Essur/LongestNumberSequence
 ```
2. Move to project dir:
```bash
cd LongestNumberSequence
```
3. Write command to maven wrapper:
Linux:
```bash
chmod +x mvnw
```
```bash
./mvnw clean package
```
Windows:
Command prompt:
```bash
mvnw.cmd clean package
```
PowerShell:
```bash
.\mvnw.cmd clean package
```
