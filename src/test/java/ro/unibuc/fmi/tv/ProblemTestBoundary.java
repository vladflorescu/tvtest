package ro.unibuc.fmi.tv;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProblemTestBoundary {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	void test111() throws Exception {
		assertEquals(0, Problem.solve(1, new String[] { "foo" }, 0));
	}

	@Test
	void test112() throws Exception {
		assertEquals(1, Problem.solve(1, new String[] { "" }, 0));
	}

	@Test
	void test12() {
		expectedException.expect(Problem.ConditionsNotMetException.class);
		Problem.solve(1, new String[] {}, -1);
	}

	@Test
	void test2() {
		expectedException.expect(Problem.ConditionsNotMetException.class);
		Problem.solve(0, new String[] {}, 0);
	}

	@Test
	void test3() {
		expectedException.expect(Problem.ConditionsNotMetException.class);
		Problem.solve(1000, new String[] {}, 0);
	}
}
