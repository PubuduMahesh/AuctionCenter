package com.codenerdz.auctioncenter.toolkit;

import com.codenerdz.auctioncenter.model.VehicleOffer;

public class LogicToolkit {

	private static LogicToolkit instance;
	
	private LogicToolkit()
	{
		
	}
	
	public static synchronized LogicToolkit getInstance()
	{
		if(instance == null )
		{
			instance =  new LogicToolkit();
		}
		return instance;
	}
	
	public VehicleOffer calculateMaxBid()
	{
		VehicleOffer vehicleOffer = new VehicleOffer();
		vehicleOffer.setClearanceCharges(25000);
		return vehicleOffer;
	}

}
