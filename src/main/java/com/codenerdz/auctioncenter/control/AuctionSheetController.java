package com.codenerdz.auctioncenter.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AuctionSheetController {

	private List<ActionListener> calculateListenerList = new ArrayList();
	
	public void registerCalculateListener(ActionListener listener)
	{
		calculateListenerList.add(listener);
	}
	
	public void fireCalculateListener(ActionEvent event)
	{
		for(ActionListener lisetner:calculateListenerList)
		{
			lisetner.actionPerformed(event);
		}
	}

}
