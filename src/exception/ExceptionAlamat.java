package exception;

public class ExceptionAlamat extends Exception {
    
    public void pesan(String alamat){
        System.out.println("[!] " +alamat +" tidak diawali dengan 'jln.' [!]");
    }
    
}
