[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19237880)
# unit-7-2-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Problem 1
Write a Java program that allows a user to input multiple words. Your program should stop accepting words when the user enters "STOP". Store the words in an `ArrayList`. The word STOP should not be stored in the list.

Next, print the `ArrayList`, then print all the strings from this list in the reverse order to which they appear in the list, with each one on a new line, while adding the strings from the array in sequential order starting from the beginning.

Sample Run:
```
Please enter words, enter STOP to stop the loop.
winter
fall
spring
summer
STOP

[winter,fall,spring,summer]
summerwinter
springfall
fallspring
wintersummer     
```

Hint: printing the entire ArrayList needs only one statement, however to print each String from the list individually on a new line starting from the last value, you will need to write a loop which starts at the end of the list and works backwards through it.

## Problem 2
Write a public static method named `highestNum` which takes an ArrayList of `Integer` objects, and returns the highest value in this list. Make sure to take into account negative numbers.

Note: when you write your method header, and specify the type of the parameter as an ArrayList, make sure you include the data type your ArrayList will contain in angle brackets (<>).

Hint: If you assume perfect data, then set the minimum to the first element of your `ArrayList`.  If you'd like to be super defensive about your programming, then set the minimum to `Integer.MIN_VALUE`.

## Problem 3
Write the `getEvens` method so it takes in a single `ArrayList` as parameter, and returns a new `ArrayList` of `Integers` containing all even `Integers` from the input `ArrayList` in the order they originally appeared. The contents of the input should not change.

For example, if an `ArrayList` containing the `Integers` 1,2,4,5,7 in that order is passed as a parameter to `getEvens`, it should return an `ArrayList` containing the `Integers` 2,4 in that order.
