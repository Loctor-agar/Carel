package kg.kloop.rinat.newcarel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Этот класс предназначен для указания команд Карелу */
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
        grid = new CarelGrid(6 , 4); // здесь изменяется размер поля (x,y)
        carel = new Carel(canvas, grid);



        /* Задания:
        * 1) Поворот направо
        * 2) Разворот
        * 3) Дойти до стены и не умереть
        * 4) Заполнить поле биперами по периметру
        * 5) Заполнить всё поле биперами (убрав те, которые уже есть),
        * причем в каждой следующей клетке на 1 бипер больше, чем в предыдущей
        * 6) На начальной клетке выложить сумму всех биперов на поле
        * 7) Бипер в центре поля
        * 8) Буква "А" из биперов
        * 9) Спираль из биперов
        * 10) Выход из лабиринта
        * */

        //Ниже идут команды Карелу.


        carel.turnLeft();



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
