package com.mygdx.escapefromlannioncity.score;

import java.time.LocalDate;
import java.util.*;

public class TestMain {
    public static void TestScore(){
        Score j1 = new Score("polpo",20,2,3,2, LocalDate.now());
        Score j2 = new Score("potre",30,2,3,2, LocalDate.now());
        Score.AddScore(j1,"Score");

        Score.AddScore(j1,"potre");
        Score.AddScore(j1,"potre");
        Score.AddScore(j1,"potre");
        Score.AddScore(j1,"potre");
        Score.AddScore(j1,"potre");
        Score.AddScore(j1,"potre");
        Score.AddScore(j1,"potre");
        Score.AddScore(j1,"potre");
        Score j = new Score("polpo",15,2,3,2, LocalDate.now());

        Score.AddScore(j,"potre");
        Score.AddScore(j,"potre");
        Score.AddScore(j,"potre");

        Score.AddScore(j2,"Score");
       // Score.Deserialize();
        try {
            System.out.println("here");
            List<Score> aff = Score.Deserialize("Score");
            System.out.println(aff.get(0).ToString()+aff.get(1).ToString());

        }catch(Exception e){
            System.out.println(e);
        }
    }
}