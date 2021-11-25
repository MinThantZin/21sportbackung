package com.tech21c.sportlivestream.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.tech21c.sportlivestream.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/team")
public class TeamController {
    private final TeamRepository repository;
    public TeamController(TeamRepository repository) {
        this.repository = repository;
    }
    @GetMapping(path = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity showMesaage() {
        return new ResponseEntity <JSONPObject> (new JSONPObject("name","I am min than zin "),HttpStatus.OK);
    }
}