package com.example.project.service;

import com.example.project.model.DTO.RecentDTO;
import com.example.project.model.entity.Recent;
import com.example.project.repository.RecentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class RecentService {
    private RecentRepository recentRepository;

    @Transactional
    public void create(RecentDTO recentDTO) {
        recentRepository.save(recentDTO.toEntity(recentDTO.getUserIdx(), recentDTO.getGdIdx()));
    }
}
