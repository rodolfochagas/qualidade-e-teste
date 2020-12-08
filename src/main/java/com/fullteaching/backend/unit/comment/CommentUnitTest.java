package com.fullteaching.backend.unit.comment;

import org.mockito.Mockito;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import com.fullteaching.backend.comment.Comment;
import com.fullteaching.backend.user.User;

public class CommentUnitTest {
	
	String mensagem;
	Long data;
	User usuario;
	Comment comentario;
	
	@Before
	public void Before () {
		mensagem = "Mensagem";
		data = (long) 11111111;
		usuario = Mockito.mock(User.class);
		comentario = new Comment(mensagem, data, usuario);
	}
	
	@Test
	public void TesteComentarioCriado() {
		Assert.assertNotNull(comentario);
	}
	
	@Test
	public void TesteGetUser() {
		Assert.assertTrue(usuario.equals(comentario.getUser()));
	}
	
	@Test
	public void testeGetCommentParent() {
		Comment resposta = new Comment(mensagem, data, usuario, comentario);
		Assert.assertTrue(comentario.equals(resposta.getCommentParent()));
	}
	
	@Test
	public void testeGetId() {
		Assert.assertNotNull(comentario.getId());
	}

}
