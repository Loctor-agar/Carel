package kg.kloop.rinat.newcarel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Этот класс предназначен для указания команд Карелу
 */
public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CarelGrid grid;
    private GameCanvas canvas;
    private Carel carel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textView);
        canvas = new GameCanvas(textView);
        grid = new CarelGrid(6, 4); // здесь изменяется размер поля (x,y)
        carel = new Carel(canvas, grid);



        /* Задания:
        * 1) Поворот направо
        * 2) Разворот
        * 3) Дойти до стены и не умереть
        * 4) Вернуться на начальную клетку из любой другой (Карел смотрит на восток)
        * 5) Заполнить поле биперами по периметру
        * 6) Шахматная доска из биперов
        * 7) Заполнить всё поле биперами (убрав те, которые уже есть),
        * причем в каждой следующей клетке на 1 бипер больше, чем в предыдущей
        * 8) Переложить биперы на 1 клетку вперед
        * 9) На начальной клетке выложить сумму (*произведение) всех биперов на поле
        * 10) Подсчет количества клеток до произвольного бипера
        * 11) Бипер в центре поля
        * 12) Буква "А" из биперов
        * 13) Спираль из биперов
        * 14) Квадрат из биперов с возможностью задать размеры
        * 15) Выход из лабиринта
        * */

        //Ниже идут команды Карелу.


        carel.turnLeft();


        //Команды Карелу закончились.

    }


    //Здесь пишем новые методы.


    //Новые методы закончились.

    private void move() {
        carel.move();
    }

    private void turnLeft() {
        carel.turnLeft();
    }

    private void collectBeeper() {
        carel.collectBeeper();
    }

    private void dropBeeper() {
        carel.dropBeeper();
    }

    private boolean isFrontClear() {
        return carel.isFrontClear();
    }

    private boolean isBeeper() {
        return carel.isBeeper();
    }

}
