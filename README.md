# Locker Problem (Java)

This is a simple Java program for the classic locker problem.

In this problem, lockers are opened and closed in several rounds. At the end, only lockers with perfect square numbers remain open.

## How it works

- The program takes one number as input
- This number represents the total number of lockers
- It prints the locker numbers that remain open
- Open lockers are perfect square numbers such as 1, 4, 9, 16, 25

## Example

Input:
20

Output:
1 4 9 16

## Why perfect squares?

Most locker numbers are changed an even number of times, so they end up closed.

Perfect square numbers have an odd number of divisors. Because of this, they are changed an odd number of times and remain open.

For example:

16 has the divisors 1, 2, 4, 8, 16.

So locker 16 is changed 5 times and remains open.

## How to run

Compile and run the program:

javac LockerProblem.java  
java LockerProblem

## What I practiced

- basic Java syntax
- loops and conditions
- mathematical reasoning
- algorithmic thinking

## Note

This project was written as part of my Java practice while learning basic algorithms.