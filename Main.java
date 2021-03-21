import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
    String nm, nmf;
    int id, ore, idf, oref;
		File f = new File("test.txt");
	  Scanner sfile = new Scanner(f);//Scanner collegato al file
    pro = 99;
    while (pro!=0){
      System.out.println("Scegli il programma:");
      System.out.println("1) Inserimento di turni di lavoro");
      System.out.println("2) Lista delle persone ");
      System.out.println("3) Resoconto totale di una persona.");
      System.out.println("4) Totale ore registrate");
      System.out.println("0) Esci");
      int pro=nextInt();
      if (pro==1){
        System.out.print("Inserire Nome: ");
				nm = s.nextLine();
        System.out.print("Inserisci ID:");
        id = s.nextInt();
        System.out.print("Inserisci Ore di lavoro:");
        ore = s.nextInt();
        fw.write(nm+", ",id+", ",ore);
      }
      else if(pro==2){
        while (sfile.hasNextLine()) { // Lettura del file
          var str = sfile.nextLine();
          var res = str.split(", ");
          nm = res[0];
          System.out.print(nm+", ");
        }
      }
      else if(pro==3){
        System.out.print("Inserisci nome della persona che cerci: ");
        nmin = s.nextLine();
        while (sfile.hasNextLine()) { // Lettura del file
          var str = sfile.nextLine();
          var res = str.split(", ");
          nm = res[0];
          oref = res[2];
          int num = Integer.parseInt(ore);
          if(nm==nmin){
            ore=num+ore;
          }
        }
      }
      else if(pro==4){
        while (sfile.hasNextLine()) { // Lettura del file
          var str = sfile.nextLine();
          var res = str.split(", ");
          nm = res[0];
          oref = res[2];
          int num = Integer.parseInt(ore);
          ore=num+ore;
        }
        System.out.print("Le ore totali sono: "+ ore);
      }

	}

}   