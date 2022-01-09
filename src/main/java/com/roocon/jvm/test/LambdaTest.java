package com.roocon.jvm.test;


import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaTest extends JFrame{
	private JButton jb;

	public LambdaTest() {
		this.setBounds(200, 200, 400, 200);
		this.setTitle("lambda测试");
		
		jb = new JButton("click");
		/*jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("clicked");
			}
		});
		*/
		jb.addActionListener(event -> System.out.println("Hello"));
		
		this.add(jb);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LambdaTest();
	}
}
