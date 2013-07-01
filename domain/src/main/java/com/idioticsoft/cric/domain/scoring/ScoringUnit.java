package com.idioticsoft.cric.domain.scoring;

public class ScoringUnit {

    public static enum Run {

        None(0), One(1), Two(2), Three(3), Four(4), Five(5), Six(6);

        Run(int run) {
            this.run = run;
        }

        int run;

        public int get() {

            return run;
        }

        public static Run from(int run) {
            switch (run) {
                case 1:
                    return One;
                case 2:
                    return Two;
                case 3:
                    return Three;
                case 4:
                    return Four;
                case 5:
                    return Five;
                case 6:
                    return Six;
            }
            return None;
        }
    }

    public static enum ExtraRunType {
        Wide, NoBall
    }

    public static enum Wicket {
        Bowled, Caught, RunOut, Stump, HitWicket,
    }

}