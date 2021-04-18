# leaf-pile-recursion

For this assignment, you are provided with a main method (LeafPile.java) and the Ground enum (Ground.java).  Do NOT change the Ground enum or the provided methods inside LeafPile.java.  You may add all necessary methods to solve the problem that you need to inside main.  Modifying the enum or the provided methods will cost you points.  You may change the map[][] array in the main method to different sizes for testing purposes.
Suppose you have an N x M grid in which either grass or a leaf is in each cell of the grid (but not both).  Your assignment is to determine the largest leaf pile on the map.  Your algorithm must utilize recursion to solve the problem.

The grid internally is represented like this
[■(GRASS&GRASS&LEAF@LEAF&LEAF&GRASS@LEAF&GRASS&LEAF)]

In which GRASS and LEAF are the enum values from Ground.java and this is  3 x 3 array.
For the purposes of shortness, GRASS will be represented by the period symbol ‘ . ‘ and LEAF will be represented by the tilde symbol ‘ ~ ‘ for the rest of the matrices in this document.

What constitutes a leaf pile?

A leaf is part of a pile if it touches another leaf in the four cardinal directions of north, east, south and west.  Leaves that touch diagonally are not part of the pile.  So, from the matrix above the piles are

pile 1={(0,2)}
pile 2={(1,0),(1,1),(2,0)}
pile 3={(2,2)}

Each pile is represented as a list of tuples that contain the coordinates of a leaf in the form of (row, column).
As you can see, the pile with most leaves is pile 2.
Provided Files

You are given two files, Ground.java and LeafPile.java.  Ground.java contains a public enum which contains two types, LEAF and GRASS.  If you are unfamiliar with enums, you may visit
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

For a refresher.
The main method contains the following utility methods
printMap(Ground map[][]) - Which prints a 2 dimensional Ground type array with period symbol for GRASS and tilde symbol for LEAF.
genearteRandomGround(Ground map[][]) - Takes in a 2 dimensional Ground array and generates a random map
largestLeafPile(Ground map[][]) - This is the method you need to implement.  It should return the size of the pile with the most leaves.
Along with the largestLeafPile method you may also add any additional methods to help you solve the problem.
Assignment Requirements

You must construct an algorithm that determines the size of the largest pile of leaves on the map that utilizes recursion. 
Your algorithm must return the correct leaf pile size and must be able to work with different sized arrays.  Rows and columns may not be the same, so you should not assume that they are. (If your algorithm is well constructed it should work on jagged arrays, although, I won’t be testing for this.)
