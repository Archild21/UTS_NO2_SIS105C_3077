/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO2_SIS105C_3077;

/**
 *
 * @author LENOVO
 */
public class SalariedEmployee_3077 extends Employee_3077{
    private int upahMingguan_3077;
    public SalariedEmployee_3077(String Nama, String Nip, int Gaji) {
        super(Nama, Nip, Gaji);
        this.upahMingguan_3077 = Gaji;
    }
    
    public void cetakSalaryEmploy_3077(){
        super.cetakEmployee_3077();
        System.out.println("Upah Mingguan : "+upahMingguan_3077);
    }
    
    
}
