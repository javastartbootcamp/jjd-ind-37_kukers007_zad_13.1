package pl.javastart.voting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {
        List<String> voters = new ArrayList<>();

        // możesz dowolnie dodawać / usuwać dane testowe
        voters.add("Jan Kowalski");
        voters.add("Zigniew Siobro");
        voters.add("Zbyszek Stonoga");

        Voting voting = new Voting();

        VotingResult votingResult = voting.executeVoting(voters, new Scanner(System.in));
        votingResult.printResults();
        votingResult.printVoteForVoter("Zigniew Siobro");
    }

    /**
     * Uzupełnij metodę metodę, ale nie zmieniaj jej sygnatury! (typu tego, co przyjmuje i zwraca).
     * do wczytywania danych od użytkownika użyj scannera z parametru
     * Metoda powinna pobrać głos dla każdego przekazanego głosującego i zapisać wyniki głosowania do VotingResult
     */

    VotingResult executeVoting(List<String> voters, Scanner scanner) {
        List<Vote> votes = new ArrayList<>();
        for (String voter : voters) {
            System.out.println("Jak głosuje " + voter +  "? (z - za, p - przeciw, w - wstrzymanie się)");
            String input = scanner.nextLine().toLowerCase();
            while (!input.equals("z") && !input.equals("p") && !input.equals("w")) {
                System.out.println("Niepoprawna wartość! Jak głosuje " + voter + "? (z - za, p - przeciw, w - wstrzymanie się)");
                input = scanner.nextLine().toLowerCase();
            }
            if (input.equals("z")) {
                votes.add(new Vote(voter, true));
            } else if (input.equals("p")) {
                votes.add(new Vote(voter, false));
            } else {
                votes.add(new Vote(voter, null));
            }
        }
        // to możesz (a nawet powinieneś/powinnaś) zmienić :)
        return new VotingResult(votes);
    }
}