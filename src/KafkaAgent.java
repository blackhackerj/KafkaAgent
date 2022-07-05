import java.util.Scanner;

public class KafkaAgent {
    public static void main(String[] args) throws Exception {
        System.out.println("'p' for producer and 'c' for consumer.");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            if(sc.next().equalsIgnoreCase("p")){
                producer.produce("127.0.0.1:9092", "testTopic");
                break;
            }else if(sc.next().equalsIgnoreCase("c")){
                consumer.consume("127.0.0.1:9092", "testID_1", "testTopic");
                break;
            }else{
                System.out.println("'p' for producer and 'c' for consumer.");
            }
        }
        
    }
}
