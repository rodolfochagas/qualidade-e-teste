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
	public void TesteSetGetId() {
		usuario.setId((long)0);
		Assert.assertTrue((long) 0 == usuario.getId());
	}
	
	@Test
	public void TesteSetGetName() {
		usuario.setName("nome");
		Assert.assertEquals("nome", usuario.getName());
	}
	
	@Test
	public void TesteSetGetPasswordHash() {
		usuario.setPasswordHash("senha");
		Assert.assertEquals("senha", usuario.getPasswordHash());
	}
	
	@Test
	public void TesteSetGetRoles() {
		List <String> papeis = new ArrayList<>();
		papeis.add("papel");
		usuario.setRoles(papeis);
		Assert.assertEquals(papeis, usuario.getRoles());
	}
	
	@Test
	public void TesteSetGetNickName() {
		usuario.setNickName("apelido");
		Assert.assertEquals("apelido", usuario.getNickName());
	}
	
	@Test
	public void TesteSetGetPicture() {
		usuario.setPicture("foto");
		Assert.assertEquals("foto", usuario.getPicture());
	}
	
	@Test
	public void TesteSetGetRegistrationDate() {
		usuario.setRegistrationDate(111);
		Assert.assertEquals(111, usuario.getRegistrationDate());
	}
	
	@Test
	public void TesteSetGetCourses() {
		Set<Course> cursos = new HashSet<>();
		Course curso = Mockito.mock(Course.class);
		cursos.add(curso);
		usuario.setCourses(cursos);
		Assert.assertEquals(cursos, usuario.getCourses());
	}
	
	@Test
	public void TesteEquals() {
		User outroUsuario = new User();
		long id = (long) 0;
		String nome = "nome";
		outroUsuario.setId(id);
		usuario.setId(id);
		outroUsuario.setName(nome);
		usuario.setName(nome);
		Assert.assertTrue(usuario.equals(outroUsuario));
	}
	
	@Test
	public void TesteHashCode() {
		usuario.setName("nome");
		int hashCodeUsuario = usuario.getName().hashCode();
		Assert.assertEquals(hashCodeUsuario, usuario.hashCode());
	}
	
	@Test
	public void TesteToString() {
		usuario.setNickName("joazinho");
		Assert.assertEquals(usuario.getNickName(), usuario.toString());
	}

}
