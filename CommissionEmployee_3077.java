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
public class CommissionEmployee_3077 extends Employee_3077{
    private int gajiPokok_3077,komisi_3077,totalPenjualan_3077;
    public CommissionEmployee_3077(String Nama, String Nip, int Gaji, int komisi, int totalPenjualan) {
        super(Nama, Nip, Gaji);
        this.gajiPokok_3077 = Gaji;
        this.komisi_3077 = komisi;
        this.totalPenjualan_3077 = totalPenjualan;
    }
    
    public int hitungGaji_3077(){
        gaji_3077 =  gajiPokok_3077 + (komisi_3077 * totalPenjualan_3077);
        return gaji_3077;
    }
    
    public void cetakCommisEmploy(){
        super.cetakEmployee_3077();
        System.out.println("Total Gaji : "+gaji_3077);
    }

}
