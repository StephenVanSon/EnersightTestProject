/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enersighttest;

/**
 *
 * @author Steve
 */
public class EnersightTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = helloWorld("Hello");
    }

    private static String helloWorld(java.lang.String name) {
        enersighttest.WsClientServices service = new enersighttest.WsClientServices();
        enersighttest.WsClientServicesSoap port = service.getWsClientServicesSoap();
        return port.helloWorld(name);
    }
    
}
