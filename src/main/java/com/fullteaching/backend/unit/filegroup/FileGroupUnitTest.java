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
	public void TesteSetGetId() {
		grupo.setId(0);
		Assert.assertEquals(0, grupo.getId());
	}
	
	@Test
	public void TesteSetGetTitle() {
		grupo.setTitle("Titulo");
		Assert.assertEquals("Titulo", grupo.getTitle());
	}
	
	@Test
	public void TesteSetGetFiles() {
		List <File> arquivos = new ArrayList<>();
		File arquivo = Mockito.mock(File.class);
		arquivos.add(arquivo);
		grupo.setFiles(arquivos);
		Assert.assertEquals(arquivos, grupo.getFiles());
	}
	
	@Test
	public void TesteSetGetFileGroups() {
		FileGroup grupoPai = Mockito.mock(FileGroup.class);
		List <FileGroup> grupos = new ArrayList<>();		
		grupos.add(grupoPai);
		grupo.setFileGroups(grupos);
		Assert.assertEquals(grupos, grupo.getFileGroups());

	}
	
	@Test
	public void TesteSetGetGroupParent() {
		FileGroup grupoPai = Mockito.mock(FileGroup.class);
		grupo.setFileGroupParent(grupoPai);
		Assert.assertEquals(grupoPai, grupo.getFileGroupParent());
	}
	
	@Test
	public void TesteEquals() {
		FileGroup outroGrupo = new FileGroup();
		outroGrupo.setId(1);
		grupo.setId(1);
		Assert.assertTrue(grupo.equals(outroGrupo));
	}
	
	@Test
	public void TesteUpdateFileIndexOrder() {
		List <File> arquivos = new ArrayList<>();
		File arquivo = Mockito.mock(File.class); 
		arquivos.add(arquivo);
		grupo.setFiles(arquivos);
		grupo.updateFileIndexOrder();
		Assert.assertNotEquals(1, arquivo.getIndexOrder());
	}
	
	@Test
	public void TesteToString() {
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

}
