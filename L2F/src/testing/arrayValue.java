package testing;

import java.util.Random;

public class arrayValue {
	public static void main (String[]args) {

	int xSize = 5;
	int ySize = 10;
	
	Random random = new Random();
	
	int[][] map = new int[xSize][ySize];
	for (int x = 0; x < map.length; x++) {
		for (int y = 0; y < map[x].length; y++) {
				int number = random.nextInt(9+1);
				map[x][y] = number;
				System.out.print(number);
			
		}
		System.out.println();
	}
	
}
}
