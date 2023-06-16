//20. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.
//If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?
//[Extract the digits from the paragraph and calculate the price]

public class Calculate_the_Price {
        public static void main(String args[]) {
            String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

            str = str.replaceAll("[^\\d]", " ");
            str = str.trim();
            str = str.replaceAll(" +", " ");
            String st[] = (str.split(" "));

            int laptop = Integer.parseInt(st[1]);
            int mouse = Integer.parseInt(st[2]);
            int quantity = Integer.parseInt(st[3]);
            int vat = Integer.parseInt(st[4]);
            System.out.println("Laptop: "+laptop+" tk");
            System.out.println("Mouse: "+mouse+" tk");
            System.out.println("vat: "+vat+"%");
            System.out.println("Total : "+(((laptop+mouse)*quantity)*15)/100+" tk");
        }
    }
