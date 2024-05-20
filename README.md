# JUnit-Testing
JUnit is a widely-used unit testing framework for the Java programming language. It has played a crucial role in the evolution of test-driven development (TDD). 
![JUNIT](https://github.com/Osmi-Bytes/JUnit-Testing/assets/100902550/e8ccdbff-fd56-4d8d-956f-18cf4879b192)

# JUnit 5 Overview
JUnit 5, also known as JUnit Jupiter, is the latest version of the testing framework. Unlike its predecessors, JUnit 5 is composed of several different modules:

JUnit Platform: The foundation for launching testing frameworks on the JVM. It defines the TestEngine API, allowing developers to create custom test engines that run on the platform. The platform also provides a Console Launcher for command-line execution and the JUnit Platform Suite Engine for running custom test suites.
JUnit Jupiter: Combines the programming model and extension model for writing tests and extensions in JUnit 5. It introduces new features and improvements over JUnit 4, making it more powerful and flexible.
JUnit Vintage: Provides backward compatibility by allowing you to run JUnit 3 and JUnit 4 tests on the JUnit 5 platform. It requires JUnit 4.12 or later to be present on the classpath.

# Testing Examples in this repo
# Basic Calculator Tests:
In the file “JUnit Testing 01” we’ve implemented tests for a Calculator class.
These tests likely include methods for addition and subtraction, ensuring the correctness of these operations.
# Triangle Type Checker:
In the file “JUnit Testing 02” we’ve created a class that determines whether a given set of side lengths forms a right-angle, acute-angle, or obtuse-angle triangle.

# Integrating JUnit with Eclipse
To integrate JUnit with Eclipse, follow these steps:

Add JUnit Jar to Your Project:
Download the JUnit JAR files (JUnit 4 or JUnit 5) from the official website.
In Eclipse, right-click your project, select “Build Path,” and choose “Configure Build Path.”
Add the JAR files to your project’s build path.
Create JUnit Test Classes:
Right-click your class or package, choose “New,” and select “JUnit Test Case.”
Follow the wizard to create test classes.
Write and Run Tests:
Write your JUnit tests in the generated test classes.
Run the tests using the JUnit runner in Eclipse.
