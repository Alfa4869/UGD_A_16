/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_a_16;

import Exception.NameException;
import Exception.GajiPokokException;
import Exception.NoTelpException;

/**
 *
 * @author ASUS
 */
public abstract class Pegawai {
    String namaPegawai, noTelpPegawai;
    float gajiPokok;

    public Pegawai(String namaPegawai, String noTelpPegawai, float gajiPokok) throws NameException, GajiPokokException, NoTelpException {
        
        if (namaPegawai.length() ==0) {
            throw new NameException();
        }else if(noTelpPegawai.length()<11 || noTelpPegawai.length()>13){
            throw new NoTelpException();
        }else if(gajiPokok < 2000000){
            throw new GajiPokokException();
        }else{
            this.namaPegawai = namaPegawai;
            this.noTelpPegawai = noTelpPegawai;
            this.gajiPokok = gajiPokok;
        }
        
        
    }
    
    public void showData(){
        
    }
    
    
}
