package com.fullteaching.backend.unit.session;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.session.Session;

public class SessionUnitTest {
//	import com.fullteaching.backend.course.Course.SimpleCourseList; USAR OUTRA FUNCIONALIDADE DO MOCKITO QUE MOCKA MÉTODOS
	
	Session sessao;
	
	@Before
	public void Before () {
		sessao = new Session();
	}
	
	@Test
	public void testeSetGetId() {
		sessao.setId(0);
		Assert.assertEquals(0, sessao.getId());
	}
	
	@Test
	public void testeSetGetTitle() {
		sessao.setTitle("Titulo");
		Assert.assertEquals("Titulo", sessao.getTitle());
	}
	
	@Test
	public void testeSetGetDescription() {
		sessao.setDescription("Descricao");
		Assert.assertEquals("Descricao", sessao.getDescription());
	}
	
	@Test
	public void testeSetGetDate() {
		sessao.setDate(111);
		Assert.assertEquals(111, sessao.getDate());
	}
	
	@Test
	public void testeSetGetCourse() {
		Course curso = Mockito.mock(Course.class);
		sessao.setCourse(curso);
		Assert.assertEquals(curso, sessao.getCourse());
	}
	
	@Test
	public void testeEquals() {
		Session outraSessao = new Session();
		Session sessaoDiferente = new Session();
		sessao.setId(0);
		outraSessao.setId(0);
		sessaoDiferente.setId(2);
		Assert.assertTrue(sessao.equals(outraSessao) && !sessao.equals(sessaoDiferente));
	}
	
	@Test
	public void testeToString() {
		sessao.setTitle("Titulo");
		sessao.setDescription("Descricao");
		sessao.setDate(111);
		String string = "Session[title: \"" + sessao.getTitle() + "\", description: \"" + sessao.getDescription() + "\", date: \"" + sessao.getDate() + "\"]";
		Assert.assertEquals(string, sessao.toString());
	}


}