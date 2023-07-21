import java.util.*;
class rectangle
{
	 {
     int l;
     int b;

    rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
	void display(int l,int b)
	{
		System.out.println(l + " " + b);
	}
}
class RectangleArea extends rectangle{
	public RectangleArea(int l, int b) {
        super(l,b);
    }

    public void display(int l,int b) 
	{
        System.out.println(l * b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l= scanner.nextInt();
        int b= scanner.nextInt();
        
        RectangleArea rect = new RectangleArea(l, b);
        rect.display(); 
        rect.display();
    }
}
		