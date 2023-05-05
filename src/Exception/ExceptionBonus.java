package exception;

public class ExceptionBonus extends Exception{
    public void pesanAdmin(){
        System.out.println("[!] Bonus lembur Admin harus antara 500.000 sampai 1.200.000 [!]");
    }
    
    public void pesanCS(){
        System.out.println("[!] Bonus lembur Customer Service harus antara 300.000 sampai 1.000.000 [!]");
    }
    
    public void pesanM(float bonus){
        System.out.println("[!] Bonus Bulanan harus diantara 600000 sampai 1400000 bukan "+bonus);
    }
    
}
