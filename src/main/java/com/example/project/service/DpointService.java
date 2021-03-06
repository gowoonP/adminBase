package com.example.project.service;

import com.example.project.model.DTO.DpointDTO;
import com.example.project.model.entity.Dpoint;
import com.example.project.model.network.Header;
import com.example.project.repository.DpointRepository;
import com.example.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DpointService {

    @Autowired
    private DpointRepository dpointRepository;

    @Transactional
    public Dpoint create(Long userIdx, DpointDTO dpointDTO){

        Dpoint dpoint = Dpoint.builder()
                .dpRegdate(LocalDateTime.now())
                .dpEnddate(LocalDateTime.now().plusMonths(1))
                .dpContent(dpointDTO.getDpContent())
                .dpPp(dpointDTO.getDpPp())
                .dpMp(dpointDTO.getDpMp() * -1)
                .dpSum(dpointDTO.getDpSum())
                .userIdx(userIdx)
                .build();
        Dpoint newDpoint = dpointRepository.save(dpoint);
        return newDpoint;
    }

    @Transactional
    public DpointDTO read(Long id){
        Optional<Dpoint> dpointOptional = dpointRepository.findById(id);
        Dpoint dpoint = dpointOptional.get();
        DpointDTO dpointDTO = DpointDTO.builder()
                .dpIdx(dpoint.getDpIdx())
                .dpRegdate(dpoint.getDpRegdate())
                .dpEnddate(dpoint.getDpEnddate())
                .dpContent(dpoint.getDpContent())
                .dpPp(dpoint.getDpPp())
                .dpMp(dpoint.getDpMp())
                .dpSum(dpoint.getDpSum())
                .userIdx(dpoint.getUserIdx())
                .build();
        return dpointDTO;
    }

    @Transactional
    public List<DpointDTO> getDpointList(Long userIdx){
        List<Dpoint> dpointList = dpointRepository.findAllByUserIdx(userIdx);
        List<DpointDTO> dpointDTOList = new ArrayList<>();

        for(Dpoint dpoint : dpointList){
            DpointDTO dpointDTO = DpointDTO.builder()
                    .dpIdx(dpoint.getDpIdx())
                    .dpRegdate(dpoint.getDpRegdate())
                    .dpEnddate(dpoint.getDpEnddate())
                    .dpContent(dpoint.getDpContent())
                    .dpPp(dpoint.getDpPp())
                    .dpMp(dpoint.getDpMp())
                    .dpSum(dpoint.getDpSum())
                    .userIdx(dpoint.getUserIdx())
                    .build();
            dpointDTOList.add(dpointDTO);
        }
        return dpointDTOList;
    }


    public DpointDTO response(Dpoint dpoint){
        DpointDTO dpointDTO = DpointDTO.builder()
                .dpIdx(dpoint.getDpIdx())
                .dpRegdate(dpoint.getDpRegdate())
                .dpEnddate(dpoint.getDpEnddate())
                .dpContent(dpoint.getDpContent())
                .dpPp(dpoint.getDpPp())
                .dpMp(dpoint.getDpMp())
                .dpSum(dpoint.getDpSum())
                .userIdx(dpoint.getUserIdx())
                .build();
        return dpointDTO;
    }


}

