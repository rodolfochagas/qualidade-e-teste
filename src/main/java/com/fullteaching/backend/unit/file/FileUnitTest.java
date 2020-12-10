package com.fullteaching.backend.unit.file;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import com.fullteaching.backend.file.File;

public class FileUnitTest {
	
	File arquivo;
	
	@Before
	public void Before () {
		arquivo = new File();
	}

	@Test
	public void TesteSetGetId() {
		arquivo.setId(0);
		Assert.assertEquals(0, arquivo.getId());
	}
	
	@Test
	public void TesteSetGetType() {
		arquivo.setType(1);
		Assert.assertEquals(1, arquivo.getType());
	}
	
	@Test
	public void TesteSetGetName() {
		arquivo.setName("nome");
		Assert.assertEquals("nome", arquivo.getName());
	}
	
	@Test
	public void TesteSetGetNameIndent() {
		arquivo.setNameIdent("0");
		Assert.assertEquals("0", arquivo.getNameIdent());
	}
	
	@Test
	public void TesteSetGetLink() {
		arquivo.setLink("link");
		Assert.assertEquals("link", arquivo.getLink());
	}
	
	@Test
	public void TesteSetGetIndexOrder() {
		arquivo.setIndexOrder(0);
		Assert.assertEquals(0, arquivo.getIndexOrder());
	}
	
	@Test
	public void TesteEquals() {
		File outroArquivo = new File();
		outroArquivo.setId((long)0);
		arquivo.setId((long) 0);
		Assert.assertTrue(arquivo.equals(outroArquivo));
	}
	
	@Test
	public void TesteGetFileExtension() {
		arquivo.setNameIdent("nome.java");
		Assert.assertEquals("java", arquivo.getFileExtension());
	}
	
	@Test
	public void TesteToString() {
		arquivo.setName("Arquivo");
		arquivo.setNameIdent("1");
		arquivo.setLink("link");
		arquivo.setIndexOrder(1);
		String string = "File[name: \"" + arquivo.getName() + "\", id: \"" + arquivo.getNameIdent() + "\", link: \"" + arquivo.getLink() + ", indexOrder: " + arquivo.getIndexOrder() + "]";
		Assert.assertEquals(string, arquivo.toString());
	}
}
