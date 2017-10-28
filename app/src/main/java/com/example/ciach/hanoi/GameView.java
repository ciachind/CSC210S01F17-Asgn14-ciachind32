package com.example.ciach.hanoi;

/**
 * Created by ciach on 10/24/2017.
 */
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

public class GameView extends SurfaceView
        implements SurfaceHolder.Callback
{

    ImageView gameView;
    float x, y;


    public GameView(Context context, AttributeSet attrs)
    {
        super(context, attrs); // call superclass constructor
        Activity activity = (Activity) context; // store reference to MainActivity

        // register SurfaceHolder.Callback listener
        getHolder().addCallback(this);
    }


    protected void onCreate(Bundle savedInstanceState)
    {

        // Drawing in a separate method
        draw();

        setContentView(gameView);
    }

    private void setContentView(ImageView gameView)
    {
    }

    // The draw() method
    public void draw()
    {

        // Declare an object of type Bitmap
        Bitmap blankBitmap;
        // Make it 600 x 600 pixels in size
        blankBitmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);
        // Declare an object of type canvas
        Canvas canvas;
        // Initialize blank bitmap
        canvas = new Canvas(blankBitmap);

        // Initialize object of type ImageView

        // Put blank bitmap on gameView
        gameView.setImageBitmap(blankBitmap);

        // Declare an object of type Paint
        Paint paint;
        // Initialize to paint canvas
        paint = new Paint();

        // Make the canvas white
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        // Make the brush blue
        paint.setColor(Color.argb(255, 26, 128, 182));

        // Draw a line for tower 1
        canvas.drawLine(100, 250, 100, 450, paint);

        // Draw a line for tower 2
        canvas.drawLine(300, 250, 300, 450, paint);

        // Draw a line for tower 3
        canvas.drawLine(500, 250, 500, 450, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 249, 129, 0));

        // Draw a rectangle for the base
        canvas.drawRect(0, 450, 700, 550, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 20, 129, 0));

        // Draw a rectangle for ring1
        canvas.drawRect(25, 400, 175, 450, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 150, 100, 100));

        // Draw a rectangle for ring2
        canvas.drawRect(50, 350, 150, 400, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 200, 12, 0));

        // Draw a rectangle for ring3
        canvas.drawRect(75, 300, 125, 350, paint);

        // Change the brush color
        paint.setColor(Color.argb(255, 200, 129, 50));

        // Draw a rectangle for ring4
        canvas.drawRect(90, 250, 110, 300, paint);


    }
    public boolean onTouch(View v, MotionEvent event)
    {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                x = event.getX();
                y = event.getY();
                break;

            case MotionEvent.ACTION_UP:
                x = event.getX();
                y = event.getY();
                break;

            case MotionEvent.ACTION_MOVE:
                x = event.getX();
                y = event.getY();
                break;

        }
        return true;
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder)
    {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height)
    {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder)
    {

    }
}
