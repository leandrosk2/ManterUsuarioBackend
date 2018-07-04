package br.com.projeto.usuarioservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.usuarioservice.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, String> {

}
