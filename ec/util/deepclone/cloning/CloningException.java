/*******************************************************************************
 * Copyright (c) 2014, 2015 
 * Anthony Awuley - Brock University Computer Science Department
 * All rights reserved. This program and the accompanying materials
 * are made available under the Academic Free License version 3.0
 * which accompanies this distribution, and is available at
 * https://aawuley@bitbucket.org/aawuley/evolvex.git
 *
 * Contributors:
 *     ECJ                     MersenneTwister & MersenneTwisterFast (https://cs.gmu.edu/~eclab/projects/ecj)
 *     voidException      Tabu Search (http://voidException.weebly.com)
 *     Lucia Blondel       Simulated Anealing 
 *     
 *
 *        
 *******************************************************************************/
package ec.util.deepclone.cloning;

/**
 * thrown if cloning fails
 * 
 * @author kostantinos.kougios
 *
 * 18 Jan 2009
 */
public class CloningException extends RuntimeException
{
	private static final long	serialVersionUID	= 3815175312001146867L;

	public CloningException(final String message, final Throwable cause)
	{
		super(message, cause);

	}

}
