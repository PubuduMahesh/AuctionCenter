package com.codenerdz.auctioncenter.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class AuctionSheet extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AuctionSheet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAcutionSheet = new JLabel("Acution Sheet");
		lblAcutionSheet.setBounds(138, 0, 107, 29);
		contentPane.add(lblAcutionSheet);
		
		JLabel lblVehicaleValue = new JLabel("Vehicale Value");
		lblVehicaleValue.setBounds(15, 53, 107, 20);
		contentPane.add(lblVehicaleValue);
		
		JLabel lblAveYenRate = new JLabel("Ave: Yen Rate");
		lblAveYenRate.setBounds(15, 77, 107, 20);
		contentPane.add(lblAveYenRate);
		
		JTextPane txtVehicleValue = new JTextPane();
		txtVehicleValue.setBounds(138, 47, 50, 26);
		contentPane.add(txtVehicleValue);
		
		JTextArea txtYenRate = new JTextArea();
		txtYenRate.setBounds(138, 77, 50, 22);
		contentPane.add(txtYenRate);
		
		JLabel lblTotalCost = new JLabel("Total Cost");
		lblTotalCost.setBounds(15, 113, 78, 20);
		contentPane.add(lblTotalCost);
		
		JTextPane txtTotalCost = new JTextPane();
		txtTotalCost.setBounds(138, 107, 50, 26);
		contentPane.add(txtTotalCost);
	}
}
