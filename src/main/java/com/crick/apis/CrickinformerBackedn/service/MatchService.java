package com.crick.apis.CrickinformerBackedn.service;

import java.util.List;
import java.util.Map;

import com.crick.apis.CrickinformerBackedn.entity.Match;

public interface MatchService {
    // get all matches

    List<Match> getLiveMatches();

    // get live matches
    List<Match> getAllMatches();

    // get cwc2023 point table
    public List<List<String>> getCWC2023PointTable();

}
