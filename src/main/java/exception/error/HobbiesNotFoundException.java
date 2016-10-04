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
public class HobbiesNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>HobbiesNotFoundException</code> without
     * detail message.
     */
    public HobbiesNotFoundException() {
    }

    /**
     * Constructs an instance of <code>HobbiesNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public HobbiesNotFoundException(String msg) {
        super(msg);
    }
}
