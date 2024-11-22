package com.gabriellibano.GS_Microservices.mapper;

import com.gabriellibano.GS_Microservices.dtos.ContatosRequestCreateDto;
import com.gabriellibano.GS_Microservices.dtos.ContatosRequestUpdateDto;
import com.gabriellibano.GS_Microservices.dtos.ContatosResponseDto;
import com.gabriellibano.GS_Microservices.model.Contatos;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ContatosMapper {

    private  final ModelMapper modelMapper;

    public ContatosResponseDto toDto(Contatos contatos) {
        return modelMapper.map(contatos, ContatosResponseDto.class);
    }

    public Contatos toModel(ContatosRequestCreateDto dto) {
        return modelMapper.map(dto, Contatos.class);
    }

    public Contatos toModel(Long id, ContatosRequestUpdateDto dto) {
        Contatos result = modelMapper.map(dto, Contatos.class);
        result.setId(id);
        return result;
    }

}
