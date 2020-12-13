package com.fullteaching.backend.unit.course;

import java.util.Set;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import org.mockito.Mockito;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.coursedetails.CourseDetails;
import com.fullteaching.backend.session.Session;
import com.fullteaching.backend.user.User;

public class CourseUnitTest {
	
	Course curso;
	
	@Before
	public void Before () {
		curso = new Course();
	}
	
	@Test
	public void testeSetGetId() {
		curso.setId(0);
		Assert.assertEquals(0, curso.getId());
	}
	
	@Test
	public void testeSetGetTitle() {
		String titulo = "Titulo";
		curso.setTitle(titulo);
		Assert.assertEquals("Titulo", curso.getTitle());
	}
	
	@Test
	public void testeSetGetImage() {
		String imagem = "Imagem";
		curso.setImage(imagem);
		Assert.assertEquals("Imagem", curso.getImage());
	}
	
	@Test
	public void testeSetGetTeacher() {
		User professor = Mockito.mock(User.class);
		curso.setTeacher(professor);
		Assert.assertEquals(professor, curso.getTeacher());
	}
	
	@Test
	public void testeSetGetCourseDetails() {
		CourseDetails detalhes = Mockito.mock(CourseDetails.class);
		curso.setCourseDetails(detalhes);
		Assert.assertEquals(detalhes, curso.getCourseDetails());
	}
	
	@Test
	public void testeSetGetAttenders() {
		Set<User> alunos = new HashSet<>();
		User aluno = Mockito.mock(User.class);
		alunos.add(aluno);
		curso.setAttenders(alunos);
		Assert.assertEquals(alunos, curso.getAttenders());
	}
	
	@Test
	public void testeSetGetSessions() {
		Set<Session> sessoes = new HashSet<>();
		Session sessao = Mockito.mock(Session.class);
		sessoes.add(sessao);
		curso.setSessions(sessoes);
		Assert.assertEquals(sessoes, curso.getSessions());
	}
	
	@Test
	public void testeEquals() {
		Course outroCurso = new Course();
		Course cursoDiferente = new Course();
		curso.setId(1);
		outroCurso.setId(1);
		cursoDiferente.setId(2);
		Assert.assertTrue(curso.equals(outroCurso) && !curso.equals(cursoDiferente));
	}
	
	@Test
	public void testeEqualsNulo() {
		Assert.assertFalse(curso.equals(null));
	}

	@Test
	public void testeEqualsMesmaInstancia() {
		User professora = Mockito.mock(User.class);
		Course outroCurso = new Course("Titulo", "imagem", professora);
		Assert.assertTrue(outroCurso.equals(outroCurso));
	}

	@Test
	public void testeEqualsClassesDiferentes() {
		User professora = Mockito.mock(User.class);
		Assert.assertFalse(curso.equals(professora));
	}

	@Test
	public void testeToString() {
		String titulo = "Titulo";
		User professor = Mockito.mock(User.class);
		Set<User> alunos = new HashSet<>();
		User aluno = Mockito.mock(User.class);
		alunos.add(aluno);
		Set<Session> sessoes = new HashSet<>();
		Session sessao = Mockito.mock(Session.class);
		sessoes.add(sessao);
		curso.setTitle(titulo);
		curso.setTeacher(professor);
		curso.setAttenders(alunos);
		curso.setSessions(sessoes);

		String mensagem = "Course[title: \"" + titulo + "\", teacher: \"" + professor.getNickName() + "\", #attenders: " + alunos.size() + ", #sessions: " + sessoes.size() + "]";
		Assert.assertEquals(mensagem, curso.toString());
	}
}