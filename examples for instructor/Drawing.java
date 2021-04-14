
public class Drawing {

	public static void main(String[] args) {
		
		
		// Rectangle !!
		// Rectangle(5, 20, false); // isFilled
		 Triangle(7);
		// Pyramid(7);
		//Circle(22);
	}
	
	public static void Triangle(int size) {
		/*
		|---------------- x
		|
		|
		y
		*/
		
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				
				 if(x <= y)
				// if(x >= y)
				// if(x <= size - y - 1)
				//if(x >= size - y - 1)
					System.out.print('*');
				else
					System.out.print(' ');
				
			}
			System.out.println();
		}
	}
	
	public static void Triangle2(int size) {
		/*
		  
		 *****    *			  *	
		  ****    **		 ***
		   ***    ***  		*****
		    **    ****	   *******	
		     *    *****   *********
		 
		 */
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				
				// if( y == 0 || x == y || x == size - 1 ) // outlined shape
				if( x >= y )
					System.out.print('*');
				else 
					System.out.print(' ');
				
			}
			System.out.println();
		}
	}
	
	public static void Rectangle(int h, int w, boolean isFilled) {
		
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				/*
				if( y == 0 || y == h - 1 || x == 0 || x == w - 1)
					System.out.print('*');
				else 
					System.out.print(' ');
				*/
				
				boolean b = !(y == 0 || y == h - 1 || x == 0 || x == w - 1) && !isFilled;
				System.out.print( b ? ' ' : '*' );
				
				/*
				boolean b = y == 0 || y == h - 1 || x == 0 || x == w - 1;
				System.out.print(!isFilled ? (b ? '*' : ' ') : '*');
				*/
			}
			System.out.println();
		}
		
		
		
	}
	/*
	
	*
   ***
  *****
   
   */
	public static void Pyramid(int size) {
		
		for (int y = 0; y < size; ++y) {
			for (int x = 0; x < size * 2 - 1; ++x) {
				
				if(x >= size - y - 1 && x <= size + y - 1)
					System.out.print('*');
				else
					System.out.print(' ');
					
			}
			System.out.println();
		}
	}
	
	public static void Circle(int radius) {
		
		for (int y = -radius; y <= radius; y += 2) {
			for (int x = -radius; x <= radius; ++x) {
				
				if(y * y + x * x <= radius * radius)
					System.out.print("*");
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}
