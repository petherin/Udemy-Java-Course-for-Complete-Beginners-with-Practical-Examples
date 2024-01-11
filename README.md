# Udemy Java Course for Complete Beginners with Practical Examples
A place to put code while working through this course

## Contents
<!-- `make toc` to generate https://github.com/jonschlinkert/markdown-toc#cli -->

<!-- toc -->

- [JDK vs JRE vs JVM](#jdk-vs-jre-vs-jvm)
  * [JDK](#jdk)
  * [JRE](#jre)
  * [JVM](#jvm)

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


