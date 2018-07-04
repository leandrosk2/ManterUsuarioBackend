package br.com.projeto.usuarioservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Table(name="tb_usuario")
	@Entity
	public class UsuarioModel {
	 
		@Id
		@Column(name="co_usuario")
		private String codigoUsuario;
	 
		@Column(name="senha")
		private String  senha;
		
		@Column(name="co_perfil")
		private String  codigoPerfil;
	 
		@Column(name="de_perfil")
		private String  descricaoPerfil;
		
		@Column(name="nu_unidade")
		private Integer numeroUnidade;
		
		@Column(name="ic_situacao")
		private boolean indicadorSituacao;
	 
		@Column(name="no_utilizador")
		private String  nomeUtilizador;

		public String getCodigoUsuario() {
			return codigoUsuario;
		}

		public void setCodigoUsuario(String codigoUsuario) {
			this.codigoUsuario = codigoUsuario;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getCodigoPerfil() {
			return codigoPerfil;
		}

		public void setCodigoPerfil(String codigoPerfil) {
			this.codigoPerfil = codigoPerfil;
		}

		public String getDescricaoPerfil() {
			return descricaoPerfil;
		}

		public void setDescricaoPerfil(String descricaoPerfil) {
			this.descricaoPerfil = descricaoPerfil;
		}

		public Integer getNumeroUnidade() {
			return numeroUnidade;
		}

		public void setNumeroUnidade(Integer numeroUnidade) {
			this.numeroUnidade = numeroUnidade;
		}

		public boolean isIndicadorSituacao() {
			return indicadorSituacao;
		}

		public void setIndicadorSituacao(boolean indicadorSituacao) {
			this.indicadorSituacao = indicadorSituacao;
		}

		public String getNomeUtilizador() {
			return nomeUtilizador;
		}

		public void setNomeUtilizador(String nomeUtilizador) {
			this.nomeUtilizador = nomeUtilizador;
		}
		
}
