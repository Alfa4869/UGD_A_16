package tgs8_a_16;

import exception.ExceptionBonus;
import exception.ExceptionGajiPokok;
import exception.ExceptionID;
import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;

public class Admin extends Pegawai implements IGaji{
    private String IDAdmin;
    private float BonusAdmin;

    public Admin(String IDAdmin, float BonusAdmin, String nama, String notelp, float gajiPokok) 
    throws ExceptionBonus, ExceptionGajiPokok, ExceptionID, ExceptionNama, ExceptionNomorTelepon{
        super(nama, notelp, gajiPokok);
        if(!IDAdmin.contains("ADM-")){
            throw new ExceptionID();
        }else if(BonusAdmin<500000 || BonusAdmin > 1200000){
            throw new ExceptionBonus();
        }else{
            this.IDAdmin = IDAdmin;
            this.BonusAdmin = BonusAdmin;
        }
    }
    
    public float totalGaji(){
        return (gajiPokok + BonusAdmin) - (gajiPokok + BonusAdmin)*0.03f;
    }
    
    public void showData(){
        System.out.println("Nama Admin              : "+nama);
        System.out.println("Nomor Telepon Admin     : "+notelp);
        System.out.println("ID Admin                : "+IDAdmin);
        System.out.println("Gaji Pokok              : "+gajiPokok);
        System.out.println("Bonus Lembur            : "+BonusAdmin);
        System.out.println("Total Gaji              : "+totalGaji());
    }
    
}
