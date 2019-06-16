package com.codenerdz.auctioncenter.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.codenerdz.auctioncenter.control.AuctionSheetController;
import com.codenerdz.auctioncenter.model.VehicleOffer;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AuctionSheet extends JFrame {

	private JPanel contentPane;
	private JTextField txtInitialValue;
	private JTextField txtTransportCost;
	private JTextField txtCIF;
	private JTextField txtGovernmentTax;
	private JTextField txtVehicleValue;
	private JTextField txtClearanceCharges;
	private JTextField txtRegistrationCharges;
	private JTextField txtOther;
	private JTextField txtTotal;
	private JTextField txtMaximuBidValue;	
	private final AuctionSheetController controller;

	/**
	 * Create the frame.
	 */
	public AuctionSheet(final AuctionSheetController con) {
		this.controller = con;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAcutionSheet = new JLabel("Acution Sheet");
		lblAcutionSheet.setBounds(203, 0, 107, 29);
		contentPane.add(lblAcutionSheet);
		
		JLabel lblInitialValue = new JLabel("Initial Value:");
		lblInitialValue.setBounds(15, 75, 98, 20);
		contentPane.add(lblInitialValue);
		
		txtInitialValue = new JTextField();
		txtInitialValue.setBounds(203, 72, 146, 26);
		contentPane.add(txtInitialValue);
		txtInitialValue.setColumns(10);
		
		JLabel lbTransportCost = new JLabel("TransportCost:");
		lbTransportCost.setBounds(15, 114, 107, 20);
		contentPane.add(lbTransportCost);
		
		txtTransportCost = new JTextField();
		txtTransportCost.setColumns(10);
		txtTransportCost.setBounds(203, 111, 146, 26);
		contentPane.add(txtTransportCost);
		
		JLabel lbCIFValue = new JLabel("CIF:");
		lbCIFValue.setBounds(15, 153, 107, 20);
		contentPane.add(lbCIFValue);
		
		txtCIF = new JTextField();
		txtCIF.setColumns(10);
		txtCIF.setBounds(203, 150, 146, 26);
		contentPane.add(txtCIF);
		
		JLabel lbGovernmentTax = new JLabel("Government Tax:");
		lbGovernmentTax.setBounds(15, 192, 134, 20);
		contentPane.add(lbGovernmentTax);
		
		txtGovernmentTax = new JTextField();
		txtGovernmentTax.setColumns(10);
		txtGovernmentTax.setBounds(203, 189, 146, 26);
		contentPane.add(txtGovernmentTax);
		
		JLabel lblYen = new JLabel("Yen");
		lblYen.setBounds(155, 75, 33, 20);
		contentPane.add(lblYen);
		
		JLabel label = new JLabel("Yen");
		label.setBounds(155, 114, 33, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Yen");
		label_1.setBounds(155, 153, 33, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("RS");
		label_2.setBounds(155, 192, 33, 20);
		contentPane.add(label_2);
		
		JLabel lbVahicleValue = new JLabel("Vehicle Value:");
		lbVahicleValue.setBounds(15, 244, 134, 20);
		contentPane.add(lbVahicleValue);
		
		JLabel label_4 = new JLabel("RS");
		label_4.setBounds(155, 244, 33, 20);
		contentPane.add(label_4);
		
		txtVehicleValue = new JTextField();
		txtVehicleValue.setColumns(10);
		txtVehicleValue.setBounds(203, 241, 146, 26);
		contentPane.add(txtVehicleValue);
		
		JLabel label_5 = new JLabel("------------------------------------");
		label_5.setBounds(203, 216, 230, 20);
		contentPane.add(label_5);
		
		JLabel lbClearanceCharges = new JLabel("Clearance Charges:");
		lbClearanceCharges.setBounds(15, 283, 134, 20);
		contentPane.add(lbClearanceCharges);
		
		JLabel label_6 = new JLabel("RS");
		label_6.setBounds(155, 283, 33, 20);
		contentPane.add(label_6);
		
		txtClearanceCharges = new JTextField();
		txtClearanceCharges.setColumns(10);
		txtClearanceCharges.setBounds(203, 280, 146, 26);
		contentPane.add(txtClearanceCharges);
		
		JLabel lbRegistrationCharges = new JLabel("Registration Charges:");
		lbRegistrationCharges.setBounds(15, 322, 134, 20);
		contentPane.add(lbRegistrationCharges);
		
		JLabel label_8 = new JLabel("RS");
		label_8.setBounds(155, 322, 33, 20);
		contentPane.add(label_8);
		
		txtRegistrationCharges = new JTextField();
		txtRegistrationCharges.setColumns(10);
		txtRegistrationCharges.setBounds(203, 319, 146, 26);
		contentPane.add(txtRegistrationCharges);
		
		JLabel lbOther = new JLabel("Other:");
		lbOther.setBounds(15, 361, 134, 20);
		contentPane.add(lbOther);
		
		JLabel label_10 = new JLabel("RS");
		label_10.setBounds(155, 361, 33, 20);
		contentPane.add(label_10);
		
		txtOther = new JTextField();
		txtOther.setColumns(10);
		txtOther.setBounds(203, 358, 146, 26);
		contentPane.add(txtOther);
		
		JLabel label_3 = new JLabel("------------------------------------");
		label_3.setBounds(203, 387, 224, 20);
		contentPane.add(label_3);
		
		JLabel label_7 = new JLabel("------------------------------------");
		label_7.setBounds(203, 400, 230, 20);
		contentPane.add(label_7);
		
		JLabel lbTotal = new JLabel("Total Cost:");
		lbTotal.setBounds(15, 426, 134, 20);
		contentPane.add(lbTotal);
		
		JLabel label_11 = new JLabel("RS");
		label_11.setBounds(155, 426, 33, 20);
		contentPane.add(label_11);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(203, 423, 146, 26);
		contentPane.add(txtTotal);
		
		JLabel lblMaximumBidValue = new JLabel("Maximum Bid Value");
		lblMaximumBidValue.setBounds(488, 75, 153, 56);
		contentPane.add(lblMaximumBidValue);
		
		txtMaximuBidValue = new JTextField();
		txtMaximuBidValue.setBounds(453, 127, 242, 82);
		contentPane.add(txtMaximuBidValue);
		txtMaximuBidValue.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActionEvent auctionSheetEvent = new ActionEvent(getVehicleOffer(), 100, "auctionSheet");
				controller.fireCalculateListener(auctionSheetEvent);
			}
		});
		btnNewButton.setBounds(532, 446, 163, 61);
		contentPane.add(btnNewButton);
	}
	
	public VehicleOffer getVehicleOffer()
	{
		return new VehicleOffer();
	}
	
	public void setVehicleOffer(VehicleOffer vehicleOffer)
	{
		txtClearanceCharges.setText(""+vehicleOffer.getClearanceCharges());
	}
}
