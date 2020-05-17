import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.print.attribute.standard.Media;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class WHSlotPicker extends JFrame {
	JLabel lblSlotID;
	
	public WHSlotPicker() {
		
		super("WHSlot");
		
		this.setSize(1000, 490);
		this.setVisible(false);
		
		JPanel pnlContainer = new JPanel();
		pnlContainer.setLayout(null);
		
		Font font = new Font("Tahoma", Font.PLAIN, 10);
		Border bdr = BorderFactory.createLineBorder(Color.black);
		Dimension btnSize = new Dimension(32,32);
		
		String[] rowID1 = {"A","B","","C","D","","E","F"};
		String slotID = "";
		
		for(int i = 1; i < 9; i++){
			for(int j = 1; j <= 12; j++) {
				if(i != 3 && i != 6) {
					slotID = rowID1[i-1] + String.format("%02d", j);
					JLabel lbl = new JLabel(slotID,SwingConstants.CENTER);
					lbl.setBorder(bdr);
					lbl.setFont(font);
					lbl.setOpaque(true);
					lbl.setBackground(Color.WHITE);
					lbl.setBounds(i*btnSize.width, j*btnSize.height, btnSize.width, btnSize.height);
					
					lbl.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							View.whShowSlot.lblSlotID.setText(lbl.getText());
							dispose();
						}
					});
					
					pnlContainer.add(lbl);
				}
			}
		}
		
		String[] rowID2 = {"G","H","","I","J","","K","L","","M","N"};
		for(int i = 10; i < 22; i++) {
			for(int j = 1; j < 12; j++) {
				if(j != 3 && j != 6 && j != 9) {
					slotID = rowID2[j-1] + String.format("%02d", i - 9);
					JLabel lbl = new JLabel(slotID,SwingConstants.CENTER);
					lbl.setBorder(bdr);
					lbl.setFont(font);
					lbl.setOpaque(true);
					lbl.setBackground(Color.WHITE);
					lbl.setBounds(i*btnSize.width, j*btnSize.height, btnSize.width, btnSize.height);
					
					lbl.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							View.whShowSlot.lblSlotID.setText(lbl.getText());
							dispose();
						}
					});
					
					pnlContainer.add(lbl);
				}				
			}
		}
		
		lblSlotID = new JLabel("IM HERE");
		lblSlotID.setBounds(this.getWidth() - 200, btnSize.height, 200 - btnSize.width, btnSize.height);
		
		pnlContainer.add(lblSlotID);
		
		this.add(pnlContainer);
		
		this.revalidate();
		this.repaint();
	}

}
