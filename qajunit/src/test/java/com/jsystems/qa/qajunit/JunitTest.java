package com.jsystems.qa.qajunit;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("Junit tests")
@Tag ("unit")
public class JunitTest {

    final String stringTestowy = "stringTestowy";

    @DisplayName("First junit test")
    @Disabled("bug")
    //@RepeatedTest(5)
    @Tag("first")
    @Test
    public void firstTest() {
    assertTrue(stringTestowy.contains("tr"));
    assertTrue(  5 == 2+3, "message for test result" );
    assertFalse(stringTestowy.contains("z"));
    assertThat(stringTestowy).contains("s");
        assertThat(stringTestowy).isEqualTo("stringTestowy");



//@Tag("secend")
//@Test
//public void  secondTest (){
        //System.out.println(0.2 * 0.2);
       // double result = new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue()

       // @Nested
       // public class NestedTest {

        //    List<Integer> list1 = array.aslist(1,2,3,4,5);


      //      @Test
      //      public void  firstNestedTest () {



        }
}
