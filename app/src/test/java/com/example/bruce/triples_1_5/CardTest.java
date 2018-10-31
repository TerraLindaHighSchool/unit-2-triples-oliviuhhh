/*********************************************************
 * Created by Olivia Armstrong
 *
 * The purpose of this class is to test the Card.java class
 *
 * Started on 10/26/18
 *********************************************************/


package com.example.bruce.triples_1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void getShape() {
        Card[] card = {new Card(Card.Shape.CIRCLE, Card.Color.BLUE, 2, 3, 4, 5 ),
                new Card(Card.Shape.SQUARE, Card.Color.BLUE, 2, 3, 4, 5),
                new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 3, 4, 5),
                new Card(Card.Shape.NO_SHAPE, Card.Color.BLUE, 2, 3, 4, 5)};
        Card.Shape[] expectedValue = {Card.Shape.CIRCLE,Card.Shape.SQUARE, Card.Shape.TRIANGLE, Card.Shape.NO_SHAPE};
        Card.Shape[] actualValue = new Card.Shape[4];
        for (int i = 0; i < card.length; i++) {
            actualValue[i] = card[i].getShape();
        }
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void getColor() {
        Card[] card = {new Card(Card.Shape.TRIANGLE, Card.Color.RED, 2, 3, 4, 5),
         new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 3, 4, 5),
         new Card(Card.Shape.TRIANGLE, Card.Color.GREEN, 2, 3, 4, 5),
         new Card(Card.Shape.TRIANGLE, Card.Color.NO_COLOR, 2, 3, 4, 5)};
        Card.Color[] expectedValue = {Card.Color.RED, Card.Color.BLUE, Card.Color.GREEN, Card.Color.NO_COLOR};
        Card.Color[] actualValue = new Card.Color[4] ;
        for (int i = 0; i < card.length; i++) {
            actualValue[i] = card[i].getColor();
        }
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void getAlpha() {
        Card[] card = {new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 0, 1, 4, 5),
                new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 1, 1, 4, 5),
                new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 1, 4, 5)};
        int[] expectedValue = {0, 1, 2};
        int[] actualValue = new int [3];
        for (int i = 0; i < card.length; i++) {
            actualValue[i] = card[i].getAlpha();
        }
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void getImageID() {
        Card card = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 0, 1, R.drawable.circle_blue_1_0, 5);
        int expectedValue = R.drawable.circle_blue_1_0;
        int actualValue = card.getImageID();
        assertTrue(expectedValue == actualValue);
    }

    @Test
    public void getSelectedImageID() {
        Card card = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 0, 1, 4, R.drawable.circle_blue_1_2);
        int expectedValue = R.drawable.circle_blue_1_2;
        int actualValue = card.getSelectedImageID();
        assertTrue(expectedValue == actualValue);
    }


    @Test
    public void getIsSelected() {
        Card card = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 3, 4, 5);
        boolean expectedValue = false;
        boolean actualValue = card.getIsSelected();
        assertTrue(expectedValue == actualValue);
    }

    @Test
    public void setIsSelected() {  Card card = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 3, 4, 5);
        card.setIsSelected(true);
        boolean actualValue = card.getIsSelected();
        assertTrue(actualValue == true);
    }

    @Test
    public void getNum()  {
        Card[] card = {new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 1, 4, 5),
                new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 2, 4, 5),
                new Card(Card.Shape.TRIANGLE, Card.Color.BLUE, 2, 3, 4, 5)};
        int[] expectedValue = {1, 2, 3};
        int[] actualValue = new int[3];
        for (int i = 0; i < card.length; i++) {
            actualValue[i] = card[i].getNum();
        }
        assertArrayEquals(expectedValue, actualValue);

    }

    @Test
    public void Test() {

    }
}