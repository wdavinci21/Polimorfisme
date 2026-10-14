/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wun
 */
public class Manajer extends Pegawai{
    public int tunjangan;
    
    @Override
    public void tampilData(){
        System.out.println("========== TAMPIL DATA MANAJER ==========");
        super.tampilData();
        System.out.println("Tunjangan = "+tunjangan);
        System.out.println("=========================================");
        System.out.println("");
    }
}
