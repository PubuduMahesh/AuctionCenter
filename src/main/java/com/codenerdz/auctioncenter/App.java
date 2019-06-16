package com.codenerdz.auctioncenter;

import java.awt.EventQueue;

import com.codenerdz.auctioncenter.view.AuctionSheet;
import com.codenerdz.auctioncenter.view.Bid;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * Launch the application.
	 */
    public static void main( String[] args )
    {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Bid();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
