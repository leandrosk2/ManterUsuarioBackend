package br.com.projeto.usuarioservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.usuarioservice.model.ResponseModel;
import br.com.projeto.usuarioservice.model.UsuarioModel;
import br.com.projeto.usuarioservice.repository.UsuarioRepository;
@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/service")
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository; 
 
	/**
	 * incluir um novo usuario
	 * @param usuario
	 * @return
	 */
	@RequestMapping(value="/usuario", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel salvar(@RequestBody UsuarioModel usuario){
 
 
		try {
 
			this.usuarioRepository.save(usuario);
 
			return new ResponseModel(1,"Registro salvo com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());			
		}
	}
	/**
	 * atualizar o registro de um usuario
	 * @param usuario
	 * @return
	 */
	@RequestMapping(value="/usuario", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel atualizar(@RequestBody UsuarioModel usuario){
 
		try {
 
			this.usuarioRepository.save(usuario);		
 
			return new ResponseModel(1,"Registro atualizado com sucesso!");
 
		}catch(Exception e) {
 
			return new ResponseModel(0,e.getMessage());
		}
	}
 
	/**
	 * consultar todos os usuarios
	 * @return
	 */
	@RequestMapping(value="/usuario", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<UsuarioModel> consultar(){
 
		return this.usuarioRepository.findAll();
	}
 
	/**
	 * buscar um usuario pelo codigoUsuario
	 * @param codigoUsuario
	 * @return
	 */
	@RequestMapping(value="/usuario/{codigoUsuario}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Optional<UsuarioModel> buscar(@PathVariable("codigoUsuario") String codigoUsuario){
 
		return this.usuarioRepository.findById(codigoUsuario);
	}
 
	/***
	 * excluir um usuario pelo codigo
	 * @param codigo
	 * @return
	 */
	@RequestMapping(value="/usuario/{codigoUsuario}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseModel excluir(@PathVariable("codigoUsuario") String codigoUsuario){
 
		try {
			usuarioRepository.deleteById(codigoUsuario);
 
			return new ResponseModel(1, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new ResponseModel(0, e.getMessage());
		}
	}
}