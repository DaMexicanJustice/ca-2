/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.error;

/**
 *
 * @author xboxm
 */
public class AddressesNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>AddressesNotFoundException</code> without
     * detail message.
     */
    public AddressesNotFoundException() {
    }

    /**
     * Constructs an instance of <code>AddressesNotFoundException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public AddressesNotFoundException(String msg) {
        super(msg);
    }
}
