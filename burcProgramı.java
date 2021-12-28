import java.util.Scanner;

public class burcProgramı {
    public static void main(String[] args) {
        int month,day;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        month= inp.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day= inp.nextInt();

        if((month>12)||(day>31)){
            System.out.print("Hatalı giriş yaptınız");
        }
        if((month==2)&&(day>28)){
            System.out.print("Hatalı giriş yaptınız");
        }

        if((month==1)&&(day<=21)){
            System.out.print("Oğlak burcusunuz");
        }
        if((month==1)&&(day>21)){
            System.out.print("Kova burcusunuz");
        }
        if((month==2)&&(day<=19)){
            System.out.print("Kova burcusunuz");
        }
        if((month==2)&&(day>19)){
            System.out.print("Balık burcusunuz");
        }
        if((month==3)&&(day<=20)){
            System.out.print("Balık burcusunuz");
        }
        if((month==3)&&(day>20)){
            System.out.print("Koç burcusunuz");
        }
        if((month==4)&&(day<=20)){
            System.out.print("Koç burcusunuz");
        }
        if((month==4)&&(day>20)){
            System.out.print("Boğa burcusunuz");
        }
        if((month==5)&&(day<=21)){
            System.out.println("Boğa burcusunuz");
        }
        if((month==5)&&(day>21)){
            System.out.print("İkizler burcusunuz");
        }
        if((month==6)&&(day<=22)){
            System.out.print("İkizler burcusunuz");
        }
        if((month==6)&&(day>22)){
            System.out.print("Yengeç burcusunuz");
        }
        if((month==7)&&(day<=22)){
            System.out.print("Yengeç burcusunuz");
        }
        if((month==7)&&(day>22)){
            System.out.print("Aslan burcusunuz");
        }
        if((month==8)&&(day<=23)){
            System.out.print("Aslan burcusunuz");
        }
        if((month==8)&&(day>23)){
            System.out.print("Başak burcusunuz");
        }
        if((month==9)&&(day<=22)){
            System.out.print("Başak burcusunuz");
        }
        if((month==9)&&(day>22)){
            System.out.print("Terazi burcusunuz");
        }
        if((month==10)&&(day<=22)){
            System.out.print("Terazi burcusunuz");
        }
        if((month==10)&&(day>22)){
            System.out.print("Akrep burcusunuz");
        }
        if((month==11)&&(day<=21)){
            System.out.print("Akrep burcusunuz");
        }
        if((month==11)&&(day>21)){
            System.out.print("Yay burcusunuz");
        }
        if ((month==12)&&(day<=21)){
            System.out.print("Yay burcusunuz");
        }
        if((month==12)&&(day>21)){
            System.out.print("Oğlak burcusunuz");
        }


    }
}
