import java.util.Random;

public class CandidateTest {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ballot = new int[10];
        int[] votes = new int[6];
        String names[] = {"a", "b", "c", "d", "e"};
        int spoiltVotes = 0;


        for(int i = 0; i < 10; i++){
            ballot[i] = rand.nextInt(6)+1;
            if(ballot[i] >= 1 && ballot[i] <= 5)
                votes[ballot[i] - 1]++;
            else
                spoiltVotes++;
        }
        System.out.println("Total votes: " + 10);
        System.out.println("Spoilt Votes: " + spoiltVotes);

        Candidate[] candidate = new Candidate[5];
        for(int i = 0; i < 5; i++)  {
            candidate[i] = new Candidate(names[i], votes[i], i+1);
        }

        for (int i = 0; i < 5; i++) {
            candidate[i].printVotes();
        }

    }
}
