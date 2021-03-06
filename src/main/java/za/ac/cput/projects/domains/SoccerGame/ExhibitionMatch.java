package za.ac.cput.projects.domains.SoccerGame;

import java.util.Objects;

public class ExhibitionMatch {
    private String scoreResult;
    private String playerWon;
    private boolean homeAway;


    public ExhibitionMatch() {
    }

    private ExhibitionMatch(Builder builder) {
        this.scoreResult = builder.scoreResult;
        this.playerWon = builder.playerWon;
        this.homeAway = builder.homeAway;
    }

    public String getScoreResult() {
        return scoreResult;
    }

    public String getPlayerWon() {
        return playerWon;
    }

    public boolean isHomeAway() {
        return homeAway;
    }

    public static class Builder{

        private String scoreResult;
        private String playerWon;
        private boolean homeAway;

        public Builder scoreResult(String scoreResult) {
            this.scoreResult = scoreResult;
            return this;
        }

        public Builder playerWon(String playerWon) {
            this.playerWon = playerWon;
            return this;
        }


        public Builder homeAway(boolean homeAway) {
            this.homeAway = homeAway;
            return this;
        }

        public ExhibitionMatch build() {
            return new ExhibitionMatch(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExhibitionMatch that = (ExhibitionMatch) o;
        return isHomeAway() == that.isHomeAway() &&
                Objects.equals(getScoreResult(), that.getScoreResult()) &&
                Objects.equals(getPlayerWon(), that.getPlayerWon());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getScoreResult(), getPlayerWon(), isHomeAway());
    }

    @Override
    public String toString() {
        return "ExhibitionMatch{" +
                "scoreResult='" + scoreResult + '\'' +
                ", playerWon='" + playerWon + '\'' +
                ", homeAway=" + homeAway +
                '}';
    }
}
