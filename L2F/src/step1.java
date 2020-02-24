
public class step1 {
	public static void main (String[]args) {
		
		//array 2D
		int [][] gps = new int[5][5];
		
		for (int i = 0; i < gps.length; i++) {
			for (int j = 0; j < gps[i].length; j++) {
				gps[0][0] = 1;
				gps[0][1] = 2;
				gps[0][2] = 3;
				gps[0][3] = 4;
				gps[0][4] = 5;
				gps[1][0] = 2;
				gps[1][1] = 4;
				gps[1][2] = 6;
				gps[1][3] = 8;
				gps[1][4] = 10;
				gps[2][0] = 3;
				gps[2][1] = 6;
				gps[2][2] = 9;
				gps[2][3] = 12;
				gps[2][4] = 15;
				gps[3][0] = 4;
				gps[3][1] = 8;
				gps[3][2] = 12;
				gps[3][3] = 16;
				gps[3][4] = 20;
				gps[4][0] = 5;
				gps[4][1] = 10;
				gps[4][2] = 15;
				gps[4][3] = 20;
				gps[4][4] = 25;
				
				
				System.out.print(gps[i][j]+ "\t");
				
			}
			System.out.println();
			System.out.println();
			
		}
		
	}
	
}
