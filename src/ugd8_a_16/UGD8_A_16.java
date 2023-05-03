/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd8_a_16;
import Exception.NameException;
import Exception.GajiPokokException;
import Exception.NoTelpException;
import Exception.IdException;
import Exception.BonusException;



import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author ASUS
 */
public class UGD8_A_16 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama, noTelp, id;
        float gajiPokok, bonus;
        
        String see = "";
        
        
        try{
            
            see = "CS";
            // CS
            System.out.println("Masukan Nama        : "); nama = br.readLine();
            System.out.println("Masukan Nomor Telp  : "); noTelp = br.readLine();
            System.out.println("Masukan Gaji Pokok  : "); gajiPokok = Float.parseFloat(br.readLine());
            System.out.println("Masukan ID CS       : "); id = br.readLine();
            System.out.println("Masukan Bonus       : "); bonus = Float.parseFloat(br.readLine());
            
            CustomerService CS = new CustomerService(id,bonus,nama,noTelp, gajiPokok);
            CS.showData();
            
            
            see = "Admin";
            // Admin
            System.out.println("Masukan Nama        : "); nama = br.readLine();
            System.out.println("Masukan Nomor Telp  : "); noTelp = br.readLine();
            System.out.println("Masukan Gaji Pokok  : "); gajiPokok = Float.parseFloat(br.readLine());
            System.out.println("Masukan ID Admin    : "); id = br.readLine();
            System.out.println("Masukan Bonus       : "); bonus = Float.parseFloat(br.readLine());
            
            Admin Ad = new Admin(id,bonus,nama,noTelp, gajiPokok);
            Ad.showData();
            
        }catch(NameException e){
            e.showMessage();
        }catch(GajiPokokException e){
            e.showMessage();
        }catch(NoTelpException e){
            e.showMessage();
        }catch(IdException e){
            if (see == "cS") {
                e.showMessageCS();
            }else{
                e.showMessageAdmin();
            }
            e.showMessage();
        }catch(BonusException e){
            e.showMessage();
        }catch(Exception e){
            System.out.println("error di readline");
        }
    }
    
}
