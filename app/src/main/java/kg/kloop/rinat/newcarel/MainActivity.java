package kg.kloop.rinat.newcarel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textView);
        CarelGrid grid = new CarelGrid();
        GameCanvas canvas = new GameCanvas(textView);
        final Carel carel = new Carel(canvas, grid);


        //Ниже идут команды Карелу.

        carel.move();
        carel.turnLeft();
        carel.turnLeft();
        carel.turnLeft();
        carel.move();
        carel.move();
        carel.move();



        //Команды Карелу закончились.

    }
}
