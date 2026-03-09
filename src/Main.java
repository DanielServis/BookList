import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Shelf main = new Shelf();
        main.add("To kill a mockingbird", "Harper Lee", "English", "Southern Fiction", "Arrow Books", 1960, 9780099419785L);
        main.add("1984", "Gorgor Well", "English", "Dystopian Fiction", "Secker & Warburg", 1949, 9780008322069L);
        main.add("Dracula", "Bram Stroker", "English", "Horror Fiction", "Archibald Constable and Company", 1897, 9780558602946L);
        main.add("More power", "Christopher Dodd", "English", "Sport Autobiography", "HQ", 2021, 9780094839355L);

        while(true)
        {
            String phrase = input.nextLine();
        }
    }
}