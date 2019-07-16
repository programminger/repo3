package 桌球小游戏;
import java.awt.*;
import javax.swing.*;

public class ball extends JFrame{
	
	//加载图片
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	//画窗口
	
	
	boolean right=true;
	
	
	double x=100;//小球的横纵坐标
	double y=100;
	
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}if(x>500-50){
			right=false;
		}if(x<50) {
			right=true;
			
		}
			

	}
	
	
	
	
	
	
	
	//窗口加载
	void launchFrame()
	{
		setSize(500,350);
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
		ball game=new ball();
		game.launchFrame();
	}
}
