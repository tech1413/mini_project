package com.shop.test.bb;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.shop.Food;
import com.shop.Owner;
import com.shop.Pet;
import com.shop.SystemFeature;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionSystem {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        java.util.List<com.shop.Food> foodList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = systemFeature0.checkFoodNameExist("hi!", foodList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray1 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList2 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList2, ownerArray1);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList2);
        java.lang.Class<?> wildcardClass5 = ownerList2.getClass();
        org.junit.Assert.assertNotNull(ownerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        java.lang.Class<?> wildcardClass1 = systemFeature0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner owner1 = null;
        com.shop.Pet pet2 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner1, pet2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner[] ownerArray7 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList8 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList8, ownerArray7);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList8);
        boolean boolean11 = systemFeature0.checkOwnerNameExist("", (java.util.List<com.shop.Owner>) ownerList8);
        com.shop.Owner owner12 = null;
        com.shop.Pet pet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner12, pet13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        java.lang.Class<?> wildcardClass6 = foodList3.getClass();
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.Owner owner10 = null;
        com.shop.Pet pet11 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner10, pet11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray1 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList2 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList2, ownerArray1);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList2);
        com.shop.Owner[] ownerArray5 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList6 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList6, ownerArray5);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList6);
        com.shop.Owner owner9 = null;
        com.shop.Pet pet10 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner9, pet10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ownerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ownerArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        java.lang.Class<?> wildcardClass10 = petList7.getClass();
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.Food[] foodArray10 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList11 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList11, foodArray10);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList11);
        java.util.List<com.shop.Owner> ownerList14 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.printOwnerList(ownerList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.Owner owner23 = null;
        com.shop.Pet pet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner23, pet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        java.lang.Class<?> wildcardClass8 = systemFeature0.getClass();
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        boolean boolean28 = systemFeature23.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet[] petArray29 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList30 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList30, petArray29);
        systemFeature23.printPetList((java.util.List<com.shop.Pet>) petList30);
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList34);
        com.shop.SystemFeature systemFeature37 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        boolean boolean42 = systemFeature37.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food43 = systemFeature23.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food44 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.SystemFeature systemFeature45 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray46 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList47 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList47, ownerArray46);
        systemFeature45.printOwnerList((java.util.List<com.shop.Owner>) ownerList47);
        com.shop.Owner[] ownerArray50 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList51 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList51, ownerArray50);
        systemFeature45.printOwnerList((java.util.List<com.shop.Owner>) ownerList51);
        com.shop.SystemFeature systemFeature56 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray58 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList59 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList59, foodArray58);
        boolean boolean61 = systemFeature56.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList59);
        com.shop.SystemFeature systemFeature64 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature66 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray67 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList68 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList68, ownerArray67);
        systemFeature66.printOwnerList((java.util.List<com.shop.Owner>) ownerList68);
        com.shop.Owner owner71 = systemFeature64.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList68);
        com.shop.SystemFeature systemFeature72 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray74 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList75 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList75, foodArray74);
        boolean boolean77 = systemFeature72.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList75);
        systemFeature56.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList68, (java.util.List<com.shop.Food>) foodList75);
        com.shop.SystemFeature systemFeature79 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray81 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList82 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList82, foodArray81);
        boolean boolean84 = systemFeature79.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList82);
        com.shop.Pet[] petArray85 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList86 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList86, petArray85);
        systemFeature79.printPetList((java.util.List<com.shop.Pet>) petList86);
        com.shop.Food[] foodArray89 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList90 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList90, foodArray89);
        systemFeature79.printFoodList((java.util.List<com.shop.Food>) foodList90);
        systemFeature45.addFoodToOwnerBasketByName("", "hi!", (java.util.List<com.shop.Owner>) ownerList68, (java.util.List<com.shop.Food>) foodList90);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList90);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(petArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(food43);
        org.junit.Assert.assertNull(food44);
        org.junit.Assert.assertNotNull(ownerArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(ownerArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(foodArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(ownerArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(owner71);
        org.junit.Assert.assertNotNull(foodArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(foodArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(petArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(foodArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.Food[] foodArray10 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList11 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList11, foodArray10);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList11);
        java.lang.Class<?> wildcardClass14 = systemFeature0.getClass();
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        boolean boolean28 = systemFeature23.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet[] petArray29 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList30 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList30, petArray29);
        systemFeature23.printPetList((java.util.List<com.shop.Pet>) petList30);
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList34);
        com.shop.SystemFeature systemFeature37 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        boolean boolean42 = systemFeature37.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food43 = systemFeature23.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food44 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.SystemFeature systemFeature46 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray48 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList49 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList49, foodArray48);
        boolean boolean51 = systemFeature46.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet[] petArray52 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList53 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList53, petArray52);
        systemFeature46.printPetList((java.util.List<com.shop.Pet>) petList53);
        com.shop.SystemFeature systemFeature56 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray58 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList59 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList59, foodArray58);
        boolean boolean61 = systemFeature56.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList59);
        com.shop.Pet[] petArray62 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList63 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList63, petArray62);
        systemFeature56.printPetList((java.util.List<com.shop.Pet>) petList63);
        systemFeature46.printPetList((java.util.List<com.shop.Pet>) petList63);
        com.shop.Pet pet67 = systemFeature0.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList63);
        com.shop.SystemFeature systemFeature69 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature71 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray72 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList73 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList73, ownerArray72);
        systemFeature71.printOwnerList((java.util.List<com.shop.Owner>) ownerList73);
        com.shop.Owner owner76 = systemFeature69.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList73);
        com.shop.Owner[] ownerArray78 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList79 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList79, ownerArray78);
        boolean boolean81 = systemFeature69.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList79);
        com.shop.Pet[] petArray83 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList84 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList84, petArray83);
        boolean boolean86 = systemFeature69.checkPetNameExist("hi!", (java.util.List<com.shop.Pet>) petList84);
        boolean boolean87 = systemFeature0.checkPetNameExist("", (java.util.List<com.shop.Pet>) petList84);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(petArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(food43);
        org.junit.Assert.assertNull(food44);
        org.junit.Assert.assertNotNull(foodArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(petArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(foodArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(petArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(pet67);
        org.junit.Assert.assertNotNull(ownerArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(owner76);
        org.junit.Assert.assertNotNull(ownerArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(petArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray1 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList2 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList2, ownerArray1);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList2);
        com.shop.Owner[] ownerArray5 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList6 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList6, ownerArray5);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList6);
        com.shop.SystemFeature systemFeature9 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray11 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList12 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList12, foodArray11);
        boolean boolean14 = systemFeature9.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList12);
        com.shop.SystemFeature systemFeature17 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature19 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray20 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList21 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList21, ownerArray20);
        systemFeature19.printOwnerList((java.util.List<com.shop.Owner>) ownerList21);
        com.shop.Owner owner24 = systemFeature17.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList21);
        com.shop.SystemFeature systemFeature25 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray27 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList28 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList28, foodArray27);
        boolean boolean30 = systemFeature25.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList28);
        systemFeature9.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList21, (java.util.List<com.shop.Food>) foodList28);
        com.shop.SystemFeature systemFeature32 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray34 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList35 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList35, foodArray34);
        boolean boolean37 = systemFeature32.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList35);
        com.shop.Pet[] petArray38 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList39 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList39, petArray38);
        systemFeature32.printPetList((java.util.List<com.shop.Pet>) petList39);
        com.shop.Food[] foodArray42 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList43 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList43, foodArray42);
        systemFeature32.printFoodList((java.util.List<com.shop.Food>) foodList43);
        com.shop.SystemFeature systemFeature46 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray48 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList49 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList49, foodArray48);
        boolean boolean51 = systemFeature46.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Food food52 = systemFeature32.getFoodInstance((java.util.List<com.shop.Food>) foodList49);
        com.shop.Food food53 = systemFeature9.getFoodInstance((java.util.List<com.shop.Food>) foodList49);
        com.shop.SystemFeature systemFeature55 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray56 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList57 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList57, ownerArray56);
        systemFeature55.printOwnerList((java.util.List<com.shop.Owner>) ownerList57);
        com.shop.SystemFeature systemFeature60 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray61 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList62 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList62, foodArray61);
        com.shop.Food food64 = systemFeature60.getFoodInstance((java.util.List<com.shop.Food>) foodList62);
        systemFeature55.printFoodList((java.util.List<com.shop.Food>) foodList62);
        com.shop.Food food66 = systemFeature9.getFoodInstanceByFoodName("hi!", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Food food67 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList62);
        org.junit.Assert.assertNotNull(ownerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ownerArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(foodArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ownerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(owner24);
        org.junit.Assert.assertNotNull(foodArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(foodArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(petArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(foodArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(foodArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(food52);
        org.junit.Assert.assertNull(food53);
        org.junit.Assert.assertNotNull(ownerArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(foodArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(food64);
        org.junit.Assert.assertNull(food66);
        org.junit.Assert.assertNull(food67);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        boolean boolean28 = systemFeature23.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet[] petArray29 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList30 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList30, petArray29);
        systemFeature23.printPetList((java.util.List<com.shop.Pet>) petList30);
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList34);
        com.shop.SystemFeature systemFeature37 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        boolean boolean42 = systemFeature37.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food43 = systemFeature23.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food44 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.SystemFeature systemFeature46 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray48 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList49 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList49, foodArray48);
        boolean boolean51 = systemFeature46.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList49);
        com.shop.Pet[] petArray52 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList53 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList53, petArray52);
        systemFeature46.printPetList((java.util.List<com.shop.Pet>) petList53);
        com.shop.SystemFeature systemFeature56 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray58 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList59 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList59, foodArray58);
        boolean boolean61 = systemFeature56.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList59);
        com.shop.Pet[] petArray62 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList63 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList63, petArray62);
        systemFeature56.printPetList((java.util.List<com.shop.Pet>) petList63);
        systemFeature46.printPetList((java.util.List<com.shop.Pet>) petList63);
        com.shop.Pet pet67 = systemFeature0.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList63);
        com.shop.Owner owner68 = null;
        com.shop.Pet pet69 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner68, pet69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(petArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(food43);
        org.junit.Assert.assertNull(food44);
        org.junit.Assert.assertNotNull(foodArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(petArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(foodArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(petArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(pet67);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.SystemFeature systemFeature11 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray13 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList14 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList14, foodArray13);
        boolean boolean16 = systemFeature11.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList14);
        com.shop.Pet[] petArray17 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList18 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList18, petArray17);
        systemFeature11.printPetList((java.util.List<com.shop.Pet>) petList18);
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        systemFeature11.printFoodList((java.util.List<com.shop.Food>) foodList22);
        com.shop.SystemFeature systemFeature25 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray27 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList28 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList28, foodArray27);
        boolean boolean30 = systemFeature25.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList28);
        com.shop.Food food31 = systemFeature11.getFoodInstance((java.util.List<com.shop.Food>) foodList28);
        boolean boolean32 = systemFeature0.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList28);
        com.shop.SystemFeature systemFeature34 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray35 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList36 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList36, foodArray35);
        com.shop.Food food38 = systemFeature34.getFoodInstance((java.util.List<com.shop.Food>) foodList36);
        boolean boolean39 = systemFeature0.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList36);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(petArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(foodArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(food31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(foodArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(food38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.Food[] foodArray10 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList11 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList11, foodArray10);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList11);
        com.shop.Owner owner14 = null;
        com.shop.Pet pet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner14, pet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature24 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray26 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList27 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList27, foodArray26);
        boolean boolean29 = systemFeature24.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList27);
        com.shop.SystemFeature systemFeature32 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature34 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray35 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList36 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList36, ownerArray35);
        systemFeature34.printOwnerList((java.util.List<com.shop.Owner>) ownerList36);
        com.shop.Owner owner39 = systemFeature32.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList36);
        com.shop.SystemFeature systemFeature40 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray42 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList43 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList43, foodArray42);
        boolean boolean45 = systemFeature40.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList43);
        systemFeature24.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList36, (java.util.List<com.shop.Food>) foodList43);
        com.shop.SystemFeature systemFeature47 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature49 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray50 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList51 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList51, ownerArray50);
        systemFeature49.printOwnerList((java.util.List<com.shop.Owner>) ownerList51);
        com.shop.Owner owner54 = systemFeature47.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList51);
        com.shop.Owner[] ownerArray56 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList57 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList57, ownerArray56);
        boolean boolean59 = systemFeature47.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList57);
        com.shop.Pet[] petArray61 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList62 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList62, petArray61);
        boolean boolean64 = systemFeature47.checkPetNameExist("hi!", (java.util.List<com.shop.Pet>) petList62);
        systemFeature24.printPetList((java.util.List<com.shop.Pet>) petList62);
        com.shop.Pet pet66 = systemFeature0.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList62);
        com.shop.SystemFeature systemFeature68 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray69 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList70 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList70, ownerArray69);
        systemFeature68.printOwnerList((java.util.List<com.shop.Owner>) ownerList70);
        com.shop.Owner owner73 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList70);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ownerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(owner39);
        org.junit.Assert.assertNotNull(foodArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(ownerArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(owner54);
        org.junit.Assert.assertNotNull(ownerArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(petArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(pet66);
        org.junit.Assert.assertNotNull(ownerArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(owner73);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.SystemFeature systemFeature9 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray10 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList11 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList11, ownerArray10);
        systemFeature9.printOwnerList((java.util.List<com.shop.Owner>) ownerList11);
        com.shop.Owner[] ownerArray14 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList15 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList15, ownerArray14);
        systemFeature9.printOwnerList((java.util.List<com.shop.Owner>) ownerList15);
        com.shop.SystemFeature systemFeature20 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray22 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList23 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList23, foodArray22);
        boolean boolean25 = systemFeature20.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList23);
        com.shop.SystemFeature systemFeature28 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature30 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray31 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList32 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList32, ownerArray31);
        systemFeature30.printOwnerList((java.util.List<com.shop.Owner>) ownerList32);
        com.shop.Owner owner35 = systemFeature28.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList32);
        com.shop.SystemFeature systemFeature36 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray38 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList39 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList39, foodArray38);
        boolean boolean41 = systemFeature36.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList39);
        systemFeature20.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList32, (java.util.List<com.shop.Food>) foodList39);
        com.shop.SystemFeature systemFeature43 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray45 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList46 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList46, foodArray45);
        boolean boolean48 = systemFeature43.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList46);
        com.shop.Pet[] petArray49 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList50 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList50, petArray49);
        systemFeature43.printPetList((java.util.List<com.shop.Pet>) petList50);
        com.shop.Food[] foodArray53 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList54 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList54, foodArray53);
        systemFeature43.printFoodList((java.util.List<com.shop.Food>) foodList54);
        systemFeature9.addFoodToOwnerBasketByName("", "hi!", (java.util.List<com.shop.Owner>) ownerList32, (java.util.List<com.shop.Food>) foodList54);
        boolean boolean58 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList54);
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(ownerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ownerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(foodArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(ownerArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(owner35);
        org.junit.Assert.assertNotNull(foodArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(foodArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(petArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(foodArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray1 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList2 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList2, ownerArray1);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList2);
        com.shop.SystemFeature systemFeature5 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Food food9 = systemFeature5.getFoodInstance((java.util.List<com.shop.Food>) foodList7);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList7);
        java.lang.Class<?> wildcardClass11 = systemFeature0.getClass();
        org.junit.Assert.assertNotNull(ownerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(food9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        boolean boolean28 = systemFeature23.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet[] petArray29 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList30 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList30, petArray29);
        systemFeature23.printPetList((java.util.List<com.shop.Pet>) petList30);
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList34);
        com.shop.SystemFeature systemFeature37 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        boolean boolean42 = systemFeature37.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food43 = systemFeature23.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food44 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.SystemFeature systemFeature46 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray47 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList48 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList48, ownerArray47);
        systemFeature46.printOwnerList((java.util.List<com.shop.Owner>) ownerList48);
        com.shop.SystemFeature systemFeature51 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray52 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList53 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList53, foodArray52);
        com.shop.Food food55 = systemFeature51.getFoodInstance((java.util.List<com.shop.Food>) foodList53);
        systemFeature46.printFoodList((java.util.List<com.shop.Food>) foodList53);
        com.shop.Food food57 = systemFeature0.getFoodInstanceByFoodName("hi!", (java.util.List<com.shop.Food>) foodList53);
        com.shop.SystemFeature systemFeature59 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray61 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList62 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList62, foodArray61);
        boolean boolean64 = systemFeature59.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Pet[] petArray65 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList66 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList66, petArray65);
        systemFeature59.printPetList((java.util.List<com.shop.Pet>) petList66);
        com.shop.SystemFeature systemFeature69 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray71 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList72 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList72, foodArray71);
        boolean boolean74 = systemFeature69.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList72);
        com.shop.Pet[] petArray75 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList76 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList76, petArray75);
        systemFeature69.printPetList((java.util.List<com.shop.Pet>) petList76);
        systemFeature59.printPetList((java.util.List<com.shop.Pet>) petList76);
        com.shop.Pet pet80 = systemFeature0.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList76);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(petArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(food43);
        org.junit.Assert.assertNull(food44);
        org.junit.Assert.assertNotNull(ownerArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(foodArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(food55);
        org.junit.Assert.assertNull(food57);
        org.junit.Assert.assertNotNull(foodArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(petArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(foodArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(petArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(pet80);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray24 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList25 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList25, ownerArray24);
        systemFeature23.printOwnerList((java.util.List<com.shop.Owner>) ownerList25);
        com.shop.SystemFeature systemFeature28 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Food food32 = systemFeature28.getFoodInstance((java.util.List<com.shop.Food>) foodList30);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList30);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList30);
        com.shop.Owner owner35 = null;
        com.shop.Pet pet36 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner35, pet36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ownerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(food32);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        boolean boolean28 = systemFeature23.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet[] petArray29 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList30 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList30, petArray29);
        systemFeature23.printPetList((java.util.List<com.shop.Pet>) petList30);
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList34);
        com.shop.SystemFeature systemFeature37 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        boolean boolean42 = systemFeature37.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food43 = systemFeature23.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food44 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.SystemFeature systemFeature46 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray47 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList48 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList48, ownerArray47);
        systemFeature46.printOwnerList((java.util.List<com.shop.Owner>) ownerList48);
        com.shop.SystemFeature systemFeature51 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray52 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList53 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList53, foodArray52);
        com.shop.Food food55 = systemFeature51.getFoodInstance((java.util.List<com.shop.Food>) foodList53);
        systemFeature46.printFoodList((java.util.List<com.shop.Food>) foodList53);
        com.shop.Food food57 = systemFeature0.getFoodInstanceByFoodName("hi!", (java.util.List<com.shop.Food>) foodList53);
        com.shop.SystemFeature systemFeature59 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray61 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList62 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList62, foodArray61);
        boolean boolean64 = systemFeature59.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList62);
        boolean boolean65 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList62);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(petArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(food43);
        org.junit.Assert.assertNull(food44);
        org.junit.Assert.assertNotNull(ownerArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(foodArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(food55);
        org.junit.Assert.assertNull(food57);
        org.junit.Assert.assertNotNull(foodArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray10 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList11 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList11, foodArray10);
        boolean boolean13 = systemFeature8.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList11);
        com.shop.Pet[] petArray14 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList15 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList15, petArray14);
        systemFeature8.printPetList((java.util.List<com.shop.Pet>) petList15);
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        systemFeature8.printFoodList((java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature22 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        boolean boolean27 = systemFeature22.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList25);
        com.shop.Food food28 = systemFeature8.getFoodInstance((java.util.List<com.shop.Food>) foodList25);
        com.shop.SystemFeature systemFeature30 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        boolean boolean35 = systemFeature30.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList33);
        com.shop.SystemFeature systemFeature38 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature40 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray41 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList42 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList42, ownerArray41);
        systemFeature40.printOwnerList((java.util.List<com.shop.Owner>) ownerList42);
        com.shop.Owner owner45 = systemFeature38.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList42);
        com.shop.SystemFeature systemFeature46 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray48 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList49 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList49, foodArray48);
        boolean boolean51 = systemFeature46.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList49);
        systemFeature30.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList42, (java.util.List<com.shop.Food>) foodList49);
        com.shop.SystemFeature systemFeature53 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray55 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList56 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList56, foodArray55);
        boolean boolean58 = systemFeature53.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList56);
        com.shop.Pet[] petArray59 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList60 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList60, petArray59);
        systemFeature53.printPetList((java.util.List<com.shop.Pet>) petList60);
        com.shop.Food[] foodArray63 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList64 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList64, foodArray63);
        systemFeature53.printFoodList((java.util.List<com.shop.Food>) foodList64);
        com.shop.SystemFeature systemFeature67 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray69 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList70 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList70, foodArray69);
        boolean boolean72 = systemFeature67.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList70);
        com.shop.Food food73 = systemFeature53.getFoodInstance((java.util.List<com.shop.Food>) foodList70);
        com.shop.Food food74 = systemFeature30.getFoodInstance((java.util.List<com.shop.Food>) foodList70);
        com.shop.SystemFeature systemFeature76 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray78 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList79 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList79, foodArray78);
        boolean boolean81 = systemFeature76.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList79);
        com.shop.Pet[] petArray82 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList83 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList83, petArray82);
        systemFeature76.printPetList((java.util.List<com.shop.Pet>) petList83);
        com.shop.SystemFeature systemFeature86 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray88 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList89 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList89, foodArray88);
        boolean boolean91 = systemFeature86.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList89);
        com.shop.Pet[] petArray92 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList93 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList93, petArray92);
        systemFeature86.printPetList((java.util.List<com.shop.Pet>) petList93);
        systemFeature76.printPetList((java.util.List<com.shop.Pet>) petList93);
        com.shop.Pet pet97 = systemFeature30.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList93);
        com.shop.Pet pet98 = systemFeature8.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList93);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList93);
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(foodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(petArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(food28);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(ownerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(owner45);
        org.junit.Assert.assertNotNull(foodArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(foodArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(petArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(foodArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(foodArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(food73);
        org.junit.Assert.assertNull(food74);
        org.junit.Assert.assertNotNull(foodArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(petArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(foodArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(petArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(pet97);
        org.junit.Assert.assertNull(pet98);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray25 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList26 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList26, foodArray25);
        boolean boolean28 = systemFeature23.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList26);
        com.shop.Pet[] petArray29 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList30 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList30, petArray29);
        systemFeature23.printPetList((java.util.List<com.shop.Pet>) petList30);
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList34);
        com.shop.SystemFeature systemFeature37 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray39 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList40 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList40, foodArray39);
        boolean boolean42 = systemFeature37.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food43 = systemFeature23.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.Food food44 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList40);
        com.shop.SystemFeature systemFeature46 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray47 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList48 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList48, ownerArray47);
        systemFeature46.printOwnerList((java.util.List<com.shop.Owner>) ownerList48);
        com.shop.Owner[] ownerArray51 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList52 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList52, ownerArray51);
        systemFeature46.printOwnerList((java.util.List<com.shop.Owner>) ownerList52);
        boolean boolean55 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList52);
        com.shop.Owner owner56 = null;
        com.shop.Pet pet57 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner56, pet57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(petArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(foodArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(food43);
        org.junit.Assert.assertNull(food44);
        org.junit.Assert.assertNotNull(ownerArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(ownerArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        java.util.List<com.shop.Owner> ownerList11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.shop.Owner owner12 = systemFeature0.getOwnerInstanceByName("hi!", ownerList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        boolean boolean15 = systemFeature10.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet[] petArray16 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList17 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList17, petArray16);
        systemFeature10.printPetList((java.util.List<com.shop.Pet>) petList17);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList17);
        com.shop.SystemFeature systemFeature22 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature24 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray25 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList26 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList26, ownerArray25);
        systemFeature24.printOwnerList((java.util.List<com.shop.Owner>) ownerList26);
        com.shop.Owner owner29 = systemFeature22.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList26);
        com.shop.Owner[] ownerArray31 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList32 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList32, ownerArray31);
        boolean boolean34 = systemFeature22.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList32);
        com.shop.Owner[] ownerArray36 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList37 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList37, ownerArray36);
        com.shop.Owner owner39 = systemFeature22.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList37);
        boolean boolean40 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList37);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(petArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ownerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(owner29);
        org.junit.Assert.assertNotNull(ownerArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(ownerArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(owner39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        boolean boolean15 = systemFeature10.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet[] petArray16 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList17 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList17, petArray16);
        systemFeature10.printPetList((java.util.List<com.shop.Pet>) petList17);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList17);
        java.lang.Class<?> wildcardClass21 = systemFeature0.getClass();
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(petArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner[] ownerArray9 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList10 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList10, ownerArray9);
        boolean boolean12 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList10);
        com.shop.Owner[] ownerArray14 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList15 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList15, ownerArray14);
        com.shop.Owner owner17 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList15);
        com.shop.SystemFeature systemFeature19 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature21 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray22 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList23 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList23, ownerArray22);
        systemFeature21.printOwnerList((java.util.List<com.shop.Owner>) ownerList23);
        com.shop.Owner[] ownerArray26 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList27 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList27, ownerArray26);
        systemFeature21.printOwnerList((java.util.List<com.shop.Owner>) ownerList27);
        boolean boolean30 = systemFeature19.checkOwnerNameExist("", (java.util.List<com.shop.Owner>) ownerList27);
        com.shop.Owner owner31 = systemFeature0.getOwnerInstanceByName("hi!", (java.util.List<com.shop.Owner>) ownerList27);
        com.shop.Owner owner32 = null;
        com.shop.Pet pet33 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner32, pet33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(ownerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ownerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(owner17);
        org.junit.Assert.assertNotNull(ownerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ownerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(owner31);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray1 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList2 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList2, ownerArray1);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList2);
        com.shop.Owner[] ownerArray5 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList6 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList6, ownerArray5);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList6);
        com.shop.SystemFeature systemFeature11 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray13 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList14 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList14, foodArray13);
        boolean boolean16 = systemFeature11.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList14);
        com.shop.SystemFeature systemFeature19 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature21 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray22 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList23 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList23, ownerArray22);
        systemFeature21.printOwnerList((java.util.List<com.shop.Owner>) ownerList23);
        com.shop.Owner owner26 = systemFeature19.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList23);
        com.shop.SystemFeature systemFeature27 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        boolean boolean32 = systemFeature27.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList30);
        systemFeature11.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList23, (java.util.List<com.shop.Food>) foodList30);
        com.shop.SystemFeature systemFeature34 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray36 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList37 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList37, foodArray36);
        boolean boolean39 = systemFeature34.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList37);
        com.shop.Pet[] petArray40 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList41 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList41, petArray40);
        systemFeature34.printPetList((java.util.List<com.shop.Pet>) petList41);
        com.shop.Food[] foodArray44 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList45 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList45, foodArray44);
        systemFeature34.printFoodList((java.util.List<com.shop.Food>) foodList45);
        systemFeature0.addFoodToOwnerBasketByName("", "hi!", (java.util.List<com.shop.Owner>) ownerList23, (java.util.List<com.shop.Food>) foodList45);
        com.shop.SystemFeature systemFeature49 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature51 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray52 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList53 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList53, ownerArray52);
        systemFeature51.printOwnerList((java.util.List<com.shop.Owner>) ownerList53);
        com.shop.Owner owner56 = systemFeature49.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList53);
        com.shop.Owner[] ownerArray58 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList59 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList59, ownerArray58);
        boolean boolean61 = systemFeature49.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList59);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList59);
        org.junit.Assert.assertNotNull(ownerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ownerArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(foodArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ownerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(owner26);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(foodArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(petArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(foodArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(ownerArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(owner56);
        org.junit.Assert.assertNotNull(ownerArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.SystemFeature systemFeature9 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature11 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray12 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList13 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList13, ownerArray12);
        systemFeature11.printOwnerList((java.util.List<com.shop.Owner>) ownerList13);
        com.shop.Owner owner16 = systemFeature9.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList13);
        com.shop.Owner[] ownerArray18 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList19 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList19, ownerArray18);
        boolean boolean21 = systemFeature9.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList19);
        com.shop.SystemFeature systemFeature22 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        boolean boolean27 = systemFeature22.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList25);
        com.shop.SystemFeature systemFeature30 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature32 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray33 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList34 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList34, ownerArray33);
        systemFeature32.printOwnerList((java.util.List<com.shop.Owner>) ownerList34);
        com.shop.Owner owner37 = systemFeature30.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList34);
        com.shop.SystemFeature systemFeature38 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray40 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList41 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList41, foodArray40);
        boolean boolean43 = systemFeature38.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList41);
        systemFeature22.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList34, (java.util.List<com.shop.Food>) foodList41);
        systemFeature9.printOwnerList((java.util.List<com.shop.Owner>) ownerList34);
        boolean boolean46 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList34);
        com.shop.SystemFeature systemFeature47 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray49 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList50 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList50, foodArray49);
        boolean boolean52 = systemFeature47.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList50);
        com.shop.Pet[] petArray53 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList54 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList54, petArray53);
        systemFeature47.printPetList((java.util.List<com.shop.Pet>) petList54);
        com.shop.Food[] foodArray57 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList58 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList58, foodArray57);
        systemFeature47.printFoodList((java.util.List<com.shop.Food>) foodList58);
        com.shop.Food food61 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList58);
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(ownerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(owner16);
        org.junit.Assert.assertNotNull(ownerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ownerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(owner37);
        org.junit.Assert.assertNotNull(foodArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(foodArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(petArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(foodArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(food61);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray1 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList2 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList2, foodArray1);
        com.shop.Food food4 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList2);
        com.shop.SystemFeature systemFeature5 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray7 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList8 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList8, foodArray7);
        boolean boolean10 = systemFeature5.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList8);
        com.shop.Pet[] petArray11 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList12 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList12, petArray11);
        systemFeature5.printPetList((java.util.List<com.shop.Pet>) petList12);
        com.shop.Food[] foodArray15 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList16 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList16, foodArray15);
        systemFeature5.printFoodList((java.util.List<com.shop.Food>) foodList16);
        com.shop.SystemFeature systemFeature19 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray21 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList22 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList22, foodArray21);
        boolean boolean24 = systemFeature19.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList22);
        com.shop.Food food25 = systemFeature5.getFoodInstance((java.util.List<com.shop.Food>) foodList22);
        com.shop.SystemFeature systemFeature27 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        boolean boolean32 = systemFeature27.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList30);
        com.shop.SystemFeature systemFeature35 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature37 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray38 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList39 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList39, ownerArray38);
        systemFeature37.printOwnerList((java.util.List<com.shop.Owner>) ownerList39);
        com.shop.Owner owner42 = systemFeature35.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList39);
        com.shop.SystemFeature systemFeature43 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray45 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList46 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList46, foodArray45);
        boolean boolean48 = systemFeature43.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList46);
        systemFeature27.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList39, (java.util.List<com.shop.Food>) foodList46);
        com.shop.SystemFeature systemFeature50 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray52 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList53 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList53, foodArray52);
        boolean boolean55 = systemFeature50.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList53);
        com.shop.Pet[] petArray56 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList57 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList57, petArray56);
        systemFeature50.printPetList((java.util.List<com.shop.Pet>) petList57);
        com.shop.Food[] foodArray60 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList61 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList61, foodArray60);
        systemFeature50.printFoodList((java.util.List<com.shop.Food>) foodList61);
        com.shop.SystemFeature systemFeature64 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray66 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList67 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList67, foodArray66);
        boolean boolean69 = systemFeature64.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList67);
        com.shop.Food food70 = systemFeature50.getFoodInstance((java.util.List<com.shop.Food>) foodList67);
        com.shop.Food food71 = systemFeature27.getFoodInstance((java.util.List<com.shop.Food>) foodList67);
        com.shop.SystemFeature systemFeature73 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray75 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList76 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList76, foodArray75);
        boolean boolean78 = systemFeature73.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList76);
        com.shop.Pet[] petArray79 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList80 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList80, petArray79);
        systemFeature73.printPetList((java.util.List<com.shop.Pet>) petList80);
        com.shop.SystemFeature systemFeature83 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray85 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList86 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList86, foodArray85);
        boolean boolean88 = systemFeature83.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList86);
        com.shop.Pet[] petArray89 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList90 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList90, petArray89);
        systemFeature83.printPetList((java.util.List<com.shop.Pet>) petList90);
        systemFeature73.printPetList((java.util.List<com.shop.Pet>) petList90);
        com.shop.Pet pet94 = systemFeature27.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList90);
        com.shop.Pet pet95 = systemFeature5.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList90);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList90);
        org.junit.Assert.assertNotNull(foodArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(food4);
        org.junit.Assert.assertNotNull(foodArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(petArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(foodArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(food25);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(ownerArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(owner42);
        org.junit.Assert.assertNotNull(foodArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(foodArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(petArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(foodArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(foodArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(food70);
        org.junit.Assert.assertNull(food71);
        org.junit.Assert.assertNotNull(foodArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(petArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(foodArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(petArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(pet94);
        org.junit.Assert.assertNull(pet95);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray24 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList25 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList25, ownerArray24);
        systemFeature23.printOwnerList((java.util.List<com.shop.Owner>) ownerList25);
        com.shop.SystemFeature systemFeature28 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Food food32 = systemFeature28.getFoodInstance((java.util.List<com.shop.Food>) foodList30);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList30);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList30);
        com.shop.SystemFeature systemFeature35 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray36 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList37 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList37, ownerArray36);
        systemFeature35.printOwnerList((java.util.List<com.shop.Owner>) ownerList37);
        com.shop.SystemFeature systemFeature41 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray43 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList44 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList44, foodArray43);
        boolean boolean46 = systemFeature41.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList44);
        boolean boolean47 = systemFeature35.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList44);
        com.shop.SystemFeature systemFeature49 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray51 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList52 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList52, foodArray51);
        boolean boolean54 = systemFeature49.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList52);
        com.shop.SystemFeature systemFeature57 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature59 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray60 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList61 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList61, ownerArray60);
        systemFeature59.printOwnerList((java.util.List<com.shop.Owner>) ownerList61);
        com.shop.Owner owner64 = systemFeature57.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList61);
        com.shop.SystemFeature systemFeature65 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray67 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList68 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList68, foodArray67);
        boolean boolean70 = systemFeature65.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList68);
        systemFeature49.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList61, (java.util.List<com.shop.Food>) foodList68);
        com.shop.SystemFeature systemFeature74 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray75 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList76 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList76, ownerArray75);
        systemFeature74.printOwnerList((java.util.List<com.shop.Owner>) ownerList76);
        com.shop.SystemFeature systemFeature79 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray80 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList81 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList81, foodArray80);
        com.shop.Food food83 = systemFeature79.getFoodInstance((java.util.List<com.shop.Food>) foodList81);
        systemFeature49.addFoodToOwnerBasketByName("hi!", "", (java.util.List<com.shop.Owner>) ownerList76, (java.util.List<com.shop.Food>) foodList81);
        boolean boolean85 = systemFeature35.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList81);
        com.shop.SystemFeature systemFeature86 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray88 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList89 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList89, foodArray88);
        boolean boolean91 = systemFeature86.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList89);
        com.shop.Food food92 = systemFeature35.getFoodInstance((java.util.List<com.shop.Food>) foodList89);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList89);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ownerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(food32);
        org.junit.Assert.assertNotNull(ownerArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(foodArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(foodArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(ownerArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(owner64);
        org.junit.Assert.assertNotNull(foodArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(ownerArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(foodArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(food83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(foodArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(food92);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray1 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList2 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList2, ownerArray1);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList2);
        com.shop.SystemFeature systemFeature5 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Food food9 = systemFeature5.getFoodInstance((java.util.List<com.shop.Food>) foodList7);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList7);
        com.shop.SystemFeature systemFeature12 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray14 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList15 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList15, foodArray14);
        boolean boolean17 = systemFeature12.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList15);
        com.shop.SystemFeature systemFeature20 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature22 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray23 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList24 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList24, ownerArray23);
        systemFeature22.printOwnerList((java.util.List<com.shop.Owner>) ownerList24);
        com.shop.Owner owner27 = systemFeature20.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList24);
        com.shop.SystemFeature systemFeature28 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray30 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList31 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList31, foodArray30);
        boolean boolean33 = systemFeature28.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList31);
        systemFeature12.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList24, (java.util.List<com.shop.Food>) foodList31);
        boolean boolean35 = systemFeature0.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Pet[] petArray37 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList38 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList38, petArray37);
        com.shop.Pet pet40 = systemFeature0.getPetInstanceByPetName("", (java.util.List<com.shop.Pet>) petList38);
        com.shop.SystemFeature systemFeature43 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature45 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray46 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList47 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList47, ownerArray46);
        systemFeature45.printOwnerList((java.util.List<com.shop.Owner>) ownerList47);
        com.shop.Owner owner50 = systemFeature43.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList47);
        com.shop.Owner[] ownerArray52 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList53 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList53, ownerArray52);
        boolean boolean55 = systemFeature43.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList53);
        com.shop.Owner[] ownerArray57 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList58 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList58, ownerArray57);
        com.shop.Owner owner60 = systemFeature43.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList58);
        com.shop.SystemFeature systemFeature61 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray63 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList64 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList64, foodArray63);
        boolean boolean66 = systemFeature61.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList64);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "", (java.util.List<com.shop.Owner>) ownerList58, (java.util.List<com.shop.Food>) foodList64);
        org.junit.Assert.assertNotNull(ownerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(food9);
        org.junit.Assert.assertNotNull(foodArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ownerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(owner27);
        org.junit.Assert.assertNotNull(foodArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(petArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(pet40);
        org.junit.Assert.assertNotNull(ownerArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(owner50);
        org.junit.Assert.assertNotNull(ownerArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(ownerArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(owner60);
        org.junit.Assert.assertNotNull(foodArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray12 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList13 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList13, foodArray12);
        boolean boolean15 = systemFeature10.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList13);
        com.shop.Pet[] petArray16 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList17 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList17, petArray16);
        systemFeature10.printPetList((java.util.List<com.shop.Pet>) petList17);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList17);
        com.shop.SystemFeature systemFeature22 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        boolean boolean27 = systemFeature22.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList25);
        com.shop.SystemFeature systemFeature30 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature32 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray33 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList34 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList34, ownerArray33);
        systemFeature32.printOwnerList((java.util.List<com.shop.Owner>) ownerList34);
        com.shop.Owner owner37 = systemFeature30.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList34);
        com.shop.SystemFeature systemFeature38 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray40 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList41 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList41, foodArray40);
        boolean boolean43 = systemFeature38.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList41);
        systemFeature22.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList34, (java.util.List<com.shop.Food>) foodList41);
        com.shop.SystemFeature systemFeature45 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature47 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray48 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList49 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList49, ownerArray48);
        systemFeature47.printOwnerList((java.util.List<com.shop.Owner>) ownerList49);
        com.shop.Owner owner52 = systemFeature45.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList49);
        com.shop.Owner[] ownerArray54 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList55 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList55, ownerArray54);
        boolean boolean57 = systemFeature45.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList55);
        com.shop.Pet[] petArray59 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList60 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList60, petArray59);
        boolean boolean62 = systemFeature45.checkPetNameExist("hi!", (java.util.List<com.shop.Pet>) petList60);
        systemFeature22.printPetList((java.util.List<com.shop.Pet>) petList60);
        com.shop.Pet pet64 = systemFeature0.getPetInstanceByPetName("", (java.util.List<com.shop.Pet>) petList60);
        com.shop.SystemFeature systemFeature66 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray68 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList69 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList69, foodArray68);
        boolean boolean71 = systemFeature66.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList69);
        com.shop.Pet[] petArray72 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList73 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList73, petArray72);
        systemFeature66.printPetList((java.util.List<com.shop.Pet>) petList73);
        com.shop.Pet pet76 = systemFeature0.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList73);
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(petArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ownerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(owner37);
        org.junit.Assert.assertNotNull(foodArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(ownerArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(owner52);
        org.junit.Assert.assertNotNull(ownerArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(petArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(pet64);
        org.junit.Assert.assertNotNull(foodArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(petArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(pet76);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner[] ownerArray9 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList10 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList10, ownerArray9);
        boolean boolean12 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList10);
        com.shop.Owner[] ownerArray14 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList15 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList15, ownerArray14);
        com.shop.Owner owner17 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList15);
        com.shop.SystemFeature systemFeature18 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray19 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList20 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList20, foodArray19);
        com.shop.Food food22 = systemFeature18.getFoodInstance((java.util.List<com.shop.Food>) foodList20);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList20);
        java.lang.Class<?> wildcardClass24 = systemFeature0.getClass();
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(ownerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ownerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(owner17);
        org.junit.Assert.assertNotNull(foodArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(food22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray1 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList2 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList2, ownerArray1);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList2);
        com.shop.SystemFeature systemFeature5 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray6 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList7 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList7, foodArray6);
        com.shop.Food food9 = systemFeature5.getFoodInstance((java.util.List<com.shop.Food>) foodList7);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList7);
        com.shop.SystemFeature systemFeature12 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray14 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList15 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList15, foodArray14);
        boolean boolean17 = systemFeature12.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList15);
        com.shop.SystemFeature systemFeature20 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature22 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray23 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList24 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList24, ownerArray23);
        systemFeature22.printOwnerList((java.util.List<com.shop.Owner>) ownerList24);
        com.shop.Owner owner27 = systemFeature20.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList24);
        com.shop.SystemFeature systemFeature28 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray30 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList31 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList31, foodArray30);
        boolean boolean33 = systemFeature28.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList31);
        systemFeature12.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList24, (java.util.List<com.shop.Food>) foodList31);
        boolean boolean35 = systemFeature0.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList31);
        com.shop.Owner owner36 = null;
        com.shop.Pet pet37 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner36, pet37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ownerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(foodArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(food9);
        org.junit.Assert.assertNotNull(foodArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ownerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(owner27);
        org.junit.Assert.assertNotNull(foodArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray1 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList2 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList2, ownerArray1);
        systemFeature0.printOwnerList((java.util.List<com.shop.Owner>) ownerList2);
        com.shop.SystemFeature systemFeature6 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray8 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList9 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList9, foodArray8);
        boolean boolean11 = systemFeature6.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList9);
        boolean boolean12 = systemFeature0.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList9);
        com.shop.SystemFeature systemFeature14 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        boolean boolean19 = systemFeature14.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList17);
        com.shop.SystemFeature systemFeature22 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature24 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray25 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList26 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList26, ownerArray25);
        systemFeature24.printOwnerList((java.util.List<com.shop.Owner>) ownerList26);
        com.shop.Owner owner29 = systemFeature22.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList26);
        com.shop.SystemFeature systemFeature30 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray32 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList33 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList33, foodArray32);
        boolean boolean35 = systemFeature30.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList33);
        systemFeature14.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList26, (java.util.List<com.shop.Food>) foodList33);
        com.shop.SystemFeature systemFeature39 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray40 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList41 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList41, ownerArray40);
        systemFeature39.printOwnerList((java.util.List<com.shop.Owner>) ownerList41);
        com.shop.SystemFeature systemFeature44 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray45 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList46 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList46, foodArray45);
        com.shop.Food food48 = systemFeature44.getFoodInstance((java.util.List<com.shop.Food>) foodList46);
        systemFeature14.addFoodToOwnerBasketByName("hi!", "", (java.util.List<com.shop.Owner>) ownerList41, (java.util.List<com.shop.Food>) foodList46);
        boolean boolean50 = systemFeature0.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList46);
        com.shop.SystemFeature systemFeature52 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature54 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray55 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList56 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList56, ownerArray55);
        systemFeature54.printOwnerList((java.util.List<com.shop.Owner>) ownerList56);
        com.shop.Owner[] ownerArray59 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList60 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList60, ownerArray59);
        systemFeature54.printOwnerList((java.util.List<com.shop.Owner>) ownerList60);
        boolean boolean63 = systemFeature52.checkOwnerNameExist("", (java.util.List<com.shop.Owner>) ownerList60);
        com.shop.Owner owner64 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList60);
        org.junit.Assert.assertNotNull(ownerArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(foodArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ownerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(owner29);
        org.junit.Assert.assertNotNull(foodArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(ownerArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(foodArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(food48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(ownerArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(ownerArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(owner64);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner[] ownerArray9 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList10 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList10, ownerArray9);
        boolean boolean12 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList10);
        com.shop.Pet[] petArray14 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList15 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList15, petArray14);
        boolean boolean17 = systemFeature0.checkPetNameExist("hi!", (java.util.List<com.shop.Pet>) petList15);
        com.shop.SystemFeature systemFeature18 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        boolean boolean23 = systemFeature18.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList21);
        com.shop.SystemFeature systemFeature26 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature28 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray29 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList30 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList30, ownerArray29);
        systemFeature28.printOwnerList((java.util.List<com.shop.Owner>) ownerList30);
        com.shop.Owner owner33 = systemFeature26.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList30);
        com.shop.SystemFeature systemFeature34 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray36 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList37 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList37, foodArray36);
        boolean boolean39 = systemFeature34.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList37);
        systemFeature18.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList30, (java.util.List<com.shop.Food>) foodList37);
        com.shop.Food food41 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList37);
        com.shop.SystemFeature systemFeature43 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray44 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList45 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList45, ownerArray44);
        systemFeature43.printOwnerList((java.util.List<com.shop.Owner>) ownerList45);
        com.shop.Owner[] ownerArray48 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList49 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList49, ownerArray48);
        systemFeature43.printOwnerList((java.util.List<com.shop.Owner>) ownerList49);
        com.shop.SystemFeature systemFeature54 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray56 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList57 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList57, foodArray56);
        boolean boolean59 = systemFeature54.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList57);
        com.shop.SystemFeature systemFeature62 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature64 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray65 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList66 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList66, ownerArray65);
        systemFeature64.printOwnerList((java.util.List<com.shop.Owner>) ownerList66);
        com.shop.Owner owner69 = systemFeature62.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList66);
        com.shop.SystemFeature systemFeature70 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray72 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList73 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList73, foodArray72);
        boolean boolean75 = systemFeature70.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList73);
        systemFeature54.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList66, (java.util.List<com.shop.Food>) foodList73);
        com.shop.SystemFeature systemFeature77 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray79 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList80 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList80, foodArray79);
        boolean boolean82 = systemFeature77.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList80);
        com.shop.Pet[] petArray83 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList84 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList84, petArray83);
        systemFeature77.printPetList((java.util.List<com.shop.Pet>) petList84);
        com.shop.Food[] foodArray87 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList88 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList88, foodArray87);
        systemFeature77.printFoodList((java.util.List<com.shop.Food>) foodList88);
        systemFeature43.addFoodToOwnerBasketByName("", "hi!", (java.util.List<com.shop.Owner>) ownerList66, (java.util.List<com.shop.Food>) foodList88);
        boolean boolean92 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList66);
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(ownerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(petArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ownerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(owner33);
        org.junit.Assert.assertNotNull(foodArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(food41);
        org.junit.Assert.assertNotNull(ownerArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(ownerArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(foodArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(ownerArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(owner69);
        org.junit.Assert.assertNotNull(foodArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(foodArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(petArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(foodArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.Pet[] petArray6 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList7 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList7, petArray6);
        systemFeature0.printPetList((java.util.List<com.shop.Pet>) petList7);
        com.shop.Food[] foodArray10 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList11 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList11, foodArray10);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList11);
        com.shop.SystemFeature systemFeature14 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray16 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList17 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList17, foodArray16);
        boolean boolean19 = systemFeature14.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList17);
        com.shop.Food food20 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList17);
        com.shop.SystemFeature systemFeature22 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray24 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList25 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList25, foodArray24);
        boolean boolean27 = systemFeature22.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList25);
        com.shop.SystemFeature systemFeature30 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature32 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray33 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList34 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList34, ownerArray33);
        systemFeature32.printOwnerList((java.util.List<com.shop.Owner>) ownerList34);
        com.shop.Owner owner37 = systemFeature30.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList34);
        com.shop.SystemFeature systemFeature38 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray40 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList41 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList41, foodArray40);
        boolean boolean43 = systemFeature38.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList41);
        systemFeature22.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList34, (java.util.List<com.shop.Food>) foodList41);
        com.shop.SystemFeature systemFeature45 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray47 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList48 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList48, foodArray47);
        boolean boolean50 = systemFeature45.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList48);
        com.shop.Pet[] petArray51 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList52 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList52, petArray51);
        systemFeature45.printPetList((java.util.List<com.shop.Pet>) petList52);
        com.shop.Food[] foodArray55 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList56 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList56, foodArray55);
        systemFeature45.printFoodList((java.util.List<com.shop.Food>) foodList56);
        com.shop.SystemFeature systemFeature59 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray61 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList62 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList62, foodArray61);
        boolean boolean64 = systemFeature59.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList62);
        com.shop.Food food65 = systemFeature45.getFoodInstance((java.util.List<com.shop.Food>) foodList62);
        com.shop.Food food66 = systemFeature22.getFoodInstance((java.util.List<com.shop.Food>) foodList62);
        com.shop.SystemFeature systemFeature68 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray70 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList71 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList71, foodArray70);
        boolean boolean73 = systemFeature68.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList71);
        com.shop.Pet[] petArray74 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList75 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList75, petArray74);
        systemFeature68.printPetList((java.util.List<com.shop.Pet>) petList75);
        com.shop.SystemFeature systemFeature78 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray80 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList81 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList81, foodArray80);
        boolean boolean83 = systemFeature78.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList81);
        com.shop.Pet[] petArray84 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList85 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList85, petArray84);
        systemFeature78.printPetList((java.util.List<com.shop.Pet>) petList85);
        systemFeature68.printPetList((java.util.List<com.shop.Pet>) petList85);
        com.shop.Pet pet89 = systemFeature22.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList85);
        com.shop.Pet pet90 = systemFeature0.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList85);
        com.shop.Owner owner91 = null;
        com.shop.Pet pet92 = null;
        // The following exception was thrown during execution in test generation
        try {
            systemFeature0.addOwnerForAPet(owner91, pet92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(petArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(foodArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(foodArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(food20);
        org.junit.Assert.assertNotNull(foodArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ownerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(owner37);
        org.junit.Assert.assertNotNull(foodArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(foodArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(petArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(foodArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(foodArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(food65);
        org.junit.Assert.assertNull(food66);
        org.junit.Assert.assertNotNull(foodArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(petArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(foodArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(petArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(pet89);
        org.junit.Assert.assertNull(pet90);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner[] ownerArray9 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList10 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList10, ownerArray9);
        boolean boolean12 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList10);
        com.shop.Owner[] ownerArray14 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList15 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList15, ownerArray14);
        com.shop.Owner owner17 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList15);
        com.shop.SystemFeature systemFeature19 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature21 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray22 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList23 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList23, ownerArray22);
        systemFeature21.printOwnerList((java.util.List<com.shop.Owner>) ownerList23);
        com.shop.Owner[] ownerArray26 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList27 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList27, ownerArray26);
        systemFeature21.printOwnerList((java.util.List<com.shop.Owner>) ownerList27);
        boolean boolean30 = systemFeature19.checkOwnerNameExist("", (java.util.List<com.shop.Owner>) ownerList27);
        com.shop.Owner owner31 = systemFeature0.getOwnerInstanceByName("hi!", (java.util.List<com.shop.Owner>) ownerList27);
        com.shop.SystemFeature systemFeature33 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature35 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray36 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList37 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList37, ownerArray36);
        systemFeature35.printOwnerList((java.util.List<com.shop.Owner>) ownerList37);
        com.shop.Owner owner40 = systemFeature33.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList37);
        com.shop.Owner[] ownerArray42 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList43 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList43, ownerArray42);
        boolean boolean45 = systemFeature33.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList43);
        com.shop.Pet[] petArray47 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList48 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList48, petArray47);
        boolean boolean50 = systemFeature33.checkPetNameExist("hi!", (java.util.List<com.shop.Pet>) petList48);
        com.shop.Pet pet51 = systemFeature0.getPetInstanceByPetName("hi!", (java.util.List<com.shop.Pet>) petList48);
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(ownerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ownerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(owner17);
        org.junit.Assert.assertNotNull(ownerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ownerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(owner31);
        org.junit.Assert.assertNotNull(ownerArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(owner40);
        org.junit.Assert.assertNotNull(ownerArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(petArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(pet51);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray2 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList3 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList3, foodArray2);
        boolean boolean5 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList3);
        com.shop.SystemFeature systemFeature8 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature10 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray11 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList12 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList12, ownerArray11);
        systemFeature10.printOwnerList((java.util.List<com.shop.Owner>) ownerList12);
        com.shop.Owner owner15 = systemFeature8.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList12);
        com.shop.SystemFeature systemFeature16 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray18 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList19 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList19, foodArray18);
        boolean boolean21 = systemFeature16.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList19);
        systemFeature0.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList12, (java.util.List<com.shop.Food>) foodList19);
        com.shop.SystemFeature systemFeature23 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray24 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList25 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList25, ownerArray24);
        systemFeature23.printOwnerList((java.util.List<com.shop.Owner>) ownerList25);
        com.shop.SystemFeature systemFeature28 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray29 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList30 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList30, foodArray29);
        com.shop.Food food32 = systemFeature28.getFoodInstance((java.util.List<com.shop.Food>) foodList30);
        systemFeature23.printFoodList((java.util.List<com.shop.Food>) foodList30);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList30);
        com.shop.Owner[] ownerArray36 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList37 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList37, ownerArray36);
        com.shop.Owner owner39 = systemFeature0.getOwnerInstanceByName("hi!", (java.util.List<com.shop.Owner>) ownerList37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = owner39.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(foodArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ownerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(owner15);
        org.junit.Assert.assertNotNull(foodArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ownerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(foodArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(food32);
        org.junit.Assert.assertNotNull(ownerArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(owner39);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner[] ownerArray9 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList10 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList10, ownerArray9);
        boolean boolean12 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList10);
        com.shop.Pet[] petArray14 = new com.shop.Pet[] {};
        java.util.ArrayList<com.shop.Pet> petList15 = new java.util.ArrayList<com.shop.Pet>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Pet>) petList15, petArray14);
        boolean boolean17 = systemFeature0.checkPetNameExist("hi!", (java.util.List<com.shop.Pet>) petList15);
        com.shop.SystemFeature systemFeature18 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray20 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList21 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList21, foodArray20);
        boolean boolean23 = systemFeature18.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList21);
        com.shop.SystemFeature systemFeature26 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature28 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray29 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList30 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList30, ownerArray29);
        systemFeature28.printOwnerList((java.util.List<com.shop.Owner>) ownerList30);
        com.shop.Owner owner33 = systemFeature26.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList30);
        com.shop.SystemFeature systemFeature34 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray36 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList37 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList37, foodArray36);
        boolean boolean39 = systemFeature34.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList37);
        systemFeature18.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList30, (java.util.List<com.shop.Food>) foodList37);
        com.shop.Food food41 = systemFeature0.getFoodInstance((java.util.List<com.shop.Food>) foodList37);
        java.lang.Class<?> wildcardClass42 = systemFeature0.getClass();
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(ownerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(petArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(foodArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ownerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(owner33);
        org.junit.Assert.assertNotNull(foodArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(food41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.shop.SystemFeature systemFeature0 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature2 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray3 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList4 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList4, ownerArray3);
        systemFeature2.printOwnerList((java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner owner7 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList4);
        com.shop.Owner[] ownerArray9 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList10 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList10, ownerArray9);
        boolean boolean12 = systemFeature0.checkOwnerNameExist("hi!", (java.util.List<com.shop.Owner>) ownerList10);
        com.shop.Owner[] ownerArray14 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList15 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList15, ownerArray14);
        com.shop.Owner owner17 = systemFeature0.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList15);
        com.shop.SystemFeature systemFeature18 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray19 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList20 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList20, foodArray19);
        com.shop.Food food22 = systemFeature18.getFoodInstance((java.util.List<com.shop.Food>) foodList20);
        systemFeature0.printFoodList((java.util.List<com.shop.Food>) foodList20);
        com.shop.SystemFeature systemFeature25 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray26 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList27 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList27, ownerArray26);
        systemFeature25.printOwnerList((java.util.List<com.shop.Owner>) ownerList27);
        com.shop.SystemFeature systemFeature31 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray33 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList34 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList34, foodArray33);
        boolean boolean36 = systemFeature31.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList34);
        boolean boolean37 = systemFeature25.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList34);
        com.shop.SystemFeature systemFeature39 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray41 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList42 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList42, foodArray41);
        boolean boolean44 = systemFeature39.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList42);
        com.shop.SystemFeature systemFeature47 = new com.shop.SystemFeature();
        com.shop.SystemFeature systemFeature49 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray50 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList51 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList51, ownerArray50);
        systemFeature49.printOwnerList((java.util.List<com.shop.Owner>) ownerList51);
        com.shop.Owner owner54 = systemFeature47.getOwnerInstanceByName("", (java.util.List<com.shop.Owner>) ownerList51);
        com.shop.SystemFeature systemFeature55 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray57 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList58 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList58, foodArray57);
        boolean boolean60 = systemFeature55.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList58);
        systemFeature39.addFoodToOwnerBasketByName("hi!", "hi!", (java.util.List<com.shop.Owner>) ownerList51, (java.util.List<com.shop.Food>) foodList58);
        com.shop.SystemFeature systemFeature64 = new com.shop.SystemFeature();
        com.shop.Owner[] ownerArray65 = new com.shop.Owner[] {};
        java.util.ArrayList<com.shop.Owner> ownerList66 = new java.util.ArrayList<com.shop.Owner>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.shop.Owner>) ownerList66, ownerArray65);
        systemFeature64.printOwnerList((java.util.List<com.shop.Owner>) ownerList66);
        com.shop.SystemFeature systemFeature69 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray70 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList71 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList71, foodArray70);
        com.shop.Food food73 = systemFeature69.getFoodInstance((java.util.List<com.shop.Food>) foodList71);
        systemFeature39.addFoodToOwnerBasketByName("hi!", "", (java.util.List<com.shop.Owner>) ownerList66, (java.util.List<com.shop.Food>) foodList71);
        boolean boolean75 = systemFeature25.checkFoodNameExist("hi!", (java.util.List<com.shop.Food>) foodList71);
        com.shop.SystemFeature systemFeature76 = new com.shop.SystemFeature();
        com.shop.Food[] foodArray78 = new com.shop.Food[] {};
        java.util.ArrayList<com.shop.Food> foodList79 = new java.util.ArrayList<com.shop.Food>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.shop.Food>) foodList79, foodArray78);
        boolean boolean81 = systemFeature76.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList79);
        com.shop.Food food82 = systemFeature25.getFoodInstance((java.util.List<com.shop.Food>) foodList79);
        boolean boolean83 = systemFeature0.checkFoodNameExist("", (java.util.List<com.shop.Food>) foodList79);
        org.junit.Assert.assertNotNull(ownerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(owner7);
        org.junit.Assert.assertNotNull(ownerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ownerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(owner17);
        org.junit.Assert.assertNotNull(foodArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(food22);
        org.junit.Assert.assertNotNull(ownerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(foodArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(foodArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(ownerArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(owner54);
        org.junit.Assert.assertNotNull(foodArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(ownerArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(foodArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(food73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(foodArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(food82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }
}

