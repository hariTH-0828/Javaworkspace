package workSpace;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T > 0){
		    int X = scan.nextInt();
		    int Y = scan.nextInt();
		    
		    if((X+Y) > 6) {
		        System.out.println("YES");
		    } else System.out.println("NO");
		}
		scan.close();
	}
}
