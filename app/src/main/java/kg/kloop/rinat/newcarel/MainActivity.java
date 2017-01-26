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
        * 6) Заполнить поле биперами через одну строку
        * 7) Линия биперов по диагонали
        * 8) Шахматная доска из биперов
        * 9) Заполнить всё поле биперами (убрав те, которые уже есть),
        * причем в каждой следующей клетке на 1 бипер больше, чем в предыдущей
        * 10) Переложить биперы на 1 клетку вперед
        * 11) На начальной клетке выложить сумму (*произведение) всех биперов на поле
        * 12) Подсчет количества клеток до произвольного бипера
        * 13) Бипер в центре поля
        * 14) Буква "А" из биперов
        * 15) Спираль из биперов
        * 16) Квадрат из биперов с возможностью задать размеры
        * 17) Выход из лабиринта
        * 18) Кнопки для основных фукций Карела
        * 19) Исправить методы так, чтобы они работали на полях разного размера (5х6, 1х1, 6х1, 1х6)
        * 20) Сделайте что-нибудь крутое
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
