
package tugas01;



public class ClassInti {

    
    public void tambah(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil pertambahan: " + hasil);
    }

   
    public void perkurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil perkurangan : " + hasil);
    }

    
    public void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil perkalian : " + hasil);
    }


    public void pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
        } else {
            int hasil = a / b;
            System.out.println("Hasil pembagian : " + hasil);
        }
    }
    public void modulus (int a, int b){
         int hasil = a%b;
         System.out.println("hasil modulus : " + hasil);
    }

}