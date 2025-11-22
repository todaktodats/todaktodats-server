package com.todaktodot.TDTD.domain.sample.controller;

import com.todaktodot.TDTD.domain.sample.dto.reqeust.SampleRequestDTO;
import com.todaktodot.TDTD.domain.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sample")
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/list")
    public void getList(@RequestBody SampleRequestDTO sampleRequestDTO) {
        sampleService.getList(sampleRequestDTO);
    }
}
