package com.wo.Game;

import java.io.Serializable;

public class Game2D implements Serializable {
		

	private static final long serialVersionUID = 1L;
		public int xPos;
		public int yPos;
		
		public void xMove(int pos)
		{
			this.xPos+=pos;
		}
		
		public void yMove(int pos)
		{
			this.yPos+=pos;
		}
}
