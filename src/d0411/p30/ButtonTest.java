package d0411.p30;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest implements ActionListener {
	private Frame f;
	private Button b;

	public ButtonTest() {
		f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		b = new Button("Ȯ��");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this);

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Ȯ��")) {
			f.setTitle("Seungjin");
		}
	}

	public static void main(String[] args) {
		new ButtonTest();
	}
}
