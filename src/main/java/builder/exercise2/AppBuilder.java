package builder.exercise2;

import java.util.List;

public class AppBuilder {
    public static void main(String[] args) {
        OpinionsDTO opinionsDTO = OpinionsDTO.builder()
                .buildFiveStarsOpinions(5)
                .buildFourStarsOpinions(0)
                .buildThreeStarsOpinions(0)
                .buildTwoStarsOpinions(0)
                .buildOneStarsOpinions(0)
                .buildAverageOfStars()
                .buildComments( List.of("Comment1","Comment2"))
                .build();
        System.out.println(opinionsDTO.toString());
    }
}
