import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.Media;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WHShowSlot extends JFrame {
	WHSlotPicker slotPicker = new WHSlotPicker();
	
	public JLabel lblSlotID;
	public WHShowSlot() {
		super("Show WHSlot");
		
		this.setSize(400,300);
		this.setLayout(new FlowLayout());
		this.setVisible(false);
		
		lblSlotID = new JLabel("SLOT ID");
		lblSlotID.setSize(100, 30);
		
		JButton btnShowPicker = new JButton("Show Picker");
		btnShowPicker.setSize(70, 30);
		btnShowPicker.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				slotPicker.setVisible(true);
			}
			
		});
		
		this.add(lblSlotID);
		this.add(btnShowPicker);
		
	}

}