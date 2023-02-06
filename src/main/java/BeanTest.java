import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Quote quoteOne = new Quote();
        Quote quoteTwo = new Quote();
        Quote quoteThree = new Quote();



        quoteOne.setAuthor("Nelson Mandela");
        quoteOne.setContent("The greatest glory in living lies not in never falling, but in rising every time we fall.");

        quoteTwo.setAuthor("Walt Disney");
        quoteTwo.setContent("The way to get started is to quit talking and begin doing.");

        quoteThree.setAuthor("Steve Jobs");
        quoteThree.setContent("Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking.");


        ArrayList<Quote> quotes = new ArrayList<>();

        quotes.add(quoteOne);
        quotes.add(quoteTwo);
        quotes.add(quoteThree);

       for (int i = 0 ; i <= quotes.size(); i++){
           if (i == quotes.size()){
               System.out.println("-------------");
               return;
           }
           if(i == 0){
               System.out.println("Author | Quote");
               System.out.println("_____________");
           }
           Quote current = quotes.get(i);
           System.out.println(current.getAuthor() + " | " + current.getContent());

       }

    }
}
