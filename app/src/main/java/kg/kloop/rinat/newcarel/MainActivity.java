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


        textView = (TextView)findViewById(R.id.textView);
        canvas = new GameCanvas(textView);
        grid = new CarelGrid(6 , 4); // здесь изменяется размер поля
        carel = new Carel(canvas, grid);


        //Ниже идут команды Карелу.
        /* Задания:
        * 1) Поворот направо
        * 2) Дойти до стены и не умереть
        * 3) Заполнить всё поле биперами, убрав те, которые уже есть
        * 4) Вертикальная линия биперов посередине поля
        * 5) Квадрат, треугольник и круг* произвольных размеров из биперов
        * */

        move();
        move();
        move();
        turnLeft();
        turnLeft();


        //Команды Карелу закончились.

    }
    
    
    //Здесь пишем новые методы.
    


    
    //Новые методы закончились.
    
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

}
