package com.fullteaching.backend.unit.comment;

import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


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
	public void testeComentarioCriado() {
		Assert.assertNotNull(comentario);
	}
	
	@Test
	public void testeGetUser() {
		Assert.assertTrue(usuario.equals(comentario.getUser()));
	}
	
	@Test
	public void testeGetCommentParentConstrutor() {
		Comment resposta = new Comment(mensagem, data, usuario, comentario);
		Assert.assertTrue(comentario.equals(resposta.getCommentParent()));
	}
	
	@Test
	public void testeSetGetId() {
		comentario.setId(0);
		Assert.assertEquals(0, comentario.getId());
	}
	
	@Test
	public void testeSetGetIdDiferenteDeZero() {
		comentario.setId((long) 1234567);
		Assert.assertEquals((long) 1234567, comentario.getId());
	}

	@Test
	public void testeSetGetMessage() {
		comentario.setMessage("qualidade e teste");
		Assert.assertEquals("qualidade e teste", comentario.getMessage());
	}
	
	@Test
	public void testeSetGetDate() {
		comentario.setDate(111);
		Assert.assertEquals(111, comentario.getDate());
	}
	
	@Test
	public void testeSetGetReplies() {
		List<Comment> respostas = new ArrayList<Comment>();
		respostas.add(comentario);
		comentario.setReplies(respostas);
		Assert.assertTrue(comentario.getReplies().contains(comentario));
	}
	
	@Test 
	public void testeSetGetUser() {
		User usuaria = Mockito.mock(User.class);
		comentario.setUser(usuaria);
		Assert.assertEquals(usuaria, comentario.getUser());
	}
	
	@Test 
	public void testeSetGetCommentParent() {
		comentario.setCommentParent(comentario);
		Assert.assertEquals(comentario, comentario.getCommentParent());
	}
	
	@Test
	public void testeToString() {
		String string =  "Comment[message: \"" + mensagem + "\", author: \"" + usuario.getNickName() + "\", parent: \"" + "null" + "\", #replies: " + 0 + "date: \"" + data + "\"]";
		Assert.assertTrue(comentario.toString().equals(string));
	}

	@Test
	public void testeToStringComRespostas() {
		List<Comment> respostas = new ArrayList<Comment>();
		respostas.add(comentario);
		comentario.setReplies(respostas);
		String string =  "Comment[message: \"" + mensagem + "\", author: \"" + usuario.getNickName() + "\", parent: \"" + "null" + "\", #replies: " + comentario.getReplies().size() + "date: \"" + data + "\"]";
		Assert.assertTrue(comentario.toString().equals(string));
	}
}