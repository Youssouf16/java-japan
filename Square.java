package question1;
 
public class Square extends Shape {
	float lenght;
	 float init(float lenght) {
		System.out.println("lenght of the square is");
		this.lenght = lenght;
		return lenght;
	}
	float area(float lenght){
		System.out.println("area of the shape is");
		float area = lenght*lenght;
		return area;
		
	}
}