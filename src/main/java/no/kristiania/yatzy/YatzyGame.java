package no.kristiania.yatzy;

public class YatzyGame {

    public Object score(YatzyCategory category, int[] dice) {
        int result = 4;
        for (int die : dice){
            if(die == 1){
                result += 1;
            }
        }
        return result;
    }
}
