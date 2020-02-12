import java.util.*;
import java.awt.*;

public class kadai01 {
	public static void main(String[] args) {
		//自機のデータ
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		Rectangle r = new Rectangle(x,y,w,h);
		//敵機のデータ
		int e = scan.nextInt();
		int teki[] = new int[e*4];
		int j=0;
		int kazu=0;
		for(int i=0;i<e;i++) {
			kazu=kazu+1;
			teki[j] = scan.nextInt();
			teki[j+1] = scan.nextInt();
			teki[j+2] = scan.nextInt();
			teki[j+3] = scan.nextInt();
			Rectangle k = new Rectangle(teki[j],teki[j+1],teki[j+2],teki[j+3]);
			if(r.intersects(k)) {
				System.out.println("敵機"+kazu+"が当たり");
			}
			j=j+4;
		}

	}
}
