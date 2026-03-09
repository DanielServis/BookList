import java.util.ArrayList;

public class SearchTitle {

    public static Book SearchTitle (ArrayList<Book> books, String TargetTitle) {

        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = (left + right)/2;
            Book midBook = books.get(mid);
            int comparison = midBook.getTitle().compareToIgnoreCase(TargetTitle);

            if(comparison == 0){
                return midBook;
            }
            else if(comparison > 0){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return null;
    }
}