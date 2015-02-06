package tychodemo.bundle.handlers;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import tychodemo.bundle.handlers.AboutHandler;

public class AboutHandlerTest {

	@Test
	public void testGetGreeting() {
		assertThat(new AboutHandler().getGreeting(), CoreMatchers.containsString("Tycho Demo"));
	}

}
