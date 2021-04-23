import java.util.Scanner;

public class Rictangle {
    private int canh1;
    private int canh2;
    private int canh3;

    public Rictangle() {
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }
    public void NhapCanh(){

           try {
               Scanner scanner = new Scanner(System.in);
               System.out.println("Nhập cạnh thứ nhất: ");
               canh1 = Integer.parseInt(scanner.nextLine());
               if (canh1 < 0) {
                   throw new NumberFormatException();
               }
               System.out.println("Nhập cạnh thứ hai: ");
               canh2 = Integer.parseInt(scanner.nextLine());
               if (canh2 < 0) {
                   throw new NumberFormatException();
               }
               System.out.println("Nhập cạnh thứ ba: ");
               canh3 = Integer.parseInt(scanner.nextLine());
               if (canh3 < 0) {
                   throw new NumberFormatException();
               }
               int x = canh1 + canh2;
               int y = canh2 + canh3;
               int z = canh1 + canh3;
               if (canh3 > x || canh2 > z || canh3 > y) {
                   throw new NullPointerException();

               }

           } catch (NumberFormatException e) {
               System.out.println("lỗi");
           } catch (NullPointerException e) {
               System.out.println("Lỗi");
           }

    }
    public void showRictangle(){
        System.out.printf("\t\t%-20s %-20s %-20s","Canh1","canh2","canh3");
        System.out.println();
        System.out.printf("\t\t%-20d %-20d %-20d",canh1,canh2,canh3 );
    }
}
