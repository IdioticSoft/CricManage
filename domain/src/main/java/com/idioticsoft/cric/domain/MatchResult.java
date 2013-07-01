package com.idioticsoft.cric.domain;

public class MatchResult {

    public static enum ResultType {
        Decision, Tie, Draw, Abandoned
    }

    ResultType resultType;

    Team winnerTeam;

    Team losingTeam;

}
