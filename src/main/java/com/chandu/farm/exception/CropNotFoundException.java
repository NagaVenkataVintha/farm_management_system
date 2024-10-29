package com.chandu.farm.exception;

public class CropNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CropNotFoundException()
	{
		super();
	}
	
	public CropNotFoundException(String message)
	{
		super(message);
	}

}
