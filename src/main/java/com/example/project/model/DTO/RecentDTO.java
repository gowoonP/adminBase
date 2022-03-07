package com.example.project.model.DTO;

import com.example.project.model.entity.Goods;
import com.example.project.model.entity.Recent;
import com.example.project.model.entity.User;
import com.example.project.repository.RecentRepository;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
public class RecentDTO {

    @Autowired
    private RecentRepository recentRepository;

    private Long rcIdx;
    private Long userIdx;
    private Long gdIdx;

    public Recent toEntity(Long userIdx, Long gdIdx){
        Recent recent = new Recent();
        recent.setRcIdx(rcIdx);
        recent.setUser(User.builder().userIdx(userIdx).build());
        recent.setGoods(Goods.builder().gdIdx(gdIdx).build());
        return recentRepository.save(recent);
    }


    @Builder
    public RecentDTO(Long rcIdx, Long userIdx, Long gdIdx){
        this.rcIdx = rcIdx;
        this.userIdx = userIdx;
        this.gdIdx = gdIdx;
    }


}
