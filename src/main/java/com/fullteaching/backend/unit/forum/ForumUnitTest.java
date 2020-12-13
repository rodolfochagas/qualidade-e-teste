package com.fullteaching.backend.unit.forum;

import java.util.List;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;

import com.fullteaching.backend.comment.Comment;
import com.fullteaching.backend.entry.Entry;
import com.fullteaching.backend.forum.Forum;

public class ForumUnitTest {
	
	Forum forum;
	
	@Before
	public void Before () {
		forum = new Forum();
	}
	
	@Test
	public void testeSetGetId() {
		forum.setId(0);
		Assert.assertEquals(0, forum.getId());
	}

	@Test
	public void testeSetGetIdDiferenteDeZero() {
		forum.setId((long) 12345);
		Assert.assertEquals((long) 12345, forum.getId());
	}

	@Test
	public void testeSetIsActivated() {
		forum.setActivated(true);
		Assert.assertTrue(forum.isActivated());
		
	}
	
	@Test
	public void testeSetIsNotActivated() {
		forum.setActivated(false);
		Assert.assertFalse(forum.isActivated());
	}
	
	@Test
	public void testeSetGetEntries() {
		List<Entry> entradas = new ArrayList<>();
		Entry entrada = Mockito.mock(Entry.class);
		entradas.add(entrada);
		forum.setEntries(entradas);
		Assert.assertEquals(entradas, forum.getEntries());
	}
	
	@Test
	public void testeToString() {
		List<Entry> entradas = new ArrayList<>();
		Entry entrada = Mockito.mock(Entry.class);
		entradas.add(entrada);
		forum.setEntries(entradas);
		forum.setActivated(true);
		
		String mensagem = "Forum[activated: \"" + forum.isActivated() + "\", #entries: \"" + forum.getEntries().size() + "\", #comments: \"" + 0 + "\"]";
		
		Assert.assertEquals(mensagem, forum.toString());
	}

	@Test
	public void testeToStringComComentarios() {
		List<Entry> entradas = new ArrayList<>();
		Entry entrada = new Entry();
		List<Comment> comentarios = new ArrayList<>();
		Comment comentario1 = new Comment();
		Comment comentario2 = new Comment();

		comentarios.add(comentario1);
		comentarios.add(comentario2);
		entrada.setComments(comentarios);
		entradas.add(entrada);
		forum.setEntries(entradas);
		forum.setActivated(true);
		
		
		String mensagem = "Forum[activated: \"" + forum.isActivated() + "\", #entries: \"" + forum.getEntries().size() + "\", #comments: \"" + 2 + "\"]";
		
		Assert.assertEquals(mensagem, forum.toString());
	}
}