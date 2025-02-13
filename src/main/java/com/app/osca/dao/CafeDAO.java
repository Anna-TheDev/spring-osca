package com.app.osca.dao;

import com.app.osca.domain.CafeVO;
import com.app.osca.mapper.CafeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CafeDAO {
    private final CafeMapper cafeMapper;

    public List<CafeVO> findAll(){
        return cafeMapper.selectAll();
    }

    public Optional<CafeVO> findById(Long id){
        return Optional.ofNullable(cafeMapper.select(id));
    }
}

