// Aaron Bachmann
public class GridWriterProgram {
	
	public static void main(String[] args) {
		GridWriter gw = new GridWriter(40, 50);

		gw.add(new MyCircle(10, 10, 9));

		gw.add(new MyRectangle(40, 0, 10, 10));
		
		gw.display();

		for (int i = 0; i < gw.size(); i++) {
			System.out.println(gw.get(i).getArea());
		}

		System.out.println("Number of shapes: " + gw.size());

		GridItem i = gw.get(2);
		System.out.println(i);
	}
	
}