package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button B[] = new Button[9];
    Button New,Exit,Reset;
    TextView tvx,tvo,tv1;
    int cnt = 0;
    private int Xcnt = 0;
    private int Ocnt = 0;
    private String Game = "S";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0 ; i < B.length ; i++)
            {
                int id = getResources().getIdentifier("B" + i , "id" , getPackageName());
                B[i] = findViewById(id);
            }
        for (int i = 0 ; i < B.length ; i++)
            {
                B[i].setOnClickListener(this);
                B[i].setEnabled(false);
            }

        New = findViewById(R.id.New);
        Exit = findViewById(R.id.Exit);
        Reset = findViewById(R.id.Reset);
        tvx = findViewById(R.id.TVX);
        tvo = findViewById(R.id.TVO);
        tv1 = findViewById(R.id.TV1);

        New.setOnClickListener(this);
        Exit.setOnClickListener(this);
        Reset.setOnClickListener(this);
        tvx.setOnClickListener(this);
        tvo.setOnClickListener(this);
        tv1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId()==New.getId())
            {
                for (int i = 0 ; i < B.length ; i++)
                {
                    B[i].setEnabled(true);
                }
            }
        if (view.getId()==B[0].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[0].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[0].setText("X");
                }
                cnt++;
                B[0].setEnabled(false);
                Wine();
            }
        if (view.getId()==B[1].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[1].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[1].setText("X");
                }
                cnt++;
                B[1].setEnabled(false);
                Wine();
            }
        if (view.getId()==B[2].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[2].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[2].setText("X");
                }
                cnt++;
                B[2].setEnabled(false);
                Wine();
            }
        if (view.getId()==B[3].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[3].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[3].setText("X");
                }
                cnt++;
                B[3].setEnabled(false);
                Wine();
            }
        if (view.getId()==B[4].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[4].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[4].setText("X");
                }
                cnt++;
                B[4].setEnabled(false);
                Wine();
            }
        if (view.getId()==B[5].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[5].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[5].setText("X");
                }
                cnt++;
                B[5].setEnabled(false);
                Wine();
            }
        if (view.getId()==B[6].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[6].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[6].setText("X");
                }
                cnt++;
                B[6].setEnabled(false);
                Wine();
            }
        if (view.getId()==B[7].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[7].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[7].setText("X");
                }
                cnt++;
                B[7].setEnabled(false);
                Wine();
            }
        if (view.getId()==B[8].getId())
            {
                if(cnt % 2 == 0)
                {
                    B[8].setText("O");
                }
                else if (cnt % 2 == 1)
                {
                    B[8].setText("X");
                }
                cnt++;
                B[8].setEnabled(false);
                Wine();
            }

        if (view.getId()==Reset.getId())
            {
                B[0].setEnabled(true);  B[1].setEnabled(true);  B[2].setEnabled(true);
                B[3].setEnabled(true);  B[4].setEnabled(true);  B[5].setEnabled(true);
                B[6].setEnabled(true);  B[7].setEnabled(true);  B[8].setEnabled(true);

                B[0].setText(" ");  B[1].setText(" ");  B[2].setText(" ");  B[3].setText(" ");
                B[4].setText(" ");  B[5].setText(" ");  B[6].setText(" ");  B[7].setText(" ");  B[8].setText(" ");

                tv1.setText(" ");

            }

        if (view.getId()==New.getId())
            {
                B[0].setEnabled(true);  B[1].setEnabled(true);  B[2].setEnabled(true);
                B[3].setEnabled(true);  B[4].setEnabled(true);  B[5].setEnabled(true);
                B[6].setEnabled(true);  B[7].setEnabled(true);  B[8].setEnabled(true);

                B[0].setText(" ");  B[1].setText(" ");  B[2].setText(" ");  B[3].setText(" ");
                B[4].setText(" ");  B[5].setText(" ");  B[6].setText(" ");  B[7].setText(" ");  B[8].setText(" ");

                Xcnt = 0;
                Ocnt = 0;
                tvx.setText(" 0 ");
                tvo.setText(" 0 ");
                tv1.setText(" ");
            }
        if (view.getId()==Exit.getId())
            {
                finishAffinity();
            }
    }
    private void Scare()
        {
            tvx.setText(String.valueOf(Xcnt));
            tvo.setText(String.valueOf(Ocnt));
        }
    private void Declaring()
        {
            if (Game.equalsIgnoreCase("S"))
            {
                Game = "o";
            }
            else
            {
                Game = "x";
            }
        }
    void Wine()
        {
            if (B[0].getText().toString().equalsIgnoreCase("O")
                && B[1].getText().toString().equalsIgnoreCase("O")
                && B[2].getText().toString().equalsIgnoreCase("O"))
                {
                System.out.println(" =*{{ O Is Win }}*= ");
                tv1.setText(" =*{{ O Is Win }}*= ");
                Ocnt++;
                Scare();
                }
            else
            if (B[0].getText().toString().equalsIgnoreCase("X")
                && B[1].getText().toString().equalsIgnoreCase("X")
                && B[2].getText().toString().equalsIgnoreCase("X"))
                {
                     System.out.println(" =*{{ X Is Win }}*= ");
                     Xcnt++;
                     Scare();
                     tv1.setText(" =*{{ X Is Win }}*= ");
                }

            if (B[3].getText().toString().equalsIgnoreCase("O")
                    && B[4].getText().toString().equalsIgnoreCase("O")
                    && B[5].getText().toString().equalsIgnoreCase("O"))
                {
                    System.out.println(" =*{{ O Is Win }}*= ");
                    tv1.setText(" =*{{ O Is Win }}*= ");
                    Ocnt++;
                    Scare();
                }
            else
            if (B[3].getText().toString().equalsIgnoreCase("X")
                    && B[4].getText().toString().equalsIgnoreCase("X")
                    && B[5].getText().toString().equalsIgnoreCase("X"))
                {
                    System.out.println(" =*{{ X Is Win }}*= ");
                    Xcnt++;
                    Scare();
                    tv1.setText(" =*{{ X Is Win }}*= ");
                }

            if (B[6].getText().toString().equalsIgnoreCase("O")
                    && B[7].getText().toString().equalsIgnoreCase("O")
                    && B[8].getText().toString().equalsIgnoreCase("O"))
            {
                System.out.println(" =*{{ O Is Win }}*= ");
                tv1.setText(" =*{{ O Is Win }}*= ");
                Ocnt++;
                Scare();
            }
            else
            if (B[6].getText().toString().equalsIgnoreCase("X")
                    && B[7].getText().toString().equalsIgnoreCase("X")
                    && B[8].getText().toString().equalsIgnoreCase("X"))
            {
                System.out.println(" =*{{ X Is Win }}*= ");
                Xcnt++;
                Scare();
                tv1.setText(" =*{{ X Is Win }}*= ");
            }

            if (B[0].getText().toString().equalsIgnoreCase("O")
                    && B[3].getText().toString().equalsIgnoreCase("O")
                    && B[6].getText().toString().equalsIgnoreCase("O"))
            {
                System.out.println(" =*{{ O Is Win }}*= ");
                tv1.setText(" =*{{ O Is Win }}*= ");
                Ocnt++;
                Scare();
            }
            else
            if (B[0].getText().toString().equalsIgnoreCase("X")
                    && B[3].getText().toString().equalsIgnoreCase("X")
                    && B[6].getText().toString().equalsIgnoreCase("X"))
            {
                System.out.println(" =*{{ X Is Win }}*= ");
                Xcnt++;
                Scare();
                tv1.setText(" =*{{ X Is Win }}*= ");
            }

            if (B[1].getText().toString().equalsIgnoreCase("O")
                    && B[4].getText().toString().equalsIgnoreCase("O")
                    && B[7].getText().toString().equalsIgnoreCase("O"))
            {
                System.out.println(" =*{{ O Is Win }}*= ");
                tv1.setText(" =*{{ O Is Win }}*= ");
                Ocnt++;
                Scare();
            }
            else
            if (B[1].getText().toString().equalsIgnoreCase("X")
                    && B[4].getText().toString().equalsIgnoreCase("X")
                    && B[7].getText().toString().equalsIgnoreCase("X"))
            {
                System.out.println(" =*{{ X Is Win }}*= ");
                Xcnt++;
                Scare();
                tv1.setText(" =*{{ X Is Win }}*= ");
            }

            if (B[2].getText().toString().equalsIgnoreCase("O")
                    && B[5].getText().toString().equalsIgnoreCase("O")
                    && B[8].getText().toString().equalsIgnoreCase("O"))
            {
                System.out.println(" =*{{ O Is Win }}*= ");
                tv1.setText(" =*{{ O Is Win }}*= ");
                Ocnt++;
                Scare();
            }
            else
            if (B[2].getText().toString().equalsIgnoreCase("X")
                    && B[5].getText().toString().equalsIgnoreCase("X")
                    && B[8].getText().toString().equalsIgnoreCase("X"))
            {
                System.out.println(" =*{{ X Is Win }}*= ");
                Xcnt++;
                Scare();
                tv1.setText(" =*{{ X Is Win }}*= ");
            }
            if (B[0].getText().toString().equalsIgnoreCase("O")
                    && B[4].getText().toString().equalsIgnoreCase("O")
                    && B[8].getText().toString().equalsIgnoreCase("O"))
            {
                System.out.println(" =*{{ O Is Win }}*= ");
                tv1.setText(" =*{{ O Is Win }}*= ");
                Ocnt++;
                Scare();
            }
            else
            if (B[0].getText().toString().equalsIgnoreCase("X")
                    && B[4].getText().toString().equalsIgnoreCase("X")
                    && B[8].getText().toString().equalsIgnoreCase("X"))
            {
                System.out.println(" =*{{ X Is Win }}*= ");
                Xcnt++;
                Scare();
                tv1.setText(" =*{{ X Is Win }}*= ");
            }

            if (B[2].getText().toString().equalsIgnoreCase("O")
                    && B[4].getText().toString().equalsIgnoreCase("O")
                    && B[6].getText().toString().equalsIgnoreCase("O"))
            {
                System.out.println(" =*{{ O Is Win }}*= ");
                tv1.setText(" =*{{ O Is Win }}*= ");
                Ocnt++;
                Scare();
            }
            else
            if (B[2].getText().toString().equalsIgnoreCase("X")
                    && B[4].getText().toString().equalsIgnoreCase("X")
                    && B[6].getText().toString().equalsIgnoreCase("X"))
            {
                System.out.println(" =*{{ X Is Win }}*= ");
                Xcnt++;
                Scare();
                tv1.setText(" =*{{ X Is Win }}*= ");
            }

        }
}