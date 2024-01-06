package java_basics.PrimitiveTypes;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// 1) public class name = name of file
// 2) rule of thumb one class in one file
// 3) public - no access restrictions
// 4) any executable code should be in class
// 5) main - method, void - doesnt return anything, static - allows to call method without creating class object
// 6) args will be arguments of command line
// javac PrimitiveTypes.HelloWorld.java - compile to bytecode with .class, javac - compiler
// java MainClassName - to run .class file, java - virtual machine
// jar archives - like zips but with manifest metafile
// jar cfe  archivename.jar MainClassName file1.class file2.class ...
// jar tf hw.jar - show archive components without unzipping it
// jar xf hw.jar - unzip jar archive
// java -jar hw.jar PrimitiveTypes.HelloWorld - run program from jar archive
// -claspath 1.jar 2.jar - additional used archives


// Javadoc is a tool in Java programming that generates comprehensive HTML documentation from Java source code. It is used to create API documentation in a consistent format that can be easily read and understood by developers. Javadoc comments are specially formatted multi-line comments that begin with /** and end with */, and they can be used to describe classes, methods, fields, and other program elements.