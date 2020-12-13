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
	public void testeSetGetId() {
		arquivo.setId(0);
		Assert.assertEquals(0, arquivo.getId());
	}
	
	@Test
	public void testeSetGetType() {
		arquivo.setType(1);
		Assert.assertEquals(1, arquivo.getType());
	}
	
	@Test
	public void testeSetGetName() {
		arquivo.setName("nome");
		Assert.assertEquals("nome", arquivo.getName());
	}
	
	@Test
	public void testeSetGetNameIndent() {
		arquivo.setNameIdent("0");
		Assert.assertEquals("0", arquivo.getNameIdent());
	}
	
	@Test
	public void testeSetGetLink() {
		arquivo.setLink("link");
		Assert.assertEquals("link", arquivo.getLink());
	}
	
	@Test
	public void testeSetGetIndexOrder() {
		arquivo.setIndexOrder(0);
		Assert.assertEquals(0, arquivo.getIndexOrder());
	}
	
	@Test
	public void testeEquals() {
		File outroArquivo = new File();
		File arquivoDiferente = new File();
		arquivo.setId((long) 0);
		outroArquivo.setId((long)0);
		arquivoDiferente.setId((long) 2);
		Assert.assertTrue(arquivo.equals(outroArquivo) && !arquivo.equals(arquivoDiferente));
	}
	
	@Test
	public void testeGetFileExtension() {
		arquivo.setNameIdent("nome.java");
		Assert.assertEquals("java", arquivo.getFileExtension());
	}
	
	@Test
	public void testeToString() {
		arquivo.setName("Arquivo");
		arquivo.setNameIdent("1");
		arquivo.setLink("link");
		arquivo.setIndexOrder(1);
		String string = "File[name: \"" + arquivo.getName() + "\", id: \"" + arquivo.getNameIdent() + "\", link: \"" + arquivo.getLink() + ", indexOrder: " + arquivo.getIndexOrder() + "]";
		Assert.assertEquals(string, arquivo.toString());
	}

	@Test
	public void testeConstructorTypeName() {
		File arquivoNovo = new File(1, "Nome");
		Assert.assertTrue(arquivoNovo.getName() == "Nome" && arquivoNovo.getType() == 1);
	}

	@Test
	public void testeConstructorTypeNameLink() {
		File arquivoNovo = new File(1, "Nome", "link");
		Assert.assertTrue(arquivoNovo.getName() == "Nome" && arquivoNovo.getType() == 1 && arquivoNovo.getLink() == "link");
	}
}