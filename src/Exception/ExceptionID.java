package exception;

public class ExceptionID extends Exception{
    public void pesanAdmin(){
        System.out.println("[!] ID Admin harus ada unsur 'ADM-' [!]");
    }
    
    public void pesanCS(){
        System.out.println("[!] ID Customer Service harus ada unsur 'CS-' [!]");
    }
    
    public void pesanM(String idm){
        System.out.println("[!] "+idm+ " tidak diawali dengan 'MNGR-' ");
    }
    
}
