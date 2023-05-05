package tgs8_a_16;

import exception.ExceptionBonus;
import exception.ExceptionGajiPokok;
import exception.ExceptionID;
import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;
import exception.ExceptionAlamat;

public class Manager extends Pegawai implements IGaji {
    private String IDManager, alamatManager;
    private float bonusBulanan;

    public Manager(String IDManager, String alamatManager, float bonusBulanan, String nama, String notelp, float gajiPokok)
    throws ExceptionBonus, ExceptionGajiPokok, ExceptionID, ExceptionNama, ExceptionNomorTelepon, ExceptionAlamat {
        super(nama, notelp, gajiPokok);
        if(!IDManager.contains("MNGR-") || IDManager.indexOf("MNGR-")!=0){
            throw new ExceptionID();
        }else if(bonusBulanan<600000 || bonusBulanan>1400000){
            throw new ExceptionBonus();
        }else if(!alamatManager.contains("jln.") || alamatManager.indexOf("jln.")!=0){
            throw new ExceptionAlamat();
        }else{
            this.IDManager = IDManager;
            this.alamatManager = alamatManager;
            this.bonusBulanan = bonusBulanan;
        }
    }
    
    public float totalGaji(){
        return (gajiPokok + bonusBulanan) - (gajiPokok + bonusBulanan)*0.05f;
    }
    
    public void showData(){
        System.out.println("Nama Manager                 : "+nama);
        System.out.println("Nomor Telepon Manager        : "+notelp);
        System.out.println("ID Manager                   : "+IDManager);
        System.out.println("Alamat Manager               : "+alamatManager);
        System.out.println("Gaji Pokok                   : "+gajiPokok);
        System.out.println("Bonus Bulanan                : "+bonusBulanan);
        System.out.println("Total Gaji                   : "+totalGaji());
    }
    
}
