
import java.util.Scanner;
public class searchCostumer {

   private String name ;
   private String adress;

    public void SetName(String nome){
        name = nome;

    }
    public String getName(){
        return  name;
    }

    public String searchCostumer(){

        this.name = name;
        this.adress = adress;


        System.out.println("enter you name: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

       return  name;
    }


}
