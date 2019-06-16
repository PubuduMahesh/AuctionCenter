package com.codenerdz.auctioncenter.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.codenerdz.auctioncenter.control.AuctionSheetController;
import com.codenerdz.auctioncenter.model.VehicleOffer;
import com.codenerdz.auctioncenter.toolkit.LogicToolkit;

public class Bid {
	
	AuctionSheetController controller = new AuctionSheetController();
	AuctionSheet frame;

	public Bid() 
	{
		createAuctionSheet();
	}
	
	private void createAuctionSheet()
	{
		this.frame = new AuctionSheet(controller);
		this.frame.setVisible(true);
		registerCalculateController();
	}
	
	private void registerCalculateController()
	{
		controller.registerCalculateListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() instanceof VehicleOffer)
				{
					frame.setVehicleOffer(LogicToolkit.getInstance().calculateMaxBid());
				}
				
			}
		});
	}

}
