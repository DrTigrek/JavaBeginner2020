import javax.swing.JFrame;

public class MainFrame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame w=new JFrame();
		w.setBounds(1000,100,800,830);
		w.setTitle("Hello Graphics");
		w.setResizable(false);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
		
		BgPanel bg=new BgPanel();
		
		w.setContentPane(bg);
	}
}
