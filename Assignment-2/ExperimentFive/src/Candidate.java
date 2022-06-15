import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Candidate {
    Random rand = new Random();

    LinkedHashMap<String, Integer> candidates = new LinkedHashMap<>(5);
    private int[] ballot = new int[10];
    private int[] votes = new int[6];
    String names[] = {"a", "b", "c", "d", "e"};
    private int spoiltVotes = 0;

    public void calculateVotes()    {
        for(int i = 0; i < 10; i++) {
            ballot[i] = rand.nextInt(6) + 1;
            if (ballot[i] >= 1 && ballot[i] <= 5)
                votes[ballot[i] - 1]++;
            else
                spoiltVotes++;
        }
        System.out.println("Spoil votes: " + spoiltVotes);
    }

    Candidate()  {
        calculateVotes();
        initialize();
    }

    public void initialize(){
        for(int i = 0; i < 5; i++)  {
            candidates.put(names[i], votes[i]);
        }
    }

    public void print() {
        for(Map.Entry<String,Integer> candidate : candidates.entrySet()) {
            System.out.println(candidate.getKey() + ": "+ candidate.getValue());
        }
    }

}
