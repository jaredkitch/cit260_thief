/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Jon
 */
public class TrapControlExceptions extends Exception {

    public TrapControlExceptions() {
    }

    public TrapControlExceptions(String string) {
        super(string);
    }

    public TrapControlExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public TrapControlExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public TrapControlExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
