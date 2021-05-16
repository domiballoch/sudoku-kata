
[![forthebadge](https://forthebadge.com/images/badges/contains-cat-gifs.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/compatibility-betamax.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/powered-by-coffee.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/built-by-neckbeards.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/contains-tasty-spaghetti-code.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/not-a-bug-a-feature.svg)](https://forthebadge.com)

<h1>Sudoku Kata</h1>
<h4>Author: Dominic Balloch</h4>

<h3>Description</h3>
Create a completed sudoku board using either a backtracking algorithm or list manipulation
<br/>Start app to see grid
<br/>Proper tests still need to be added

<h3>Design</h3>
Lists with random numbers to create initial grid
<br/>1. Create 9 lists of 9 elements
<br/>2. Add lists to a super list
<br/>3. Populate lists with random numbers
<br/>4. The first (list 1) is set as the constant - order the next two (lists 2-3) so 3x3 grids exist using sublists
<br/>
<br/>REPEATING LOGIC - for lists 4-6 & 7-9
<br/>5. Vertical check the first list in the next group of 3 against the others
<br/>6. Check and order the next list against the previous using sublists
<br/>7. Vertical check the same list against the lists above it
<br/>8. This bit is the key: re-check the list using sublists but use a recursive loop until they both pass vertically and horizontally
<br/>9. Display all lists in a sudoku grid 9x9

<br/>Note: 
<br/>Collections.shuffle has to be used. If you use Random your IDE will crash as its more expensive to call
<br/>If you try and check more than one list as part of the recursive loop a stackoverflow error will occur

<h3>Learning Outcomes</h3>
Using lists, loops, algorithms, logical thinking and problem solving

<h3>Prerequisites</h3>
Java 11
<br/> Spring Boot 2.4.5
<br/>Maven 3.6.3
<br/>No SQL required

<h3>Build project</h3>
mvn clean install
<br/>spring-boot:run

<h3>Logging level</h3>
No logging