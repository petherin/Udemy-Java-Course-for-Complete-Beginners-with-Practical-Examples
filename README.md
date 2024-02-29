# Udemy Java Course for Complete Beginners with Practical Examples
A place to put code while working through this course

## Contents
<!-- `make toc` to generate https://github.com/jonschlinkert/markdown-toc#cli -->

<!-- toc -->

- [JDK vs JRE vs JVM](#jdk-vs-jre-vs-jvm)
  * [JDK](#jdk)
  * [JRE](#jre)
  * [JVM](#jvm)
- [Checked and Unchecked Exceptions](#checked-and-unchecked-exceptions)
- [Exception Bad Practices to Avoid](#exception-bad-practices-to-avoid)
  * [Don't Catch and Ignore Exceptions](#dont-catch-and-ignore-exceptions)
  * [Pass On Exceptions](#pass-on-exceptions)
  * [Finally is For Closing Resources](#finally-is-for-closing-resources)
  * [Exceptions Are for Errors Only](#exceptions-are-for-errors-only)

<!-- tocstop -->

## JDK vs JRE vs JVM

* JDK
  * software development environment used for developing Java applications. It contains JRE and JVM
* JRE
  * provides a platform to execute Java programs. It executes Java byte code which is created by Java compiler in the JDK
* JVM
  * converts byte code created by the compiler into machine-specific code. Executes compiled code

### JDK
Java Development Kits are specific to platforms, so there's Windows, MacOS and Linux versions.

![jdk_contents.png](assets%2Fjdk_contents.png)

Here's how you get from a Java class to a running program.

![java_compile_and_run_process.png](assets%2Fjava_compile_and_run_process.png)

Java source code files have the `.java` extension.

Compiled byte code files have the `.class` extension and look like gobbledygook if viewed in a text editor. IntelliJ decompiles `.class` files so you can read them.
### JRE

The Java Runtime Environment can run a Java program. Takes your Java code, combines it with necessary libraries, and starts the JVM to execute it.

![jre_contents.png](assets%2Fjre_contents.png)

### JVM
There are Java Virtual Machines for each operating system,

Translates bytecode into native machine code.

JDK and JRE have the JVM.

## Checked and Unchecked Exceptions
Checked exceptions must either be inside a try-catch block or  declared in the method signature using the `throws` clause.

Unchecked exceptions do not.

A checked exception, including custom ones you create yourself, always `extends Exception`.

An unchecked exception, including custom ones you create yourself, always `extends RuntimeException`.

For custom exceptions it's good practice to extend `Exception` to make it checked and force it to be handled.

## Exception Bad Practices to Avoid
### Don't Catch and Ignore Exceptions
Don't catch exceptions and do nothing with them. The code won't crash but you won't know that an exception occurred.

```java
private static void getPlayerScore() {
    try {
        throw new IOException();
    } catch (IOException e) {
    }
}
```

### Pass On Exceptions
In a catch block you can throw a new exception, but you should include the original exception or it will be lost.

For example, this code does not pass the original `IOException` to the thrown `IllegalStateException`.

```java
try {
    throw new IOException();
} catch (IOException e) {
    throw new IllegalStateException();
}
```

Instead do this:

```java
try {
    throw new IOException();
} catch (IOException e) {
    throw new IllegalStateException(e);
}
```

### Finally is For Closing Resources
`finally` blocks are for closing files, database connection and any other resources. Do not return values or throw fresh exceptions, ie don't do this.

```java
finally {
    throw new NullPointerException;
    return 3;
}
```

### Exceptions Are for Errors Only
Exceptions are for error handling, not another form of `if` or `switch` statement.

Don't use the `throw` keyword to jump to the piece of code you'd like to execute.

So don't do this:

```java
 try {
    if (somethingHappened) {
        throw new IOException();
    } else if (somethingElseHappened) {
        throw new IllegalAccessException();
    } else if (somethingElseHappenedAgain) {
        throw new IllegalCallerException();
    }
}
```