package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tes {
	private Mahasiswa mahasiswa;
	
	@Before
	public void beginTest(){
		System.out.println("Mengawali testing ..");
	}
	
	@Test
	public void testNotNull(){
		mahasiswa = new Mahasiswa();
		mahasiswa.setNama("asd");
		assertNotNull("seharusnya tidak null",mahasiswa.getNama());
		assertNull("seharusnya null",mahasiswa.getNama());
		assertEquals("a", "b");
	}
	
	@After
	public void after(){
		System.out.println("Mengakhiri testing");
	}
	

}
