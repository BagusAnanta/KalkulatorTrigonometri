package com.LatihanSederhana;
import java.util.Scanner;
import java.text.DecimalFormat;

class Rumus{
  Scanner Userinput = new Scanner(System.in);
  double Input;

  public void Pilihan(){
    Scanner UserInput = new Scanner(System.in);

    System.out.println("Kalkulator Trigonometri");
    System.out.println("1) Sin");
    System.out.println("2) Cos");
    System.out.println("3) Tan");
    System.out.print("Masukkan Pilihan : ");
    String PilihanUser = UserInput.next();
  
    switch (PilihanUser){
      case "1":
      RumusSin();
      break;
      case "2":
      RumusCos();
      break;
      case "3":
      RumusTan();
      break;

      default :
      System.out.println("Pilihan Tidak Ada, silahkan ulangi lagi ");
    }
  }

  

  private double RumusSin(){
    System.out.println("===== Sin =====");
    System.out.print("Masukkan Angka (Dalam Derajat) : ");
    Input = Userinput.nextDouble();

    // Rumus
    double Hitung = Math.sin(Input);
    System.out.println("Hasil Perhitungan : " + Hitung);
    Pilihan(Hitung);
    return Hitung;
  }

  private double RumusCos(){
    System.out.println("===== Cos =====");
    System.out.println("Masukkan Angka (Dalam Derajat) : ");
    Input = Userinput.nextDouble();

    // Rumus 
    double Hitung = Math.cos(Input);
    System.out.println("Hasil Perhitungan : " + Hitung);
    Pilihan(Hitung);
    return Hitung;
  }

  private double RumusTan(){
    System.out.println("===== Tan =====");
    System.out.println("Masukkan Angka (Dalam Derajat) : ");
    Input = Userinput.nextDouble();

    // Rumus
    double Hitung = Math.tan(Input);
    System.out.println("Hasil Perhitungan : " + Hitung);
    Pilihan(Hitung);
    return Hitung;
  }

  private void Pilihan (double Hasil){
    Scanner UserInput = new Scanner(System.in);
    DecimalFormat formatData = new DecimalFormat("#.#####");
    System.out.println("Apakah Anda Ingin meringkas Angkanya ? (y/n)");
    System.out.print("Jawaban : ");
    String PilihanUser = UserInput.next();

    if (PilihanUser.equals("y")){
      formatData.format(Hasil);
      System.out.println("Hasil : " + Hasil);
    } else {
      System.out.println("Program Usai");
    }
  }

}

public class ProgramKalkulatortrigonometri {
    public static void main(String[] args) {
        Rumus rumus1 = new Rumus();
        rumus1.Pilihan();
    }
}
