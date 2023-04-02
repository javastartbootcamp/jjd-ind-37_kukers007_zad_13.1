package pl.javastart.voting;

/**
 * Możesz dodać kolejne metody i pola do klasy. Nie zmieniaj istniejących metod.
 */
public class VotingResult {
    float percentVotesFor;
    float percentVotesAgainst;
    float percentAbstentions;

    public VotingResult(float percentVotesFor, float percentVotesAgainst, float percentAbstentions) {
        this.percentVotesFor = percentVotesFor;
        this.percentVotesAgainst = percentVotesAgainst;
        this.percentAbstentions = percentAbstentions;

    }

    public float getPercentVotesFor() {
        return percentVotesFor;
    }

    public void setPercentVotesFor(float percentVotesFor) {
        this.percentVotesFor = percentVotesFor;
    }

    public float getPercentVotesAgainst() {
        return percentVotesAgainst;
    }

    public void setPercentVotesAgainst(float percentVotesAgainst) {
        this.percentVotesAgainst = percentVotesAgainst;
    }

    public float getPercentAbstentions() {
        return percentAbstentions;
    }

    public void setPercentAbstentions(float percentAbstentions) {
        this.percentAbstentions = percentAbstentions;
    }

    /**
     * Metoda powinna drukować wyniki głosowania w takiej postaci:
     * Głosów za: 56.53%
     * Głosów przeciw: 35.00%
     * Wstrzymało się: 8.47%
     */
    public void printResults() {
        System.out.printf("Głosów za: %.2f%%\n", percentVotesFor);
        System.out.printf("Głosów przeciw: %.2f%%\n", percentVotesAgainst);
        System.out.printf("Wstrzymało się: %.2f%%\n", percentAbstentions);
        // metoda powinna drukować wyniki głosowania
    }

    /**
     * Metoda przyjmuje imię i nazwisko głosującego, np "Zigniew Siobro".
     * Uzupełnij tę metodę, żeby drukowała informację w formie:
     * Zigniew Siobro: ZA
     * Nie zmieniaj sygnatury tej metody!
     */
    public void printVoteForVoter(String voterName) {
        System.out.println(voterName);
    }
}
