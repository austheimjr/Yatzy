package no.kristiania.yatzy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest{

    private final YatzyGame yatzyGame = new YatzyGame();

    @Test
    void ShouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] {1, 1, 2, 1, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[] {6, 5, 2, 1, 1}));
    }

    @Test
    void ShouldScoreTwo(){
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[] {1, 1, 2, 1, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[] {6, 5, 2, 1, 1}));
    }


}
