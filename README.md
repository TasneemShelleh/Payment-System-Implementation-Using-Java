# Payment-System-Implementation-Using-Java-main

A Java-based payment system that demonstrates object-oriented programming concepts such as inheritance, abstraction, interfaces, polymorphism, and sorting using `Comparable`.

The project simulates different customer payment methods, including cash, checks, and credit cards. Each payment type has its own calculation and authorization rules.

## Project Overview

This project implements a simple payment processing system using Java. The system stores different customer payments in an `ArrayList`, checks whether certain payments are authorized, calculates the final payment amount, sorts payments in descending order based on their calculated payment value, and prints the payment information.

The project includes three main payment types:

* Cash payment
* Check payment
* Credit card payment

## Repository Structure

```text
Payment-System-Implementation-Using-Java-main/
│
├── CustomerPayment.java   # Abstract parent class for all payment types
├── Cash.java              # Cash payment class
├── Check.java             # Check payment class
├── CreditCard.java        # Credit card payment class
├── Payable.java           # Interface for authorization
├── Driver.java            # Main class used to test the system
└── README.md              # Project documentation
```

## Main Classes

## 1. CustomerPayment.java

`CustomerPayment` is an abstract class that represents the common information shared by all payment types.

It contains:

* Customer name
* Customer ID
* Payment amount
* Abstract method `calculatePayment()`
* Method `printPaymentInfo()`
* `compareTo()` method for sorting payments

The class implements `Comparable<CustomerPayment>` so that payment objects can be sorted in descending order based on the calculated payment amount.

## 2. Cash.java

`Cash` extends `CustomerPayment`.

This class represents cash payments and includes a discount rate.

The final payment is calculated as:

```text
payment = amount - (discountRate × amount / 100)
```

Example:

```text
amount = 150
discountRate = 5%

payment = 142.5
```

## 3. Check.java

`Check` extends `CustomerPayment` and implements the `Payable` interface.

This class represents check payments and includes:

* Account number
* Account balance
* Check type

The supported check types are:

```java
public static final int CASHIER = 1;
public static final int CERTIFIED = 2;
public static final int PERSONAL = 3;
```

A check is authorized if:

* The check type is `CASHIER`, or
* The payment amount is less than or equal to the account balance

For certified and personal checks, the payment amount is deducted from the account balance.

## 4. CreditCard.java

`CreditCard` extends `CustomerPayment` and implements the `Payable` interface.

This class represents credit card payments and includes:

* Charging fee
* Expiry date

The final payment is calculated as:

```text
payment = amount + chargingFee
```

A credit card payment is authorized if the expiry date is greater than or equal to the current date.

## 5. Payable.java

`Payable` is an interface that contains the method:

```java
boolean isAuthorized();
```

This interface is implemented by payment types that require authorization, such as:

* Check
* Credit card

## 6. Driver.java

`Driver` is the main class of the project.

It performs the following steps:

1. Creates an `ArrayList` of `CustomerPayment` objects
2. Creates different payment objects
3. Checks authorization for checks and credit cards
4. Adds authorized payments to the list
5. Sorts the payments in descending order
6. Prints the payment information

## Features

* Uses abstract classes
* Uses interfaces
* Uses inheritance
* Uses polymorphism
* Uses method overriding
* Uses encapsulation with getters and setters
* Uses `ArrayList`
* Uses `Collections.sort()`
* Sorts payments using `Comparable`
* Handles different payment calculation rules
* Handles authorization for checks and credit cards

## How the System Works

```text
Create Payment Objects
        ↓
Check Authorization
        ↓
Add Authorized Payments to ArrayList
        ↓
Sort Payments by Calculated Payment
        ↓
Print Payment Information
```

## Example Payment Objects

The `Driver` class creates sample payments such as:

```java
CustomerPayment check1 = new Check("Rana", 7777, 400, 1111, 350, Check.PERSONAL);
CustomerPayment cash = new Cash("Ahmad", 4444, 150, 5.0);
CustomerPayment check2 = new Check("Suha", 5555, 100, 1111, 200, Check.CASHIER);
CustomerPayment check3 = new Check("Rania", 7777, 600.0, 1111, 750, Check.CERTIFIED);
CustomerPayment creditCard1 = new CreditCard("Randa", 9999, 170, 20, new Date(124, 05, 03));
CustomerPayment creditCard2 = new CreditCard("Hani", 6666, 150, 10, new Date(120, 06, 07));
```

Only authorized payments are added to the payment list.

## Sorting

Payments are sorted in descending order based on the result of `calculatePayment()`.

For example, a payment with a calculated value of `600` appears before a payment with a calculated value of `190`.

The sorting is done using:

```java
Collections.sort(payments);
```

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Payment-System-Implementation-Using-Java-main.git
```

### 2. Open the Project Folder

```bash
cd Payment-System-Implementation-Using-Java-main
```

### 3. Compile the Java Files

Because the files use the package name `finalProject`, place the `.java` files inside a folder named `finalProject`.

Your structure should look like this:

```text
Payment-System-Implementation-Using-Java-main/
└── finalProject/
    ├── CustomerPayment.java
    ├── Cash.java
    ├── Check.java
    ├── CreditCard.java
    ├── Payable.java
    └── Driver.java
```

Then compile:

```bash
javac finalProject/*.java
```

### 4. Run the Program

```bash
java finalProject.Driver
```

## Alternative Run Method in an IDE

You can also run the project using an IDE such as:

* Eclipse
* IntelliJ IDEA
* NetBeans
* VS Code

Steps:

1. Create a Java project
2. Create a package named `finalProject`
3. Add all `.java` files inside the package
4. Run `Driver.java`

## Requirements

* Java JDK installed
* Java compiler, such as `javac`
* Any Java IDE or terminal

## Technologies Used

* Java
* Object-Oriented Programming
* Abstract Classes
* Interfaces
* Collections Framework
* ArrayList
* Comparable
* Date class

## Learning Outcomes

This project demonstrates:

* How to design a class hierarchy using inheritance
* How to use abstract classes in Java
* How to implement interfaces
* How to override methods
* How to use polymorphism with parent-class references
* How to sort objects using `Comparable`
* How to separate authorization logic from payment calculation logic
* How to use Java collections to manage objects

## Author

Tasneem Shelleh

