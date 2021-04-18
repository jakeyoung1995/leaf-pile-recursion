public class LeafPile {
    public static void main( String[] args ) {
	Ground map[][] = new Ground[ 5 ][ 10 ];
	generateRandomGround( map );
	printMap( map );
	System.out.println(largestLeafPile(map));

    }

    /*****************STUDENT CODE HERE*******************/
    
    private static int largestLeafPile( Ground map[][]) {
    	int maxSize = 0; 
    	int pile;
    	for (int r = 0; r < map.length; r++) {
    		for (int c = 0; c < map[r].length; c++)
    			if (map[r][c] == Ground.LEAF) { // If leaf found
    				pile = sizeOfLeafPile(map, r, c); // Call to function that indicates size of the pile
    				if (pile > maxSize) {
    					maxSize = pile; 
    				}
    			}
    	}
    	return maxSize; 
    }
    
    // Recursive method to identify the size of the leaf pile
    private static int sizeOfLeafPile(Ground map[][], int r, int c) {
    	if (r < 0 || r > map.length - 1) { // Out of Bounds
    		return 0;
    	} 
    	if (c < 0 || c > map[r].length - 1) { // Out of Bounds
    		return 0;
    	}
    	if (map[r][c] == Ground.GRASS) { // Leaf Not Found
    		return 0; 
    	}
    	map[r][c] = Ground.GRASS; // Change Leaf to Grass (visited) to avoid redundancy
    		return 1 + sizeOfLeafPile(map, r - 1, c) +  // North
    				sizeOfLeafPile(map, r + 1, c) + // South
    				sizeOfLeafPile(map, r, c - 1) +  // West
    				sizeOfLeafPile(map, r, c + 1); // East
    	
    }
 
    /****************END STUDENT CODE**********************/

    /************ Utility Methods *************/
    
    private static void printMap( Ground map[][] ) {
	for(int r = 0; r < map.length; r++) {
	    for(int c = 0; c < map[r].length; c++) {
		if( map[r][c] == Ground.GRASS ) {
		    System.out.print( ". " );
		}
		if( map[r][c] == Ground.LEAF ) {
		    System.out.print( "~ " );
		}
	    }
	    System.out.println();
	}
    }

    private static void generateRandomGround( Ground map[][] ) {
	int randGround;
	for(int r = 0; r < map.length; r++) {	
	    for(int c = 0; c < map[r].length; c++) {
		randGround = (int) ( Math.random() * 2 );
		map[r][c] = randGround == 0 ? Ground.GRASS : Ground.LEAF;
	    }
	}
    }

    
    /****************************************/
}
