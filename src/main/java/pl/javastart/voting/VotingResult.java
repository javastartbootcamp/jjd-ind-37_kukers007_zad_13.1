package pl.javastart.voting;

import java.util.List;

/**
 * Możesz dodać kolejne metody i pola do klasy. Nie zmieniaj istniejących metod.
 */
public class VotingResult {
    List<Vote> votes;

    VotingResult(List<Vote> votes) {
        this.votes = votes;
    }

    /**
     * Metoda powinna drukować wyniki głosowania w takiej postaci:
     * Głosów za: 56.53%
     * Głosów przeciw: 35.00%
     * Wstrzymało się: 8.47%
     */
    void printResults() {
        float voteFor = 0;
        float voteAgainst = 0;
        float abstension = 0;
        for (Vote vote : votes) {
            if (vote.getVote() == null) {
                abstension++;
            } else if (vote.getVote().equals(true)) {
                voteFor++;
            } else {
                voteAgainst++;
            }
        }
        float votesFor = voteFor / votes.size() * 100;
        float votesAgainst = voteAgainst / votes.size() * 100;
        float abstenion = abstension / votes.size() * 100;
        System.out.printf("Głosów za: %.2f%%\n", votesFor);
        System.out.printf("Głosów przeciw: %.2f%%\n", votesAgainst);
        System.out.printf("Wstrzymało się: %.2f%%\n", abstenion);
        // metoda powinna drukować wyniki głosowania
    }

    /**
     * Metoda przyjmuje imię i nazwisko głosującego, np "Zigniew Siobro".
     * Uzupełnij tę metodę, żeby drukowała informację w formie:
     * Zigniew Siobro: ZA
     * Nie zmieniaj sygnatury tej metody!
     */
    void printVoteForVoter(String voterName) {
        for (Vote vote : votes) {
            if (vote.getVoter().equals(voterName)) {
                System.out.println(vote.getVoter() + ": " + voteConversion(vote.getVote()));
            }
        }
    }

    private String voteConversion(Boolean vote) {
        if (vote == null) {
            return "WSTRZYMAŁ SIĘ";
        }
        if (!vote) {
            return "PRZECIW";
        } else {
            return "ZA";
        }
    }
}
