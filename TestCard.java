import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TestCard extends JFrame{
	private DeckOfCards deck = new DeckOfCards();
	private java.util.ArrayList<ImageIcon> list = new  java.util.ArrayList<ImageIcon>();

	private JLabel jrd1 = new JLabel("  ");
	private JLabel jrd2 = new JLabel("  ");
	private JLabel jrd3 = new JLabel("click");
	private JLabel jrd4 = new JLabel("Refresh");
			

	public TestCard(){
		
		//Image icon
		list.add(new ImageIcon("src/1.png"));
		list.add(new ImageIcon("src/2.png"));
		list.add(new ImageIcon("src/3.png"));
		list.add(new ImageIcon("src/4.png"));
		list.add(new ImageIcon("src/5.png"));
		list.add(new ImageIcon("src/6.png"));
		list.add(new ImageIcon("src/7.png"));
		list.add(new ImageIcon("src/8.png"));
		list.add(new ImageIcon("src/9.png"));
		list.add(new ImageIcon("src/10.png"));
		list.add(new ImageIcon("src/11.png"));
		list.add(new ImageIcon("src/12.png"));
		list.add(new ImageIcon("src/13.png"));
		list.add(new ImageIcon("src/14.png"));
		list.add(new ImageIcon("src/15.png"));
		list.add(new ImageIcon("src/16.png"));
		list.add(new ImageIcon("src/17.png"));
		list.add(new ImageIcon("src/18.png"));
		list.add(new ImageIcon("src/19.png"));
		list.add(new ImageIcon("src/20.png"));
		list.add(new ImageIcon("src/21.png"));
		list.add(new ImageIcon("src/22.png"));
		list.add(new ImageIcon("src/23.png"));
		list.add(new ImageIcon("src/24.png"));
		list.add(new ImageIcon("src/25.png"));
		list.add(new ImageIcon("src/26.png"));
		list.add(new ImageIcon("src/27.png"));
		list.add(new ImageIcon("src/28.png"));
		list.add(new ImageIcon("src/29.png"));
		list.add(new ImageIcon("src/30.png"));
		list.add(new ImageIcon("src/31.png"));
		list.add(new ImageIcon("src/32.png"));
		list.add(new ImageIcon("src/33.png"));
		list.add(new ImageIcon("src/34.png"));
		list.add(new ImageIcon("src/35.png"));
		list.add(new ImageIcon("src/36.png"));
		list.add(new ImageIcon("src/37.png"));
		list.add(new ImageIcon("src/38.png"));
		list.add(new ImageIcon("src/39.png"));
		list.add(new ImageIcon("src/40.png"));
		list.add(new ImageIcon("src/41.png"));
		list.add(new ImageIcon("src/42.png"));
		list.add(new ImageIcon("src/43.png"));
		list.add(new ImageIcon("src/44.png"));
		list.add(new ImageIcon("src/45.png"));
		list.add(new ImageIcon("src/46.png"));
		list.add(new ImageIcon("src/47.png"));
		list.add(new ImageIcon("src/48.png"));
		list.add(new ImageIcon("src/49.png"));
		list.add(new ImageIcon("src/50.png"));
		list.add(new ImageIcon("src/51.png"));
		list.add(new ImageIcon("src/52.png"));

		int card[] = deck.Display();;
		
		//Create panel 
		JPanel p1 = new JPanel(new GridLayout(1, 4));
		
		//four label
		p1.add(jrd1);
		p1.add(jrd2);
		p1.add(jrd3);
		p1.add(jrd4);

		//a button		
		JButton jbt = new JButton("Refresh");
		
		//add content to the frame
		add(p1, BorderLayout.NORTH);	
		add(jbt, BorderLayout.SOUTH);

		//register
		jbt.addActionListener(new ButtonListener());
	}
	
	//get input
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){
			int card[] = deck.Display();

			jrd1.setIcon(list.get(card[0]));
			jrd2.setIcon(list.get(card[1]));
			jrd3.setIcon(list.get(card[2]));
			jrd4.setIcon(list.get(card[3]));

		}
	}
	
	/** Main method */
	public static void main(String[] args) {
		TestCard frame = new TestCard();
  		frame.pack();
		frame.setTitle("Deck Of Cards");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setVisible(true);
	}

}
		
