package tgs8_a_16;

import exception.ExceptionBonus;
import exception.ExceptionGajiPokok;
import exception.ExceptionID;
import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;

public abstract class Pegawai {
    protected String nama, notelp;
    protected float gajiPokok;

    public Pegawai(String nama, String notelp, float gajiPokok) 
    throws ExceptionGajiPokok, ExceptionNama, ExceptionNomorTelepon{
        if(nama.length()==0){
            throw new ExceptionNama();
        }else if(notelp.length()<11 || notelp.length()>13){
            throw new ExceptionNomorTelepon();
        }else if(gajiPokok<2000000){
            throw new ExceptionGajiPokok();
        }else{
            this.nama = nama;
            this.notelp = notelp;
            this.gajiPokok = gajiPokok;
        }
    }
    
    public abstract void showData();
    
}
