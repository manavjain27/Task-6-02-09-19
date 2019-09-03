package com.wo.Game;

public class Game3D extends Game2D{
	

	private static final long serialVersionUID = 1L;
	public int zPos;
	
	public void zMove(int pos)
	{
		this.zPos+=pos;
	}
	
	

}
