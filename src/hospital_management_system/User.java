/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

/**
 *
 * @author Dinuwan Theekshana
 */
public class User {

    private byte[] pictuere;

    public User(byte[] image) {

        this.pictuere = image;

    }

    public byte[] getImage() {

        return pictuere;

    }

}
