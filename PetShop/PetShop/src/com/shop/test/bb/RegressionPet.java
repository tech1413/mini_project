package com.shop.test.bb;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.shop.Food;
import com.shop.Pet;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionPet {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass3 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.Class<?> wildcardClass23 = foodList16.getClass();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        java.lang.String str12 = pet0.getName();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(foodList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.lang.String str5 = pet0.getName();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = foodList7.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.Class<?> wildcardClass13 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet14.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.shop.Food[] foodArray3 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList4 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList4, foodArray3);
        com.shop.Pet pet6 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList4);
        java.util.List<com.shop.Food> foodList7 = pet6.getFavouriteFood();
        java.lang.Class<?> wildcardClass8 = pet6.getClass();
        org.junit.Assert.assertNotNull(foodArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(foodList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        java.lang.String str10 = pet0.getName();
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = foodList7.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.List<com.shop.Food> foodList3 = null;
        com.shop.Pet pet4 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList3);
        java.lang.Class<?> wildcardClass5 = pet4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.util.List<com.shop.Food> foodList3 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass4 = pet0.getClass();
        org.junit.Assert.assertNull(foodList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet14.setOwner("Pet [name=null, age=0, owner=, favouriteFood=null]");
        java.lang.Class<?> wildcardClass17 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str19 = pet18.getOwner();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Food[] foodArray46 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList47 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList47, foodArray46);
        com.shop.Pet pet49 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet50 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet51 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        pet30.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        java.lang.Class<?> wildcardClass56 = pet18.getClass();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getName();
        java.lang.String str15 = pet0.getName();
        java.lang.String str16 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str16, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        pet0.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList24 = pet0.getFavouriteFood();
        java.lang.String str25 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str25, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet24 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList21);
        java.lang.Class<?> wildcardClass27 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.util.List<com.shop.Food> foodList8 = pet3.getFavouriteFood();
        com.shop.Pet pet9 = new com.shop.Pet();
        pet9.setAge((java.lang.Integer) 100);
        pet9.setOwner("");
        java.lang.String str14 = pet9.getOwner();
        java.lang.String str15 = pet9.getName();
        java.lang.String str16 = pet9.getName();
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        java.util.List<com.shop.Food> foodList24 = pet23.getFavouriteFood();
        pet9.setFavouriteFood(foodList24);
        pet3.setFavouriteFood(foodList24);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList24);
        java.lang.Class<?> wildcardClass28 = foodList24.getClass();
        org.junit.Assert.assertNull(foodList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(foodList24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=hi!, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=hi!, age=100, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        java.lang.Class<?> wildcardClass16 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Food[] foodArray37 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList38 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList38, foodArray37);
        com.shop.Pet pet40 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet42 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet43 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList38);
        pet21.setFavouriteFood((java.util.List<com.shop.Food>) foodList38);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList38);
        java.lang.Class<?> wildcardClass47 = foodList38.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = foodList10.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str17 = pet0.getName();
        java.lang.Class<?> wildcardClass18 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList3 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = foodList3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(foodList3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        java.lang.String str12 = pet0.getName();
        java.lang.String str13 = pet0.toString();
        java.util.List<com.shop.Food> foodList14 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(foodList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=hi!, age=100, owner=, favouriteFood=null]" + "'", str13, "Pet [name=hi!, age=100, owner=, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList14);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = foodList7.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", foodList13);
        pet14.setAge((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass17 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        pet0.setName("hi!");
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=, age=0, owner=, favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = foodList7.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) 1, "", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = foodList10.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.Class<?> wildcardClass23 = pet22.getClass();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(foodList5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList13);
        pet18.setName("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.String str21 = pet18.getOwner();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str21, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList4 = pet0.getFavouriteFood();
        java.lang.String str5 = pet0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(foodList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str5, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.shop.Food[] foodArray3 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList4 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList4, foodArray3);
        com.shop.Pet pet6 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList4);
        java.util.List<com.shop.Food> foodList7 = pet6.getFavouriteFood();
        pet6.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList10 = pet6.getFavouriteFood();
        java.lang.Class<?> wildcardClass11 = foodList10.getClass();
        org.junit.Assert.assertNotNull(foodArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(foodList7);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet();
        pet14.setAge((java.lang.Integer) 100);
        pet14.setOwner("");
        java.util.List<com.shop.Food> foodList19 = pet14.getFavouriteFood();
        com.shop.Pet pet20 = new com.shop.Pet();
        pet20.setAge((java.lang.Integer) 100);
        pet20.setOwner("");
        java.lang.String str25 = pet20.getOwner();
        java.lang.String str26 = pet20.getName();
        java.lang.String str27 = pet20.getName();
        com.shop.Food[] foodArray31 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList32 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList32, foodArray31);
        com.shop.Pet pet34 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList32);
        java.util.List<com.shop.Food> foodList35 = pet34.getFavouriteFood();
        pet20.setFavouriteFood(foodList35);
        pet14.setFavouriteFood(foodList35);
        pet13.setFavouriteFood(foodList35);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=100, owner=, favouriteFood=null]", foodList35);
        java.lang.Class<?> wildcardClass40 = pet39.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(foodArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(foodList35);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str3 = pet0.getName();
        java.lang.String str4 = pet0.toString();
        java.lang.String str5 = pet0.getOwner();
        pet0.setAge((java.lang.Integer) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pet [name=null, age=100, owner=null, favouriteFood=null]" + "'", str4, "Pet [name=null, age=100, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList19);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.String str3 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]" + "'", str3, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.getName();
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList12);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        pet0.setFavouriteFood(foodList15);
        java.lang.String str17 = pet0.toString();
        pet0.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(foodList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=[]]" + "'", str17, "Pet [name=null, age=100, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        java.lang.String str11 = pet3.getName();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.lang.String str29 = pet28.getName();
        pet28.setAge((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str29, "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet27 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        pet9.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList23);
        java.lang.Class<?> wildcardClass30 = foodList23.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.toString();
        java.lang.String str8 = pet0.getOwner();
        java.lang.Integer int9 = pet0.getAge();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str7, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray8 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList9 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList9, foodArray8);
        com.shop.Pet pet11 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList9);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList9);
        java.lang.Class<?> wildcardClass13 = foodList9.getClass();
        org.junit.Assert.assertNotNull(foodArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        java.lang.String str10 = pet0.getOwner();
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.toString();
        java.lang.String str8 = pet0.getOwner();
        java.lang.Integer int9 = pet0.getAge();
        java.lang.String str10 = pet0.toString();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str7, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str10, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList11);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.toString();
        java.lang.String str16 = pet3.getName();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        pet41.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str15, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Food[] foodArray28 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList29 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList29, foodArray28);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList29);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList29);
        pet21.setFavouriteFood((java.util.List<com.shop.Food>) foodList29);
        com.shop.Food[] foodArray46 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList47 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList47, foodArray46);
        com.shop.Pet pet49 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet50 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet51 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet52 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        pet21.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet54 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList47);
        java.lang.Class<?> wildcardClass55 = pet54.getClass();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(foodArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.util.List<com.shop.Food> foodList3 = null;
        com.shop.Pet pet4 = new com.shop.Pet("", (java.lang.Integer) 100, "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 100);
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList13);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        java.lang.String str19 = pet14.getName();
        java.lang.String str20 = pet14.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str19, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]" + "'", str20, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str23 = pet22.toString();
        java.lang.String str24 = pet22.getName();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=null]" + "'", str24, "Pet [name=null, age=100, owner=, favouriteFood=null]");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        java.lang.Class<?> wildcardClass24 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        pet0.setAge((java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        java.lang.String str24 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str24, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = foodList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(foodList5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.getName();
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList12);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        pet0.setFavouriteFood(foodList15);
        java.lang.String str17 = pet0.toString();
        java.lang.Class<?> wildcardClass18 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(foodList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=[]]" + "'", str17, "Pet [name=null, age=100, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.shop.Pet pet0 = new com.shop.Pet();
        java.lang.String str1 = pet0.toString();
        pet0.setOwner("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.lang.Class<?> wildcardClass4 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pet [name=null, age=null, owner=null, favouriteFood=null]" + "'", str1, "Pet [name=null, age=null, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.getName();
        java.lang.String str8 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=null]" + "'", str8, "Pet [name=null, age=100, owner=, favouriteFood=null]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.Class<?> wildcardClass3 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str23 = pet22.toString();
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        com.shop.Pet pet36 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Pet pet37 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Pet pet38 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Food[] foodArray48 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList49 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList49, foodArray48);
        com.shop.Pet pet51 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList49);
        pet38.setFavouriteFood((java.util.List<com.shop.Food>) foodList49);
        pet22.setFavouriteFood((java.util.List<com.shop.Food>) foodList49);
        java.lang.Class<?> wildcardClass56 = foodList49.getClass();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.lang.String str5 = pet0.toString();
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        java.util.List<com.shop.Food> foodList19 = pet18.getFavouriteFood();
        pet18.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList22 = pet18.getFavouriteFood();
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList22);
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        pet23.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        java.lang.Class<?> wildcardClass30 = foodList25.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=, age=100, owner=null, favouriteFood=null]" + "'", str5, "Pet [name=, age=100, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodList19);
        org.junit.Assert.assertNotNull(foodList22);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("Pet [name=null, age=0, owner=null, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        java.lang.String str3 = pet0.toString();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        java.lang.String str8 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str3, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getName();
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        java.util.List<com.shop.Food> foodList20 = null;
        pet10.setFavouriteFood(foodList20);
        pet10.setName("Pet [name=null, age=1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str11, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setAge((java.lang.Integer) 100);
        pet10.setAge((java.lang.Integer) (-1));
        java.lang.String str15 = pet10.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str15, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getOwner();
        pet0.setOwner("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        java.lang.String str15 = pet0.getOwner();
        java.lang.String str16 = pet0.getName();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str19 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.shop.Pet pet0 = new com.shop.Pet();
        java.lang.String str1 = pet0.toString();
        pet0.setOwner("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList4 = pet0.getFavouriteFood();
        java.lang.Integer int5 = pet0.getAge();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pet [name=null, age=null, owner=null, favouriteFood=null]" + "'", str1, "Pet [name=null, age=null, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setName("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(foodList5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet10.setAge((java.lang.Integer) 0);
        pet10.setAge((java.lang.Integer) 0);
        pet10.setOwner("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getOwner();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str11, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str19 = pet18.getOwner();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Food[] foodArray46 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList47 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList47, foodArray46);
        com.shop.Pet pet49 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet50 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet51 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        pet30.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        com.shop.Food[] foodArray62 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList63 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList63, foodArray62);
        com.shop.Pet pet65 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList63);
        com.shop.Pet pet66 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList63);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList63);
        java.lang.String str68 = pet18.getOwner();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(foodArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet24 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList21);
        pet10.setAge((java.lang.Integer) 0);
        pet10.setAge((java.lang.Integer) 1);
        java.lang.String str31 = pet10.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Pet [name=, age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str31, "Pet [name=, age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet25 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList19);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) 1, "", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList13);
        pet18.setName("Pet [name=null, age=0, owner=null, favouriteFood=null]");
        pet18.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.String str23 = pet18.toString();
        java.lang.String str24 = pet18.getOwner();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.toString();
        java.lang.String str16 = pet3.getName();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str15, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        java.lang.String str11 = pet3.getName();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.lang.String str29 = pet28.getName();
        java.lang.String str30 = pet28.getName();
        java.lang.String str31 = pet28.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str29, "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str30, "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]" + "'", str31, "Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str11 = pet0.getOwner();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str11, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        java.lang.String str10 = pet0.getName();
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(foodList11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = foodList10.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        pet16.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList19 = pet16.getFavouriteFood();
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", foodList19);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=Pet [name=null, age=0, owner=null, favouriteFood=null], age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]", foodList19);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodList19);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getOwner();
        java.lang.Class<?> wildcardClass12 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str7 = pet0.toString();
        pet0.setName("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]" + "'", str7, "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.toString();
        java.lang.String str16 = pet3.getName();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        java.lang.Class<?> wildcardClass42 = foodList33.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str15, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str15 = pet14.toString();
        pet14.setOwner("Pet [name=hi!, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=hi!, age=10, owner=, favouriteFood=[]]" + "'", str15, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList13);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        pet14.setOwner("Pet [name=hi!, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str23 = pet22.toString();
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        com.shop.Pet pet36 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Pet pet37 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Pet pet38 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Food[] foodArray48 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList49 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList49, foodArray48);
        com.shop.Pet pet51 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList49);
        pet38.setFavouriteFood((java.util.List<com.shop.Food>) foodList49);
        pet22.setFavouriteFood((java.util.List<com.shop.Food>) foodList49);
        java.util.List<com.shop.Food> foodList56 = pet22.getFavouriteFood();
        java.lang.Class<?> wildcardClass57 = foodList56.getClass();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(foodList56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        pet18.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        pet18.setOwner("Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList12);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList12);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=, age=0, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList12);
        java.lang.Class<?> wildcardClass17 = pet16.getClass();
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        java.util.List<com.shop.Food> foodList10 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = foodList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str23 = pet22.toString();
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        com.shop.Pet pet36 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Pet pet37 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Pet pet38 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList34);
        com.shop.Food[] foodArray48 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList49 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList49, foodArray48);
        com.shop.Pet pet51 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList49);
        pet38.setFavouriteFood((java.util.List<com.shop.Food>) foodList49);
        pet22.setFavouriteFood((java.util.List<com.shop.Food>) foodList49);
        java.util.List<com.shop.Food> foodList56 = pet22.getFavouriteFood();
        pet22.setOwner("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(foodList56);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        java.lang.String str3 = pet0.toString();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str3, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.Class<?> wildcardClass23 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        java.lang.String str12 = pet0.getName();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList17);
        java.util.List<com.shop.Food> foodList20 = pet19.getFavouriteFood();
        pet19.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList23 = pet19.getFavouriteFood();
        pet0.setFavouriteFood(foodList23);
        java.lang.Class<?> wildcardClass25 = foodList23.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(foodList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodList20);
        org.junit.Assert.assertNotNull(foodList23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.toString();
        java.lang.String str15 = pet0.getName();
        java.lang.String str16 = pet0.getOwner();
        java.lang.String str17 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str14, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("");
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        pet0.setName("Pet [name=hi!, age=10, owner=null, favouriteFood=[]]");
        pet0.setOwner("Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str3 = pet0.getName();
        com.shop.Food[] foodArray13 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList14 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList14, foodArray13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList14);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList14);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList14);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList14);
        java.lang.Class<?> wildcardClass20 = foodList14.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(foodArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Food[] foodArray23 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList24 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList24, foodArray23);
        com.shop.Pet pet26 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList24);
        com.shop.Pet pet27 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList24);
        com.shop.Pet pet28 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList24);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList24);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList24);
        java.lang.Class<?> wildcardClass31 = pet30.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=, age=0, owner=, favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str15 = pet14.toString();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str15, "Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.shop.Food[] foodArray3 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList4 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList4, foodArray3);
        com.shop.Pet pet6 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList4);
        java.util.List<com.shop.Food> foodList7 = pet6.getFavouriteFood();
        java.lang.Class<?> wildcardClass8 = foodList7.getClass();
        org.junit.Assert.assertNotNull(foodArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(foodList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]");
        pet0.setOwner("Pet [name=hi!, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass17 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getName();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.util.List<com.shop.Food> foodList14 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(foodList14);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) 1, "", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str15 = pet14.getName();
        pet14.setName("Pet [name=hi!, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        pet14.setAge((java.lang.Integer) 1);
        java.util.List<com.shop.Food> foodList20 = pet14.getFavouriteFood();
        java.lang.String str21 = pet14.getName();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(foodList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=hi!, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str21, "Pet [name=hi!, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("");
        java.lang.String str5 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=, age=1, owner=null, favouriteFood=null]" + "'", str5, "Pet [name=, age=1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.util.List<com.shop.Food> foodList8 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertNull(foodList8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str16 = pet0.toString();
        java.lang.String str17 = pet0.getOwner();
        java.lang.Class<?> wildcardClass18 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str16, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str17, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str7 = pet0.toString();
        pet0.setName("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]" + "'", str7, "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str23 = pet22.toString();
        pet22.setName("Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        java.lang.String str10 = pet0.getOwner();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        java.lang.String str29 = pet28.toString();
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        com.shop.Pet pet42 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet43 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Food[] foodArray54 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList55 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList55, foodArray54);
        com.shop.Pet pet57 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet58 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet59 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList55);
        pet44.setFavouriteFood((java.util.List<com.shop.Food>) foodList55);
        pet28.setFavouriteFood((java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet62 = new com.shop.Pet("Pet [name=null, age=1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet63 = new com.shop.Pet("hi!", (java.lang.Integer) (-1), "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet64 = new com.shop.Pet();
        pet64.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray70 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList71 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList71, foodArray70);
        com.shop.Pet pet73 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList71);
        pet64.setFavouriteFood((java.util.List<com.shop.Food>) foodList71);
        com.shop.Food[] foodArray90 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList91 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList91, foodArray90);
        com.shop.Pet pet93 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList91);
        com.shop.Pet pet94 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList91);
        com.shop.Pet pet95 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList91);
        com.shop.Pet pet96 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList91);
        com.shop.Pet pet97 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList91);
        pet64.setFavouriteFood((java.util.List<com.shop.Food>) foodList91);
        pet63.setFavouriteFood((java.util.List<com.shop.Food>) foodList91);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str29, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(foodArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(foodArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(foodArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.getName();
        com.shop.Pet pet16 = new com.shop.Pet();
        pet16.setAge((java.lang.Integer) 100);
        pet16.setOwner("");
        java.lang.String str21 = pet16.getOwner();
        java.util.List<com.shop.Food> foodList22 = pet16.getFavouriteFood();
        pet16.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList25 = pet16.getFavouriteFood();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=, age=100, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList33);
        java.lang.Class<?> wildcardClass40 = foodList33.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(foodList22);
        org.junit.Assert.assertNull(foodList25);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet13.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList16 = pet13.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", foodList16);
        pet17.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        java.lang.String str20 = pet17.getName();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=null]" + "'", str20, "Pet [name=null, age=100, owner=, favouriteFood=null]");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        com.shop.Pet pet9 = new com.shop.Pet();
        pet9.setAge((java.lang.Integer) 100);
        pet9.setOwner("");
        java.lang.String str14 = pet9.getOwner();
        java.util.List<com.shop.Food> foodList15 = pet9.getFavouriteFood();
        pet9.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList18 = pet9.getFavouriteFood();
        pet9.setOwner("hi!");
        java.lang.String str21 = pet9.toString();
        java.lang.String str22 = pet9.getName();
        com.shop.Food[] foodArray38 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList39 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList39, foodArray38);
        com.shop.Pet pet41 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet43 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet44 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet45 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList39);
        pet9.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet47 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList39);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        pet0.setName("Pet [name=null, age=10, owner=null, favouriteFood=[]]");
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(foodList15);
        org.junit.Assert.assertNull(foodList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str21, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(foodArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.toString();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str7, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str8, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getOwner();
        java.lang.String str15 = pet0.getName();
        java.lang.String str16 = pet0.getOwner();
        pet0.setName("Pet [name=hi!, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray8 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList9 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList9, foodArray8);
        com.shop.Pet pet11 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList9);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList9);
        com.shop.Pet pet13 = new com.shop.Pet();
        pet13.setAge((java.lang.Integer) 100);
        pet13.setOwner("");
        java.lang.String str18 = pet13.getOwner();
        java.util.List<com.shop.Food> foodList19 = pet13.getFavouriteFood();
        pet13.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList22 = pet13.getFavouriteFood();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        java.lang.String str36 = pet0.getOwner();
        java.lang.String str37 = pet0.toString();
        org.junit.Assert.assertNotNull(foodArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNull(foodList22);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Pet [name=null, age=10, owner=null, favouriteFood=[]]" + "'", str37, "Pet [name=null, age=10, owner=null, favouriteFood=[]]");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        java.lang.Class<?> wildcardClass3 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        com.shop.Pet pet9 = new com.shop.Pet();
        pet9.setAge((java.lang.Integer) 100);
        pet9.setOwner("");
        java.lang.String str14 = pet9.getOwner();
        java.util.List<com.shop.Food> foodList15 = pet9.getFavouriteFood();
        pet9.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList18 = pet9.getFavouriteFood();
        pet9.setOwner("hi!");
        java.lang.String str21 = pet9.toString();
        java.lang.String str22 = pet9.getName();
        com.shop.Food[] foodArray38 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList39 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList39, foodArray38);
        com.shop.Pet pet41 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet43 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet44 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet45 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList39);
        pet9.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet47 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList39);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        java.lang.String str49 = pet0.getOwner();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(foodList15);
        org.junit.Assert.assertNull(foodList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str21, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(foodArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        pet18.setName("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        pet18.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=hi!, age=100, owner=, favouriteFood=null]");
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList23);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        java.lang.String str29 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str29, "Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getOwner();
        java.lang.Class<?> wildcardClass15 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.lang.String str13 = pet6.getName();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList18);
        java.util.List<com.shop.Food> foodList21 = pet20.getFavouriteFood();
        pet6.setFavouriteFood(foodList21);
        pet0.setFavouriteFood(foodList21);
        java.util.List<com.shop.Food> foodList24 = null;
        pet0.setFavouriteFood(foodList24);
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList28 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray41 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList42 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList42, foodArray41);
        com.shop.Pet pet44 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList42);
        com.shop.Pet pet45 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList42);
        com.shop.Food[] foodArray61 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList62 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList62, foodArray61);
        com.shop.Pet pet64 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet65 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet66 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet67 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet68 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList62);
        pet45.setFavouriteFood((java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet70 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet71 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList62);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList62);
        java.lang.Class<?> wildcardClass73 = foodList62.getClass();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodList21);
        org.junit.Assert.assertNull(foodList28);
        org.junit.Assert.assertNotNull(foodArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(foodArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str3 = pet0.getName();
        com.shop.Food[] foodArray13 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList14 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList14, foodArray13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList14);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList14);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList14);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList14);
        java.lang.Class<?> wildcardClass20 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(foodArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        java.lang.String str8 = pet0.getOwner();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        pet0.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        com.shop.Pet pet42 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet43 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet44 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet45 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet46 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList40);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList40);
        java.util.List<com.shop.Food> foodList48 = pet0.getFavouriteFood();
        java.lang.String str49 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(foodList48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        java.lang.String str29 = pet28.toString();
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        com.shop.Pet pet42 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet43 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Food[] foodArray54 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList55 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList55, foodArray54);
        com.shop.Pet pet57 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet58 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet59 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList55);
        pet44.setFavouriteFood((java.util.List<com.shop.Food>) foodList55);
        pet28.setFavouriteFood((java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet62 = new com.shop.Pet("Pet [name=null, age=1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet63 = new com.shop.Pet("hi!", (java.lang.Integer) (-1), "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList55);
        java.lang.Class<?> wildcardClass64 = foodList55.getClass();
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str29, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(foodArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList7);
        pet10.setOwner("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        pet10.setOwner("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str15 = pet10.getOwner();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str15, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        pet12.setFavouriteFood((java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList26);
        java.lang.Class<?> wildcardClass34 = pet33.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.getName();
        java.util.List<com.shop.Food> foodList8 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(foodList8);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("Pet [name=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str18 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        java.lang.String str3 = pet0.toString();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList10 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str3, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(foodList10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str15 = pet14.getOwner();
        java.util.List<com.shop.Food> foodList16 = pet14.getFavouriteFood();
        pet14.setName("Pet [name=Pet [name=null, age=100, owner=null, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str15, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodList16);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.lang.String str4 = pet0.toString();
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str4, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(foodList6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.util.List<com.shop.Food> foodList3 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.String str6 = pet0.toString();
        pet0.setName("Pet [name=null, age=1, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNull(foodList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pet [name=null, age=1, owner=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=null]" + "'", str6, "Pet [name=null, age=1, owner=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        java.lang.String str3 = pet0.toString();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str3, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet34 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        java.lang.String str38 = pet0.getOwner();
        java.lang.String str39 = pet0.getName();
        java.lang.Class<?> wildcardClass40 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        pet22.setAge((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass25 = pet22.getClass();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str14 = pet13.getOwner();
        pet13.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        com.shop.Pet pet17 = new com.shop.Pet();
        pet17.setAge((java.lang.Integer) 100);
        pet17.setOwner("");
        java.lang.String str22 = pet17.getOwner();
        java.util.List<com.shop.Food> foodList23 = pet17.getFavouriteFood();
        pet17.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList26 = pet17.getFavouriteFood();
        pet17.setOwner("hi!");
        java.lang.String str29 = pet17.getOwner();
        pet17.setOwner("");
        com.shop.Food[] foodArray38 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList39 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList39, foodArray38);
        com.shop.Pet pet41 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList39);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet45 = new com.shop.Pet("Pet [name=hi!, age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Food[] foodArray55 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList56 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList56, foodArray55);
        com.shop.Pet pet58 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList56);
        com.shop.Pet pet59 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList56);
        pet59.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList62 = pet59.getFavouriteFood();
        com.shop.Pet pet63 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=0, owner=, favouriteFood=null]", foodList62);
        pet45.setFavouriteFood(foodList62);
        pet45.setName("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        java.lang.Class<?> wildcardClass67 = pet45.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(foodList23);
        org.junit.Assert.assertNull(foodList26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(foodArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(foodArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(foodList62);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.util.List<com.shop.Food> foodList3 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass4 = pet0.getClass();
        org.junit.Assert.assertNull(foodList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList16);
        java.util.List<com.shop.Food> foodList23 = pet22.getFavouriteFood();
        java.lang.Class<?> wildcardClass24 = pet22.getClass();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet34 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet38 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        java.lang.Class<?> wildcardClass39 = pet38.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        pet16.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList19 = pet16.getFavouriteFood();
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=0, owner=, favouriteFood=null]", foodList19);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=, favouriteFood=null]", foodList19);
        java.lang.String str22 = pet21.getName();
        java.util.List<com.shop.Food> foodList23 = pet21.getFavouriteFood();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=null, favouriteFood=null]" + "'", str22, "Pet [name=null, age=100, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodList23);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList13);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        java.lang.String str19 = pet14.getName();
        java.lang.String str20 = pet14.getOwner();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str19, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str20, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getName();
        pet0.setOwner("Pet [name=hi!, age=100, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.List<com.shop.Food> foodList3 = null;
        com.shop.Pet pet4 = new com.shop.Pet("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=, age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList3);
        java.util.List<com.shop.Food> foodList5 = pet4.getFavouriteFood();
        java.lang.Class<?> wildcardClass6 = pet4.getClass();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray8 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList9 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList9, foodArray8);
        com.shop.Pet pet11 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList9);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList9);
        pet0.setAge((java.lang.Integer) 0);
        java.lang.String str15 = pet0.getOwner();
        pet0.setOwner("Pet [name=null, age=100, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.util.List<com.shop.Food> foodList3 = pet0.getFavouriteFood();
        java.lang.String str4 = pet0.toString();
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNull(foodList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pet [name=null, age=1, owner=null, favouriteFood=null]" + "'", str4, "Pet [name=null, age=1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.List<com.shop.Food> foodList3 = null;
        com.shop.Pet pet4 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList3);
        pet4.setOwner("Pet [name=null, age=100, owner=, favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList7 = pet4.getFavouriteFood();
        java.lang.String str8 = pet4.toString();
        java.lang.String str9 = pet4.toString();
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]" + "'", str8, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]" + "'", str9, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getName();
        java.lang.String str11 = pet0.getName();
        java.util.List<com.shop.Food> foodList12 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList15 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertNull(foodList15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.toString();
        java.lang.String str15 = pet0.getName();
        java.util.List<com.shop.Food> foodList16 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str14, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(foodList16);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        java.lang.String str3 = pet0.toString();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str3, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str3 = pet0.getName();
        com.shop.Food[] foodArray7 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList8 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList8, foodArray7);
        com.shop.Pet pet10 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList8);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(foodArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.getName();
        java.util.List<com.shop.Food> foodList8 = pet0.getFavouriteFood();
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = foodList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(foodList8);
        org.junit.Assert.assertNull(foodList9);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList4 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray14 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList15 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList15, foodArray14);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList15);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList15);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList15);
        pet0.setOwner("Pet [name=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(foodList4);
        org.junit.Assert.assertNotNull(foodArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        java.lang.String str8 = pet0.getName();
        java.lang.String str9 = pet0.getOwner();
        java.lang.String str10 = pet0.getOwner();
        java.lang.String str11 = pet0.getName();
        java.util.List<com.shop.Food> foodList12 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(foodList12);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getName();
        java.lang.String str11 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet24 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList21);
        pet10.setName("Pet [name=null, age=100, owner=, favouriteFood=[]]");
        pet10.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]]");
        pet0.setName("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList10);
        pet14.setName("Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
        java.lang.String str17 = pet14.getName();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str17, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.toString();
        java.lang.String str8 = pet0.getOwner();
        java.lang.Integer int9 = pet0.getAge();
        java.lang.String str10 = pet0.toString();
        java.lang.String str11 = pet0.toString();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str7, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str10, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str11, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.util.List<com.shop.Food> foodList13 = pet6.getFavouriteFood();
        java.lang.String str14 = pet6.getName();
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet29 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList25);
        pet6.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet31 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList25);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet41 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet42 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        java.lang.String str43 = pet42.toString();
        pet42.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str43, "Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.lang.String str13 = pet6.getName();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList18);
        java.util.List<com.shop.Food> foodList21 = pet20.getFavouriteFood();
        pet6.setFavouriteFood(foodList21);
        pet0.setFavouriteFood(foodList21);
        java.util.List<com.shop.Food> foodList24 = null;
        pet0.setFavouriteFood(foodList24);
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.String str28 = pet0.getName();
        java.lang.Class<?> wildcardClass29 = pet0.getClass();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodList21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str22 = pet21.getOwner();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Food[] foodArray49 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList50 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList50, foodArray49);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet54 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet55 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet56 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList50);
        pet33.setFavouriteFood((java.util.List<com.shop.Food>) foodList50);
        pet21.setFavouriteFood((java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet59 = new com.shop.Pet("Pet [name=, age=0, owner=, favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=, age=0, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList50);
        java.util.List<com.shop.Food> foodList60 = pet59.getFavouriteFood();
        pet59.setName("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(foodList60);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList4 = pet0.getFavouriteFood();
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(foodList4);
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet33 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList27);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        java.lang.Class<?> wildcardClass35 = foodList27.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str23 = pet22.toString();
        pet22.setOwner("Pet [name=null, age=10, owner=null, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet24 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList21);
        java.lang.String str27 = pet10.getOwner();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str27, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray8 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList9 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList9, foodArray8);
        com.shop.Pet pet11 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList9);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList9);
        com.shop.Pet pet13 = new com.shop.Pet();
        pet13.setAge((java.lang.Integer) 100);
        pet13.setOwner("");
        java.lang.String str18 = pet13.getOwner();
        java.util.List<com.shop.Food> foodList19 = pet13.getFavouriteFood();
        pet13.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList22 = pet13.getFavouriteFood();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        java.lang.String str36 = pet0.getOwner();
        java.lang.String str37 = pet0.getOwner();
        org.junit.Assert.assertNotNull(foodArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNull(foodList22);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        java.lang.Class<?> wildcardClass15 = foodList10.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setName("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.String str5 = pet0.getName();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]" + "'", str5, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet24 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        pet26.setName("Pet [name=Pet [name=null, age=100, owner=null, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.Class<?> wildcardClass29 = pet26.getClass();
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        java.lang.String str24 = pet0.getOwner();
        pet0.setOwner("Pet [name=null, age=1, owner=null, favouriteFood=null]");
        java.lang.String str27 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str24, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pet [name=null, age=1, owner=null, favouriteFood=null]" + "'", str27, "Pet [name=null, age=1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getName();
        java.util.List<com.shop.Food> foodList12 = pet10.getFavouriteFood();
        pet10.setName("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        pet10.setName("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str11, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodList12);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        com.shop.Pet pet8 = new com.shop.Pet();
        pet8.setAge((java.lang.Integer) 100);
        pet8.setOwner("");
        java.lang.String str13 = pet8.getOwner();
        java.lang.String str14 = pet8.getName();
        java.util.List<com.shop.Food> foodList15 = pet8.getFavouriteFood();
        java.lang.String str16 = pet8.getName();
        pet8.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray19 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList20 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList20, foodArray19);
        pet8.setFavouriteFood((java.util.List<com.shop.Food>) foodList20);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList20);
        pet0.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=null, favouriteFood=null]");
        java.lang.String str26 = pet0.getOwner();
        java.lang.Class<?> wildcardClass27 = pet0.getClass();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(foodList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=null, favouriteFood=null]" + "'", str26, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        com.shop.Pet pet28 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList26);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList26);
        com.shop.Food[] foodArray43 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList44 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList44, foodArray43);
        com.shop.Pet pet46 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList44);
        com.shop.Pet pet47 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList44);
        com.shop.Pet pet48 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList44);
        com.shop.Pet pet49 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList44);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList44);
        pet18.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.String str53 = pet18.toString();
        java.lang.String str54 = pet18.getOwner();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(foodArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str53, "Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str54, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=hi!, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]], age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        pet30.setName("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList16 = pet12.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList16);
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=null, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList19);
        java.lang.Class<?> wildcardClass23 = pet22.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str17 = pet0.getName();
        pet0.setName("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList13 = pet10.getFavouriteFood();
        java.lang.Class<?> wildcardClass14 = foodList13.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.lang.String str13 = pet6.getName();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList18);
        java.util.List<com.shop.Food> foodList21 = pet20.getFavouriteFood();
        pet6.setFavouriteFood(foodList21);
        pet0.setFavouriteFood(foodList21);
        java.util.List<com.shop.Food> foodList24 = null;
        pet0.setFavouriteFood(foodList24);
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.Class<?> wildcardClass28 = pet0.getClass();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodList21);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getName();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getName();
        java.lang.String str15 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str15, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.util.List<com.shop.Food> foodList8 = pet3.getFavouriteFood();
        com.shop.Pet pet9 = new com.shop.Pet();
        pet9.setAge((java.lang.Integer) 100);
        pet9.setOwner("");
        java.lang.String str14 = pet9.getOwner();
        java.lang.String str15 = pet9.getName();
        java.lang.String str16 = pet9.getName();
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        java.util.List<com.shop.Food> foodList24 = pet23.getFavouriteFood();
        pet9.setFavouriteFood(foodList24);
        pet3.setFavouriteFood(foodList24);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList24);
        pet27.setName("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.util.List<com.shop.Food> foodList30 = pet27.getFavouriteFood();
        pet27.setAge((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(foodList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(foodList24);
        org.junit.Assert.assertNotNull(foodList30);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList16 = pet12.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList16);
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        java.lang.Class<?> wildcardClass23 = foodList19.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        java.lang.String str15 = pet0.getOwner();
        java.lang.String str16 = pet0.getName();
        com.shop.Pet pet17 = new com.shop.Pet();
        pet17.setAge((java.lang.Integer) 100);
        pet17.setOwner("");
        java.lang.String str22 = pet17.getOwner();
        java.lang.String str23 = pet17.getName();
        java.util.List<com.shop.Food> foodList24 = pet17.getFavouriteFood();
        pet17.setName("hi!");
        java.lang.String str27 = pet17.getOwner();
        com.shop.Food[] foodArray34 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList35 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList35, foodArray34);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList35);
        com.shop.Pet pet38 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList35);
        com.shop.Food[] foodArray54 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList55 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList55, foodArray54);
        com.shop.Pet pet57 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet58 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet59 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet60 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList55);
        com.shop.Pet pet61 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList55);
        pet38.setFavouriteFood((java.util.List<com.shop.Food>) foodList55);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList55);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList55);
        java.lang.String str65 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(foodList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(foodArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(foodArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=[]]" + "'", str65, "Pet [name=null, age=100, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getOwner();
        pet10.setName("Pet [name=null, age=100, owner=, favouriteFood=[]]");
        pet10.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=[]]");
        java.lang.Class<?> wildcardClass16 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getName();
        java.lang.String str15 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList16 = pet0.getFavouriteFood();
        java.util.List<com.shop.Food> foodList17 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(foodList16);
        org.junit.Assert.assertNull(foodList17);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList7);
        pet10.setOwner("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.String str13 = pet10.toString();
        pet10.setAge((java.lang.Integer) 100);
        java.lang.String str16 = pet10.getOwner();
        java.lang.String str17 = pet10.getOwner();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str13, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str16, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str17, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.getOwner();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet22 = new com.shop.Pet("", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList18);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList18);
        java.lang.String str24 = pet0.getName();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str19 = pet18.getOwner();
        pet18.setName("Pet [name=null, age=100, owner=null, favouriteFood=null]");
        java.lang.String str22 = pet18.toString();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=null, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]" + "'", str22, "Pet [name=Pet [name=null, age=100, owner=null, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        java.lang.String str11 = pet3.getName();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.util.List<com.shop.Food> foodList29 = pet28.getFavouriteFood();
        pet28.setAge((java.lang.Integer) 1);
        pet28.setName("Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(foodList29);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet0.getName();
        pet0.setName("Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet11 = new com.shop.Pet();
        pet11.setAge((java.lang.Integer) 100);
        pet11.setOwner("");
        java.util.List<com.shop.Food> foodList16 = pet11.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet();
        pet17.setAge((java.lang.Integer) 100);
        pet17.setOwner("");
        java.lang.String str22 = pet17.getOwner();
        java.lang.String str23 = pet17.getName();
        java.lang.String str24 = pet17.getName();
        com.shop.Food[] foodArray28 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList29 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList29, foodArray28);
        com.shop.Pet pet31 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList29);
        java.util.List<com.shop.Food> foodList32 = pet31.getFavouriteFood();
        pet17.setFavouriteFood(foodList32);
        pet11.setFavouriteFood(foodList32);
        pet10.setFavouriteFood(foodList32);
        java.lang.Class<?> wildcardClass36 = foodList32.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(foodList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(foodArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(foodList32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        pet18.setOwner("Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        com.shop.Food[] foodArray19 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList20 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList20, foodArray19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList20);
        com.shop.Pet pet23 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList20);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList20);
        pet3.setName("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        com.shop.Food[] foodArray36 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList37 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList37, foodArray36);
        com.shop.Pet pet39 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList37);
        com.shop.Pet pet40 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList37);
        com.shop.Food[] foodArray56 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList57 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList57, foodArray56);
        com.shop.Pet pet59 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList57);
        com.shop.Pet pet60 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList57);
        com.shop.Pet pet61 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList57);
        com.shop.Pet pet62 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList57);
        com.shop.Pet pet63 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList57);
        pet40.setFavouriteFood((java.util.List<com.shop.Food>) foodList57);
        com.shop.Pet pet65 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList57);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList57);
        com.shop.Pet pet67 = new com.shop.Pet("Pet [name=hi!, age=10, owner=null, favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=1, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList57);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertNotNull(foodArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(foodArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) 1, "", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str15 = pet14.getName();
        java.lang.Class<?> wildcardClass16 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList13);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        pet14.setAge((java.lang.Integer) 1);
        java.lang.String str21 = pet14.toString();
        java.lang.String str22 = pet14.getName();
        pet14.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]" + "'", str21, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        pet0.setName("Pet [name=null, age=-1, owner=, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.shop.Food[] foodArray3 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList4 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList4, foodArray3);
        com.shop.Pet pet6 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList4);
        java.util.List<com.shop.Food> foodList7 = pet6.getFavouriteFood();
        pet6.setAge((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass10 = pet6.getClass();
        org.junit.Assert.assertNotNull(foodArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(foodList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str12 = pet0.getOwner();
        com.shop.Pet pet13 = new com.shop.Pet();
        pet13.setAge((java.lang.Integer) 100);
        pet13.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList22);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet();
        pet26.setAge((java.lang.Integer) 100);
        pet26.setOwner("");
        java.lang.String str31 = pet26.getOwner();
        java.util.List<com.shop.Food> foodList32 = pet26.getFavouriteFood();
        pet26.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList35 = pet26.getFavouriteFood();
        com.shop.Food[] foodArray42 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList43 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList43, foodArray42);
        com.shop.Pet pet45 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList43);
        com.shop.Pet pet46 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList43);
        pet26.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        com.shop.Pet pet50 = new com.shop.Pet();
        pet50.setAge((java.lang.Integer) 100);
        pet50.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray58 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList59 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList59, foodArray58);
        com.shop.Pet pet61 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList59);
        pet50.setFavouriteFood((java.util.List<com.shop.Food>) foodList59);
        pet50.setAge((java.lang.Integer) 0);
        com.shop.Pet pet65 = new com.shop.Pet();
        pet65.setAge((java.lang.Integer) 100);
        pet65.setOwner("");
        java.lang.String str70 = pet65.getOwner();
        java.lang.String str71 = pet65.getName();
        java.lang.String str72 = pet65.getName();
        com.shop.Food[] foodArray76 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList77 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList77, foodArray76);
        com.shop.Pet pet79 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList77);
        java.util.List<com.shop.Food> foodList80 = pet79.getFavouriteFood();
        pet65.setFavouriteFood(foodList80);
        pet50.setFavouriteFood(foodList80);
        pet0.setFavouriteFood(foodList80);
        java.lang.String str84 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(foodList32);
        org.junit.Assert.assertNull(foodList35);
        org.junit.Assert.assertNotNull(foodArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(foodArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(foodArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(foodList80);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str19 = pet18.getOwner();
        java.lang.Class<?> wildcardClass20 = pet18.getClass();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        pet22.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList25 = pet22.getFavouriteFood();
        java.lang.String str26 = pet22.getOwner();
        pet22.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList29 = pet22.getFavouriteFood();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str26, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodList29);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.lang.String str5 = pet0.toString();
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        java.util.List<com.shop.Food> foodList19 = pet18.getFavouriteFood();
        pet18.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList22 = pet18.getFavouriteFood();
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList22);
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        pet23.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        java.util.List<com.shop.Food> foodList30 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass31 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=, age=100, owner=null, favouriteFood=null]" + "'", str5, "Pet [name=, age=100, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodList19);
        org.junit.Assert.assertNotNull(foodList22);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(foodList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.lang.String str5 = pet0.toString();
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        java.util.List<com.shop.Food> foodList19 = pet18.getFavouriteFood();
        pet18.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList22 = pet18.getFavouriteFood();
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList22);
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        pet23.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        java.util.List<com.shop.Food> foodList30 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=, age=100, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=, age=100, owner=null, favouriteFood=null]" + "'", str5, "Pet [name=, age=100, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodList19);
        org.junit.Assert.assertNotNull(foodList22);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(foodList30);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        java.lang.String str16 = pet14.toString();
        java.lang.String str17 = pet14.getOwner();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=hi!, age=10, owner=, favouriteFood=[]]" + "'", str16, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList16);
        java.util.List<com.shop.Food> foodList23 = pet22.getFavouriteFood();
        java.lang.Class<?> wildcardClass24 = foodList23.getClass();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.util.List<com.shop.Food> foodList3 = null;
        com.shop.Pet pet4 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=, age=100, owner=null, favouriteFood=null]", foodList3);
        java.lang.String str5 = pet4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]" + "'", str5, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.getName();
        com.shop.Pet pet16 = new com.shop.Pet();
        pet16.setAge((java.lang.Integer) 100);
        pet16.setOwner("");
        java.lang.String str21 = pet16.getOwner();
        java.util.List<com.shop.Food> foodList22 = pet16.getFavouriteFood();
        pet16.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList25 = pet16.getFavouriteFood();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList33);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(foodList22);
        org.junit.Assert.assertNull(foodList25);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        pet10.setName("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str3 = pet0.getName();
        pet0.setName("Pet [name=null, age=100, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList16 = pet12.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList16);
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=null, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList19);
        pet22.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray31 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList32 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList32, foodArray31);
        com.shop.Pet pet34 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList32);
        com.shop.Pet pet35 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList32);
        com.shop.Food[] foodArray45 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList46 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList46, foodArray45);
        com.shop.Pet pet48 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList46);
        com.shop.Pet pet49 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList46);
        com.shop.Pet pet50 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList46);
        pet35.setFavouriteFood((java.util.List<com.shop.Food>) foodList46);
        pet22.setFavouriteFood((java.util.List<com.shop.Food>) foodList46);
        java.lang.String str53 = pet22.toString();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(foodArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(foodArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Pet [name=hi!, age=100, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=[]]" + "'", str53, "Pet [name=hi!, age=100, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getName();
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        java.lang.String str20 = pet10.getOwner();
        pet10.setName("Pet [name=null, age=1, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str11, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str20, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        pet3.setName("hi!");
        java.lang.String str13 = pet3.getOwner();
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Food[] foodArray40 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList41 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList41, foodArray40);
        com.shop.Pet pet43 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet45 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet46 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet47 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList41);
        pet24.setFavouriteFood((java.util.List<com.shop.Food>) foodList41);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet50 = new com.shop.Pet("Pet [name=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList41);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(foodArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.shop.Food[] foodArray3 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList4 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList4, foodArray3);
        com.shop.Pet pet6 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList4);
        java.util.List<com.shop.Food> foodList7 = pet6.getFavouriteFood();
        pet6.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray19 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList20 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList20, foodArray19);
        com.shop.Pet pet22 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList20);
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList20);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList20);
        pet6.setFavouriteFood((java.util.List<com.shop.Food>) foodList20);
        java.lang.Class<?> wildcardClass26 = pet6.getClass();
        org.junit.Assert.assertNotNull(foodArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(foodList7);
        org.junit.Assert.assertNotNull(foodArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        java.util.List<com.shop.Food> foodList14 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]");
        pet0.setAge((java.lang.Integer) 10);
        java.util.List<com.shop.Food> foodList19 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(foodList14);
        org.junit.Assert.assertNull(foodList19);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet24 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList21);
        pet10.setOwner("Pet [name=null, age=100, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        pet0.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList24 = pet0.getFavouriteFood();
        java.lang.String str25 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pet [name=null, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str25, "Pet [name=null, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str14 = pet13.getOwner();
        pet13.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        com.shop.Pet pet17 = new com.shop.Pet();
        pet17.setAge((java.lang.Integer) 100);
        pet17.setOwner("");
        java.lang.String str22 = pet17.getOwner();
        java.util.List<com.shop.Food> foodList23 = pet17.getFavouriteFood();
        pet17.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList26 = pet17.getFavouriteFood();
        pet17.setOwner("hi!");
        java.lang.String str29 = pet17.getOwner();
        pet17.setOwner("");
        com.shop.Food[] foodArray38 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList39 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList39, foodArray38);
        com.shop.Pet pet41 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList39);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet45 = new com.shop.Pet("Pet [name=hi!, age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Food[] foodArray55 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList56 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList56, foodArray55);
        com.shop.Pet pet58 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList56);
        com.shop.Pet pet59 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList56);
        pet59.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList62 = pet59.getFavouriteFood();
        com.shop.Pet pet63 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=0, owner=, favouriteFood=null]", foodList62);
        pet45.setFavouriteFood(foodList62);
        pet45.setName("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        pet45.setOwner("Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(foodList23);
        org.junit.Assert.assertNull(foodList26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(foodArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(foodArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(foodList62);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]");
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str20 = pet19.getOwner();
        pet19.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        com.shop.Pet pet23 = new com.shop.Pet();
        pet23.setAge((java.lang.Integer) 100);
        pet23.setOwner("");
        java.lang.String str28 = pet23.getOwner();
        java.util.List<com.shop.Food> foodList29 = pet23.getFavouriteFood();
        pet23.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList32 = pet23.getFavouriteFood();
        pet23.setOwner("hi!");
        java.lang.String str35 = pet23.getOwner();
        pet23.setOwner("");
        com.shop.Food[] foodArray44 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList45 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList45, foodArray44);
        com.shop.Pet pet47 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList45);
        com.shop.Pet pet48 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList45);
        pet23.setFavouriteFood((java.util.List<com.shop.Food>) foodList45);
        pet19.setFavouriteFood((java.util.List<com.shop.Food>) foodList45);
        com.shop.Pet pet51 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList45);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList45);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList45);
        java.util.List<com.shop.Food> foodList54 = pet53.getFavouriteFood();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(foodList29);
        org.junit.Assert.assertNull(foodList32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(foodArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(foodList54);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.getOwner();
        pet3.setOwner("");
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        com.shop.Pet pet27 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList25);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 100, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList25);
        java.lang.Class<?> wildcardClass31 = foodList25.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str14 = pet13.getOwner();
        pet13.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        com.shop.Pet pet17 = new com.shop.Pet();
        pet17.setAge((java.lang.Integer) 100);
        pet17.setOwner("");
        java.lang.String str22 = pet17.getOwner();
        java.util.List<com.shop.Food> foodList23 = pet17.getFavouriteFood();
        pet17.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList26 = pet17.getFavouriteFood();
        pet17.setOwner("hi!");
        java.lang.String str29 = pet17.getOwner();
        pet17.setOwner("");
        com.shop.Food[] foodArray38 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList39 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList39, foodArray38);
        com.shop.Pet pet41 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList39);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet45 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList39);
        pet45.setOwner("Pet [name=null, age=100, owner=null, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(foodList23);
        org.junit.Assert.assertNull(foodList26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(foodArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        java.lang.String str26 = pet25.toString();
        com.shop.Food[] foodArray36 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList37 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList37, foodArray36);
        com.shop.Pet pet39 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList37);
        com.shop.Pet pet40 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList37);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList37);
        com.shop.Food[] foodArray51 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList52 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList52, foodArray51);
        com.shop.Pet pet54 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList52);
        com.shop.Pet pet55 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList52);
        com.shop.Pet pet56 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList52);
        pet41.setFavouriteFood((java.util.List<com.shop.Food>) foodList52);
        pet25.setFavouriteFood((java.util.List<com.shop.Food>) foodList52);
        com.shop.Pet pet59 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=null, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList52);
        java.lang.String str60 = pet59.getOwner();
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str26, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(foodArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Pet [name=hi!, age=10, owner=, favouriteFood=[]]" + "'", str60, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setName("hi!");
        pet0.setAge((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass30 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getName();
        pet0.setAge((java.lang.Integer) 10);
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList7);
        pet0.setName("Pet [name=, age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str13 = pet0.getOwner();
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        com.shop.Pet pet13 = new com.shop.Pet();
        pet13.setAge((java.lang.Integer) 100);
        pet13.setOwner("");
        java.lang.String str18 = pet13.getOwner();
        java.util.List<com.shop.Food> foodList19 = pet13.getFavouriteFood();
        pet13.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str22 = pet13.getName();
        java.lang.String str23 = pet13.getName();
        com.shop.Food[] foodArray30 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList31 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList31, foodArray30);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Pet pet34 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Food[] foodArray50 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList51 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList51, foodArray50);
        com.shop.Pet pet53 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList51);
        com.shop.Pet pet54 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList51);
        com.shop.Pet pet55 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList51);
        com.shop.Pet pet56 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList51);
        com.shop.Pet pet57 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList51);
        pet34.setFavouriteFood((java.util.List<com.shop.Food>) foodList51);
        java.util.List<com.shop.Food> foodList59 = pet34.getFavouriteFood();
        pet13.setFavouriteFood(foodList59);
        pet0.setFavouriteFood(foodList59);
        java.lang.Class<?> wildcardClass62 = foodList59.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(foodArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(foodArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(foodList59);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 100);
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList12 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = foodList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList19 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        java.lang.String str32 = pet0.getName();
        java.lang.String str33 = pet0.getName();
        pet0.setAge((java.lang.Integer) 0);
        java.lang.String str36 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str32, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str33, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=, favouriteFood=[]]" + "'", str36, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet27 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Food[] foodArray34 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList35 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList35, foodArray34);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList35);
        com.shop.Pet pet38 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList35);
        pet27.setFavouriteFood((java.util.List<com.shop.Food>) foodList35);
        com.shop.Food[] foodArray52 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList53 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList53, foodArray52);
        com.shop.Pet pet55 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet56 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet57 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet58 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList53);
        pet27.setFavouriteFood((java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet60 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet61 = new com.shop.Pet("Pet [name=hi!, age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet62 = new com.shop.Pet("Pet [name=, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList53);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(foodArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(foodArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=hi!, age=100, owner=, favouriteFood=null]");
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList23);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        pet0.setName("Pet [name=, age=1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str12 = pet0.getOwner();
        com.shop.Pet pet13 = new com.shop.Pet();
        pet13.setAge((java.lang.Integer) 100);
        pet13.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList22);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet();
        pet26.setAge((java.lang.Integer) 100);
        pet26.setOwner("");
        java.lang.String str31 = pet26.getOwner();
        java.util.List<com.shop.Food> foodList32 = pet26.getFavouriteFood();
        pet26.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList35 = pet26.getFavouriteFood();
        com.shop.Food[] foodArray42 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList43 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList43, foodArray42);
        com.shop.Pet pet45 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList43);
        com.shop.Pet pet46 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList43);
        pet26.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        com.shop.Pet pet50 = new com.shop.Pet();
        pet50.setAge((java.lang.Integer) 100);
        pet50.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray58 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList59 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList59, foodArray58);
        com.shop.Pet pet61 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList59);
        pet50.setFavouriteFood((java.util.List<com.shop.Food>) foodList59);
        pet50.setAge((java.lang.Integer) 0);
        com.shop.Pet pet65 = new com.shop.Pet();
        pet65.setAge((java.lang.Integer) 100);
        pet65.setOwner("");
        java.lang.String str70 = pet65.getOwner();
        java.lang.String str71 = pet65.getName();
        java.lang.String str72 = pet65.getName();
        com.shop.Food[] foodArray76 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList77 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList77, foodArray76);
        com.shop.Pet pet79 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList77);
        java.util.List<com.shop.Food> foodList80 = pet79.getFavouriteFood();
        pet65.setFavouriteFood(foodList80);
        pet50.setFavouriteFood(foodList80);
        pet0.setFavouriteFood(foodList80);
        pet0.setOwner("Pet [name=, age=0, owner=, favouriteFood=[]]");
        java.lang.String str86 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(foodList32);
        org.junit.Assert.assertNull(foodList35);
        org.junit.Assert.assertNotNull(foodArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(foodArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(foodArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(foodList80);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=[]]" + "'", str86, "Pet [name=null, age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(foodList11);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        pet28.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList31 = pet28.getFavouriteFood();
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", foodList31);
        pet14.setFavouriteFood(foodList31);
        pet14.setName("Pet [name=hi!, age=10, owner=null, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(foodList31);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.getName();
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList12);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        pet0.setFavouriteFood(foodList15);
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.String str19 = pet0.getName();
        java.lang.String str20 = pet0.getOwner();
        pet0.setName("Pet [name=hi!, age=10, owner=null, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(foodList15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str19, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        java.util.List<com.shop.Food> foodList10 = pet0.getFavouriteFood();
        java.lang.String str11 = pet0.toString();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]" + "'", str11, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        java.lang.String str8 = pet0.getName();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        com.shop.Pet pet11 = new com.shop.Pet();
        pet11.setAge((java.lang.Integer) 100);
        pet11.setOwner("");
        java.lang.String str16 = pet11.getOwner();
        java.util.List<com.shop.Food> foodList17 = pet11.getFavouriteFood();
        pet11.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str20 = pet11.getName();
        java.lang.String str21 = pet11.getName();
        com.shop.Food[] foodArray28 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList29 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList29, foodArray28);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList29);
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList29);
        com.shop.Food[] foodArray48 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList49 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList49, foodArray48);
        com.shop.Pet pet51 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet52 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet53 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet54 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet pet55 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList49);
        pet32.setFavouriteFood((java.util.List<com.shop.Food>) foodList49);
        java.util.List<com.shop.Food> foodList57 = pet32.getFavouriteFood();
        pet11.setFavouriteFood(foodList57);
        pet0.setFavouriteFood(foodList57);
        java.util.List<com.shop.Food> foodList60 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(foodList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(foodArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(foodArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(foodList57);
        org.junit.Assert.assertNotNull(foodList60);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet34 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        java.lang.String str38 = pet0.getOwner();
        pet0.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.lang.String str13 = pet6.getName();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList18);
        java.util.List<com.shop.Food> foodList21 = pet20.getFavouriteFood();
        pet6.setFavouriteFood(foodList21);
        pet0.setFavouriteFood(foodList21);
        java.util.List<com.shop.Food> foodList24 = null;
        pet0.setFavouriteFood(foodList24);
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.String str28 = pet0.getName();
        java.lang.String str29 = pet0.getOwner();
        pet0.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodList21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]" + "'", str29, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=, age=0, owner=, favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet14.setName("Pet [name=null, age=0, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=hi!, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList19);
        java.util.List<com.shop.Food> foodList27 = pet26.getFavouriteFood();
        pet26.setAge((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(foodList27);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str23 = pet22.toString();
        java.lang.String str24 = pet22.toString();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]" + "'", str24, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet0.getName();
        pet0.setName("Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Food[] foodArray49 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList50 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList50, foodArray49);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet54 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet55 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet56 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList50);
        pet33.setFavouriteFood((java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet58 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet59 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet60 = new com.shop.Pet("", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList50);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList50);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        java.lang.String str11 = pet3.getName();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.util.List<com.shop.Food> foodList29 = pet28.getFavouriteFood();
        pet28.setName("");
        java.lang.Class<?> wildcardClass32 = pet28.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(foodList29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList10);
        pet14.setAge((java.lang.Integer) 1);
        java.lang.String str17 = pet14.toString();
        java.lang.String str18 = pet14.toString();
        java.lang.String str19 = pet14.getName();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]" + "'", str17, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]" + "'", str18, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str19, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = foodList7.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.util.List<com.shop.Food> foodList13 = pet6.getFavouriteFood();
        pet6.setName("hi!");
        java.lang.String str16 = pet6.getOwner();
        java.util.List<com.shop.Food> foodList17 = pet6.getFavouriteFood();
        java.lang.String str18 = pet6.getName();
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        java.util.List<com.shop.Food> foodList26 = pet25.getFavouriteFood();
        pet25.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList29 = pet25.getFavouriteFood();
        pet6.setFavouriteFood(foodList29);
        com.shop.Pet pet31 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]", foodList29);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=null, age=null, owner=null, favouriteFood=null]", foodList29);
        java.lang.Class<?> wildcardClass33 = pet32.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(foodList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(foodList26);
        org.junit.Assert.assertNotNull(foodList29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.util.List<com.shop.Food> foodList14 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = foodList14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(foodList14);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        pet0.setOwner("");
        java.lang.String str13 = pet0.toString();
        pet0.setOwner("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=hi!, age=100, owner=, favouriteFood=null]" + "'", str13, "Pet [name=hi!, age=100, owner=, favouriteFood=null]");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        java.lang.String str16 = pet14.toString();
        pet14.setOwner("Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=hi!, age=10, owner=, favouriteFood=[]]" + "'", str16, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.util.List<com.shop.Food> foodList13 = pet6.getFavouriteFood();
        pet6.setName("hi!");
        java.lang.String str16 = pet6.getOwner();
        java.util.List<com.shop.Food> foodList17 = pet6.getFavouriteFood();
        java.lang.String str18 = pet6.getName();
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        java.util.List<com.shop.Food> foodList26 = pet25.getFavouriteFood();
        pet25.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList29 = pet25.getFavouriteFood();
        pet6.setFavouriteFood(foodList29);
        com.shop.Pet pet31 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]", foodList29);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList29);
        java.lang.Class<?> wildcardClass33 = pet32.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(foodList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(foodList26);
        org.junit.Assert.assertNotNull(foodList29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet10.setAge((java.lang.Integer) 0);
        pet10.setAge((java.lang.Integer) 0);
        java.lang.String str17 = pet10.toString();
        java.util.List<com.shop.Food> foodList18 = pet10.getFavouriteFood();
        pet10.setName("");
        java.lang.String str21 = pet10.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str17, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str21, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList13);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        pet14.setAge((java.lang.Integer) 1);
        java.lang.String str21 = pet14.toString();
        pet14.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]" + "'", str21, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.String str8 = pet0.getName();
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        pet0.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        com.shop.Pet pet42 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet43 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet44 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet45 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Pet pet46 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList40);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList40);
        pet0.setName("Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]");
        java.lang.Class<?> wildcardClass50 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        pet18.setAge((java.lang.Integer) 100);
        java.lang.String str21 = pet18.toString();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=, age=100, owner=hi!, favouriteFood=[]]" + "'", str21, "Pet [name=, age=100, owner=hi!, favouriteFood=[]]");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str11 = pet0.getOwner();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str14 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str11, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]" + "'", str14, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.util.List<com.shop.Food> foodList12 = pet6.getFavouriteFood();
        pet6.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList15 = pet6.getFavouriteFood();
        pet6.setOwner("hi!");
        java.lang.String str18 = pet6.toString();
        java.lang.String str19 = pet6.getName();
        com.shop.Food[] foodArray35 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList36 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList36, foodArray35);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList36);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList36);
        com.shop.Pet pet40 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList36);
        com.shop.Pet pet41 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList36);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList36);
        pet6.setFavouriteFood((java.util.List<com.shop.Food>) foodList36);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList36);
        com.shop.Pet pet45 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList36);
        pet45.setName("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=-1, owner=null, favouriteFood=null]");
        pet45.setName("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertNull(foodList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str18, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(foodArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList7);
        pet10.setOwner("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.String str13 = pet10.toString();
        pet10.setAge((java.lang.Integer) 100);
        java.lang.String str16 = pet10.getOwner();
        java.lang.String str17 = pet10.getName();
        java.util.List<com.shop.Food> foodList18 = pet10.getFavouriteFood();
        java.lang.Class<?> wildcardClass19 = foodList18.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str13, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str16, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(foodList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet14.setOwner("Pet [name=null, age=0, owner=, favouriteFood=null]");
        pet14.setOwner("Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null]");
        java.lang.String str19 = pet14.toString();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str19, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str19 = pet18.getOwner();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Food[] foodArray46 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList47 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList47, foodArray46);
        com.shop.Pet pet49 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet50 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet51 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        pet30.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        pet18.setOwner("Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
        java.lang.String str58 = pet18.getOwner();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str58, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        java.util.List<com.shop.Food> foodList14 = pet0.getFavouriteFood();
        java.lang.String str15 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList16 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]], age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(foodList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(foodList16);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        java.lang.String str8 = pet0.getName();
        java.lang.String str9 = pet0.getOwner();
        pet0.setAge((java.lang.Integer) 0);
        java.lang.String str12 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=0, owner=, favouriteFood=null]" + "'", str12, "Pet [name=null, age=0, owner=, favouriteFood=null]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getName();
        java.lang.String str15 = pet0.getOwner();
        com.shop.Food[] foodArray37 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList38 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList38, foodArray37);
        com.shop.Pet pet40 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet41 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet43 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet45 = new com.shop.Pet("Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=hi!, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet46 = new com.shop.Pet("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]], age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList38);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList38);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(foodArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        java.lang.String str10 = pet0.getName();
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getOwner();
        pet10.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        com.shop.Pet pet14 = new com.shop.Pet();
        pet14.setAge((java.lang.Integer) 100);
        pet14.setOwner("");
        java.lang.String str19 = pet14.getOwner();
        java.util.List<com.shop.Food> foodList20 = pet14.getFavouriteFood();
        pet14.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList23 = pet14.getFavouriteFood();
        pet14.setOwner("hi!");
        java.lang.String str26 = pet14.getOwner();
        pet14.setOwner("");
        com.shop.Food[] foodArray35 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList36 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList36, foodArray35);
        com.shop.Pet pet38 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList36);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList36);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList36);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList36);
        java.lang.Class<?> wildcardClass42 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(foodList20);
        org.junit.Assert.assertNull(foodList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(foodArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList19 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        java.lang.String str32 = pet0.getName();
        java.lang.String str33 = pet0.getOwner();
        java.lang.String str34 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str32, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str3 = pet0.getName();
        java.lang.Class<?> wildcardClass4 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.getOwner();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet22 = new com.shop.Pet("", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList18);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList18);
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        com.shop.Pet pet36 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList34);
        java.util.List<com.shop.Food> foodList37 = pet36.getFavouriteFood();
        pet36.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray49 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList50 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList50, foodArray49);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet54 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList50);
        pet36.setFavouriteFood((java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet56 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet pet57 = new com.shop.Pet("", (java.lang.Integer) 100, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList50);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList50);
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodList37);
        org.junit.Assert.assertNotNull(foodArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setAge((java.lang.Integer) 10);
        pet0.setAge((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet33 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList27);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.lang.String str4 = pet0.toString();
        java.lang.String str5 = pet0.getOwner();
        pet0.setName("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str8 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = foodList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str4, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(foodList9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        java.lang.String str14 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=null]" + "'", str14, "Pet [name=null, age=100, owner=, favouriteFood=null]");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.lang.String str4 = pet0.getName();
        java.lang.String str5 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        java.lang.String str8 = pet0.getName();
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(foodList9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        java.util.List<com.shop.Food> foodList16 = pet15.getFavouriteFood();
        pet15.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList19 = pet15.getFavouriteFood();
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList19);
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        pet20.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=hi!, age=100, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=[]]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=null, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.lang.Class<?> wildcardClass27 = foodList22.getClass();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodList19);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.toString();
        java.lang.String str12 = pet10.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet10.getFavouriteFood();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=, age=0, owner=, favouriteFood=[]]" + "'", str11, "Pet [name=, age=0, owner=, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(foodList13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getName();
        pet0.setName("Pet [name=null, age=-1, owner=, favouriteFood=null]");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        pet0.setAge((java.lang.Integer) 0);
        pet0.setOwner("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        com.shop.Food[] foodArray38 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList39 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList39, foodArray38);
        com.shop.Pet pet41 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet43 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet44 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList39);
        java.lang.String str45 = pet44.getOwner();
        com.shop.Food[] foodArray52 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList53 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList53, foodArray52);
        com.shop.Pet pet55 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet56 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Food[] foodArray72 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList73 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList73, foodArray72);
        com.shop.Pet pet75 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList73);
        com.shop.Pet pet76 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList73);
        com.shop.Pet pet77 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList73);
        com.shop.Pet pet78 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList73);
        com.shop.Pet pet79 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList73);
        pet56.setFavouriteFood((java.util.List<com.shop.Food>) foodList73);
        pet44.setFavouriteFood((java.util.List<com.shop.Food>) foodList73);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList73);
        java.lang.String str83 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(foodArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(foodArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Pet [name=null, age=null, owner=null, favouriteFood=null]" + "'", str83, "Pet [name=null, age=null, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.toString();
        java.lang.String str8 = pet0.getOwner();
        pet0.setOwner("Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str7, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        java.lang.Class<?> wildcardClass19 = foodList13.getClass();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList13);
        pet18.setName("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.Class<?> wildcardClass21 = pet18.getClass();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.toString();
        java.lang.String str15 = pet0.getName();
        pet0.setName("Pet [name=hi!, age=10, owner=null, favouriteFood=[]]");
        pet0.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str14, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList7);
        pet10.setOwner("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.String str13 = pet10.toString();
        pet10.setAge((java.lang.Integer) 100);
        java.lang.String str16 = pet10.getOwner();
        java.lang.String str17 = pet10.getName();
        java.util.List<com.shop.Food> foodList18 = pet10.getFavouriteFood();
        java.lang.String str19 = pet10.toString();
        java.lang.Class<?> wildcardClass20 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str13, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str16, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(foodList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str19, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.toString();
        java.lang.String str12 = pet10.getOwner();
        java.lang.Class<?> wildcardClass13 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=, age=0, owner=, favouriteFood=[]]" + "'", str11, "Pet [name=, age=0, owner=, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.List<com.shop.Food> foodList3 = null;
        com.shop.Pet pet4 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList3);
        pet4.setOwner("Pet [name=null, age=100, owner=, favouriteFood=[]]");
        pet4.setAge((java.lang.Integer) 1);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        pet12.setFavouriteFood((java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList26);
        pet33.setOwner("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        com.shop.Pet pet39 = new com.shop.Pet();
        pet39.setAge((java.lang.Integer) 100);
        pet39.setOwner("");
        java.lang.String str44 = pet39.getOwner();
        java.util.List<com.shop.Food> foodList45 = pet39.getFavouriteFood();
        pet39.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList48 = pet39.getFavouriteFood();
        pet39.setOwner("hi!");
        java.lang.String str51 = pet39.getOwner();
        pet39.setOwner("");
        pet39.setAge((java.lang.Integer) 1);
        java.lang.String str56 = pet39.getName();
        com.shop.Food[] foodArray66 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList67 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList67, foodArray66);
        com.shop.Pet pet69 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList67);
        com.shop.Pet pet70 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList67);
        com.shop.Pet pet71 = new com.shop.Pet();
        pet71.setAge((java.lang.Integer) 100);
        pet71.setOwner("");
        java.util.List<com.shop.Food> foodList76 = pet71.getFavouriteFood();
        com.shop.Pet pet77 = new com.shop.Pet();
        pet77.setAge((java.lang.Integer) 100);
        pet77.setOwner("");
        java.lang.String str82 = pet77.getOwner();
        java.lang.String str83 = pet77.getName();
        java.lang.String str84 = pet77.getName();
        com.shop.Food[] foodArray88 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList89 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList89, foodArray88);
        com.shop.Pet pet91 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList89);
        java.util.List<com.shop.Food> foodList92 = pet91.getFavouriteFood();
        pet77.setFavouriteFood(foodList92);
        pet71.setFavouriteFood(foodList92);
        pet70.setFavouriteFood(foodList92);
        com.shop.Pet pet96 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=100, owner=, favouriteFood=null]", foodList92);
        pet39.setFavouriteFood(foodList92);
        com.shop.Pet pet98 = new com.shop.Pet("Pet [name=null, age=10, owner=null, favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=, favouriteFood=null]", foodList92);
        pet33.setFavouriteFood(foodList92);
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(foodList45);
        org.junit.Assert.assertNull(foodList48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(foodArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(foodList76);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNotNull(foodArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(foodList92);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList7);
        pet10.setOwner("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.String str13 = pet10.toString();
        pet10.setAge((java.lang.Integer) 100);
        java.lang.String str16 = pet10.getOwner();
        java.lang.Class<?> wildcardClass17 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str13, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str16, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        pet0.setOwner("");
        java.lang.Class<?> wildcardClass26 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str19 = pet18.getOwner();
        java.lang.String str20 = pet18.getName();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=null, age=0, owner=, favouriteFood=null]" + "'", str20, "Pet [name=null, age=0, owner=, favouriteFood=null]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        java.util.List<com.shop.Food> foodList41 = pet16.getFavouriteFood();
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=1, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=null]", foodList41);
        com.shop.Pet pet43 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 100, "Pet [name=, age=0, owner=, favouriteFood=[]]", foodList41);
        java.lang.String str44 = pet43.toString();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(foodList41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=[]]" + "'", str44, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        java.lang.String str24 = pet0.getOwner();
        java.lang.String str25 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str24, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str25, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.util.List<com.shop.Food> foodList3 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(foodList3);
        org.junit.Assert.assertNull(foodList6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet24 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList21);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList21);
        pet10.setOwner("");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList19 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        java.lang.Class<?> wildcardClass32 = foodList27.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList3 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(foodList3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        pet0.setOwner("");
        java.lang.String str26 = pet0.toString();
        pet0.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList29 = pet0.getFavouriteFood();
        java.lang.String str30 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=[]]" + "'", str26, "Pet [name=null, age=100, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=null, favouriteFood=null]" + "'", str30, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = foodList5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(foodList5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setAge((java.lang.Integer) 100);
        java.lang.String str13 = pet10.getOwner();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str13, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        java.lang.Class<?> wildcardClass27 = foodList19.getClass();
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.toString();
        pet10.setAge((java.lang.Integer) 10);
        java.lang.String str14 = pet10.getOwner();
        pet10.setName("");
        java.lang.String str17 = pet10.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=, age=0, owner=, favouriteFood=[]]" + "'", str11, "Pet [name=, age=0, owner=, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=, age=10, owner=, favouriteFood=[]]" + "'", str17, "Pet [name=, age=10, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.toString();
        java.lang.String str7 = pet0.getName();
        java.util.List<com.shop.Food> foodList8 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str6, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(foodList8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        java.lang.String str16 = pet14.toString();
        java.lang.Class<?> wildcardClass17 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=hi!, age=10, owner=, favouriteFood=[]]" + "'", str16, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList7);
        pet0.setName("Pet [name=, age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList16 = pet12.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList16);
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=null, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList19);
        java.lang.String str23 = pet22.getOwner();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=hi!, age=10, owner=null, favouriteFood=[]]" + "'", str23, "Pet [name=hi!, age=10, owner=null, favouriteFood=[]]");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getName();
        pet10.setOwner("Pet [name=null, age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str11, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        java.lang.String str8 = pet0.getName();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList19);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList19);
        java.lang.String str25 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=[]]" + "'", str25, "Pet [name=null, age=100, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        java.util.List<com.shop.Food> foodList10 = pet0.getFavouriteFood();
        java.lang.String str11 = pet0.getOwner();
        java.lang.String str12 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str11, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getName();
        java.lang.String str15 = pet0.getName();
        com.shop.Pet pet16 = new com.shop.Pet();
        pet16.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList23);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        pet0.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str30 = pet0.toString();
        java.util.List<com.shop.Food> foodList31 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=100, owner=hi!, favouriteFood=[]]" + "'", str30, "Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=100, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodList31);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList16 = pet12.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList16);
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        pet22.setAge((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass25 = pet22.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str16 = pet0.toString();
        java.lang.String str17 = pet0.getOwner();
        java.lang.String str18 = pet0.getName();
        pet0.setAge((java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str16, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str17, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pet [name=null, age=100, owner=, favouriteFood=null]" + "'", str18, "Pet [name=null, age=100, owner=, favouriteFood=null]");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getName();
        java.lang.String str15 = pet0.getName();
        com.shop.Pet pet16 = new com.shop.Pet();
        pet16.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList23);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        pet0.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str30 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str30, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.toString();
        java.lang.Class<?> wildcardClass15 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str14, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.toString();
        java.lang.String str16 = pet3.getName();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList33);
        java.lang.String str42 = pet41.getOwner();
        pet41.setName("Pet [name=null, age=null, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str15, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList19 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        com.shop.Food[] foodArray53 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList54 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList54, foodArray53);
        com.shop.Pet pet56 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList54);
        com.shop.Pet pet57 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList54);
        com.shop.Pet pet58 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList54);
        com.shop.Pet pet59 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList54);
        com.shop.Pet pet60 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList54);
        java.lang.String str61 = pet60.toString();
        com.shop.Food[] foodArray71 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList72 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList72, foodArray71);
        com.shop.Pet pet74 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList72);
        com.shop.Pet pet75 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList72);
        com.shop.Pet pet76 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList72);
        com.shop.Food[] foodArray86 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList87 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList87, foodArray86);
        com.shop.Pet pet89 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList87);
        com.shop.Pet pet90 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList87);
        com.shop.Pet pet91 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList87);
        pet76.setFavouriteFood((java.util.List<com.shop.Food>) foodList87);
        pet60.setFavouriteFood((java.util.List<com.shop.Food>) foodList87);
        com.shop.Pet pet94 = new com.shop.Pet("Pet [name=null, age=1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList87);
        com.shop.Pet pet95 = new com.shop.Pet("hi!", (java.lang.Integer) (-1), "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList87);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList87);
        java.lang.String str97 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str61, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(foodArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=, favouriteFood=[]]" + "'", str97, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        java.lang.String str23 = pet22.toString();
        java.lang.String str24 = pet22.getOwner();
        pet22.setOwner("Pet [name=null, age=1, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pet [name=null, age=0, owner=, favouriteFood=null]" + "'", str24, "Pet [name=null, age=0, owner=, favouriteFood=null]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        java.lang.String str10 = pet0.getName();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Food[] foodArray37 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList38 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList38, foodArray37);
        com.shop.Pet pet40 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet42 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet43 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList38);
        pet21.setFavouriteFood((java.util.List<com.shop.Food>) foodList38);
        java.util.List<com.shop.Food> foodList46 = pet21.getFavouriteFood();
        pet0.setFavouriteFood(foodList46);
        pet0.setName("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        com.shop.Pet pet53 = new com.shop.Pet();
        pet53.setAge((java.lang.Integer) 100);
        pet53.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray61 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList62 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList62, foodArray61);
        com.shop.Pet pet64 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList62);
        pet53.setFavouriteFood((java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet66 = new com.shop.Pet();
        pet66.setAge((java.lang.Integer) 100);
        pet66.setOwner("");
        java.lang.String str71 = pet66.getOwner();
        java.util.List<com.shop.Food> foodList72 = pet66.getFavouriteFood();
        pet66.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList75 = pet66.getFavouriteFood();
        com.shop.Food[] foodArray82 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList83 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList83, foodArray82);
        com.shop.Pet pet85 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList83);
        com.shop.Pet pet86 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList83);
        pet66.setFavouriteFood((java.util.List<com.shop.Food>) foodList83);
        pet53.setFavouriteFood((java.util.List<com.shop.Food>) foodList83);
        com.shop.Pet pet89 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList83);
        java.util.List<com.shop.Food> foodList90 = pet89.getFavouriteFood();
        pet0.setFavouriteFood(foodList90);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(foodList46);
        org.junit.Assert.assertNotNull(foodArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(foodList72);
        org.junit.Assert.assertNull(foodList75);
        org.junit.Assert.assertNotNull(foodArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(foodList90);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList4 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray14 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList15 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList15, foodArray14);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList15);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList15);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList15);
        java.util.List<com.shop.Food> foodList21 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(foodList4);
        org.junit.Assert.assertNotNull(foodArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(foodList21);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = foodList11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(foodList11);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setName("");
        java.util.List<com.shop.Food> foodList8 = pet3.getFavouriteFood();
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        java.util.List<com.shop.Food> foodList16 = pet15.getFavouriteFood();
        pet15.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray28 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList29 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList29, foodArray28);
        com.shop.Pet pet31 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList29);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList29);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList29);
        pet15.setFavouriteFood((java.util.List<com.shop.Food>) foodList29);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList29);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList29);
        org.junit.Assert.assertNull(foodList8);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList13);
        java.lang.String str15 = pet14.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]" + "'", str15, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        pet0.setAge((java.lang.Integer) 0);
        pet0.setOwner("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList26 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodList26);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.lang.String str13 = pet0.getName();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str16 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=null, age=1, owner=hi!, favouriteFood=null]" + "'", str16, "Pet [name=null, age=1, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet10.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]");
        java.lang.String str13 = pet10.getOwner();
        pet10.setOwner("Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        pet10.setOwner("Pet [name=null, age=null, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]" + "'", str13, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.toString();
        java.lang.String str16 = pet3.getName();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList33);
        java.lang.String str42 = pet41.toString();
        java.lang.Class<?> wildcardClass43 = pet41.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str15, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]" + "'", str42, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        java.lang.String str11 = pet3.getName();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.util.List<com.shop.Food> foodList29 = pet28.getFavouriteFood();
        java.lang.String str30 = pet28.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(foodList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str30, "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        pet12.setFavouriteFood((java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList26);
        pet33.setOwner("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        java.lang.String str36 = pet33.getName();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]" + "'", str36, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet14.setOwner("Pet [name=null, age=0, owner=, favouriteFood=null]");
        pet14.setName("Pet [name=null, age=null, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        pet0.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.util.List<com.shop.Food> foodList3 = null;
        com.shop.Pet pet4 = new com.shop.Pet("Pet [name=Pet [name=null, age=null, owner=null, favouriteFood=null], age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=[]]", (java.lang.Integer) 10, "Pet [name=null, age=10, owner=null, favouriteFood=[]]", foodList3);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet41 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList33);
        pet42.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        pet0.setAge((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        java.lang.String str15 = pet0.getOwner();
        pet0.setName("Pet [name=null, age=100, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]");
        java.lang.Class<?> wildcardClass18 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet10.setAge((java.lang.Integer) (-1));
        pet10.setName("");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getOwner();
        java.lang.String str15 = pet0.getName();
        java.lang.String str16 = pet0.getOwner();
        java.lang.String str17 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList7);
        pet10.setOwner("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.String str13 = pet10.getName();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str13 = pet10.getOwner();
        pet10.setOwner("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        pet10.setAge((java.lang.Integer) 100);
        pet10.setName("Pet [name=null, age=-1, owner=null, favouriteFood=[]]");
        java.lang.String str20 = pet10.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str13, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=[]], age=100, owner=Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]], favouriteFood=[]]" + "'", str20, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=[]], age=100, owner=Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        pet12.setFavouriteFood((java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList26);
        pet33.setOwner("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        java.lang.Class<?> wildcardClass36 = pet33.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        java.lang.String str11 = pet3.getName();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.lang.String str29 = pet28.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]" + "'", str29, "Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList13);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        java.lang.String str19 = pet14.getOwner();
        java.lang.Class<?> wildcardClass20 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str19, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        pet0.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList25 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodList25);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getOwner();
        java.lang.String str12 = pet10.getOwner();
        java.lang.String str13 = pet10.getOwner();
        pet10.setAge((java.lang.Integer) (-1));
        java.lang.String str16 = pet10.toString();
        java.lang.String str17 = pet10.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=, age=-1, owner=, favouriteFood=[]]" + "'", str16, "Pet [name=, age=-1, owner=, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=, age=-1, owner=, favouriteFood=[]]" + "'", str17, "Pet [name=, age=-1, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        pet0.setName("Pet [name=, age=1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList12);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str7 = pet0.getOwner();
        pet0.setOwner("Pet [name=null, age=1, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str7, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setAge((java.lang.Integer) 100);
        pet10.setOwner("Pet [name=null, age=100, owner=null, favouriteFood=[]]");
        java.lang.Class<?> wildcardClass15 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str14 = pet13.getOwner();
        pet13.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        com.shop.Pet pet17 = new com.shop.Pet();
        pet17.setAge((java.lang.Integer) 100);
        pet17.setOwner("");
        java.lang.String str22 = pet17.getOwner();
        java.util.List<com.shop.Food> foodList23 = pet17.getFavouriteFood();
        pet17.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList26 = pet17.getFavouriteFood();
        pet17.setOwner("hi!");
        java.lang.String str29 = pet17.getOwner();
        pet17.setOwner("");
        com.shop.Food[] foodArray38 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList39 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList39, foodArray38);
        com.shop.Pet pet41 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList39);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList39);
        com.shop.Pet pet45 = new com.shop.Pet("Pet [name=hi!, age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList39);
        com.shop.Food[] foodArray55 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList56 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList56, foodArray55);
        com.shop.Pet pet58 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList56);
        com.shop.Pet pet59 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList56);
        pet59.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList62 = pet59.getFavouriteFood();
        com.shop.Pet pet63 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=0, owner=, favouriteFood=null]", foodList62);
        pet45.setFavouriteFood(foodList62);
        pet45.setName("Pet [name=null, age=null, owner=null, favouriteFood=null]");
        com.shop.Food[] foodArray76 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList77 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList77, foodArray76);
        com.shop.Pet pet79 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList77);
        com.shop.Pet pet80 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList77);
        com.shop.Pet pet81 = new com.shop.Pet("Pet [name=, age=0, owner=, favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList77);
        pet45.setFavouriteFood((java.util.List<com.shop.Food>) foodList77);
        pet45.setOwner("Pet [name=null, age=100, owner=, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList85 = pet45.getFavouriteFood();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(foodList23);
        org.junit.Assert.assertNull(foodList26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(foodArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(foodArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(foodList62);
        org.junit.Assert.assertNotNull(foodArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(foodList85);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        com.shop.Pet pet28 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList26);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList26);
        com.shop.Food[] foodArray43 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList44 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList44, foodArray43);
        com.shop.Pet pet46 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList44);
        com.shop.Pet pet47 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList44);
        com.shop.Pet pet48 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList44);
        com.shop.Pet pet49 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList44);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList44);
        pet18.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.String str53 = pet18.getName();
        java.lang.Class<?> wildcardClass54 = pet18.getClass();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(foodArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]" + "'", str53, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        pet0.setAge((java.lang.Integer) 1);
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("Pet [name=Pet [name=Pet [name=null, age=0, owner=null, favouriteFood=null], age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getOwner();
        pet0.setOwner("Pet [name=null, age=1, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", foodList13);
        java.lang.String str15 = pet14.getOwner();
        pet14.setOwner("Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str15, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        java.lang.String str10 = pet0.getName();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.String str14 = pet0.getName();
        java.lang.Class<?> wildcardClass15 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(foodList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]" + "'", str14, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        java.util.List<com.shop.Food> foodList18 = pet17.getFavouriteFood();
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=null, age=null, owner=null, favouriteFood=null]", foodList18);
        java.lang.String str20 = pet19.getOwner();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=null, age=null, owner=null, favouriteFood=null]" + "'", str20, "Pet [name=null, age=null, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setName("hi!");
        java.lang.String str28 = pet0.getName();
        pet0.setAge((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        pet22.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList25 = pet22.getFavouriteFood();
        java.lang.String str26 = pet22.getOwner();
        pet22.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.lang.String str29 = pet22.getOwner();
        pet22.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str26, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str29, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList12);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList12);
        pet3.setAge((java.lang.Integer) 0);
        com.shop.Pet pet18 = new com.shop.Pet();
        pet18.setAge((java.lang.Integer) 100);
        pet18.setOwner("");
        java.lang.String str23 = pet18.getOwner();
        java.lang.String str24 = pet18.getName();
        java.lang.String str25 = pet18.getName();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        java.util.List<com.shop.Food> foodList33 = pet32.getFavouriteFood();
        pet18.setFavouriteFood(foodList33);
        pet3.setFavouriteFood(foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]", foodList33);
        java.lang.String str37 = pet36.getName();
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodList33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]" + "'", str37, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        java.lang.Class<?> wildcardClass16 = foodList15.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        java.lang.String str24 = pet0.getName();
        pet0.setName("Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.Class<?> wildcardClass27 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList10);
        pet14.setAge((java.lang.Integer) 1);
        pet14.setAge((java.lang.Integer) 10);
        pet14.setOwner("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str21 = pet14.toString();
        java.lang.String str22 = pet14.getOwner();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]" + "'", str21, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.getOwner();
        pet3.setOwner("");
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        com.shop.Pet pet27 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList25);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=10, owner=null, favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList25);
        java.lang.String str31 = pet30.getOwner();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str31, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.util.List<com.shop.Food> foodList8 = pet3.getFavouriteFood();
        com.shop.Pet pet9 = new com.shop.Pet();
        pet9.setAge((java.lang.Integer) 100);
        pet9.setOwner("");
        java.lang.String str14 = pet9.getOwner();
        java.lang.String str15 = pet9.getName();
        java.lang.String str16 = pet9.getName();
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList21);
        java.util.List<com.shop.Food> foodList24 = pet23.getFavouriteFood();
        pet9.setFavouriteFood(foodList24);
        pet3.setFavouriteFood(foodList24);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList24);
        java.lang.String str28 = pet27.getName();
        org.junit.Assert.assertNull(foodList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(foodList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("Pet [name=hi!, age=1, owner=hi!, favouriteFood=[]]");
        pet0.setOwner("Pet [name=Pet [name=, age=1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=null], age=1, owner=Pet [name=null, age=1, owner=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str3 = pet0.getName();
        java.lang.String str4 = pet0.toString();
        pet0.setName("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pet [name=null, age=1, owner=null, favouriteFood=null]" + "'", str4, "Pet [name=null, age=1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        com.shop.Food[] foodArray19 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList20 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList20, foodArray19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList20);
        com.shop.Pet pet23 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList20);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList20);
        pet3.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList27 = pet3.getFavouriteFood();
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList27);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertNotNull(foodArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodList27);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str16 = pet0.toString();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet34 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet35 = new com.shop.Pet("Pet [name=, age=100, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=Pet [name=null, age=0, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        java.lang.String str37 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str16, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str37, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet13.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet13.setAge((java.lang.Integer) 0);
        pet13.setAge((java.lang.Integer) 0);
        java.lang.String str20 = pet13.toString();
        java.util.List<com.shop.Food> foodList21 = pet13.getFavouriteFood();
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]", foodList21);
        java.lang.Class<?> wildcardClass23 = pet22.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str20, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodList21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str11 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList12 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str11, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList12);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        java.lang.String str10 = pet0.getName();
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=-1, owner=null, favouriteFood=null]");
        pet0.setOwner("Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=, favouriteFood=[]], age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(foodList13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList16 = pet12.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList16);
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        pet17.setFavouriteFood((java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        pet22.setAge((java.lang.Integer) 10);
        pet22.setName("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.lang.Class<?> wildcardClass27 = pet22.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        pet0.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList24 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass25 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        pet10.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet10.setAge((java.lang.Integer) 0);
        pet10.setName("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str17 = pet10.toString();
        java.lang.String str18 = pet10.getName();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str17, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str18, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList13 = pet9.getFavouriteFood();
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", foodList13);
        pet14.setAge((java.lang.Integer) 100);
        pet14.setName("Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodList13);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.util.List<com.shop.Food> foodList9 = pet3.getFavouriteFood();
        pet3.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList12 = pet3.getFavouriteFood();
        pet3.setOwner("hi!");
        java.lang.String str15 = pet3.getName();
        com.shop.Pet pet16 = new com.shop.Pet();
        pet16.setAge((java.lang.Integer) 100);
        pet16.setOwner("");
        java.lang.String str21 = pet16.getOwner();
        java.util.List<com.shop.Food> foodList22 = pet16.getFavouriteFood();
        pet16.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList25 = pet16.getFavouriteFood();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=Pet [name=, age=100, owner=null, favouriteFood=null], age=100, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=null, age=10, owner=null, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList33);
        java.lang.String str40 = pet39.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(foodList22);
        org.junit.Assert.assertNull(foodList25);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pet [name=Pet [name=Pet [name=, age=100, owner=null, favouriteFood=null], age=100, owner=null, favouriteFood=null], age=100, owner=Pet [name=null, age=10, owner=null, favouriteFood=[]], favouriteFood=[]]" + "'", str40, "Pet [name=Pet [name=Pet [name=, age=100, owner=null, favouriteFood=null], age=100, owner=null, favouriteFood=null], age=100, owner=Pet [name=null, age=10, owner=null, favouriteFood=[]], favouriteFood=[]]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet13.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList16 = pet13.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", foodList16);
        java.lang.String str18 = pet17.getName();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pet [name=null, age=0, owner=, favouriteFood=null]" + "'", str18, "Pet [name=null, age=0, owner=, favouriteFood=null]");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList25);
        java.lang.String str31 = pet14.toString();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str31, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.getOwner();
        pet0.setOwner("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        pet0.setOwner("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str22, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str18 = pet17.getOwner();
        java.util.List<com.shop.Food> foodList19 = pet17.getFavouriteFood();
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=, age=1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=1, owner=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=null]", foodList19);
        java.lang.String str21 = pet20.toString();
        pet20.setOwner("Pet [name=hi!, age=100, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str18, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pet [name=Pet [name=, age=1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=null], age=1, owner=Pet [name=null, age=1, owner=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=null], favouriteFood=[]]" + "'", str21, "Pet [name=Pet [name=, age=1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=null], age=1, owner=Pet [name=null, age=1, owner=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str9 = pet0.getOwner();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str9, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("");
        java.lang.String str5 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList10);
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet13.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList16 = pet13.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=0, owner=, favouriteFood=null]", foodList16);
        pet17.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray8 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList9 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList9, foodArray8);
        com.shop.Pet pet11 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList9);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList9);
        pet0.setAge((java.lang.Integer) 0);
        com.shop.Pet pet15 = new com.shop.Pet();
        pet15.setAge((java.lang.Integer) 100);
        pet15.setOwner("");
        java.lang.String str20 = pet15.getOwner();
        java.lang.String str21 = pet15.getName();
        java.lang.String str22 = pet15.getName();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        java.util.List<com.shop.Food> foodList30 = pet29.getFavouriteFood();
        pet15.setFavouriteFood(foodList30);
        pet0.setFavouriteFood(foodList30);
        java.lang.Class<?> wildcardClass33 = pet0.getClass();
        org.junit.Assert.assertNotNull(foodArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodList30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        com.shop.Pet pet8 = new com.shop.Pet();
        pet8.setAge((java.lang.Integer) 100);
        pet8.setOwner("");
        java.lang.String str13 = pet8.getOwner();
        java.lang.String str14 = pet8.getName();
        java.util.List<com.shop.Food> foodList15 = pet8.getFavouriteFood();
        java.lang.String str16 = pet8.getName();
        pet8.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray19 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList20 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList20, foodArray19);
        pet8.setFavouriteFood((java.util.List<com.shop.Food>) foodList20);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList20);
        pet0.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=null, favouriteFood=null]");
        pet0.setOwner("Pet [name=, age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(foodList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(foodArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str16 = pet0.toString();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet34 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet35 = new com.shop.Pet("Pet [name=, age=100, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=Pet [name=null, age=0, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        java.util.List<com.shop.Food> foodList37 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str16, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodList37);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getName();
        java.lang.String str11 = pet0.getName();
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet31 = new com.shop.Pet();
        pet31.setAge((java.lang.Integer) 100);
        pet31.setOwner("");
        java.lang.String str36 = pet31.getOwner();
        java.util.List<com.shop.Food> foodList37 = pet31.getFavouriteFood();
        pet31.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList40 = pet31.getFavouriteFood();
        pet31.setOwner("hi!");
        java.lang.String str43 = pet31.toString();
        com.shop.Pet pet44 = new com.shop.Pet();
        pet44.setAge((java.lang.Integer) 100);
        pet44.setOwner("");
        java.lang.String str49 = pet44.getOwner();
        java.util.List<com.shop.Food> foodList50 = pet44.getFavouriteFood();
        pet44.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str53 = pet44.getName();
        java.lang.String str54 = pet44.getName();
        com.shop.Food[] foodArray61 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList62 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList62, foodArray61);
        com.shop.Pet pet64 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet65 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Food[] foodArray81 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList82 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList82, foodArray81);
        com.shop.Pet pet84 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet pet85 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet pet86 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet pet87 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet pet88 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList82);
        pet65.setFavouriteFood((java.util.List<com.shop.Food>) foodList82);
        java.util.List<com.shop.Food> foodList90 = pet65.getFavouriteFood();
        pet44.setFavouriteFood(foodList90);
        pet31.setFavouriteFood(foodList90);
        java.util.List<com.shop.Food> foodList93 = pet31.getFavouriteFood();
        pet30.setFavouriteFood(foodList93);
        pet0.setFavouriteFood(foodList93);
        java.util.List<com.shop.Food> foodList96 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(foodList37);
        org.junit.Assert.assertNull(foodList40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str43, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(foodList50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(foodArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(foodArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(foodList90);
        org.junit.Assert.assertNotNull(foodList93);
        org.junit.Assert.assertNotNull(foodList96);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 100);
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=, age=10, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNull(foodList9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        java.lang.String str8 = pet0.getName();
        java.lang.String str9 = pet0.getOwner();
        pet0.setName("Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        pet0.setName("hi!");
        java.lang.String str7 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=hi!, age=10, owner=null, favouriteFood=null]" + "'", str7, "Pet [name=hi!, age=10, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str15 = pet14.toString();
        pet14.setAge((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass18 = pet14.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Pet [name=hi!, age=10, owner=, favouriteFood=[]]" + "'", str15, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        pet0.setName("hi!");
        java.lang.String str7 = pet0.getOwner();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet27 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        pet9.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=hi!, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList23);
        java.util.List<com.shop.Food> foodList30 = pet29.getFavouriteFood();
        java.lang.Class<?> wildcardClass31 = foodList30.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(foodList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str17 = pet0.getName();
        com.shop.Food[] foodArray27 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList28 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList28, foodArray27);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList28);
        com.shop.Pet pet31 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList28);
        com.shop.Pet pet32 = new com.shop.Pet();
        pet32.setAge((java.lang.Integer) 100);
        pet32.setOwner("");
        java.util.List<com.shop.Food> foodList37 = pet32.getFavouriteFood();
        com.shop.Pet pet38 = new com.shop.Pet();
        pet38.setAge((java.lang.Integer) 100);
        pet38.setOwner("");
        java.lang.String str43 = pet38.getOwner();
        java.lang.String str44 = pet38.getName();
        java.lang.String str45 = pet38.getName();
        com.shop.Food[] foodArray49 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList50 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList50, foodArray49);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList50);
        java.util.List<com.shop.Food> foodList53 = pet52.getFavouriteFood();
        pet38.setFavouriteFood(foodList53);
        pet32.setFavouriteFood(foodList53);
        pet31.setFavouriteFood(foodList53);
        com.shop.Pet pet57 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=100, owner=, favouriteFood=null]", foodList53);
        pet0.setFavouriteFood(foodList53);
        java.lang.String str59 = pet0.toString();
        java.lang.Class<?> wildcardClass60 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(foodArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(foodList37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(foodArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(foodList53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Pet [name=null, age=1, owner=, favouriteFood=[]]" + "'", str59, "Pet [name=null, age=1, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str9 = pet0.getName();
        java.lang.String str10 = pet0.getName();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Food[] foodArray37 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList38 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList38, foodArray37);
        com.shop.Pet pet40 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet42 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet43 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList38);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList38);
        pet21.setFavouriteFood((java.util.List<com.shop.Food>) foodList38);
        java.util.List<com.shop.Food> foodList46 = pet21.getFavouriteFood();
        pet0.setFavouriteFood(foodList46);
        java.lang.String str48 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList49 = pet0.getFavouriteFood();
        java.lang.String str50 = pet0.getName();
        pet0.setName("Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(foodList46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str48, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodList49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        java.util.List<com.shop.Food> foodList41 = pet16.getFavouriteFood();
        com.shop.Pet pet42 = new com.shop.Pet("Pet [name=, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=1, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=null]", foodList41);
        com.shop.Pet pet43 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", foodList41);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(foodList41);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str3 = pet0.getName();
        pet0.setName("Pet [name=null, age=100, owner=null, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str8 = pet0.getName();
        java.lang.String str9 = pet0.getOwner();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pet [name=null, age=100, owner=null, favouriteFood=null]" + "'", str8, "Pet [name=null, age=100, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.List<com.shop.Food> foodList6 = null;
        com.shop.Pet pet7 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList6);
        pet7.setOwner("Pet [name=null, age=100, owner=, favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList10 = pet7.getFavouriteFood();
        com.shop.Food[] foodArray23 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList24 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList24, foodArray23);
        com.shop.Pet pet26 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList24);
        com.shop.Pet pet27 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList24);
        java.lang.String str28 = pet27.getOwner();
        pet27.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        com.shop.Pet pet31 = new com.shop.Pet();
        pet31.setAge((java.lang.Integer) 100);
        pet31.setOwner("");
        java.lang.String str36 = pet31.getOwner();
        java.util.List<com.shop.Food> foodList37 = pet31.getFavouriteFood();
        pet31.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList40 = pet31.getFavouriteFood();
        pet31.setOwner("hi!");
        java.lang.String str43 = pet31.getOwner();
        pet31.setOwner("");
        com.shop.Food[] foodArray52 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList53 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList53, foodArray52);
        com.shop.Pet pet55 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet56 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList53);
        pet31.setFavouriteFood((java.util.List<com.shop.Food>) foodList53);
        pet27.setFavouriteFood((java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet59 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet60 = new com.shop.Pet("", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList53);
        pet7.setFavouriteFood((java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet pet62 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=0, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=0, owner=null, favouriteFood=null], age=100, owner=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList53);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNotNull(foodArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(foodList37);
        org.junit.Assert.assertNull(foodList40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(foodArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str16 = pet0.toString();
        pet0.setName("Pet [name=, age=0, owner=, favouriteFood=[]]");
        pet0.setAge((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str16, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str3 = pet0.getName();
        pet0.setName("Pet [name=null, age=100, owner=null, favouriteFood=null]");
        pet0.setName("Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str8 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str8, "Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList19 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        pet0.setName("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.String str34 = pet0.getOwner();
        java.lang.String str35 = pet0.getOwner();
        java.lang.String str36 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList7);
        pet10.setAge((java.lang.Integer) (-1));
        java.lang.String str13 = pet10.toString();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=hi!, favouriteFood=[]]" + "'", str13, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=hi!, favouriteFood=[]]");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList12);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList12);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 100, "Pet [name=Pet [name=, age=0, owner=, favouriteFood=[]], age=100, owner=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList12);
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList13);
        java.util.List<com.shop.Food> foodList19 = pet18.getFavouriteFood();
        pet18.setAge((java.lang.Integer) 0);
        pet18.setName("Pet [name=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=1, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]");
        java.lang.String str24 = pet18.getOwner();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str24, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.toString();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str6, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=100, owner=, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str16 = pet0.toString();
        java.lang.String str17 = pet0.getOwner();
        java.lang.String str18 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str16, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str17, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]" + "'", str18, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=null]");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        pet22.setOwner("Pet [name=hi!, age=10, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        java.lang.String str11 = pet3.getName();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.util.List<com.shop.Food> foodList29 = pet28.getFavouriteFood();
        pet28.setName("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(foodList29);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList12);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList12);
        com.shop.Pet pet16 = new com.shop.Pet();
        pet16.setAge((java.lang.Integer) 100);
        pet16.setOwner("");
        java.lang.String str21 = pet16.getOwner();
        java.util.List<com.shop.Food> foodList22 = pet16.getFavouriteFood();
        pet16.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList25 = pet16.getFavouriteFood();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList33);
        java.lang.String str40 = pet39.getOwner();
        java.util.List<com.shop.Food> foodList41 = pet39.getFavouriteFood();
        java.lang.Class<?> wildcardClass42 = foodList41.getClass();
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(foodList22);
        org.junit.Assert.assertNull(foodList25);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pet [name=hi!, age=10, owner=, favouriteFood=[]]" + "'", str40, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodList41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = foodList7.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getOwner();
        java.lang.Integer int7 = pet0.getAge();
        java.lang.String str8 = pet0.getOwner();
        pet0.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setName("hi!");
        java.lang.String str28 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pet [name=hi!, age=100, owner=, favouriteFood=[]]" + "'", str28, "Pet [name=hi!, age=100, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.util.List<com.shop.Food> foodList10 = pet3.getFavouriteFood();
        java.lang.String str11 = pet3.getName();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList22);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet28 = new com.shop.Pet("Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.lang.String str29 = pet28.getName();
        java.util.List<com.shop.Food> foodList30 = pet28.getFavouriteFood();
        java.lang.Class<?> wildcardClass31 = foodList30.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(foodList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str29, "Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str3 = pet0.getName();
        com.shop.Food[] foodArray13 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList14 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList14, foodArray13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList14);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList14);
        com.shop.Pet pet18 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList14);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList14);
        pet0.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(foodArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        java.lang.String str22 = pet0.toString();
        java.lang.String str23 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setName("hi!");
        java.lang.String str28 = pet0.getName();
        java.lang.Class<?> wildcardClass29 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str22, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str23, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.toString();
        com.shop.Pet pet15 = new com.shop.Pet();
        pet15.setAge((java.lang.Integer) 100);
        pet15.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray23 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList24 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList24, foodArray23);
        com.shop.Pet pet26 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList24);
        pet15.setFavouriteFood((java.util.List<com.shop.Food>) foodList24);
        com.shop.Pet pet28 = new com.shop.Pet();
        pet28.setAge((java.lang.Integer) 100);
        pet28.setOwner("");
        java.lang.String str33 = pet28.getOwner();
        java.util.List<com.shop.Food> foodList34 = pet28.getFavouriteFood();
        pet28.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList37 = pet28.getFavouriteFood();
        com.shop.Food[] foodArray44 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList45 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList45, foodArray44);
        com.shop.Pet pet47 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList45);
        com.shop.Pet pet48 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList45);
        pet28.setFavouriteFood((java.util.List<com.shop.Food>) foodList45);
        pet15.setFavouriteFood((java.util.List<com.shop.Food>) foodList45);
        com.shop.Pet pet51 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList45);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList45);
        pet10.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=100, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]" + "'", str11, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(foodList34);
        org.junit.Assert.assertNull(foodList37);
        org.junit.Assert.assertNotNull(foodArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.shop.Pet pet0 = new com.shop.Pet();
        java.lang.String str1 = pet0.toString();
        pet0.setOwner("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        pet0.setName("Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pet [name=null, age=null, owner=null, favouriteFood=null]" + "'", str1, "Pet [name=null, age=null, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        java.util.List<com.shop.Food> foodList14 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(foodList14);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet24 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Food[] foodArray31 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList32 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList32, foodArray31);
        com.shop.Pet pet34 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList32);
        com.shop.Pet pet35 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList32);
        pet24.setFavouriteFood((java.util.List<com.shop.Food>) foodList32);
        com.shop.Pet pet37 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList32);
        com.shop.Pet pet38 = new com.shop.Pet("Pet [name=hi!, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList32);
        pet38.setOwner("Pet [name=null, age=-1, owner=, favouriteFood=null]");
        java.lang.String str41 = pet38.toString();
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(foodArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=, favouriteFood=null], favouriteFood=[]]" + "'", str41, "Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 0);
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet27 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        pet9.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=1, owner=, favouriteFood=[]]", (java.lang.Integer) 10, "Pet [name=null, age=0, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList23);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        pet18.setName("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str17 = pet0.getName();
        com.shop.Food[] foodArray27 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList28 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList28, foodArray27);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList28);
        com.shop.Pet pet31 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList28);
        com.shop.Pet pet32 = new com.shop.Pet();
        pet32.setAge((java.lang.Integer) 100);
        pet32.setOwner("");
        java.util.List<com.shop.Food> foodList37 = pet32.getFavouriteFood();
        com.shop.Pet pet38 = new com.shop.Pet();
        pet38.setAge((java.lang.Integer) 100);
        pet38.setOwner("");
        java.lang.String str43 = pet38.getOwner();
        java.lang.String str44 = pet38.getName();
        java.lang.String str45 = pet38.getName();
        com.shop.Food[] foodArray49 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList50 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList50, foodArray49);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList50);
        java.util.List<com.shop.Food> foodList53 = pet52.getFavouriteFood();
        pet38.setFavouriteFood(foodList53);
        pet32.setFavouriteFood(foodList53);
        pet31.setFavouriteFood(foodList53);
        com.shop.Pet pet57 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=hi!, age=100, owner=, favouriteFood=null]", foodList53);
        pet0.setFavouriteFood(foodList53);
        java.lang.String str59 = pet0.getName();
        java.lang.Class<?> wildcardClass60 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(foodArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(foodList37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(foodArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(foodList53);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getOwner();
        java.lang.String str12 = pet10.getOwner();
        java.lang.String str13 = pet10.getOwner();
        java.util.List<com.shop.Food> foodList14 = pet10.getFavouriteFood();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(foodList14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str19 = pet18.getOwner();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Food[] foodArray46 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList47 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList47, foodArray46);
        com.shop.Pet pet49 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet50 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet51 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet52 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet53 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        pet30.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        pet18.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        java.lang.Class<?> wildcardClass56 = foodList47.getClass();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet23 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList18);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList18);
        java.lang.String str25 = pet0.getName();
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet34 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        java.lang.String str38 = pet0.getName();
        pet0.setAge((java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet34 = new com.shop.Pet("Pet [name=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet37 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet38 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet39 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet41 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        com.shop.Pet pet42 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList33);
        pet42.setAge((java.lang.Integer) 0);
        java.lang.String str45 = pet42.getName();
        java.util.List<com.shop.Food> foodList46 = pet42.getFavouriteFood();
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(foodList46);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.shop.Food[] foodArray3 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList4 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList4, foodArray3);
        com.shop.Pet pet6 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList4);
        java.lang.String str7 = pet6.getName();
        pet6.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(foodArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        pet14.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        java.lang.Class<?> wildcardClass19 = foodList16.getClass();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.util.List<com.shop.Food> foodList13 = pet6.getFavouriteFood();
        pet6.setName("hi!");
        java.lang.String str16 = pet6.getOwner();
        java.util.List<com.shop.Food> foodList17 = pet6.getFavouriteFood();
        java.lang.String str18 = pet6.getName();
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList23);
        java.util.List<com.shop.Food> foodList26 = pet25.getFavouriteFood();
        pet25.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList29 = pet25.getFavouriteFood();
        pet6.setFavouriteFood(foodList29);
        com.shop.Pet pet31 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]", foodList29);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 0, "Pet [name=, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", foodList29);
        java.lang.Class<?> wildcardClass33 = pet32.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(foodList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(foodList26);
        org.junit.Assert.assertNotNull(foodList29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet13.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList16 = pet13.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=0, owner=, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]", foodList16);
        pet17.setName("Pet [name=, age=0, owner=, favouriteFood=[]]");
        pet17.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList16);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setOwner("");
        java.lang.String str8 = pet3.getOwner();
        java.lang.String str9 = pet3.getName();
        java.lang.String str10 = pet3.getName();
        com.shop.Food[] foodArray14 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList15 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList15, foodArray14);
        com.shop.Pet pet17 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList15);
        java.util.List<com.shop.Food> foodList18 = pet17.getFavouriteFood();
        pet3.setFavouriteFood(foodList18);
        pet3.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList22 = pet3.getFavouriteFood();
        com.shop.Pet pet23 = new com.shop.Pet();
        pet23.setAge((java.lang.Integer) 100);
        pet23.setOwner("");
        java.lang.String str28 = pet23.getOwner();
        java.util.List<com.shop.Food> foodList29 = pet23.getFavouriteFood();
        pet23.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet23.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        com.shop.Pet pet34 = new com.shop.Pet();
        pet34.setAge((java.lang.Integer) 100);
        pet34.setOwner("");
        java.lang.String str39 = pet34.getOwner();
        java.util.List<com.shop.Food> foodList40 = pet34.getFavouriteFood();
        pet34.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str43 = pet34.getName();
        java.lang.String str44 = pet34.getName();
        com.shop.Food[] foodArray51 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList52 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList52, foodArray51);
        com.shop.Pet pet54 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList52);
        com.shop.Pet pet55 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList52);
        com.shop.Food[] foodArray71 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList72 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList72, foodArray71);
        com.shop.Pet pet74 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList72);
        com.shop.Pet pet75 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList72);
        com.shop.Pet pet76 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList72);
        com.shop.Pet pet77 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList72);
        com.shop.Pet pet78 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList72);
        pet55.setFavouriteFood((java.util.List<com.shop.Food>) foodList72);
        java.util.List<com.shop.Food> foodList80 = pet55.getFavouriteFood();
        pet34.setFavouriteFood(foodList80);
        pet23.setFavouriteFood(foodList80);
        pet3.setFavouriteFood(foodList80);
        com.shop.Pet pet84 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]], favouriteFood=[]]", (java.lang.Integer) 10, "", foodList80);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(foodArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(foodList18);
        org.junit.Assert.assertNotNull(foodList22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(foodList29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(foodList40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(foodArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(foodArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(foodList80);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=null, age=0, owner=, favouriteFood=null]");
        pet0.setOwner("Pet [name=null, age=0, owner=null, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getName();
        java.lang.String str15 = pet0.getName();
        java.util.List<com.shop.Food> foodList16 = pet0.getFavouriteFood();
        java.util.List<com.shop.Food> foodList17 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(foodList16);
        org.junit.Assert.assertNull(foodList17);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.lang.String str4 = pet0.toString();
        java.lang.String str5 = pet0.getOwner();
        pet0.setName("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        pet0.setAge((java.lang.Integer) 10);
        pet0.setName("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str4, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.lang.String str4 = pet0.getName();
        java.lang.String str5 = pet0.toString();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str5, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setName("");
        java.lang.String str5 = pet0.toString();
        pet0.setAge((java.lang.Integer) 10);
        pet0.setOwner("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pet [name=, age=100, owner=null, favouriteFood=null]" + "'", str5, "Pet [name=, age=100, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("Pet [name=null, age=100, owner=hi!, favouriteFood=[]]");
        java.lang.Class<?> wildcardClass3 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList13 = pet0.getFavouriteFood();
        java.lang.String str14 = pet0.getName();
        java.lang.String str15 = pet0.getName();
        com.shop.Pet pet16 = new com.shop.Pet();
        pet16.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList23);
        pet16.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList23);
        pet0.setName("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.lang.String str30 = pet0.toString();
        com.shop.Food[] foodArray40 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList41 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList41, foodArray40);
        com.shop.Pet pet43 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet44 = new com.shop.Pet("", (java.lang.Integer) 100, "", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet45 = new com.shop.Pet("", (java.lang.Integer) 1, "", (java.util.List<com.shop.Food>) foodList41);
        java.lang.String str46 = pet45.getName();
        pet45.setName("Pet [name=hi!, age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList49 = pet45.getFavouriteFood();
        pet0.setFavouriteFood(foodList49);
        pet0.setName("Pet [name=, age=1, owner=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=100, owner=hi!, favouriteFood=[]]" + "'", str30, "Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=0, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=100, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(foodList49);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setOwner("hi!");
        pet0.setOwner("hi!");
        java.lang.Integer int5 = pet0.getAge();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.toString();
        java.lang.Integer int8 = pet0.getAge();
        com.shop.Pet pet9 = new com.shop.Pet();
        pet9.setAge((java.lang.Integer) 100);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        pet9.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList16);
        pet0.setName("Pet [name=Pet [name=null, age=null, owner=null, favouriteFood=null], age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=[]]");
        pet0.setAge((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pet [name=null, age=null, owner=hi!, favouriteFood=null]" + "'", str7, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.util.List<com.shop.Food> foodList13 = pet6.getFavouriteFood();
        java.lang.String str14 = pet6.getName();
        pet6.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        pet6.setFavouriteFood((java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList18);
        com.shop.Pet pet22 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList18);
        java.lang.String str23 = pet22.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(foodList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]" + "'", str23, "Pet [name=Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=Pet [name=hi!, age=100, owner=, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        pet0.setOwner("hi!");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        pet22.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList25 = pet22.getFavouriteFood();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList33);
        java.util.List<com.shop.Food> foodList36 = pet35.getFavouriteFood();
        pet35.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList39 = pet35.getFavouriteFood();
        com.shop.Pet pet40 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList39);
        com.shop.Food[] foodArray53 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList54 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList54, foodArray53);
        com.shop.Pet pet56 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList54);
        com.shop.Pet pet57 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList54);
        com.shop.Pet pet58 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList54);
        com.shop.Pet pet59 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList54);
        pet40.setFavouriteFood((java.util.List<com.shop.Food>) foodList54);
        pet22.setFavouriteFood((java.util.List<com.shop.Food>) foodList54);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList54);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(foodList25);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(foodList36);
        org.junit.Assert.assertNotNull(foodList39);
        org.junit.Assert.assertNotNull(foodArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        com.shop.Pet pet18 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Pet pet21 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList16);
        com.shop.Food[] foodArray28 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList29 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList29, foodArray28);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList29);
        com.shop.Pet pet32 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList29);
        pet21.setFavouriteFood((java.util.List<com.shop.Food>) foodList29);
        com.shop.Food[] foodArray46 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList47 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList47, foodArray46);
        com.shop.Pet pet49 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet50 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet51 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet52 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList47);
        pet21.setFavouriteFood((java.util.List<com.shop.Food>) foodList47);
        com.shop.Pet pet54 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]", (java.lang.Integer) (-1), "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList47);
        java.lang.String str55 = pet54.getOwner();
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(foodArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]" + "'", str55, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        pet0.setAge((java.lang.Integer) 100);
        java.lang.String str12 = pet0.getOwner();
        com.shop.Pet pet13 = new com.shop.Pet();
        pet13.setAge((java.lang.Integer) 100);
        pet13.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        com.shop.Pet pet24 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList22);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet();
        pet26.setAge((java.lang.Integer) 100);
        pet26.setOwner("");
        java.lang.String str31 = pet26.getOwner();
        java.util.List<com.shop.Food> foodList32 = pet26.getFavouriteFood();
        pet26.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList35 = pet26.getFavouriteFood();
        com.shop.Food[] foodArray42 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList43 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList43, foodArray42);
        com.shop.Pet pet45 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList43);
        com.shop.Pet pet46 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList43);
        pet26.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList43);
        com.shop.Pet pet50 = new com.shop.Pet();
        pet50.setAge((java.lang.Integer) 100);
        pet50.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray58 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList59 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList59, foodArray58);
        com.shop.Pet pet61 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList59);
        pet50.setFavouriteFood((java.util.List<com.shop.Food>) foodList59);
        pet50.setAge((java.lang.Integer) 0);
        com.shop.Pet pet65 = new com.shop.Pet();
        pet65.setAge((java.lang.Integer) 100);
        pet65.setOwner("");
        java.lang.String str70 = pet65.getOwner();
        java.lang.String str71 = pet65.getName();
        java.lang.String str72 = pet65.getName();
        com.shop.Food[] foodArray76 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList77 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList77, foodArray76);
        com.shop.Pet pet79 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList77);
        java.util.List<com.shop.Food> foodList80 = pet79.getFavouriteFood();
        pet65.setFavouriteFood(foodList80);
        pet50.setFavouriteFood(foodList80);
        pet0.setFavouriteFood(foodList80);
        pet0.setOwner("Pet [name=, age=0, owner=, favouriteFood=[]]");
        java.lang.String str86 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(foodList32);
        org.junit.Assert.assertNull(foodList35);
        org.junit.Assert.assertNotNull(foodArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(foodArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(foodArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(foodList80);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getOwner();
        java.lang.String str11 = pet0.getOwner();
        pet0.setName("Pet [name=Pet [name=, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=0, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        java.util.List<com.shop.Food> foodList16 = pet15.getFavouriteFood();
        pet15.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList19 = pet15.getFavouriteFood();
        com.shop.Pet pet20 = new com.shop.Pet("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) 1, "Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]", foodList19);
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        pet20.setFavouriteFood((java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet25 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=null, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList22);
        java.util.List<com.shop.Food> foodList27 = pet26.getFavouriteFood();
        com.shop.Food[] foodArray40 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList41 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList41, foodArray40);
        com.shop.Pet pet43 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet44 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet45 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList41);
        com.shop.Pet pet46 = new com.shop.Pet("Pet [name=, age=100, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=Pet [name=null, age=0, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList41);
        pet26.setFavouriteFood((java.util.List<com.shop.Food>) foodList41);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodList19);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(foodList27);
        org.junit.Assert.assertNotNull(foodArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.toString();
        java.lang.String str12 = pet10.toString();
        pet10.setAge((java.lang.Integer) 0);
        java.lang.String str15 = pet10.getOwner();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pet [name=, age=0, owner=, favouriteFood=[]]" + "'", str11, "Pet [name=, age=0, owner=, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=, age=0, owner=, favouriteFood=[]]" + "'", str12, "Pet [name=, age=0, owner=, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        java.util.List<com.shop.Food> foodList35 = pet10.getFavouriteFood();
        java.lang.String str36 = pet10.toString();
        java.lang.String str37 = pet10.getOwner();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Pet [name=hi!, age=1, owner=hi!, favouriteFood=[]]" + "'", str36, "Pet [name=hi!, age=1, owner=hi!, favouriteFood=[]]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        pet14.setOwner("Pet [name=null, age=0, owner=, favouriteFood=null]");
        pet14.setOwner("Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null]");
        pet14.setOwner("Pet [name=hi!, age=100, owner=, favouriteFood=[]]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        com.shop.Pet pet19 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Pet pet20 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList17);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList17);
        pet0.setAge((java.lang.Integer) 0);
        pet0.setName("Pet [name=null, age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=null]");
        java.lang.Class<?> wildcardClass26 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList15 = pet14.getFavouriteFood();
        pet14.setAge((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList15);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        java.util.List<com.shop.Food> foodList13 = pet12.getFavouriteFood();
        pet12.setAge((java.lang.Integer) 0);
        java.util.List<com.shop.Food> foodList16 = pet12.getFavouriteFood();
        com.shop.Pet pet17 = new com.shop.Pet("Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", foodList16);
        java.util.List<com.shop.Food> foodList18 = pet17.getFavouriteFood();
        com.shop.Pet pet19 = new com.shop.Pet("Pet [name=null, age=10, owner=null, favouriteFood=[]]", (java.lang.Integer) 10, "Pet [name=Pet [name=null, age=100, owner=, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=10, owner=Pet [name=null, age=null, owner=null, favouriteFood=null], favouriteFood=[]], favouriteFood=[]], favouriteFood=[]]", foodList18);
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(foodList13);
        org.junit.Assert.assertNotNull(foodList16);
        org.junit.Assert.assertNotNull(foodList18);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        java.lang.String str35 = pet10.getName();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("", (java.lang.Integer) 0, "", (java.util.List<com.shop.Food>) foodList7);
        java.lang.String str11 = pet10.getOwner();
        java.lang.String str12 = pet10.getOwner();
        java.lang.String str13 = pet10.getOwner();
        java.lang.String str14 = pet10.getName();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setOwner("");
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) 100);
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setName("Pet [name=hi!, age=10, owner=, favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList12 = pet0.getFavouriteFood();
        java.lang.String str13 = pet0.getOwner();
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertNull(foodList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str13, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        com.shop.Pet pet21 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet22 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet23 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet24 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet25 = new com.shop.Pet("Pet [name=null, age=100, owner=, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=0, owner=, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        com.shop.Pet pet26 = new com.shop.Pet("Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList19);
        java.util.List<com.shop.Food> foodList27 = pet26.getFavouriteFood();
        java.lang.String str28 = pet26.toString();
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(foodList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pet [name=Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null], favouriteFood=[]]" + "'", str28, "Pet [name=Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null], age=1, owner=Pet [name=null, age=-1, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setAge((java.lang.Integer) 0);
        java.lang.String str10 = pet0.getName();
        java.util.List<com.shop.Food> foodList11 = pet0.getFavouriteFood();
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(foodList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=0, owner=, favouriteFood=null]" + "'", str12, "Pet [name=null, age=0, owner=, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray8 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList9 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList9, foodArray8);
        com.shop.Pet pet11 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList9);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList9);
        com.shop.Pet pet13 = new com.shop.Pet();
        pet13.setAge((java.lang.Integer) 100);
        pet13.setOwner("");
        java.lang.String str18 = pet13.getOwner();
        java.util.List<com.shop.Food> foodList19 = pet13.getFavouriteFood();
        pet13.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList22 = pet13.getFavouriteFood();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        pet13.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        java.lang.String str36 = pet0.getOwner();
        java.lang.String str37 = pet0.getName();
        org.junit.Assert.assertNotNull(foodArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNull(foodList22);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.getOwner();
        pet0.setOwner("");
        pet0.setAge((java.lang.Integer) 1);
        pet0.setName("Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList19 = pet0.getFavouriteFood();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        pet0.setName("Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        java.lang.String str34 = pet0.getOwner();
        java.lang.String str35 = pet0.getName();
        java.lang.String str36 = pet0.getOwner();
        java.lang.Class<?> wildcardClass37 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]" + "'", str35, "Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList7);
        java.util.List<com.shop.Food> foodList10 = pet9.getFavouriteFood();
        pet9.setAge((java.lang.Integer) 10);
        pet9.setOwner("Pet [name=null, age=1, owner=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=null]");
        com.shop.Food[] foodArray30 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList31 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList31, foodArray30);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Pet pet34 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 0, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) (-1), "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=null, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=null, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Pet pet37 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=hi!, age=10, owner=, favouriteFood=[]]", (java.util.List<com.shop.Food>) foodList31);
        java.util.List<com.shop.Food> foodList38 = pet37.getFavouriteFood();
        pet9.setFavouriteFood(foodList38);
        java.util.List<com.shop.Food> foodList40 = pet9.getFavouriteFood();
        com.shop.Pet pet41 = new com.shop.Pet("Pet [name=Pet [name=Pet [name=Pet [name=hi!, age=100, owner=hi!, favouriteFood=null], age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=null, owner=hi!, favouriteFood=null], favouriteFood=[]], age=100, owner=Pet [name=hi!, age=10, owner=, favouriteFood=[]], favouriteFood=[]]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=, favouriteFood=null]", foodList40);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodList10);
        org.junit.Assert.assertNotNull(foodArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(foodList38);
        org.junit.Assert.assertNotNull(foodList40);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        pet0.setAge((java.lang.Integer) 1);
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str14 = pet0.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList10);
        java.lang.String str15 = pet14.getName();
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.lang.String str6 = pet0.getName();
        java.util.List<com.shop.Food> foodList7 = pet0.getFavouriteFood();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.getName();
        java.lang.String str11 = pet0.getName();
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        com.shop.Pet pet27 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 0, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet29 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=0, owner=null, favouriteFood=null]", (java.lang.Integer) 100, "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Pet pet31 = new com.shop.Pet();
        pet31.setAge((java.lang.Integer) 100);
        pet31.setOwner("");
        java.lang.String str36 = pet31.getOwner();
        java.util.List<com.shop.Food> foodList37 = pet31.getFavouriteFood();
        pet31.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList40 = pet31.getFavouriteFood();
        pet31.setOwner("hi!");
        java.lang.String str43 = pet31.toString();
        com.shop.Pet pet44 = new com.shop.Pet();
        pet44.setAge((java.lang.Integer) 100);
        pet44.setOwner("");
        java.lang.String str49 = pet44.getOwner();
        java.util.List<com.shop.Food> foodList50 = pet44.getFavouriteFood();
        pet44.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str53 = pet44.getName();
        java.lang.String str54 = pet44.getName();
        com.shop.Food[] foodArray61 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList62 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList62, foodArray61);
        com.shop.Pet pet64 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet pet65 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Food[] foodArray81 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList82 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList82, foodArray81);
        com.shop.Pet pet84 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet pet85 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet pet86 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet pet87 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet pet88 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList82);
        pet65.setFavouriteFood((java.util.List<com.shop.Food>) foodList82);
        java.util.List<com.shop.Food> foodList90 = pet65.getFavouriteFood();
        pet44.setFavouriteFood(foodList90);
        pet31.setFavouriteFood(foodList90);
        java.util.List<com.shop.Food> foodList93 = pet31.getFavouriteFood();
        pet30.setFavouriteFood(foodList93);
        pet0.setFavouriteFood(foodList93);
        pet0.setName("Pet [name=Pet [name=null, age=100, owner=null, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.String str98 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(foodList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(foodList37);
        org.junit.Assert.assertNull(foodList40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str43, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(foodList50);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(foodArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(foodArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(foodList90);
        org.junit.Assert.assertNotNull(foodList93);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Pet [name=Pet [name=Pet [name=null, age=100, owner=null, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], age=100, owner=, favouriteFood=[]]" + "'", str98, "Pet [name=Pet [name=Pet [name=null, age=100, owner=null, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], age=100, owner=, favouriteFood=[]]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.getOwner();
        java.lang.String str4 = pet0.toString();
        java.lang.String str5 = pet0.getOwner();
        pet0.setName("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        pet0.setAge((java.lang.Integer) 10);
        com.shop.Pet pet10 = new com.shop.Pet();
        pet10.setAge((java.lang.Integer) 100);
        pet10.setOwner("");
        java.lang.String str15 = pet10.getOwner();
        java.util.List<com.shop.Food> foodList16 = pet10.getFavouriteFood();
        pet10.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str19 = pet10.getName();
        java.lang.String str20 = pet10.getOwner();
        java.util.List<com.shop.Food> foodList21 = pet10.getFavouriteFood();
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        com.shop.Pet pet28 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList26);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList26);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str4, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(foodList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pet [name=null, age=-1, owner=null, favouriteFood=null]" + "'", str20, "Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList21);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.shop.Pet pet3 = new com.shop.Pet();
        pet3.setAge((java.lang.Integer) 100);
        pet3.setAge((java.lang.Integer) 10);
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        com.shop.Pet pet14 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList12);
        pet3.setFavouriteFood((java.util.List<com.shop.Food>) foodList12);
        pet3.setAge((java.lang.Integer) 0);
        com.shop.Pet pet18 = new com.shop.Pet();
        pet18.setAge((java.lang.Integer) 100);
        pet18.setOwner("");
        java.lang.String str23 = pet18.getOwner();
        java.lang.String str24 = pet18.getName();
        java.lang.String str25 = pet18.getName();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        java.util.List<com.shop.Food> foodList33 = pet32.getFavouriteFood();
        pet18.setFavouriteFood(foodList33);
        pet3.setFavouriteFood(foodList33);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=Pet [name=null, age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]], age=1, owner=Pet [name=null, age=100, owner=, favouriteFood=[]], favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=10, owner=hi!, favouriteFood=[]]", foodList33);
        pet36.setOwner("Pet [name=Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]], age=100, owner=Pet [name=, age=0, owner=, favouriteFood=[]], favouriteFood=[]]");
        pet36.setAge((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodList33);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        com.shop.Pet pet6 = new com.shop.Pet();
        pet6.setAge((java.lang.Integer) 100);
        pet6.setOwner("");
        java.lang.String str11 = pet6.getOwner();
        java.lang.String str12 = pet6.getName();
        java.lang.String str13 = pet6.getName();
        com.shop.Food[] foodArray17 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList18 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList18, foodArray17);
        com.shop.Pet pet20 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList18);
        java.util.List<com.shop.Food> foodList21 = pet20.getFavouriteFood();
        pet6.setFavouriteFood(foodList21);
        pet0.setFavouriteFood(foodList21);
        java.util.List<com.shop.Food> foodList24 = null;
        pet0.setFavouriteFood(foodList24);
        pet0.setOwner("Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]]");
        java.lang.String str28 = pet0.toString();
        pet0.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pet [name=null, age=100, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]" + "'", str28, "Pet [name=null, age=100, owner=Pet [name=Pet [name=null, age=100, owner=hi!, favouriteFood=null], age=1, owner=hi!, favouriteFood=[]], favouriteFood=null]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.util.List<com.shop.Food> foodList5 = pet0.getFavouriteFood();
        java.lang.String str6 = pet0.getOwner();
        java.lang.String str7 = pet0.getOwner();
        pet0.setName("Pet [name=null, age=100, owner=Pet [name=hi!, age=10, owner=null, favouriteFood=[]], favouriteFood=null]");
        org.junit.Assert.assertNull(foodList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        com.shop.Pet pet13 = new com.shop.Pet();
        pet13.setAge((java.lang.Integer) 100);
        pet13.setOwner("");
        java.lang.String str18 = pet13.getOwner();
        java.util.List<com.shop.Food> foodList19 = pet13.getFavouriteFood();
        pet13.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.String str22 = pet13.getName();
        java.lang.String str23 = pet13.getName();
        com.shop.Food[] foodArray30 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList31 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList31, foodArray30);
        com.shop.Pet pet33 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Pet pet34 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Food[] foodArray50 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList51 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList51, foodArray50);
        com.shop.Pet pet53 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList51);
        com.shop.Pet pet54 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList51);
        com.shop.Pet pet55 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList51);
        com.shop.Pet pet56 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList51);
        com.shop.Pet pet57 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList51);
        pet34.setFavouriteFood((java.util.List<com.shop.Food>) foodList51);
        java.util.List<com.shop.Food> foodList59 = pet34.getFavouriteFood();
        pet13.setFavouriteFood(foodList59);
        pet0.setFavouriteFood(foodList59);
        java.util.List<com.shop.Food> foodList62 = pet0.getFavouriteFood();
        java.lang.Class<?> wildcardClass63 = pet0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(foodList19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(foodArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(foodArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(foodList59);
        org.junit.Assert.assertNotNull(foodList62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.List<com.shop.Food> foodList3 = null;
        com.shop.Pet pet4 = new com.shop.Pet("Pet [name=Pet [name=null, age=1, owner=Pet [name=hi!, age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null], favouriteFood=null], age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) 1, "Pet [name=, age=0, owner=, favouriteFood=[]]", foodList3);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.shop.Food[] foodArray9 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList10 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList10, foodArray9);
        com.shop.Pet pet12 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet13 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList10);
        com.shop.Pet pet14 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "hi!", (java.util.List<com.shop.Food>) foodList10);
        pet14.setAge((java.lang.Integer) 1);
        pet14.setAge((java.lang.Integer) (-1));
        pet14.setOwner("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=100, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=null]");
        org.junit.Assert.assertNotNull(foodArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setName("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        pet0.setAge((java.lang.Integer) (-1));
        pet0.setName("Pet [name=, age=1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("hi!", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        com.shop.Pet pet29 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet30 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet31 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList27);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList27);
        pet10.setFavouriteFood((java.util.List<com.shop.Food>) foodList27);
        java.util.List<com.shop.Food> foodList35 = pet10.getFavouriteFood();
        pet10.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.lang.Class<?> wildcardClass38 = pet10.getClass();
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodList35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.shop.Pet pet0 = new com.shop.Pet();
        pet0.setAge((java.lang.Integer) 100);
        pet0.setOwner("");
        java.lang.String str5 = pet0.getOwner();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        pet0.setOwner("Pet [name=null, age=-1, owner=null, favouriteFood=null]");
        java.util.List<com.shop.Food> foodList9 = pet0.getFavouriteFood();
        pet0.setOwner("hi!");
        java.lang.String str12 = pet0.toString();
        java.lang.String str13 = pet0.getName();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Pet pet32 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet33 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet34 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet35 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList30);
        com.shop.Pet pet36 = new com.shop.Pet("Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.lang.Integer) 10, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]", (java.util.List<com.shop.Food>) foodList30);
        pet0.setFavouriteFood((java.util.List<com.shop.Food>) foodList30);
        pet0.setAge((java.lang.Integer) 1);
        java.lang.String str40 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(foodList6);
        org.junit.Assert.assertNull(foodList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pet [name=null, age=100, owner=hi!, favouriteFood=null]" + "'", str12, "Pet [name=null, age=100, owner=hi!, favouriteFood=null]");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pet [name=null, age=1, owner=hi!, favouriteFood=[]]" + "'", str40, "Pet [name=null, age=1, owner=hi!, favouriteFood=[]]");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.shop.Pet pet0 = new com.shop.Pet();
        java.lang.String str1 = pet0.toString();
        pet0.setOwner("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList4 = pet0.getFavouriteFood();
        java.lang.Integer int5 = pet0.getAge();
        java.util.List<com.shop.Food> foodList6 = pet0.getFavouriteFood();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pet [name=null, age=null, owner=null, favouriteFood=null]" + "'", str1, "Pet [name=null, age=null, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(foodList6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Pet pet9 = new com.shop.Pet("hi!", (java.lang.Integer) 100, "hi!", (java.util.List<com.shop.Food>) foodList7);
        com.shop.Pet pet10 = new com.shop.Pet("Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=-1, owner=null, favouriteFood=null], favouriteFood=[]]", (java.lang.Integer) (-1), "Pet [name=Pet [name=null, age=-1, owner=null, favouriteFood=null], age=-1, owner=Pet [name=null, age=100, owner=null, favouriteFood=null], favouriteFood=null]", (java.util.List<com.shop.Food>) foodList7);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        com.shop.Pet pet15 = new com.shop.Pet("", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet16 = new com.shop.Pet("Pet [name=null, age=-1, owner=null, favouriteFood=null]", (java.lang.Integer) (-1), "hi!", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet17 = new com.shop.Pet("hi!", (java.lang.Integer) 10, "", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet pet18 = new com.shop.Pet("", (java.lang.Integer) 1, "hi!", (java.util.List<com.shop.Food>) foodList13);
        java.lang.String str19 = pet18.getOwner();
        pet18.setName("Pet [name=null, age=100, owner=null, favouriteFood=null]");
        pet18.setAge((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.shop.Pet pet0 = new com.shop.Pet();
        java.lang.String str1 = pet0.toString();
        pet0.setOwner("Pet [name=, age=100, owner=Pet [name=null, age=100, owner=hi!, favouriteFood=null], favouriteFood=[]]");
        java.util.List<com.shop.Food> foodList4 = pet0.getFavouriteFood();
        java.lang.Integer int5 = pet0.getAge();
        java.lang.Integer int6 = pet0.getAge();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Pet [name=null, age=null, owner=null, favouriteFood=null]" + "'", str1, "Pet [name=null, age=null, owner=null, favouriteFood=null]");
        org.junit.Assert.assertNull(foodList4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }
}

