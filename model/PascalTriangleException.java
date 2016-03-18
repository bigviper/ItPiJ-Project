/*
 * Copyright (C) 2016 bigvip.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package pl.polsl.patryk.zmijewski.model;

/**
 * @version 1.0.0
 * @author Patryk Żmijewski
 */

/**
 * Exeption class designed for incorrect height values setting etc.
 */
public class PascalTriangleException extends Exception {
    /**
     * Public constructor of the class
     */
    public PascalTriangleException()
    {
    }
    /**
     * Public constructor of the class specifying the specified message it throws
     * @param message - message of the exception
     */
    public PascalTriangleException(String message)
    {
	super(message);
    }
    /**
     * Public constructor of the class specifying the cause why it hass been thrown
     * @param cause - reason of the exception throw
     */
    public PascalTriangleException(Throwable cause)
    {
	super(cause);
    }
    /**
     * Public constructor of the class specifying the cause why it hass been thrown and the specified message it throws
     * @param message - message of the exception
     * @param cause - reason of the exception throw
     */
    public PascalTriangleException(String message, Throwable cause)
    {
	super(message, cause);
    }
}
