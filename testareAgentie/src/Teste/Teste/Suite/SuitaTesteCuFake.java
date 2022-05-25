package Teste.Teste.Suite;
import Teste.Teste.AgentieTurismTest;
import Teste.Teste.Categorii.TestCuFake;
import Teste.Teste.PachetTuristicTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TestCuFake.class)
public class SuitaTesteCuFake {
}
