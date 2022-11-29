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
public class ProjectPlanner_3077 extends Employee_3077{
    private int pajak_3077,gajiPokok_3077,komisi_3077,totalHasilProyek_3077;
    public ProjectPlanner_3077(String Nama, String Nip, int Gaji, int komisi, int totalHasilProyek) {
        super(Nama, Nip, Gaji);
        gajiPokok_3077 = Gaji;
        komisi_3077 = komisi;
        totalHasilProyek_3077 = totalHasilProyek;
    }
    
    public int hitungGaji_3077(){
        pajak_3077 = (int) (gajiPokok_3077 * 0.05);
        gaji_3077 =  gajiPokok_3077 + (komisi_3077 * totalHasilProyek_3077) - pajak_3077;
        return gaji_3077;
    }
    
    public void cetakProjectPlanEmploy_3077(){
        super.cetakEmployee_3077();
        System.out.println("Total Gaji : "+gaji_3077);
    }
    
}
