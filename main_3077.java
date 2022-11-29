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
public class main_3077 {

    public static void main(String[] args) {
        SalariedEmployee_3077 se = new SalariedEmployee_3077("Samsuddin", "20001203", 3000000);
        CommissionEmployee_3077 ce = new CommissionEmployee_3077("Fikri", "20003112", 4000000, 200000, 5);
        ProjectPlanner_3077 pp = new ProjectPlanner_3077("Hassan", "200301222", 5000000, 400000, 3);

        se.cetakSalaryEmploy_3077();
        ce.hitungGaji_3077();
        ce.cetakCommisEmploy();
        pp.hitungGaji_3077();
        pp.cetakProjectPlanEmploy_3077();
    }
}
