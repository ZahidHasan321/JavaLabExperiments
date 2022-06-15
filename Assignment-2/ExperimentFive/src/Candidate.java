public class Candidate {
    private String name;
    private int votes;
    private int candidateNumber;

    public Candidate()  {

    }

    public Candidate(String name, int votes, int candidateNumber) {
        this.name = name;
        this.votes = votes;
        this.candidateNumber = candidateNumber;
    }

    public void printVotes()  {
        System.out.println(candidateNumber + "." + name + ": " + votes );
    }
}
