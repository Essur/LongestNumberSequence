Для вибору файлів використовується бібліотека JFileChooser, що є частиною стандартної бібліотеки Java (в пакеті javax.swing), тому не потрібно додатково її підключати.
Використання бібліотеки:
```java
JFileChooser fileChooser = new JFileChooser();
int returnValue = fileChooser.showOpenDialog(null);
if (returnValue == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
}
```
