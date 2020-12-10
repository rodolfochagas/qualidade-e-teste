package com.fullteaching.backend.unit.coursedetails;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;

import java.util.List;
import java.util.ArrayList;

import com.fullteaching.backend.forum.Forum;
import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.filegroup.FileGroup;
import com.fullteaching.backend.coursedetails.CourseDetails;


public class CourseDetailsUnitTest {
	
	CourseDetails detalhes;
	
	@Before
	public void Before () {
		detalhes = new CourseDetails();
	}
	
	@Test
	public void TesteSetGetId() {
		detalhes.setId(0);
		Assert.assertEquals(0, detalhes.getId());
	}

	@Test
	public void TesteSetGetInfo() {
		detalhes.setInfo("Informacao");
		Assert.assertEquals("Informacao", detalhes.getInfo());
	}
	
	@Test
	public void TesteSetGetForum() {
		Forum forum = Mockito.mock(Forum.class);
		detalhes.setForum(forum);
		Assert.assertEquals(forum, detalhes.getForum());
	}
	
	@Test
	public void TesteSetGetFiles() {
		List<FileGroup> arquivos = new ArrayList<>();
		FileGroup arquivo = Mockito.mock(FileGroup.class);
		arquivos.add(arquivo);
		detalhes.setFiles(arquivos);
		Assert.assertEquals(arquivos, detalhes.getFiles());
	}

	@Test
	public void TesteSetGetCourse() {
		Course curso = Mockito.mock(Course.class);
		detalhes.setCourse(curso);
		Assert.assertEquals(curso, detalhes.getCourse());
	}


	

}
