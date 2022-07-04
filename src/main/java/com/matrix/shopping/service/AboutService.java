package com.matrix.shopping.service;

import com.matrix.shopping.dao.repository.AboutRepository;
import com.matrix.shopping.mapping.AboutMapper;
import com.matrix.shopping.model.AboutDto;
import org.springframework.stereotype.Service;

@Service
public class AboutService {
    private AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public AboutDto getAboutParametr() {
        return AboutMapper.INSTANCE.aboutToDto(aboutRepository.findById(1).get());
    }
}
