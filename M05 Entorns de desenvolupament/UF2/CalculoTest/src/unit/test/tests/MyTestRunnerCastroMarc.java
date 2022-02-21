package unit.test.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import unit.test.classes.MultiplicaCastroMarc;
import unit.test.classes.SumaCastroMarc;

@RunWith(Suite.class)
@SuiteClasses({MultiplicaTestCastroMarc.class, SumaTestCastroMarc.class})
public class MyTestRunnerCastroMarc {

}
