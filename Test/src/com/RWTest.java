package com;

import com.lock.Ticket;

public class RWTest {

	public static void main(String[] args) {
		final Ticket ticket = new Ticket();
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					ticket.getTickets();

				}
			}).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					ticket.setTickets();

				}
			}).start();
		}
	}
}
