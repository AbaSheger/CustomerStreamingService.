package com.example.demo.controller;

import com.example.demo.model.StreamingService;
import com.example.demo.database.ScamBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StreamingServiceController {

    @Autowired
    ScamBase scamBase;

    @RequestMapping (value = "/streams")

    public List<StreamingService> getStreaming() {

      return scamBase.getStreaming();

    }



    @RequestMapping (value = "/streams/{id}")


    public StreamingService getStreamingById(@PathVariable("id") int id) {

        return scamBase.getStreamingById(id);
    }



    @PostMapping (value = "/addstream")

public StreamingService addStreaming(@RequestBody StreamingService streamingService) {

        scamBase.addStreamingService(streamingService);

        return streamingService;
    }

    @DeleteMapping (value = "/deletestream/{id}")

    public StreamingService deleteStreaming(@PathVariable("id") int id) {

        return scamBase.deleteStreamingService(id);
    }


}



