package com.fullteaching.backend.unit.user;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.user.User;


public class UserUnitTest {
	
	User usuario;
	
	@Before
	public void Before() {
		usuario = new User();
	}
	
	@Test
	public void testeSetGetId() {
		usuario.setId((long)0);
		Assert.assertTrue((long) 0 == usuario.getId());
	}

	@Test
	public void testeSetGetIdDiferenteDeZero() {
		usuario.setId((long)12345);
		Assert.assertTrue((long) 12345 == usuario.getId());
	}
	
	@Test
	public void testeSetGetName() {
		usuario.setName("nome");
		Assert.assertEquals("nome", usuario.getName());
	}
	
	@Test
	public void testeSetGetPasswordHash() {
		usuario.setPasswordHash("senha");
		Assert.assertEquals("senha", usuario.getPasswordHash());
	}
	
	@Test
	public void testeSetGetRoles() {
		List <String> papeis = new ArrayList<>();
		papeis.add("papel");
		usuario.setRoles(papeis);
		Assert.assertEquals(papeis, usuario.getRoles());
	}
	
	@Test
	public void testeSetGetNickName() {
		usuario.setNickName("apelido");
		Assert.assertEquals("apelido", usuario.getNickName());
	}
	
	@Test
	public void testeSetGetPicture() {
		usuario.setPicture("foto");
		Assert.assertEquals("foto", usuario.getPicture());
	}
	
	@Test
	public void testeSetGetPictureComConstrutor() {
		User outroUsuario = new User("Nome", "Senha", "Apelido", "Foto");
		Assert.assertEquals("Foto", outroUsuario.getPicture());
	}


	@Test
	public void testeSetGetRegistrationDate() {
		usuario.setRegistrationDate(111);
		Assert.assertEquals(111, usuario.getRegistrationDate());
	}
	
	@Test
	public void testeSetGetCourses() {
		Set<Course> cursos = new HashSet<>();
		Course curso = Mockito.mock(Course.class);
		cursos.add(curso);
		usuario.setCourses(cursos);
		Assert.assertEquals(cursos, usuario.getCourses());
	}
	
	@Test
	public void testeEquals() {
		User outroUsuario = new User();
		User usuarioDiferente1 = new User();
		User usuarioDiferente2 = new User();
		User usuarioDiferente3 = new User();

		long id = (long) 0;
		long idDiferente = (long) 1;
		String nome = "nome";
		String nomeDiferente = "nomeDiferente";
		
		usuario.setId(id);
		outroUsuario.setId(id);
		usuarioDiferente1.setId(idDiferente);
		usuarioDiferente2.setId(idDiferente);
		usuarioDiferente3.setId(id);

		usuario.setName(nome);
		outroUsuario.setName(nome);
		usuarioDiferente1.setName(nomeDiferente);
		usuarioDiferente2.setName(nome);
		usuarioDiferente3.setName(nomeDiferente);

		Assert.assertTrue(usuario.equals(outroUsuario) && !usuario.equals(usuarioDiferente1) && !usuario.equals(usuarioDiferente2) && !usuario.equals(usuarioDiferente3));
	}

	@Test
	public void testeEqualsNulo() {
		Assert.assertFalse(usuario.equals(null));
	}
	
	@Test
	public void testeEqualsMesmaInstancia() {
		User outroUsuario = new User("Nome", "Senha", "Apelido", "Foto");
		Assert.assertTrue(outroUsuario.equals(outroUsuario));
	}

	@Test
	public void testeEqualsClasseDiferente() {
		Course curso = Mockito.mock(Course.class);
		Assert.assertFalse(usuario.equals(curso));
	}

	@Test
	public void testeHashCode() {
		usuario.setName("nome");
		int hashCodeUsuario = usuario.getName().hashCode();
		Assert.assertEquals(hashCodeUsuario, usuario.hashCode());
	}
	
	@Test
	public void testeToString() {
		usuario.setNickName("joazinho");
		Assert.assertEquals(usuario.getNickName(), usuario.toString());
	}
}