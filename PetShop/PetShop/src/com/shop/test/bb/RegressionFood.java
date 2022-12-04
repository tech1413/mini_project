package com.shop.test.bb;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.shop.Food;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionFood {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.Class<?> wildcardClass5 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.Class<?> wildcardClass8 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.Class<?> wildcardClass3 = food0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        food0.setProduceDate("hi!");
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.Class<?> wildcardClass3 = food0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.toString();
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setProduceDate("hi!");
        java.lang.Class<?> wildcardClass5 = food0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        java.lang.String str6 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass4 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.Class<?> wildcardClass1 = food0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.toString();
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.shop.Food food3 = new com.shop.Food("hi!", "", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("");
        java.lang.String str11 = food0.getName();
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        food0.setName("");
        food0.setName("");
        java.lang.String str9 = food0.toString();
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getName();
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        food0.setName("Food [name=null, produceDate=null, expiredDate=]");
        food0.setProduceDate("hi!");
        java.lang.String str12 = food0.getProduceDate();
        food0.setExpiredDate("");
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        food0.setName("");
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("");
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.getName();
        java.lang.Class<?> wildcardClass2 = food0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.getName();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass3 = food0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.shop.Food food3 = new com.shop.Food("hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.toString();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "", "");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        food0.setName("Food [name=null, produceDate=null, expiredDate=]");
        food0.setProduceDate("hi!");
        java.lang.String str12 = food0.getProduceDate();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("hi!");
        food0.setExpiredDate("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str12 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.shop.Food food3 = new com.shop.Food("hi!", "", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=]");
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass8 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str14 = food0.toString();
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str14 = food0.getExpiredDate();
        food0.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str19 = food0.getName();
        java.lang.Class<?> wildcardClass20 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str19, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "hi!");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.toString();
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.toString();
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("");
        java.lang.String str8 = food3.getName();
        java.lang.String str9 = food3.getExpiredDate();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        food0.setName("");
        food0.setName("");
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        food0.setName("");
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str13 = food0.toString();
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str13, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]", "");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getProduceDate();
        java.lang.String str6 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.toString();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getName();
        java.lang.Class<?> wildcardClass5 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str2, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setProduceDate("");
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getProduceDate();
        java.lang.String str6 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.toString();
        food0.setName("hi!");
        java.lang.String str14 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str12 = food0.getName();
        food0.setExpiredDate("Food [name=, produceDate=, expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str10 = food3.toString();
        java.lang.String str11 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass12 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str10, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str12 = food0.getName();
        java.lang.String str13 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str8 = food0.getExpiredDate();
        java.lang.String str9 = food0.getName();
        food0.setName("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getExpiredDate();
        food0.setExpiredDate("hi!");
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getName();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str6 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        food3.setName("");
        java.lang.String str7 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str8 = food0.toString();
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str8, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        java.lang.String str6 = food0.getProduceDate();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str6 = food3.toString();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass10 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str6, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.toString();
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str5, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str6 = food0.getExpiredDate();
        java.lang.String str7 = food0.getProduceDate();
        java.lang.String str8 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "", "");
        java.lang.String str4 = food3.getName();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getExpiredDate();
        java.lang.String str13 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str13 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "");
        java.lang.String str4 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass4 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str4 = food3.getProduceDate();
        food3.setName("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setExpiredDate("hi!");
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getProduceDate();
        food3.setName("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.Class<?> wildcardClass8 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        food3.setExpiredDate("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str6 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.String str4 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.toString();
        java.lang.String str6 = food3.getName();
        food3.setProduceDate("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.String str9 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str5, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.getName();
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.toString();
        java.lang.String str5 = food0.toString();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.toString();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.String str14 = food0.getName();
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("");
        java.lang.String str11 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str14 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass17 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setExpiredDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        java.lang.String str8 = food3.getExpiredDate();
        java.lang.String str9 = food3.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str8, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.getName();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str11 = food0.getName();
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.getName();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.String str13 = food0.getName();
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "", "hi!");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str9 = food0.getExpiredDate();
        java.lang.String str10 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str13 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str13, "Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str13 = food0.toString();
        java.lang.String str14 = food0.getExpiredDate();
        java.lang.String str15 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass16 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str13, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setExpiredDate("hi!");
        food0.setExpiredDate("");
        java.lang.Class<?> wildcardClass16 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str6 = food3.toString();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food3.getProduceDate();
        food3.setProduceDate("Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str6, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass8 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getName();
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=]");
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass10 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.shop.Food food3 = new com.shop.Food("", "hi!", "Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getProduceDate();
        java.lang.String str6 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.toString();
        food3.setName("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str5, "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        java.lang.String str6 = food3.getName();
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str13 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str13, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getName();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("");
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass16 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("hi!");
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.toString();
        food0.setName("Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
        java.lang.Class<?> wildcardClass8 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str6 = food0.getName();
        java.lang.String str7 = food0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]" + "'", str7, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getProduceDate();
        food0.setExpiredDate("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getName();
        food3.setExpiredDate("Food [name=, produceDate=null, expiredDate=hi!]");
        food3.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("");
        java.lang.String str8 = food3.getName();
        food3.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass13 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getProduceDate();
        java.lang.String str6 = food3.getExpiredDate();
        food3.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass9 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setName("");
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str16 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str16, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str4, "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str5, "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getProduceDate();
        java.lang.String str6 = food3.getProduceDate();
        java.lang.String str7 = food3.getName();
        java.lang.String str8 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("");
        java.lang.String str8 = food3.getExpiredDate();
        food3.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setExpiredDate("Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setExpiredDate("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str10 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]" + "'", str10, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getProduceDate();
        java.lang.String str6 = food3.getProduceDate();
        java.lang.String str7 = food3.getName();
        java.lang.Class<?> wildcardClass8 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str7, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        food0.setName("");
        food0.setName("");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        food0.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.toString();
        java.lang.String str13 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str12, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.getName();
        java.lang.String str6 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.getName();
        food0.setProduceDate("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        java.lang.String str4 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]" + "'", str4, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.shop.Food food3 = new com.shop.Food("hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setName("Food [name=, produceDate=, expiredDate=hi!]");
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str11 = food0.getProduceDate();
        java.lang.String str12 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getExpiredDate();
        food0.setExpiredDate("hi!");
        java.lang.String str14 = food0.getName();
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]" + "'", str5, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("hi!");
        food0.setExpiredDate("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.String str11 = food0.getName();
        food0.setExpiredDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        java.lang.String str14 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getProduceDate();
        food3.setName("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str8 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass9 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getName();
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str8, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str9, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getProduceDate();
        java.lang.String str13 = food0.toString();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.Class<?> wildcardClass16 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setExpiredDate("");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getExpiredDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.toString();
        java.lang.String str6 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getName();
        food3.setExpiredDate("Food [name=, produceDate=null, expiredDate=hi!]");
        food3.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        java.lang.String str10 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("");
        java.lang.String str8 = food3.getName();
        java.lang.Class<?> wildcardClass9 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.toString();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.toString();
        food0.setProduceDate("Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str2, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.shop.Food food3 = new com.shop.Food("hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str8, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        food0.setName("Food [name=null, produceDate=null, expiredDate=]");
        food0.setProduceDate("hi!");
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=, expiredDate=hi!]", "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]", "Food [name=, produceDate=, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.toString();
        java.lang.String str12 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "hi!");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "", "Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getProduceDate();
        food3.setName("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str8 = food3.getProduceDate();
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setName("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str6 = food3.toString();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str6, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str5 = food0.getProduceDate();
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass8 = food0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        food3.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.String str4 = food3.toString();
        java.lang.String str5 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]" + "'", str4, "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.toString();
        java.lang.String str12 = food0.toString();
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str8 = food0.getExpiredDate();
        java.lang.String str9 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.toString();
        java.lang.String str12 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null], expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str14 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=null, produceDate=null, expiredDate=]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.String str14 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=], expiredDate=hi!]" + "'", str14, "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=], expiredDate=hi!]");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str7 = food3.getName();
        java.lang.String str8 = food3.getExpiredDate();
        food3.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]");
        java.lang.String str11 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str7, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getName();
        food0.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.toString();
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str5, "Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.getExpiredDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str12, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("hi!");
        java.lang.String str11 = food0.getExpiredDate();
        java.lang.String str12 = food0.getExpiredDate();
        java.lang.String str13 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str8 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass9 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str8, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("");
        java.lang.String str11 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str14 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.shop.Food food3 = new com.shop.Food("hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setProduceDate("");
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        java.lang.String str6 = food3.toString();
        food3.setName("Food [name=, produceDate=, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass9 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        java.lang.String str6 = food0.getProduceDate();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getExpiredDate();
        food0.setExpiredDate("hi!");
        food0.setProduceDate("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("");
        java.lang.String str6 = food3.getName();
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass9 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("");
        java.lang.String str8 = food3.getExpiredDate();
        java.lang.String str9 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass10 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        java.lang.String str6 = food0.getExpiredDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food0.setExpiredDate("");
        food0.setProduceDate("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str7 = food3.getName();
        java.lang.String str8 = food3.getExpiredDate();
        java.lang.String str9 = food3.getProduceDate();
        food3.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.String str12 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str7, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str5 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        food3.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.String str6 = food3.toString();
        java.lang.String str7 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str7, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        java.lang.String str6 = food3.toString();
        java.lang.String str7 = food3.getName();
        java.lang.String str8 = food3.getName();
        java.lang.String str9 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str7, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("");
        java.lang.String str8 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass9 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str14 = food0.toString();
        java.lang.String str15 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.String str11 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.toString();
        food3.setExpiredDate("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=], expiredDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]]" + "'", str4, "Food [name=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=], expiredDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=, produceDate=Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=hi!]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str5 = food0.getProduceDate();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], expiredDate=hi!]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getName();
        food3.setExpiredDate("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str8 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        food0.setName("");
        food0.setName("");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str12 = food0.getProduceDate();
        java.lang.String str13 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getProduceDate();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setExpiredDate("Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str7 = food3.getName();
        java.lang.String str8 = food3.getExpiredDate();
        food3.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]");
        java.lang.String str11 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str7, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]" + "'", str11, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]", "Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.String str4 = food3.toString();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]" + "'", str4, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str6 = food3.getName();
        food3.setName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "", "Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]", "Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str6 = food3.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.toString();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
        java.lang.String str7 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str4, "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]" + "'", str7, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setProduceDate("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str6 = food3.toString();
        java.lang.String str7 = food3.getExpiredDate();
        java.lang.String str8 = food3.toString();
        java.lang.String str9 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass10 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str6, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str7, "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str8, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str9, "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "", "Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str6 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=hi!, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.toString();
        java.lang.String str12 = food0.getProduceDate();
        java.lang.String str13 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getProduceDate();
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]");
        java.lang.String str8 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        food3.setName("");
        java.lang.String str8 = food3.getExpiredDate();
        food3.setProduceDate("Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food0.setProduceDate("Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setExpiredDate("Food [name=hi!, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setExpiredDate("Food [name=, produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null], expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        food3.setExpiredDate("");
        java.lang.String str6 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.toString();
        java.lang.String str6 = food0.getExpiredDate();
        java.lang.String str7 = food0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("");
        java.lang.String str11 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str14 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("");
        java.lang.String str12 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.Class<?> wildcardClass8 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.String str8 = food0.getName();
        food0.setExpiredDate("Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]");
        food0.setName("Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getExpiredDate();
        java.lang.String str13 = food0.toString();
        java.lang.String str14 = food0.getProduceDate();
        java.lang.String str15 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str15, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "", "");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getExpiredDate();
        java.lang.String str6 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.String str8 = food0.getName();
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        java.lang.String str11 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]" + "'", str8, "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str8, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str9, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.toString();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str5, "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "hi!");
        java.lang.String str4 = food3.toString();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str13 = food0.getProduceDate();
        java.lang.String str14 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str7 = food0.getProduceDate();
        food0.setProduceDate("Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str10 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str7, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getExpiredDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str11 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        food0.setProduceDate("Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str8 = food0.getProduceDate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setExpiredDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        food3.setName("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        java.lang.Class<?> wildcardClass10 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getProduceDate();
        java.lang.String str6 = food0.getName();
        food0.setProduceDate("Food [name=, produceDate=, expiredDate=hi!]");
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]", "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("");
        java.lang.String str6 = food3.getExpiredDate();
        java.lang.String str7 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]");
        java.lang.String str4 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.String str11 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.Class<?> wildcardClass18 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str5, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "", "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.toString();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str2, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str7 = food3.getName();
        java.lang.String str8 = food3.getExpiredDate();
        java.lang.String str9 = food3.getProduceDate();
        food3.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str7, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setExpiredDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        java.lang.String str8 = food3.getName();
        food3.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.Class<?> wildcardClass11 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str10 = food3.toString();
        java.lang.String str11 = food3.getExpiredDate();
        java.lang.String str12 = food3.getExpiredDate();
        java.lang.String str13 = food3.getName();
        java.lang.Class<?> wildcardClass14 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str10, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str13, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str10 = food0.getExpiredDate();
        food0.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setName("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setExpiredDate("Food [name=hi!, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getExpiredDate();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        food3.setName("");
        java.lang.String str8 = food3.getExpiredDate();
        java.lang.String str9 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=null, produceDate=null, expiredDate=]", "");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        java.lang.String str6 = food3.getProduceDate();
        java.lang.String str7 = food3.getProduceDate();
        food3.setProduceDate("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str7, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("");
        java.lang.String str6 = food3.getName();
        food3.setName("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        food3.setExpiredDate("Food [name=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=], expiredDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str6 = food3.getName();
        java.lang.String str7 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass8 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=hi!, expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]", "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]], produceDate=null, expiredDate=hi!]", "Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=hi!, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food3.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]");
        java.lang.String str6 = food3.getProduceDate();
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]" + "'", str6, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.toString();
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str5, "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setExpiredDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]], expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str6 = food3.getName();
        java.lang.String str7 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str7, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setName("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str5 = food0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getProduceDate();
        java.lang.String str13 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str13, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]", "");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.getName();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.String str13 = food0.getExpiredDate();
        java.lang.String str14 = food0.getProduceDate();
        java.lang.String str15 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str18 = food0.toString();
        java.lang.String str19 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str14, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Food [name=, produceDate=Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=hi!]" + "'", str18, "Food [name=, produceDate=Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str10 = food3.toString();
        java.lang.String str11 = food3.getExpiredDate();
        java.lang.String str12 = food3.getExpiredDate();
        food3.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str15 = food3.toString();
        java.lang.String str16 = food3.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str10, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str15, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str16, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]", "Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getExpiredDate();
        java.lang.String str10 = food0.getProduceDate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str8, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        food3.setName("");
        java.lang.String str8 = food3.toString();
        food3.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]");
        java.lang.String str11 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]" + "'", str11, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.Class<?> wildcardClass8 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.shop.Food food3 = new com.shop.Food("", "hi!", "Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        food3.setProduceDate("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.String str10 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str10, "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]", "");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.toString();
        java.lang.String str13 = food0.getProduceDate();
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setName("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass20 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str12, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.shop.Food food3 = new com.shop.Food("hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.toString();
        java.lang.String str6 = food0.getExpiredDate();
        food0.setName("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getProduceDate();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]" + "'", str9, "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]", "Food [name=, produceDate=, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str4 = food3.getProduceDate();
        food3.setExpiredDate("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str7 = food3.toString();
        java.lang.Class<?> wildcardClass8 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]]" + "'", str7, "Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setExpiredDate("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        food3.setName("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        java.lang.String str6 = food3.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.toString();
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str5, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getExpiredDate();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("");
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getName();
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setName("Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str8 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        food0.setName("");
        java.lang.String str8 = food0.getName();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.String str13 = food0.getName();
        java.lang.String str14 = food0.getName();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str17 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str16 = food0.getExpiredDate();
        java.lang.String str17 = food0.getName();
        food0.setProduceDate("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str17, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("");
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str16 = food0.getName();
        java.lang.Class<?> wildcardClass17 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("");
        java.lang.String str12 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=, expiredDate=hi!]");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=], expiredDate=hi!]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "", "");
        java.lang.String str4 = food3.toString();
        java.lang.String str5 = food3.getName();
        food3.setExpiredDate("Food [name=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=], expiredDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str8 = food3.toString();
        food3.setName("Food [name=null, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]]");
        food3.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str8, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str4 = food3.getName();
        food3.setName("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.String str7 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str7, "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.toString();
        food3.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str5, "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getProduceDate();
        java.lang.String str6 = food0.getName();
        food0.setProduceDate("Food [name=, produceDate=, expiredDate=hi!]");
        java.lang.String str9 = food0.getName();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setExpiredDate("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getExpiredDate();
        food0.setExpiredDate("hi!");
        food0.setProduceDate("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setName("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=hi!]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str4, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]", "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.getName();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getName();
        java.lang.String str4 = food0.toString();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str5, "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food0.setExpiredDate("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=hi!]");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("hi!");
        java.lang.String str11 = food0.getExpiredDate();
        java.lang.String str12 = food0.getProduceDate();
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getExpiredDate();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]");
        food0.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=null, produceDate=null, expiredDate=]", "Food [name=null, produceDate=null, expiredDate=hi!]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setExpiredDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setName("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]], expiredDate=null]");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str4 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]" + "'", str4, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setName("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str5 = food0.getProduceDate();
        java.lang.String str6 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        java.lang.String str6 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]", "Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("hi!");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]], expiredDate=null]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=hi!, expiredDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]]");
        java.lang.String str8 = food3.getName();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]", "Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "hi!");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setName("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.Class<?> wildcardClass10 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getName();
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.String str22 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str22, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]", "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getExpiredDate();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]");
        food0.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=null, produceDate=null, expiredDate=]", "");
        food3.setProduceDate("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.toString();
        food0.setName("hi!");
        java.lang.String str14 = food0.getProduceDate();
        food0.setName("hi!");
        food0.setName("Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("hi!");
        food0.setExpiredDate("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str12 = food0.getProduceDate();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str15 = food0.getExpiredDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str15, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str4 = food3.getName();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=hi!, expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.toString();
        food0.setProduceDate("Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.shop.Food food3 = new com.shop.Food("", "hi!", "Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        food3.setProduceDate("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass10 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass15 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.String str11 = food0.toString();
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getProduceDate();
        java.lang.String str13 = food0.getProduceDate();
        java.lang.String str14 = food0.getProduceDate();
        java.lang.String str15 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str15, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        food3.setExpiredDate("Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=, produceDate=null, expiredDate=hi!]", "");
        java.lang.String str4 = food3.toString();
        java.lang.String str5 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=]" + "'", str5, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=]");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]" + "'", str4, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setExpiredDate("Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str9 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]" + "'", str9, "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], expiredDate=]");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getExpiredDate();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        java.lang.String str6 = food3.getName();
        food3.setName("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str10 = food3.getExpiredDate();
        food3.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass13 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("");
        java.lang.String str11 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str14 = food0.getProduceDate();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]], expiredDate=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        food0.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getProduceDate();
        java.lang.String str13 = food0.getProduceDate();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=hi!]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str13, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        java.lang.String str6 = food3.toString();
        java.lang.String str7 = food3.getName();
        java.lang.String str8 = food3.getName();
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str13 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str7, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str13, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getProduceDate();
        java.lang.String str6 = food0.getName();
        food0.setProduceDate("Food [name=, produceDate=, expiredDate=hi!]");
        java.lang.String str9 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass12 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]", "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]" + "'", str5, "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("");
        java.lang.String str8 = food3.getName();
        food3.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food3.setName("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.toString();
        food0.setName("");
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food0.setName("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str14 = food0.getName();
        java.lang.String str15 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str15, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.toString();
        java.lang.String str11 = food0.getProduceDate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str9, "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str10, "Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str5 = food0.getExpiredDate();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]" + "'", str8, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setProduceDate("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str11 = food0.getExpiredDate();
        java.lang.String str12 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.toString();
        food3.setName("Food [name=, produceDate=, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=hi!, produceDate=hi!, expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str8, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str9, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]" + "'", str10, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getExpiredDate();
        java.lang.String str5 = food0.toString();
        java.lang.Class<?> wildcardClass6 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]", "Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass7 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.getProduceDate();
        java.lang.String str6 = food3.getProduceDate();
        food3.setExpiredDate("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        food3.setName("");
        java.lang.String str11 = food3.getProduceDate();
        java.lang.String str12 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setName("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food3.setExpiredDate("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass8 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.getExpiredDate();
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=Food [name=, produceDate=, expiredDate=hi!], expiredDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]]", "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.toString();
        java.lang.String str12 = food0.toString();
        java.lang.Class<?> wildcardClass13 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]", "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        food3.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        java.lang.String str7 = food3.getName();
        java.lang.String str8 = food3.getExpiredDate();
        java.lang.String str9 = food3.getProduceDate();
        food3.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setProduceDate("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str7, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]], produceDate=null, expiredDate=hi!]", "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.String str4 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]" + "'", str4, "Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str4 = food3.getName();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        java.lang.String str4 = food3.getProduceDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]" + "'", str4, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.toString();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=, expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("");
        java.lang.String str8 = food3.getName();
        food3.setName("Food [name=, produceDate=null, expiredDate=hi!]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        food3.setName("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        food3.setExpiredDate("Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]");
        food3.setName("Food [name=null, produceDate=null, expiredDate=]");
        food3.setExpiredDate("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        java.lang.String str6 = food0.getProduceDate();
        food0.setProduceDate("Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.getName();
        java.lang.String str5 = food3.toString();
        java.lang.String str6 = food3.getName();
        food3.setProduceDate("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str5, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str6 = food3.toString();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food3.getExpiredDate();
        java.lang.String str10 = food3.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str6, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=, produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.shop.Food food3 = new com.shop.Food("hi!", "hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        food3.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass9 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=null, produceDate=null, expiredDate=]", "");
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        food3.setName("Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        java.lang.Class<?> wildcardClass8 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getExpiredDate();
        food0.setName("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.shop.Food food3 = new com.shop.Food("hi!", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.toString();
        java.lang.String str5 = food3.getExpiredDate();
        java.lang.String str6 = food3.getExpiredDate();
        java.lang.String str7 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str4, "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str7, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getName();
        food3.setExpiredDate("hi!");
        java.lang.String str8 = food3.getProduceDate();
        java.lang.String str9 = food3.getProduceDate();
        java.lang.String str10 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.toString();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        food3.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setExpiredDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        food3.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str10 = food3.toString();
        java.lang.String str11 = food3.getExpiredDate();
        java.lang.String str12 = food3.getExpiredDate();
        food3.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food3.setProduceDate("Food [name=, produceDate=null, expiredDate=hi!]");
        food3.setName("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        java.lang.String str19 = food3.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]" + "'", str10, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str19, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str12 = food0.getProduceDate();
        food0.setExpiredDate("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.toString();
        java.lang.String str6 = food0.getProduceDate();
        java.lang.Class<?> wildcardClass7 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=null]", "");
        food3.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        food0.setExpiredDate("");
        java.lang.String str11 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str14 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        java.lang.Class<?> wildcardClass23 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str14, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setName("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str14 = food0.getExpiredDate();
        food0.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str19 = food0.getName();
        food0.setExpiredDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        food0.setName("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]");
        java.lang.String str24 = food0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str19, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]" + "'", str24, "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        java.lang.String str10 = food0.getProduceDate();
        java.lang.String str11 = food0.getName();
        java.lang.String str12 = food0.getProduceDate();
        java.lang.String str13 = food0.getName();
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str12, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=null]]", "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=hi!, expiredDate=Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]]", "Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        java.lang.String str6 = food0.getExpiredDate();
        food0.setName("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.Class<?> wildcardClass9 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]", "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=, expiredDate=hi!]");
        java.lang.String str4 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass4 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "hi!");
        java.lang.String str4 = food3.getProduceDate();
        java.lang.String str5 = food3.getProduceDate();
        food3.setName("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str8 = food3.toString();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass11 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str8, "Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.shop.Food food3 = new com.shop.Food("", "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.String str4 = food3.toString();
        java.lang.String str5 = food3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=, produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]]" + "'", str4, "Food [name=, produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=hi!]", "");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.getProduceDate();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.getName();
        food3.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str4, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]]");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.Class<?> wildcardClass4 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("");
        java.lang.String str3 = food0.toString();
        food0.setProduceDate("hi!");
        food0.setExpiredDate("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setName("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Food [name=null, produceDate=null, expiredDate=]" + "'", str3, "Food [name=null, produceDate=null, expiredDate=]");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food0.toString();
        food0.setName("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food0.setExpiredDate("hi!");
        food0.setExpiredDate("");
        food0.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str9, "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.shop.Food food0 = new com.shop.Food();
        java.lang.String str1 = food0.toString();
        java.lang.String str2 = food0.getProduceDate();
        java.lang.String str3 = food0.getExpiredDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.toString();
        java.lang.String str6 = food0.getExpiredDate();
        java.lang.String str7 = food0.toString();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]]");
        java.lang.String str10 = food0.toString();
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str1, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str5, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str7, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]], expiredDate=null]" + "'", str10, "Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=]]], expiredDate=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=null, expiredDate=hi!]", "hi!", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str6 = food3.toString();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        java.lang.String str9 = food3.getExpiredDate();
        java.lang.String str10 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str6, "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str9, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str10, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        java.lang.String str6 = food0.getExpiredDate();
        java.lang.String str7 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass8 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        food3.setProduceDate("Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=, expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        java.lang.Class<?> wildcardClass6 = food3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=hi!, expiredDate=Food [name=Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=, produceDate=, expiredDate=hi!]]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        java.lang.String str4 = food3.getExpiredDate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=]", "Food [name=Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!], expiredDate=Food [name=, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str10 = food0.getExpiredDate();
        java.lang.Class<?> wildcardClass11 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.shop.Food food3 = new com.shop.Food("Food [name=, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.shop.Food food3 = new com.shop.Food("Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=]", "Food [name=, produceDate=null, expiredDate=hi!]", "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        java.lang.String str4 = food3.getExpiredDate();
        java.lang.String str5 = food3.toString();
        java.lang.String str6 = food3.getExpiredDate();
        food3.setExpiredDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=hi!, expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str4, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]" + "'", str5, "Food [name=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]" + "'", str6, "Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.toString();
        java.lang.String str9 = food0.getProduceDate();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.getExpiredDate();
        food0.setExpiredDate("hi!");
        food0.setProduceDate("");
        java.lang.String str16 = food0.getProduceDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setExpiredDate("hi!");
        java.lang.String str8 = food0.toString();
        food0.setExpiredDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        java.lang.String str11 = food0.toString();
        food0.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]], produceDate=Food [name=null, produceDate=null, expiredDate=], expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        java.lang.Class<?> wildcardClass14 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str8, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]" + "'", str11, "Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!], produceDate=null, expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=null]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food3.setProduceDate("");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.shop.Food food3 = new com.shop.Food("Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.toString();
        java.lang.String str5 = food3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str4, "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str5, "Food [name=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], produceDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=hi!], produceDate=null, expiredDate=]", "Food [name=null, produceDate=Food [name=, produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]", "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=, expiredDate=Food [name=, produceDate=null, expiredDate=hi!]]");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.shop.Food food3 = new com.shop.Food("", "hi!", "Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
        food3.setProduceDate("Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        food3.setExpiredDate("");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=null, expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]], expiredDate=Food [name=null, produceDate=null, expiredDate=]]", "Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=]");
        food3.setExpiredDate("Food [name=, produceDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]], expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food3.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        java.lang.String str10 = food0.getName();
        java.lang.String str11 = food0.toString();
        java.lang.String str12 = food0.getProduceDate();
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str15 = food0.getName();
        food0.setExpiredDate("Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=], produceDate=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=hi!, expiredDate=Food [name=null, produceDate=null, expiredDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]], expiredDate=Food [name=Food [name=, produceDate=null, expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=]]");
        java.lang.Class<?> wildcardClass18 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str10, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]" + "'", str11, "Food [name=Food [name=null, produceDate=null, expiredDate=null], produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str15, "Food [name=null, produceDate=null, expiredDate=null]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getExpiredDate();
        java.lang.String str6 = food0.toString();
        java.lang.String str7 = food0.getName();
        java.lang.String str8 = food0.getName();
        java.lang.String str9 = food0.getName();
        java.lang.Class<?> wildcardClass10 = food0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Food [name=null, produceDate=null, expiredDate=hi!]" + "'", str6, "Food [name=null, produceDate=null, expiredDate=hi!]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.shop.Food food3 = new com.shop.Food("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]", "Food [name=null, produceDate=null, expiredDate=]");
        java.lang.String str4 = food3.toString();
        java.lang.Class<?> wildcardClass5 = food3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]" + "'", str4, "Food [name=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=]]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        java.lang.String str8 = food0.getProduceDate();
        java.lang.String str9 = food0.getName();
        food0.setProduceDate("Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=Food [name=null, produceDate=null, expiredDate=null]]");
        food0.setProduceDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=hi!, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!]]]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Food [name=null, produceDate=null, expiredDate=null]" + "'", str9, "Food [name=null, produceDate=null, expiredDate=null]");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.shop.Food food0 = new com.shop.Food();
        food0.setExpiredDate("hi!");
        java.lang.String str3 = food0.getProduceDate();
        java.lang.String str4 = food0.getName();
        java.lang.String str5 = food0.getName();
        food0.setName("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setProduceDate("Food [name=null, produceDate=null, expiredDate=null]");
        food0.setExpiredDate("Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]");
        food0.setName("Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=]");
        java.lang.String str14 = food0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]]" + "'", str14, "Food [name=Food [name=Food [name=null, produceDate=null, expiredDate=hi!], produceDate=Food [name=, produceDate=null, expiredDate=hi!], expiredDate=], produceDate=Food [name=null, produceDate=null, expiredDate=null], expiredDate=Food [name=Food [name=null, produceDate=Food [name=null, produceDate=null, expiredDate=hi!], expiredDate=hi!], produceDate=null, expiredDate=Food [name=null, produceDate=null, expiredDate=hi!]]]");
    }
}

