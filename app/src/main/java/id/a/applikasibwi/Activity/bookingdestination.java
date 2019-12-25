package id.a.applikasibwi.Activity;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Herdi_WORK on 18.06.17.
 */

@IgnoreExtraProperties

public class bookingdestination implements Serializable {



    private String Nama;
    private String Email;
    private Integer Phone;
    private String Destination;

    public bookingdestination(){

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        this.Phone = phone;
    }

    @Override
    public String toString() {
        return " "+nama+"\n" +
                " "+merk +"\n" +
                " "+harga;
    }

    public bookingdestination(String nm, String mrk, String hrg){
        nama = nm;
        merk = mrk;
        harga = hrg;
    }
}