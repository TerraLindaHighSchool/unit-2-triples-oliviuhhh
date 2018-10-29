/*********************************************************
 * Created by Olivia Armstrong
 *
 * The purpose of this class is to create the card objects
 *
 * Started on 10/24/18
 *********************************************************/

package com.example.bruce.triples_1_5;

public class Card {
    private Shape mShape;
    private Color mColor;
    private int mAlpha, mNum;
    private int mImageID;
    private int mSelectedImageID;
    private boolean mIsSelected;


    public enum Shape{

        CIRCLE, SQUARE, TRIANGLE, NO_SHAPE;
    }

    public enum Color{
        RED, BLUE, GREEN, NO_COLOR;
    }

    public Card(Shape shape, Color color, int alpha, int num, int image, int selectedimage){
        mShape = shape;
        mColor = color;
        mAlpha = alpha;
        mNum = num;
        mImageID = image;
        mSelectedImageID = selectedimage;
    };

/*************************************************
* Getters and Setters
**************************************************/

    public Shape getShape() {
    return mShape;
}

    public Color getColor() {
        return mColor;
    }

    public int getAlpha() {
        return mAlpha;
    }

    public int getImageID() {
        return mImageID;
    }

    public int getSelectedImageID() {
        return mSelectedImageID;
    }

    public boolean getIsSelected() {
            return mIsSelected;
        }

    public void setIsSelected(boolean mIsSelected) {
            this.mIsSelected = mIsSelected;
        }

    public int getNum() {
        return mNum;
    }
}


