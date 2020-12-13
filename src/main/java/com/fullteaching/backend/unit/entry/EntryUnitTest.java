package com.fullteaching.backend.unit.entry;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;

import java.util.List;
import java.util.ArrayList;

import com.fullteaching.backend.comment.Comment;
import com.fullteaching.backend.user.User;
import com.fullteaching.backend.entry.Entry;

public class EntryUnitTest {
	
	Entry entrada;
	
	@Before
	public void Before () {
		entrada = new Entry();
	}
	
	@Test
	public void testeSetGetId() {
		entrada.setId(0);
		Assert.assertEquals(0, entrada.getId());
	}
	
	@Test
	public void testeSetGetTitle() {
		User usuario = Mockito.mock(User.class);
		Entry novaEntrada = new Entry("Titulo", (long) 1111, usuario);
		Assert.assertEquals("Titulo", novaEntrada.getTitle());
	}
	
	@Test
	public void testeSetGetDate() {
		entrada.setDate(111);
		Assert.assertEquals(111,entrada.getDate());
	}
	
	@Test
	public void testeSetGetComments() {
		List <Comment> comentarios = new ArrayList<>();
		Comment comentario = Mockito.mock(Comment.class);
		comentarios.add(comentario);
		entrada.setComments(comentarios);
		Assert.assertEquals(comentarios, entrada.getComments());
	}
	
	@Test
	public void testeSetGetUser() {
		User usuario = Mockito.mock(User.class);
		entrada.setUser(usuario);
		Assert.assertEquals(usuario, entrada.getUser());
	}
	
	@Test
	public void testeToString() {
		String titulo = "Titulo";
		entrada.setTitle(titulo);
		User usuario = Mockito.mock(User.class);
		entrada.setUser(usuario);
		entrada.setDate(111);
		List <Comment> comentarios = new ArrayList<>();
		Comment comentario = Mockito.mock(Comment.class);
		comentarios.add(comentario);
		entrada.setComments(comentarios);
		String mensagem = "Entry[title: \"" + titulo + "\", author: \"" + entrada.getUser().getNickName() + "\", date: " + entrada.getDate() + ", #comments: " + entrada.getComments().size() + "]";
		Assert.assertEquals(mensagem, entrada.toString());	
	}
}