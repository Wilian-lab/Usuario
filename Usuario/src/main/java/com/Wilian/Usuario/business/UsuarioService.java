package com.Wilian.Usuario.business;

import com.Wilian.Usuario.Infrastructure.entity.Usuario;
import com.Wilian.Usuario.Infrastructure.repository.UsuarioRepository;
import com.Wilian.Usuario.business.Converter.UsuarioConverter;
import com.Wilian.Usuario.business.DTO.UsuarioDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuarioSalvo);
    }

}





