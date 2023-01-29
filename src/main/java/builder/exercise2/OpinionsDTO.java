package builder.exercise2;

import java.util.List;

public class OpinionsDTO {

    private int fiveStarsOpinions;
    private int fourStarsOpinions;
    private int threeStarsOpinions;
    private int twoStarsOpinions;
    private int oneStarsOpinions;
    private double averageOfStars;
    private List<String> comments;

    private OpinionsDTO(int fiveStarsOpinions, int fourStarsOpinions, int threeStarsOpinions, int twoStarsOpinions, int oneStarsOpinions, double averageOfStars, List<String> comments) {
        this.fiveStarsOpinions = fiveStarsOpinions;
        this.fourStarsOpinions = fourStarsOpinions;
        this.threeStarsOpinions = threeStarsOpinions;
        this.twoStarsOpinions = twoStarsOpinions;
        this.oneStarsOpinions = oneStarsOpinions;
        this.averageOfStars = averageOfStars;
        this.comments = comments;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "OpinionsDTO{" +
                "fiveStarsOpinions=" + fiveStarsOpinions +
                ", fourStarsOpinions=" + fourStarsOpinions +
                ", threeStarsOpinions=" + threeStarsOpinions +
                ", twoStarsOpinions=" + twoStarsOpinions +
                ", oneStarsOpinions=" + oneStarsOpinions +
                ", averageOfStars=" + averageOfStars +
                ", comments=" + comments +
                '}';
    }

    public static class Builder {
        private int fiveStarsOpinions;
        private int fourStarsOpinions;
        private int threeStarsOpinions;
        private int twoStarsOpinions;
        private int oneStarsOpinions;
        private double averageOfStars;
        private List<String> comments;


        public Builder buildFiveStarsOpinions(int fiveStarsOpinions) {
            this.fiveStarsOpinions = fiveStarsOpinions;
            return this;
        }

        public Builder buildFourStarsOpinions(int fourStarsOpinions) {
            this.fourStarsOpinions = fourStarsOpinions;
            return this;
        }

        public Builder buildThreeStarsOpinions(int threeStarsOpinions) {
            this.threeStarsOpinions = threeStarsOpinions;
            return this;
        }

        public Builder buildTwoStarsOpinions(int twoStarsOpinions) {
            this.twoStarsOpinions = twoStarsOpinions;
            return this;
        }

        public Builder buildOneStarsOpinions(int oneStarsOpinions) {
            this.oneStarsOpinions = oneStarsOpinions;
            return this;
        }

        public Builder buildComments(List<String> comments) {
            this.comments = comments;
            return this;
        }

        public Builder buildAverageOfStars() {
            this.averageOfStars = 5;
            return this;
        }

        public OpinionsDTO build() {
            return new OpinionsDTO(this.fiveStarsOpinions,this.fourStarsOpinions,
                    this.threeStarsOpinions,this.twoStarsOpinions,this.oneStarsOpinions,
                    this.averageOfStars,this.comments);
        }


    }
}
