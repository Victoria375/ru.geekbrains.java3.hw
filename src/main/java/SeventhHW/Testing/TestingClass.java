package SeventhHW.Testing;

public class TestingClass {

    @Test(priority = 4)
    public void test1() {
        System.out.println("priority = 4");
    }

    @Test(priority = 9)
    public void test2() {
        System.out.println("priority = 9");
    }

    @Test(priority = 2)
    public void test3() {
        System.out.println("priority = 2");
    }

    @Test
    public void test4() {
        System.out.println("priority = default (7)");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

//    @AfterSuite()
//    public void error() {
//        System.out.println("afterSuite");
//    }

}
