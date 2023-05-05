/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author ASUS
 */
public class IdException extends Exception{
    
    public void showMessageCS(){
        System.out.println("[!] Id CS Harus ada unsur 'CS-'[!]");
    }
    
    public void showMessageAdmin(){
        System.out.println("[!] Id Admin Harus ada unsur 'ADM-'[!]");
    }
}
