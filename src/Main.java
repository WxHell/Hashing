import java.util.*;

public class Main {
    public static void main(String[] args) {
        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";
        String fText ="HELLO";
        List<String>list = Arrays.asList(
                aText,bText,cText,dText,eText,fText
        );
        list.forEach(s -> System.out.println(s + ": "+s.hashCode()));//hascode verir sayı döndürür
        Set<String> mySet = new HashSet<>(list);
        System.out.println("mySet = "+mySet);//Hello,HELLO ve hello verir
        System.out.println("# of elements = "+mySet.size());


        PlayingCard aceHearts = new PlayingCard("Hearts","Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs","King");
        PlayingCard queenSpades = new PlayingCard("Spades","Queen");

        List<PlayingCard> cards =
                Arrays.asList(aceHearts,kingClubs,queenSpades);
        cards.forEach(s -> System.out.println(s + ": "+s.hashCode()));

        Set<PlayingCard>deck = new HashSet<>();
        for (PlayingCard c : cards){
            if (!deck.add(c)){
                System.out.println("Found a duplice for " + c);
            }
        }
        System.out.println(deck);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.hashCode());
        String ronaldo = "ronaldo";
        if (ronaldo.hashCode() == name.hashCode()){
            System.out.println("pat");
        }else  {
            System.out.println("wrong");
        }
    }
}
//ava’da küme(set) arayüzünün en önemli özelliği veri tekrarına izin vermeyerek uniqe elemanlar üretmemize olanak
// sağlıyor olmasıdır. Ek olarak List arayüzü gibi doğrudan index erişimine izin vermez fakat ilk ve son elemanına doğrudan
//erişebiliriz. Ayrıca null değerli elemanlar içerebilir, içerdiği null değerleri eşsiz hashcode ile barındırır.
//HashSet arayüzü verileri düzensiz sıralar, performans olarak tasarruf etmenizi sağlar.
//HashLinkedSet ise verileri eklenen sıraya göre düzenli tutar eğer verilerin sırası önemli değilse HashLinkedSet size
// ekstra maaliyet oluşturacaktır.