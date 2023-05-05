package tgs8_a_16;

import exception.ExceptionBonus;
import exception.ExceptionGajiPokok;
import exception.ExceptionID;
import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;
import exception.ExceptionAlamat;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UGD8_A_16 {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String nama, notelp, IDAdmin, IDCS, p = "", IDManager = "", alamatManager = "";
        float gajiPokok, bonusAdmin, komisi, bonusBulanan = 0;
        
        try{
            p = "CS";
            System.out.println("Masukkan Nama CS    : "); nama = br.readLine();
            System.out.println("Nomor Telepon CS    : "); notelp = br.readLine();
            System.out.println("Masukkan ID CS      : "); IDCS = br.readLine();
            System.out.println("Masukkan Gaji Pokok : "); gajiPokok = Float.parseFloat(br.readLine());
            System.out.println("Masukkan Komisi     : "); komisi = Float.parseFloat(br.readLine());
            CustomerService cs = new CustomerService(IDCS, komisi, nama, notelp, gajiPokok);
            cs.showData();
            
            p = "Admin";
            System.out.println("Masukkan Nama Admin    : "); nama = br.readLine();
            System.out.println("Nomor Telepon Admin    : "); notelp = br.readLine();
            System.out.println("Masukkan ID Admin      : "); IDAdmin = br.readLine();
            System.out.println("Masukkan Gaji Pokok    : "); gajiPokok = Float.parseFloat(br.readLine());
            System.out.println("Masukkan Bonus Lembur  : "); bonusAdmin = Float.parseFloat(br.readLine());
            Admin adm = new Admin(IDAdmin, bonusAdmin, nama, notelp, gajiPokok);
            adm.showData();
            
            p = "Manager";
            System.out.println("Masukkan Nama Manager    : "); nama = br.readLine();
            System.out.println("Nomor Telepon Manager    : "); notelp = br.readLine();
            System.out.println("Masukkan ID Manager      : "); IDManager = br.readLine();
            System.out.println("Masukkan Gaji Pokok : "); gajiPokok = Float.parseFloat(br.readLine());
            System.out.println("Masukkan Gaji Bulanan Manager     : "); bonusBulanan = Float.parseFloat(br.readLine());
            System.out.println("Masukkan Alamat Manager         : "); alamatManager = br.readLine();
            Manager mng = new Manager(IDManager, alamatManager, bonusBulanan, nama, notelp, gajiPokok);
            mng.showData();
            
        }catch(ExceptionNama e1){
            e1.pesan();
        }catch(ExceptionNomorTelepon e2){
            e2.pesan();
        }catch(ExceptionID e3){
            if(p == "CS"){
                e3.pesanCS();
            }else if(p == "Admin"){
                e3.pesanAdmin();
            }else{
                e3.pesanM(IDManager);
            }
        }catch(ExceptionGajiPokok e4){
            e4.pesan();
        }catch(ExceptionBonus e5){
            if(p == "CS"){
                e5.pesanCS();
            }else if(p == "Admin"){
                e5.pesanAdmin();
            }else{
                e5.pesanM(bonusBulanan);
            }
        }catch(ExceptionAlamat e6){
            e6.pesan(alamatManager);
        }catch(Exception e){
            System.out.println("MASUK SiNI");
        }finally{
            System.out.println("Kelar");
        }
        
    }
    
}
