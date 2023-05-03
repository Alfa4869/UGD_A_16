/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_a_16;
import Exception.NameException;
import Exception.GajiPokokException;
import Exception.NoTelpException;
import Exception.IdException;
import Exception.BonusException;

/**
 *
 * @author ASUS
 */
public class CustomerService extends Pegawai implements IGaji{
    
    private String idCS;
    private float komisi;

    public CustomerService(String idCS, float komisi, String namaPegawai, String noTelpPegawai, float gajiPokok) throws NameException, GajiPokokException, 
            NoTelpException, IdException, BonusException{
        super(namaPegawai, noTelpPegawai, gajiPokok);
        
        if (!idCS.contains("CS-")) {
            throw new IdException();
        }else if(komisi<300000 || komisi>100000){
            throw new BonusException();
        }else{
            this.idCS = idCS;
            this.komisi = komisi;
        }
        
    }
    
    public float totalGaji(){
        
        return (gajiPokok + komisi) - (gajiPokok + komisi) * 0.2f;
    }
    
    public void showData(){
        System.out.println("============== CS =============");
        System.out.println("Nama CS     : " + namaPegawai);
        System.out.println("Nomor Telp  : " + noTelpPegawai);
        System.out.println("ID CS       : " + idCS);
        System.out.println("Gaji Pokok  : " + gajiPokok);
        System.out.println("Komisi      : " + komisi);
        System.out.println("Total Gaji  : " + totalGaji());
        System.out.println("===============================");
    }
}
