package test;

import java.util.Scanner;

public class Kota {
	int max = 10; // Banyak data kota yang dapat di Masukan
	String[] kota = new String[max];	// pembuatan array kota
	int[][] jarak = new int[max][max];	// ---||---- array jarak
	int index = 0;	// penomeran nomer index kota
	
	void addKota(String Kota) {
		this.kota[index++] = Kota;
	}
	// Penambahan Rule Kota (Ex. Blitar --> Kediri Jaraknya 10)
	public void addEdge(String Start, String End, int jaraknya) {
		int a = 0;
		int b = 0;
		/* pembuatan Rule Array antar kota. (Contoh !!)
		*	|		Malang 		Kediri 
		*	|Malang		x		   x
		*	|Kediri		v		   x	
		*	|Blitar		x		   v	
		*	|TA		x		   x
		*	|Jombang	v		   v
		*
		*	Baris adalah 'a' dan kolom adalah 'b' (terserah di balik juga gak papa asal pembuatan rule benar)
		*/
		while (!(kota[a].equalsIgnoreCase(Start))) {
			a++;
		}
		while (!(kota[b].equalsIgnoreCase(End))) {
			b++;
		}

		jarak[a][b] = jaraknya; //Penentuan Jarak
	}

	String[] temp = {"1","2","3","4"};	//Untuk Menyimpan data kota yang di pilih dan Jarak yang sudah di tempuh
	int[] jsementara = {1,2,3,4} ;

	public void Search(String Node) {
		int a = 0, num = 0;

		while (!kota[a].equalsIgnoreCase(Node)) { //Mendapatkan Indek kota yang di cari
			a++;
		}		
		
		// Menampilkan Selanjutnya dan Menyimpan nya ke temp[];
		for (int i = 0; i < max; i++) {
			if (jarak[a][i] > 0) {
				System.out.println(++num + ". " + kota[i] + "    Jarak = " +jarak[a][i]);
				temp[num]=kota[i];
				jsementara[num]=jarak[a][i];
			}
		}
	}
	public static void main(String[] args) {
        int totalJjarak=0;
        Kota kota = new Kota();
        Scanner sc = new Scanner(System.in);

        // Input Data

        kota.addKota("Malang");
        kota.addKota("Blitar");
        kota.addKota("Kediri");
        kota.addKota("Jombang");
        kota.addKota("TA");

        kota.addEdge("Malang", "Blitar",4);
        kota.addEdge("Malang", "Kediri",3);
        kota.addEdge("Kediri", "Jombang",7);
        kota.addEdge("Kediri", "TA",8);
        kota.addEdge("Blitar", "TA",10);
        kota.addEdge("Blitar", "Malang",4);
        kota.addEdge("Kediri", "Malang",3);
        kota.addEdge("Jombang", "Kediri",7);
        kota.addEdge("TA", "Kediri",8);
        kota.addEdge("TA", "Blitar",10);


        System.out.print("Masukan Node : ");
        String input = sc.nextLine();
        kota.Search(input);
        //Input ke 2 dan dst.
        do {
                System.out.println("\nJarak Total : " +totalJjarak);
                System.out.print("Masukan Node : ");
                input = sc.nextLine();

                for(int i = 0; i < kota.temp.length; i++){ //Pengulangan untuk menentukan apakah kota Yang di iput sesuai dengan selanjutnya
                        if(kota.temp[i].equalsIgnoreCase(input)){
                                totalJjarak+=kota.jsementara[i];
                                kota.Search(input);
                                break;
                        }
                }
        } while (!input.equalsIgnoreCase("Stop"));
        System.out.println("Ty");

	}
}


