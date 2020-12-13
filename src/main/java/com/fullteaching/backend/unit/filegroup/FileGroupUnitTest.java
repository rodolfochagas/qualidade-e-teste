package com.fullteaching.backend.unit.filegroup;

import java.util.List;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;

import com.fullteaching.backend.file.File;
import com.fullteaching.backend.filegroup.FileGroup;

public class FileGroupUnitTest {
	
	FileGroup grupo;
	
	@Before
	public void Before () {
		grupo = new FileGroup();
	}
	
	@Test
	public void testeSetGetId() {
		grupo.setId(0);
		Assert.assertEquals(0, grupo.getId());
	}

	@Test
	public void testeSetGetIdDiferenteDeZero() {
		grupo.setId((long) 12345);
		Assert.assertEquals((long) 12345, grupo.getId());
	}
	
	@Test
	public void testeSetGetTitle() {
		grupo.setTitle("Titulo");
		Assert.assertEquals("Titulo", grupo.getTitle());
	}
	
	@Test
	public void testeSetGetFiles() {
		List <File> arquivos = new ArrayList<>();
		File arquivo = Mockito.mock(File.class);
		arquivos.add(arquivo);
		grupo.setFiles(arquivos);
		Assert.assertEquals(arquivos, grupo.getFiles());
	}
	
	@Test
	public void testeSetGetFileGroups() {
		FileGroup grupoPai = Mockito.mock(FileGroup.class);
		List <FileGroup> grupos = new ArrayList<>();		
		grupos.add(grupoPai);
		grupo.setFileGroups(grupos);
		Assert.assertEquals(grupos, grupo.getFileGroups());

	}
	
	@Test
	public void testeSetGetGroupParent() {
		FileGroup grupoPai = Mockito.mock(FileGroup.class);
		grupo.setFileGroupParent(grupoPai);
		Assert.assertEquals(grupoPai, grupo.getFileGroupParent());
	}
	
	@Test
	public void testeEqualsValidFile() {
		FileGroup outroGrupo = new FileGroup();
		FileGroup grupoDiferente = new FileGroup();
		grupo.setId(1);
		outroGrupo.setId(1);
		grupoDiferente.setId(2);
		Assert.assertTrue(grupo.equals(outroGrupo) && !grupo.equals(grupoDiferente));
	}

	@Test
	public void testeEqualsNulo() {
		Assert.assertFalse(grupo.equals(null));
	}

	@Test
	public void testeEqualsMesmoGrupo() {
		Assert.assertTrue(grupo.equals(grupo));
	}

	@Test
	public void testeEqualsTipoDiferente() {
		File arquivo = Mockito.mock(File.class);
		Assert.assertFalse(grupo.equals(arquivo));
	}

	@Test
	public void testeUpdateFileIndexOrder() {
		List <File> arquivos = new ArrayList<>();
		File arquivo = Mockito.mock(File.class);
		arquivo.setIndexOrder(20);
		arquivos.add(arquivo);
		grupo.setFiles(arquivos);
		grupo.updateFileIndexOrder();
		Assert.assertEquals(0, arquivo.getIndexOrder());
	}

	@Test
	public void testeUpdateFileIndexOrderSemMock() {
		List <File> arquivos = new ArrayList<>();
		File arquivo = new File();
		arquivo.setIndexOrder(20);
		arquivos.add(arquivo);
		grupo.setFiles(arquivos);
		grupo.updateFileIndexOrder();
		Assert.assertEquals(0, arquivo.getIndexOrder());
	}

	@Test
	public void testeUpdateFileIndexComDoisArquivos() {
		List <File> arquivos = new ArrayList<>();
		File arquivo1 = new File();
		File arquivo2 = new File();
		arquivo1.setIndexOrder(20);
		arquivo2.setIndexOrder(40);
		arquivos.add(arquivo1);
		arquivos.add(arquivo2);
		grupo.setFiles(arquivos);
		grupo.updateFileIndexOrder();
		Assert.assertTrue(arquivo1.getIndexOrder() == 0 && arquivo2.getIndexOrder() == 1);
	}

	@Test
	public void testeToString() {
		grupo.setTitle("Titulo");
		FileGroup grupoPai = Mockito.mock(FileGroup.class);
		List <File> arquivos = new ArrayList<>();
		File arquivo = Mockito.mock(File.class);
		arquivos.add(arquivo);
		grupo.setFiles(arquivos);
		List <FileGroup> grupos = new ArrayList<>();		
		grupos.add(grupoPai);
		grupo.setFileGroups(grupos);
		String string = "FileGroup[title: \"" + grupo.getTitle() + "\", parentFileGroup: \"" + "null" + "\", #files: " + grupo.getFiles().size()+ ", #childrenFileGroups: " + grupo.getFileGroups().size() + "]";
		Assert.assertEquals(string, grupo.toString());	
	}

	@Test
	public void testeToStringComParentFileGroup() {
		grupo.setTitle("Titulo");
		FileGroup outroGrupo = Mockito.mock(FileGroup.class);
		FileGroup grupoPai = new FileGroup("Título pai");
		List <File> arquivos = new ArrayList<>();
		File arquivo = Mockito.mock(File.class);
		arquivos.add(arquivo);
		grupo.setFiles(arquivos);
		List <FileGroup> grupos = new ArrayList<>();		
		grupos.add(outroGrupo);
		grupo.setFileGroups(grupos);
		grupo.setFileGroupParent(grupoPai);
		String string = "FileGroup[title: \"" + grupo.getTitle() + "\", parentFileGroup: \"" + grupoPai.getTitle() + "\", #files: " + grupo.getFiles().size()+ ", #childrenFileGroups: " + grupo.getFileGroups().size() + "]";
		Assert.assertEquals(string, grupo.toString());	
	}

}