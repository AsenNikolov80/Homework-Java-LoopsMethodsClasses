package loopsMethodsClasses;

	

    import java.util.ArrayList;
     
     
    public class test {
     
            public static void main(String[] args) {
                    String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A"};
                    String[] faces = {"♣", "♦", "♥", "♠" };
                    int fullHouseCount = 0;
                    ArrayList<String> allCards = new ArrayList<String>();
                    for (String card : cards) {
                            for(String face : faces){
                                    String tempcard = card+face;
                                    allCards.add(tempcard);
                            }
                    }
                    for (String card1 : allCards) {
                            for (String card2 : allCards) {
                                    for (String card3 : allCards) {
                                            for (String card4 : allCards) {
                                                    for (String card5 : allCards) {
                                                            if(card1.charAt(0)==card2.charAt(0)&&card2.charAt(0)==card3.charAt(0)){
                                                                    if(card4.charAt(0)!=card1.charAt(0)&&card4.charAt(0)==card5.charAt(0)){
                                                                            System.out.printf("(%s%s%s%s%s)%n",card1,card2,card3,card4,card5);
                                                                            fullHouseCount++;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                    System.out.println(fullHouseCount);
            }
    }

