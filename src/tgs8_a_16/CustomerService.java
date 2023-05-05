package tgs8_a_16;

import exception.ExceptionBonus;
import exception.ExceptionGajiPokok;
import exception.ExceptionID;
import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;

public class CustomerService extends Pegawai implements IGaji{
    private String IDCS;
    private float komisi;

    public CustomerService(String IDCS, float komisi, String nama, String notelp, float gajiPokok) 
    throws ExceptionBonus, ExceptionGajiPokok, ExceptionID, ExceptionNama, ExceptionNomorTelepon{
        super(nama, notelp, gajiPokok);
        if(!IDCS.contains("CS-")){
            throw new ExceptionID();
        }else if(komisi<300000 || komisi > 1200000){
            throw new ExceptionBonus();
        }else{
            this.IDCS = IDCS;
            this.komisi = komisi;
        }
    }
    
    public float totalGaji(){
        return (gajiPokok + komisi) - (gajiPokok + komisi)*0.02f;
    }
    
    public void showData(){
        System.out.println("Nama Customer Service              : "+nama);
        System.out.println("Nomor Telepon Customer Service     : "+notelp);
        System.out.println("ID Customer Service                : "+IDCS);
        System.out.println("Gaji Pokok                         : "+gajiPokok);
        System.out.println("Komisi                             : "+komisi);
        System.out.println("Total Gaji                         : "+totalGaji());
    }
    
}
