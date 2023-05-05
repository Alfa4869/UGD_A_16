package exception;

public class ExceptionNomorTelepon extends Exception{
    public void pesan(){
        System.out.println("[!] Nomor telepon harus antara 11-13 digits [!]");
    }
    
}
