package ballgame2;
import java.awt.*;
import javax.swing.*;

public class ballgame extends JFrame{
	
	//加载图片
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	//画窗口
	
	
	
	double degree=3.14/3;
	double x=100;//小球的横纵坐标
	double y=100;
	
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x= x+10 * Math.cos(degree);
		y= y+10 * Math.asin(degree);
		 if(y>300-50 || y<30) {
			 degree=-degree; 
		 }if(x>500-50 || x<0) {
			 degree=3.14-degree;
		 }

			

	}
	
	
	
	
	
	
	
	//窗口加载
	void launchFrame()
	{
		setSize(500,300);
		setLocation(60,60);
		setVisible(true);
		while(true) {
			repaint();
			try {
				Thread.sleep(50);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello java");
		ballgame game=new ballgame();
		game.launchFrame();
	}
}

