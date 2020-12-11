package com.fullteaching.backend.unit.forum;

import java.util.List;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;

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
	public void testeSetIsActivated() {
		forum.setActivated(true);
		Assert.assertTrue(forum.isActivated());
		
	}
	
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

} 