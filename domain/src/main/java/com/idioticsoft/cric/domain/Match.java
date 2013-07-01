package com.idioticsoft.cric.domain;

import java.util.List;

public class Match {

    Long matchId;

    Team teamA;

    Team teamB;

    Scorecard scorecardTeamA;

    Scorecard scorecardTeamB;

    MatchResult result;

    public void markPlayingElevenTeamA(List<Long> playersSelected) {
    }

    public void markPlayingElevenTeamB(List<Long> playersSelected) {
    }

    public void inningsEnd() {
    }
}
