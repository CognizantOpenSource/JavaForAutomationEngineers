# JavaForAutomationEngineers
Training content for the "Java for automation engineers" course

## How it works
- Join the training quest in Game of Pods.
- Watch the associated training videos.
- Fork this repository (https://github.com/CognizantOpenSource/JavaForAutomationEngineers) to your own github to begin working.
- Do homework 1-5, check off the completed tasks and answer the questions in your forked repository. *Remember to push your work to your GitHub repository.
- Give your quest lead access and/or a link to your repository.
- Get training credit.


# Session Homework
[Homework 1](#Homework_1)  
[Homework 2](#Homework_2)  
[Homework 3](#Homework_3)  
[Homework 4](#Homework_4)  
[Homework 5](#Homework_5)  

---
# Homework_1
This is the first homework for the Java for Automation Engineers Class

## Summary
This is a calculator class allowing for basic arithmetic. 

## Homework 1 checklist:
Calculator.java  
- [ ] Finish the subtract method  
- [ ] Fix the bug in the multiply method  
- [ ] Run the main method to see what happens  
- [ ] Run the TestNG tests and make sure they all pass  

CalculatorTest.java    
- [ ] Uncomment the marked lines of code  
- [ ] Run all Tests  
  
SHORT ANSWERS  
- [ ] Comment below what the difference between TestNG and the main method is:  
// ***ANSWER HERE***

---
# Homework_2
This is the second homework for the Java for Automation Engineers Class

## Summary
This is a Shapes project using multiple types of shapes.

## Homework 2 checklist:
    
Square.java  
- [ ] Correct the setSide method  
- [ ] Fix the main method  

Rectangle.java  
- [ ] Update both the set method for rectangle like you did for square  
- [ ] Write the setters for the Rectangle Class  
- [ ] Write methods for the Rectangle Class  

EquilateralTriangle.java  
- [ ] Write the Triangle Class  

SquareTest, RectangleTest and EquilateralTriangleTest  
- [ ] Uncomment all marked code  
- [ ] Run all Tests  
---
# Homework_3
This is the third homework for the Java for Automation Engineers Class

## Summary
This is a Shape Factory project using inheritance.

### Homework 3 checklist: 
BaseShape.java  
- [ ] Create a valid and logical constructor  
- [ ] Create all logical 'Setter' methods and have each method's 'scope' correct  

Rectangle.java  
- [ ] Update this class to inherit from BaseShape.java  
- [ ] Update to a valid and logical constructor  
- [ ] Add a static main method  

EquilateralTriangle.java  
- [ ] Update this class to inherit from BaseShape.java  
- [ ] Update to a valid and logical constructor  
- [ ] Override the area method  
- [ ] Override the perimeter method  
- [ ] Add a static main method  

SquareTest.java, Rectangle.java and EquilateralTriangleTest.java  
- [ ] Uncomment any code, now that the shape classes are complete  
- [ ] Run all tests  

ShapeFactory.java  
- [ ] Uncomment any marked code in both CreateShape methods  

ShapeTests.java  
- [ ] Run all tests   

SHORT ANSWERS  
*Answer each question, and note many don't have a 'right answer' so just answer honestly*  

[ ] What is the purpose of a constructor  
    // ***ANSWER HERE***    

[ ] This project uses 'inheritance' for each shape, since they all have 'BaseShape' as their parent.  
    In your own words define what you believe 'inheritance' means.  
    // ***ANSWER HERE***    

[ ] Research the concept of 'Object Oriented Programming (OOP)', and write down the 4 principles of 'OOP'.  
    ***ANSWER HERE***    
        1)  
        2)  
        3)  
        4)  

[ ] What are some advantages of 'inheritance'  
    // ***ANSWER HERE***    

[ ] In the ShapeFactory.java class, there are two methods both called CreateShape.  
    One method takes in 3 parameters - Shape Name, length and height  
    One method takes in 2 parameters - Shape Name and length  

[ ] This concept is called 'polymorphism', research 'polymorphism' and write below why Factory used 'polymorphism'  
    // ***ANSWER HERE***    
  
[ ] Does this project ever cover the concept of 'Abstraction'? If yes, how so?  
    // ***ANSWER HERE***    

[ ] Does this project ever cover the concept of 'Encapsulation'? If yes, how so?  
    // ***ANSWER HERE***    

[ ] Why did you need to 'override' the 'area' and 'perimeter' methods in 'EquilateralTriangle.java' but not the  
    'Square.java' and 'Rectangle.java'?  
    // ***ANSWER HERE***    

[ ] We made 'ShapeTests' differently than we did 'SquareTest', 'RectangleTest' and 'EquilateralTriangleTest'. A unit test is testing a single unit and generally that means by classes in java. 'SquareTest', 'RectangleTest' and 'EquilateralTriangleTest' are all unit tests. 'ShapeTests' was testing with each shape as a generic 'BaseShape' instead of the previous shape classes.  
    Is 'ShapeTests' a unit test of 'ShapeFactory.java'?  
    // ***ANSWER HERE***    

---
# Homework_4
This is the fourth homework for the Java for Automation Engineers Class

## Summary
This is a MP3 Player console application that allows the user to play songs and playlist.

### Homework 4 checklist:

SongDatabase.java
- [ ] Complete the 'addSong' method
- [ ] Throw an IllegalArgumentException when a playlist of the given name already exists in the 'createPlaylist' method
- [ ] Complete the 'getPlaylist' method
- [ ] Complete the 'addSongToPlaylist' method
- [ ] Complete the 'findSongByName' method
- [ ] Complete the 'findSongByArtist' method
    MP3Player.java
- [ ] Run the 'main' method and try multiple work flows

TEST TASKS:  
SongDatabaseTest.java  
- [ ] Write the 'testAddDeleteSong' test method
- [ ] Write the 'testAddGetDeletePlaylist' test method
- [ ] Run every other test

SHORT ANSWERS:  
    *Answer each question, and note many don't have a 'right answer' so just answer honestly*  
- [ ] The MP3Player is a console application, what features do you wish were added?  
    // ***ANSWER HERE***  
  
- [ ] Pick any feature you mentioned in the last question. Do you think you could implement that feature with your current knowledge?     
*If yes explain the basic thought processing of adding that feature, if not explain why.*  
    // ***ANSWER HERE***  
  
- [ ] What is a loop?  
    // ***ANSWER HERE***  
  
- [ ] Write what each of these loops does in your own words:  
    // FOR LOOP:  
    // WHILE LOOP:  
    // DO WHILE:  
  
- [ ] Why were 'infinite loops' used in this project? (See UserHelperMethods.displayOptionsAndWaitForValidOption(String[] options) for a reference)  
    // ***ANSWER HERE***  
  
- [ ] This project has 3 packages (models, resources, and utils). Describe each one.  
    // MODELS:  
    // RESOURCES:  
    // UTILS:  
   
    
---
# Homework_5
This is the final homework for the  Java for Automation Engineers Class

## NOTE
This homework is different from each other homework, as you will be creating the entire java project from scratch. Read the summary and complete the REQUIREMENTS section listed in this README

## Summary
Your goal for this homework is to create a java console application that represents a Movie Store. Every requirement must be completed for completion and all previous Homeworks can be used as reference.

## REQUIREMENTS
- [ ] Use correct scoping for all variables/properties
- [ ] Use correct getter/setter methods through the entire project
- [ ] Use construtors correctly in all classes
- [ ] Use correct scoping for all methods
- [ ] Create at least 4 seperate classes
- [ ] Use at least 2 loops
- [ ] Use inheritance at least once
- [ ] Override at least one method
- [ ] Take and parse user input
- [ ] No unexpected errors should be thrown
- [ ] The project must compile
- [ ] There should be at least one main method that should in practice start your 'Movie Store' program
- [ ] Your movie store must have at least 5 features such as 'renting a movie', 'searching for movie genere', etc.
- [ ] All your code must be cleanly commented
- [ ] You must have at least 5 test methods (Using testng like the previous projects)

