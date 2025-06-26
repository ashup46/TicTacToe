package com.example.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StartGame extends AppCompatActivity {

    private FloatingActionButton btnrestartGame, btnbackGame;

    private final Button[] ticTacBtn = new Button[9];

    private final int[] flag_1 = new int[9];


    private int player_1 = 0, player_2 = 0;

    private int flag = 0;

    private int counter = 0, counter_Draw = 0;

    private String match;

    private EditText player1Score, player2Score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_start_game);
        buttonClickedOption();
        buttonClckedXandO();
        player1Score = findViewById(R.id.edtPlayer1);
        player2Score = findViewById(R.id.edtPlayer2);
        match = "";

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void buttonClickedOption() {


        btnrestartGame = findViewById(R.id.btnRestart);
        btnbackGame = findViewById(R.id.btnBack);

        btnrestartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                finish();
                startActivity(intent);

            }
        });

        btnbackGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                StartGame.super.onBackPressed();
            }
        });
    }

    private void buttonClckedXandO() {

        ticTacBtn[0] = findViewById(R.id.onebyone);
        ticTacBtn[1] = findViewById(R.id.onebytwo);
        ticTacBtn[2] = findViewById(R.id.onebythree);
        ticTacBtn[3] = findViewById(R.id.twobyone);
        ticTacBtn[4] = findViewById(R.id.twobytwo);
        ticTacBtn[5] = findViewById(R.id.twobythree);
        ticTacBtn[6] = findViewById(R.id.threebyone);
        ticTacBtn[7] = findViewById(R.id.threebytwo);
        ticTacBtn[8] = findViewById(R.id.threebythree);


        ticTacBtn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag_1[0] == 0) {
                    if (flag == 0) {
                        ticTacBtn[0].setText("X");
                        flag = 1;


                    } else if (flag == 1) {
                        ticTacBtn[0].setText("O");

                        flag = 0;
                    }
                    ticTacBtn[0].setTextSize(40);
                    flag_1[0] = 1;

                }
                counter_Draw++;
                gameLogic();

            }
        });


        ticTacBtn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag_1[1] == 0) {
                    if (flag == 0) {
                        ticTacBtn[1].setText("X");

                        flag = 1;

                    } else if (flag == 1) {
                        ticTacBtn[1].setText("O");

                        flag = 0;
                    }

                    ticTacBtn[1].setTextSize(40);
                    flag_1[1] = 1;

                }
                counter_Draw++;
                gameLogic();
            }
        });

        ticTacBtn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag_1[2] == 0) {
                    if (flag == 0) {
                        ticTacBtn[2].setText("X");

                        flag = 1;

                    } else if (flag == 1) {
                        ticTacBtn[2].setText("O");

                        flag = 0;
                    }

                    ticTacBtn[2].setTextSize(40);
                    flag_1[2] = 1;

                }
                counter_Draw++;
                gameLogic();
            }
        });


        ticTacBtn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag_1[3] == 0) {
                    if (flag == 0) {
                        ticTacBtn[3].setText("X");

                        flag = 1;

                    } else if (flag == 1) {
                        ticTacBtn[3].setText("O");

                        flag = 0;
                    }

                    ticTacBtn[3].setTextSize(40);
                    flag_1[3] = 1;

                }
                counter_Draw++;
                gameLogic();
            }
        });


        ticTacBtn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag_1[4] == 0) {
                    if (flag == 0) {
                        ticTacBtn[4].setText("X");

                        flag = 1;

                    } else if (flag == 1) {
                        ticTacBtn[4].setText("O");

                        flag = 0;
                    }

                    ticTacBtn[4].setTextSize(40);
                    flag_1[4] = 1;

                }
                counter_Draw++;
                gameLogic();
            }
        });


        ticTacBtn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag_1[5] == 0) {
                    if (flag == 0) {
                        ticTacBtn[5].setText("X");

                        flag = 1;

                    } else if (flag == 1) {
                        ticTacBtn[5].setText("O");

                        flag = 0;
                    }

                    ticTacBtn[5].setTextSize(40);
                    flag_1[5] = 1;

                }
                counter_Draw++;
                gameLogic();
            }
        });


        ticTacBtn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag_1[6] == 0) {
                    if (flag == 0) {
                        ticTacBtn[6].setText("X");

                        flag = 1;

                    } else if (flag == 1) {
                        ticTacBtn[6].setText("O");

                        flag = 0;
                    }

                    ticTacBtn[6].setTextSize(40);
                    flag_1[6] = 1;

                }
                counter_Draw++;
                gameLogic();
            }
        });


        ticTacBtn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag_1[7] == 0) {
                    if (flag == 0) {
                        ticTacBtn[7].setText("X");

                        flag = 1;

                    } else if (flag == 1) {
                        ticTacBtn[7].setText("O");

                        flag = 0;
                    }

                    ticTacBtn[7].setTextSize(40);
                    flag_1[7] = 1;

                }
                counter_Draw++;
                gameLogic();
            }
        });


        ticTacBtn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (flag_1[8] == 0) {
                    if (flag == 0) {
                        ticTacBtn[8].setText("X");

                        flag = 1;

                    } else if (flag == 1) {
                        ticTacBtn[8].setText("O");

                        flag = 0;
                    }

                    ticTacBtn[8].setTextSize(40);
                    flag_1[8] = 1;

                }
                counter_Draw++;
                gameLogic();
            }
        });


    }

    private void gameLogic() {
        counter = 0;

//        This Loop Row

        for (int i = 0; i < 7; i += 3) {
            match = (String) ticTacBtn[i].getText();
            counter = 0;
            for (int j = i; j < (i + 3); j++) {
                if ((match.equals(ticTacBtn[j].getText())) && (match.equals("X") || match.equals("O"))) {
                    counter++;


                } else {
                    counter = 0;
                    break;
                }
                // This is the condition to put the score of the Player 1 and Player 2
                if (counter == 3) {

                    if (match.equals("X")) {
                        player_1++;
                        new AlertDialog.Builder(this).setTitle("Winner").setMessage("Player 1 Wins").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).show();

                    } else if (match.equals("O")) {
                        player_2++;

                        new AlertDialog.Builder(this).setTitle("Winner").setMessage("Player 2 Wins").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).show();
                    }
                    player1Score.setText(String.valueOf(player_1));
                    player2Score.setText(String.valueOf(player_2));

                    break;
                }

            }

            if (counter == 3) {
                clearButton(ticTacBtn);
                counter = 0;
                counter_Draw = 0;
                flag = 0;
                return;
            }

        }


