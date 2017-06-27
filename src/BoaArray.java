import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoaArray {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc =new Scanner(new File("kmeans.txt"));
		StringBuilder sb =new StringBuilder();
		sb.append("a: array of int = {");
		while(sc.hasNextLine()){
			String gid = sc.nextLine();
			sb.append(gid);
			if(sc.hasNextLine()){
				sb.append(",");
			}
		}
		sb.append("};");
		System.out.println(sb.toString());
		sc.close();
	}
}
