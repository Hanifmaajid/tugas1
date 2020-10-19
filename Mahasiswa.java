/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HANIF MAAJID
 */
import java.util.Scanner;
public class Mahasiswa {
    private String nama;
    private String nim;
    private String alamat;
    private float uts;
    private float uas;
    private float nilai;

    public Mahasiswa(String nama, String nim, String alamat, float uts, float uas, float nilai) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.uts = uts;
        this.uas = uas;
        this.nilai = (uts+uas)/2;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setUts(float uts){
        this.uts = uts;
    }
    
    public void setUas(float uas){
        this.uas = uas;
    }
    public void setNilai(float nilai){
        this.nilai = (uts+uas)/2;
    }
    
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public float getUts(){
        return uts;
    }
    
    public float getUas(){
        return uas;
    }
    public float getNilai(){
        return nilai;
    }
    
}
