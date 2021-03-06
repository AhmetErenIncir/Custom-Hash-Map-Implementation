import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    BinaryTree<Integer> binaryTree = new BinaryTree<>();

    long time;
    Instant start , end;

    HashTableBST<Integer,Integer> hashTableBST = new HashTableBST<>();
    ArrayList<Long> BtTime = new ArrayList<>();
    HashtableOpen<Integer,Integer> hashtableOpen = new HashtableOpen<>();
    ArrayList<Long> OpenTime = new ArrayList<>();
    HashtableChain<Integer,Integer> hashtableChain = new HashtableChain<>();
    ArrayList<Long> ChainTime = new ArrayList<>();


    Random random = new Random();


    start = Instant.now();
    for(int i=0 ; i<100000 ; i++){
        hashTableBST.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    BtTime.add(time);

    start = Instant.now();
    for(int i=0 ; i<200000 ; i++){
        hashTableBST.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    BtTime.add(time);

    start = Instant.now();
    for(int i=0 ; i<400000 ; i++){
        hashTableBST.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    BtTime.add(time);

    start = Instant.now();
    for(int i=0 ; i<100000 ; i++){
        hashtableOpen.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    OpenTime.add(time);

    start = Instant.now();
    for(int i=0 ; i<200000 ; i++){
        hashtableOpen.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    OpenTime.add(time);

    start = Instant.now();
    for(int i=0 ; i<400000 ; i++){
        hashtableOpen.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    OpenTime.add(time);

    start = Instant.now();
    for(int i=0 ; i<100000 ; i++){
        hashtableChain.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    ChainTime.add(time);

    start = Instant.now();
    for(int i=0 ; i<200000 ; i++){
        hashtableChain.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    ChainTime.add(time);

    start = Instant.now();
    for(int i=0 ; i<400000 ; i++){
        hashtableChain.put(i,random.nextInt()%10000);
    }
    end = Instant.now();
    time = Duration.between(start,end).toMillis();
    ChainTime.add(time);


    System.out.println("HashTableBT : ");
    for (int i=0 ; i<3 ; i++){
        System.out.print(BtTime.get(i) + " ms ");
    }
    System.out.println("\nHashtableOpen : ");
    for (int i=0 ; i<3 ; i++){
        System.out.print(OpenTime.get(i) + " ms ");
    }
    System.out.println("\nHahTableChain : ");
    for (int i=0 ; i<3 ; i++){
        System.out.print(ChainTime.get(i) + " ms ");
    }

    System.out.println();
    System.out.println("\nTest of HashTableBSt methods : ");
    System.out.println("Test of put and get methods :");
    System.out.println("100 adding into 17. index of table");
    hashTableBST.put(17,100);
    System.out.println(hashTableBST.get(17) + " Added!");
    System.out.println("Test of remove method : ");
    System.out.println("Removing table's 17th index element : ");
    System.out.println( hashTableBST.remove(17) + " removed!");

    }

}
