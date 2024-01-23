package com.crick.apis.CrickinformerBackedn.controllers;

import org.apache.catalina.connector.Response;
// import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.crick.apis.CrickinformerBackedn.entity.*;
import com.crick.apis.CrickinformerBackedn.service.MatchService;

@RestController
@RequestMapping("/match")
@CrossOrigin(value = "*")
public class MatchController {
    
    @Autowired
    private MatchService matchService;

    @GetMapping(value = "/allmatches")
    public ResponseEntity<List<Match>> getAllMatches(){
        System.out.println("controller 27");
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);

    }

    @GetMapping(value = "/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        System.out.println("in controller 29");
        // this.matchService.getLiveMatches();
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);

    }

    @GetMapping(value = "/pointstable")
    public ResponseEntity<List<List<String>>> getCWC2023PointTable(){
        return new ResponseEntity<>(this.matchService.getCWC2023PointTable(),HttpStatus.OK);
    }
}
