package javasql.ust;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

public class Mockito3 {
	
	@Spy
	List<String> spyList =spy(new ArrayList<>());
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		//List<String> lst=new ArrayList<>();
		//when(spyList.size()).thenReturn(5);
		spyList.add("Lisna");
		spyList.add("Glory");
		
		Mockito.verify(spyList).add("Lisna");
		//assertEquals("Lisna",spyList.get(0));
	}

}