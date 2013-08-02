import javax.swing.JFrame;
public class skeleton extends JFrame {
	
	public skeleton ()
	{
		add(new graphicsdemo());
		setTitle("Graphics Demo 1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,280);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args){
		new skeleton();
	}
}
