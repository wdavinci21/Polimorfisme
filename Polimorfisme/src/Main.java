/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wun
 */
public class Main {
    public static void main (String[] argv){
        Pegawai p = new Pegawai();
        p = new Programmer(); //poli
        p = new Manajer(); //poli
        
        //Manajer m = new Programmer();
        
        Manajer m= new Manajer ();
        m.gajiPokok = 1000000;
        m.nama = "Nazwa";
        m.tunjangan = 5000;
        p = m; //polimorfisme
        p.tampilData(); //Virtual Method Invocation - VMI
        
        m.tampilData(); //Bukan VMI karena bukan objek poli
        
        Pegawai[] arrPeg = new Pegawai [3];
        Programmer pr = new Programmer ();
        pr.nama = "Febu"; pr.gajiPokok = 100000; pr.bonus = 120000;
        pr.tampilData();
        arrPeg[0] = p;
        arrPeg[1] = m;
        arrPeg[2] = pr;
        //arrPeg[0].tampilData();
        //arrPeg[1].tampilData();
        arrPeg[2].tampilData();
        
        hitungGajiTotal(m);
        hitungGajiTotal(pr);
    }
    
    public static void hitungGajiTotal(Pegawai p){
        if(p instanceof Programmer){
            Programmer prog = (Programmer) p;
            int gajiTot = prog.bonus+prog.gajiPokok;
            System.out.println("Gaji Total Programmer = "+gajiTot);
    } else if (p instanceof Manajer){
        Manajer man = (Manajer) p;
        int gajiTot = man.tunjangan+man.gajiPokok;
        System.out.println("Gaji Total Manajer = "+gajiTot);
    }
    }
}
