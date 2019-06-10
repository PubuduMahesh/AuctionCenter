package com.codenerdz.auctioncenter;

import java.awt.EventQueue;

import com.codenerdz.auctioncenter.view.AuctionSheet;

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
					AuctionSheet frame = new AuctionSheet();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
