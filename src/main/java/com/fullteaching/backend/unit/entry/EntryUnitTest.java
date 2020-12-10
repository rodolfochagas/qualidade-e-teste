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
	public void TesteSetGetId() {
		entrada.setId(0);
		Assert.assertEquals(0, entrada.getId());
	}
	
	@Test
	public void TesteSetGetTitle() {
		entrada.setTitle("Titulo");
		Assert.assertEquals("Titulo", entrada.getTitle());
	}
	
	@Test
	public void TesteSetGetDate() {
		entrada.setDate(111);
		Assert.assertEquals(111,entrada.getDate());
	}
	
	@Test
	public void TesteSetGetComments() {
		List <Comment> comentarios = new ArrayList<>();
		Comment comentario = Mockito.mock(Comment.class);
		comentarios.add(comentario);
		entrada.setComments(comentarios);
		Assert.assertEquals(comentarios, entrada.getComments());
	}
	
	@Test
	public void TesteSetGetUser() {
		User usuario = Mockito.mock(User.class);
		entrada.setUser(usuario);
		Assert.assertEquals(usuario, entrada.getUser());
	}
	
	@Test
	public void TesteToString() {
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
