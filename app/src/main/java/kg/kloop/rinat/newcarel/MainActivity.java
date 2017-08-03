package kg.kloop.rinat.newcarel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CarelGrid grid;
    private GameCanvas canvas;
    private Carel carel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        //Здесь пишем, что Карел должен делать.********************

    while (true){
        ClearRow();
        turnRight();
        if(!isFrontClear()){
            returnHome();
            break;
        }
        gotonextRow();
    }



    private void qwerty(){

    }

        //Дальше ничего не меняем.*********************************




    }//Здесь пишем новые методы.***********************************

    private void gotonextRow() {
        move();
        turnRight();
        moveToWall();
        uTurn();


    }

    private void moveToWall() {
      while (isFrontClear()){
        move();}
    }


    private void returnHome() {
        turnRight();
        moveToWall();
        turnRight();
        moveToWall();
        turnRight();
    }

    private void uTurn() {
        turnLeft();
        turnLeft();
    }

    private void turnRight() {
        for(int i=0;i<3;i++){
            turnLeft();
        }

    }

    private void ClearRow() {
        while(true){
            clearCell();
            if(isFrontClear()){
                move();
            }else break;
        }
    }

    private void clearCell() {
        while(isBeeper()){
            collectBeeper();
        }
    }


    //Дальше ничего не меняем.*************************************





    private void move(){
        carel.move();
    }

    private void turnLeft(){
        carel.turnLeft();
    }

    private void collectBeeper(){
        carel.collectBeeper();
    }

    private void dropBeeper(){
        carel.dropBeeper();
    }

    private boolean isFrontClear(){
        return carel.isFrontClear();
    }

    private boolean isBeeper(){
        return carel.isBeeper();
    }


    private void init() {
        textView = (TextView)findViewById(R.id.textView);
        grid = new CarelGrid();
        canvas = new GameCanvas(textView);
        carel = new Carel(canvas, grid);
    }
}