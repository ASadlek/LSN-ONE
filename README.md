# Implementation for 1st LSN Backend Task

## Goal
The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order, plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.

## Prerequisites
To use this application, you need to have JDK (Java 8+) and Maven installed on your computer.

## Instructions
Follow these commands to run the application for the first time:

```bash
mvn compile
mvn exec:java
```
If the application was compiled at least once, you can run it with just:

```bash
mvn exec:java
```
You should see this message after starting the application:

```
Enter numbers separated by spaces or type 'exit' to quit:
```

Only integer values are allowed as input. (from -2,147,483,648 to 2,147,483,647).

You can try by providing sample input from https://backend-tasks.lsn.io/

In case of any issues, please contact andre.sadlek@gmail.com :)