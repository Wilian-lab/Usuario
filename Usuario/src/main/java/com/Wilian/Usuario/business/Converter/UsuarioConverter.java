package com.Wilian.Usuario.business.Converter;

import com.Wilian.Usuario.Infrastructure.entity.Endereco;
import com.Wilian.Usuario.Infrastructure.entity.Telefone;
import com.Wilian.Usuario.Infrastructure.entity.Usuario;
import com.Wilian.Usuario.business.DTO.EnderecoDTO;
import com.Wilian.Usuario.business.DTO.TelefoneDTO;
import com.Wilian.Usuario.business.DTO.UsuarioDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioConverter {

    public Usuario paraUsuario(UsuarioDTO ususuarioDTO) {
        return Usuario.builder()
                .nome(ususuarioDTO.getNome())
                .email(ususuarioDTO.getEmail())
                .senha(ususuarioDTO.getSenha())
                .enderecos(paraListaEndereco(ususuarioDTO.getEnderecos()))
                //.telefones(paraListaTelefone(ususuarioDTO.getTelefones()))

                .build();

    }

    public List<Endereco> paraListaEndereco(List<EnderecoDTO> enderecoDTO) {
        return enderecoDTO.stream()
                .map(this::paraEndereco)
                .toList();

    }

    public Endereco paraEndereco(EnderecoDTO enderecoDTO) {

        return Endereco.builder()
                .rua(enderecoDTO.getRua())
                .numero(enderecoDTO.getNumero())
                .complemento(enderecoDTO.getComplemento())
                .cidade(enderecoDTO.getCidade())
                .estado(enderecoDTO.getEstado())
                .cep(enderecoDTO.getCep())

                .build();
    }

    public List<Telefone> paraListaTelefone(List<TelefoneDTO> telefoneDTO) {
        return telefoneDTO.stream()
                .map(this::paraTelefone)
                .toList();

    }

    public Telefone paraTelefone(TelefoneDTO telefoneDTO) {
        return Telefone.builder()
                .numero(telefoneDTO.getNumero())
                .ddd(telefoneDTO.getDdd())
                .build();
    }

    //=================================================================================================//

    public UsuarioDTO paraUsuarioDTO(Usuario ususuarioDTO) {
        return UsuarioDTO.builder()
                .nome(ususuarioDTO.getNome())
                .email(ususuarioDTO.getEmail())
                .senha(ususuarioDTO.getSenha())
                .enderecos(paraListaEnderecoDTO(ususuarioDTO.getEnderecos()))
                //.telefones(paraListaTelefoneDTO(ususuarioDTO.getTelefones()))

                .build();

    }

    public List<EnderecoDTO> paraListaEnderecoDTO(List<Endereco> enderecoDTO) {
        return enderecoDTO.stream()
                .map(this::paraEnderecoDTO)
                .toList();

    }

    public EnderecoDTO paraEnderecoDTO(Endereco enderecoDTO) {

        return EnderecoDTO.builder()
                .rua(enderecoDTO.getRua())
                .numero(enderecoDTO.getNumero())
                .complemento(enderecoDTO.getComplemento())
                .cidade(enderecoDTO.getCidade())
                .estado(enderecoDTO.getEstado())
                .cep(enderecoDTO.getCep())

                .build();
    }

    public List<TelefoneDTO> paraListaTelefonesDTO(List<Telefone> telefoneDTO) {
        return telefoneDTO.stream()
                .map(this::paraTelefone)
                .toList();

    }

    public TelefoneDTO paraTelefone(Telefone telefoneDTO) {
        return TelefoneDTO.builder()
                .numero(telefoneDTO.getNumero())
                .ddd(telefoneDTO.getDdd())
                .build();
    }


}
