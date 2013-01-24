import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;


public class Run {
	public static void main(String[] args) throws IOException {
		File file=new File("img/6.jpg");
		Carcker c=new Carcker(ImageIO.read(file));
		System.out.println(c.read());
		Random r= new Random();
		System.out.println(r.nextDouble());
		
	}
}