//        This Loop Column
        for (int i = 0; i < 3; i++) {
            match = (String) ticTacBtn[i].getText();
            counter = 0;
            for (int j = i; j < (i + 7); j += 3) {

                if ((match.equals(ticTacBtn[j].getText())) && (match.equals("X") || match.equals("O"))) {
                    counter++;

                } else {
                    counter = 0;
                    break;
                }

                if (counter == 3) {

                    if (match.equals("X")) {
                        player_1++;
                        new AlertDialog.Builder(this).setTitle("Winner").setMessage("Player 1 Wins").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).show();

                    } else if (match.equals("O")) {
                        player_2++;

                        new AlertDialog.Builder(this).setTitle("Winner").setMessage("Player 2 Wins").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).show();
                    }


                    player1Score.setText(String.valueOf(player_1));
                    player2Score.setText(String.valueOf(player_2));
                    clearButton(ticTacBtn);
                    counter_Draw = 0;
                    counter = 0;
                    flag = 0;

                    break;
                }

                if (counter == 3) {

                    return;
                }


            }

        }

//This for Diagnlly
        match = (String) ticTacBtn[0].getText();
        counter = 0;
        for (int i = 0; i < 9; i += 4) {

            if ((match.equals(ticTacBtn[i].getText())) && (match.equals("X") || match.equals("O"))) {
                counter++;

            } else {
                counter = 0;
                break;
            }

            if (counter == 3) {


                if (match.equals("X")) {
                    player_1++;
                    new AlertDialog.Builder(this).setTitle("Winner").setMessage("Player 1 Wins").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).show();

                } else if (match.equals("O")) {
                    player_2++;

                    new AlertDialog.Builder(this).setTitle("Winner").setMessage("Player 2 Wins").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).show();
                }
                player1Score.setText(String.valueOf(player_1));
                player2Score.setText(String.valueOf(player_2));
                clearButton(ticTacBtn);
                counter_Draw = 0;
                counter = 0;
                flag = 0;
                break;
            }

            if (counter == 3) {

                return;
            }

        }
//This for Cross Daignol
        match = (String) ticTacBtn[2].getText();
        counter = 0;

        for (int i = 2; i < 7; i += 2) {

            if ((match.equals(ticTacBtn[i].getText())) && (match.equals("X") || match.equals("O"))) {
                counter++;


            } else {
                counter = 0;
                break;
            }
            if (counter == 3) {
                if (match.equals("X")) {
                    player_1++;
                    new AlertDialog.Builder(this).setTitle("Winner").setMessage("Player 1 Wins").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).show();

                } else if (match.equals("O")) {
                    player_2++;

                    new AlertDialog.Builder(this).setTitle("Winner").setMessage("Player 2 Wins").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).show();
                }
                player1Score.setText(String.valueOf(player_1));
                player2Score.setText(String.valueOf(player_2));
                clearButton(ticTacBtn);
                counter_Draw = 0;
                counter = 0;
                flag = 0;
                break;
            }

            if (counter == 3) {

                return;
            }

        }

//this is the the condtion for Draw the match
        if (counter_Draw == 9) {
            new AlertDialog.Builder(this).setTitle("Winner").setMessage("MATCH DRAW").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).show();
            counter_Draw = 0;
            clearButton(ticTacBtn);
            counter = 0;
            flag = 0;
        }


    }


    public void clearButton(Button[] ticTacBtn) {
        for (int i = 0; i < 9; i++) {
            ticTacBtn[i].setText(" ");
            ticTacBtn[i].setTextSize(40);
            flag_1[i] = 0;

        }
    }


// I need to make the app for DRAW and clear all the tiles when the game is complete


}