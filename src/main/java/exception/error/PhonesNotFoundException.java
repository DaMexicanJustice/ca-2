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
public class PhonesNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PhonesNotFoundException</code> without
     * detail message.
     */
    public PhonesNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PhonesNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PhonesNotFoundException(String msg) {
        super(msg);
    }
}
