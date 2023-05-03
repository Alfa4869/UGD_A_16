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
public class Admin extends Pegawai implements IGaji{
    
    private String idAdmin;
    private float bonusLembur;

    public Admin(String idAdmin, float bonusLembur, String namaPegawai, String noTelpPegawai, float gajiPokok) throws NameException, GajiPokokException, 
            NoTelpException, IdException, BonusException{
        super(namaPegawai, noTelpPegawai, gajiPokok);
        
        if (!idAdmin.contains("ADM-")) {
            throw new IdException();
        }else if(bonusLembur<500000 || bonusLembur>1200000){
            throw new BonusException();
        }else{
            this.idAdmin = idAdmin;
            this.bonusLembur = bonusLembur;
        }
        
        
    }

    
    public float totalGaji() {
        
        return (gajiPokok + bonusLembur) - (gajiPokok + bonusLembur) * 0.3f;
        
        
    }
    
    public void showData(){
        System.out.println("============== CS =============");
        System.out.println("Nama Admin  : " + namaPegawai);
        System.out.println("Nomor Telp  : " + noTelpPegawai);
        System.out.println("ID Admin    : " + idAdmin);
        System.out.println("Gaji Pokok  : " + gajiPokok);
        System.out.println("Bonus Lembur: " + bonusLembur);
        System.out.println("Total Gaji  : " + totalGaji());
        System.out.println("===============================");
    }
    
    
    
}
