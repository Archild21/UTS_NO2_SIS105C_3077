/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO2_SIS105C_3077;

/**
 * @author Nicodemus
 * 21103077
 * SIS105C
 */
public class Employee_3077{
    protected String nama_3077,nip_3077;
    protected int gaji_3077;
    public Employee_3077(String Nama, String Nip,int Gaji){
        this.nama_3077 = Nama;    
        this.nip_3077 = Nip;
        this.gaji_3077 = Gaji;
    }
    
    public void cetakEmployee_3077(){
        System.out.println("Nama Pegawai : "+nama_3077);
        System.out.println("NIP : "+nip_3077);
    }
}
