package com.example.project.controller.api;

import com.example.project.model.DTO.RecentDTO;
import com.example.project.service.RecentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recent")
@RequiredArgsConstructor
public class RecentController {

    private final RecentService recentService;

    @PostMapping("/write")
    public void write(@RequestBody RecentDTO recentDTO){
        recentService.create(recentDTO);
    }
}
