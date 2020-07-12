package com.example.canastaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {


    PathInterpolator pathInterpolator;
    ArrayList<float[]> XAndY;
    ArrayList<ImageView> imageViews;
    ArrayList<Integer> cardIntegers;
    int j = -1;
    int k = -1;

    int gameState = 0;

    ImageView middleCard;
    ImageView middleCard2;
    ImageView middleCard3;
    ImageView middleCard4;
    ImageView middleCard5;
    ImageView middleCard6;
    ImageView middleCard7;
    ImageView middleCard8;
    ImageView middleCard9;
    ImageView middleCard10;
    ImageView middleCard11;
    ImageView middleCard12;
    ImageView middleCard13;
    ImageView middleCard14;
    ImageView middleCard15;
    ImageView middleCard16;
    ImageView middleCard17;
    ImageView middleCard18;
    ImageView middleCard19;
    ImageView middleCard20;
    ImageView middleCard21;
    ImageView middleCard22;
    ImageView middleCard23;
    ImageView middleCard24;
    ImageView middleCard25;
    ImageView middleCard26;
    ImageView middleCard27;
    ImageView middleCard28;
    ImageView middleCard29;
    ImageView middleCard30;
    ImageView middleCard31;
    ImageView middleCard32;
    ImageView middleCard33;
    ImageView middleCard34;
    ImageView middleCard35;
    ImageView middleCard36;
    ImageView middleCard37;
    ImageView middleCard38;
    ImageView middleCard39;
    ImageView middleCard40;
    ImageView middleCard41;
    ImageView middleCard42;
    ImageView middleCard43;
    ImageView middleCard44;
    ImageView middleCard45;
    ImageView middleCard46;
    ImageView middleCard47;
    ImageView middleCard48;
    ImageView middleCard49;
    ImageView middleCard50;
    ImageView middleCard51;
    ImageView middleCard52;

    public void assignImage(final ImageView imageView, final int i) {

        //imageView.animate().rotationYBy(360).setDuration(100);

        final ObjectAnimator oa1 = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 0f);
        final ObjectAnimator oa2 = ObjectAnimator.ofFloat(imageView, "scaleX", 0f, 1f);
        oa1.setInterpolator(new DecelerateInterpolator());
        oa2.setInterpolator(new AccelerateDecelerateInterpolator());
        oa1.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                //test.setImageResource(R.drawable.cardback);

                if (i == 101) {
                    imageView.setImageResource(R.drawable.ace_of_clubs);
                }
                else if (i == 102) {
                    imageView.setImageResource(R.drawable.two_of_clubs);

                }
                else if (i == 103) {
                    imageView.setImageResource(R.drawable.three_of_clubs);
                }
                else if (i == 104) {
                    imageView.setImageResource(R.drawable.four_of_clubs);
                }
                else if (i == 105) {
                    imageView.setImageResource(R.drawable.five_of_clubs);
                }
                else if (i == 106) {
                    imageView.setImageResource(R.drawable.six_of_clubs);
                }
                else if (i == 107) {
                    imageView.setImageResource(R.drawable.seven_of_clubs);

                }
                else if (i == 108) {
                    imageView.setImageResource(R.drawable.eight_of_clubs);
                }
                else if (i == 109) {
                    imageView.setImageResource(R.drawable.nine_of_clubs);
                }
                else if (i == 110) {
                    imageView.setImageResource(R.drawable.ten_of_clubs);
                }
                else if (i == 111) {
                    imageView.setImageResource(R.drawable.jack_of_clubs);
                }
                else if (i == 112) {
                    imageView.setImageResource(R.drawable.queen_of_clubs);

                }
                else if (i == 113) {
                    imageView.setImageResource(R.drawable.king_of_clubs);
                }
                else if (i == 201) {
                    imageView.setImageResource(R.drawable.ace_of_diamonds);
                }
                else if (i == 202) {
                    imageView.setImageResource(R.drawable.two_of_diamonds);
                }
                else if (i == 203) {
                    imageView.setImageResource(R.drawable.three_of_diamonds);
                }
                else if (i == 204) {
                    imageView.setImageResource(R.drawable.four_of_diamonds);

                }
                else if (i == 205) {
                    imageView.setImageResource(R.drawable.five_of_diamonds);
                }
                else if (i == 206) {
                    imageView.setImageResource(R.drawable.six_of_diamonds);
                }
                else if (i == 207) {
                    imageView.setImageResource(R.drawable.seven_of_diamonds);
                }
                else if (i == 208) {
                    imageView.setImageResource(R.drawable.eight_of_diamonds);
                }
                else if (i == 209) {
                    imageView.setImageResource(R.drawable.nine_of_diamonds);

                }
                else if (i == 210) {
                    imageView.setImageResource(R.drawable.ten_of_diamonds);
                }
                else if (i == 211) {
                    imageView.setImageResource(R.drawable.jack_of_diamonds);
                }
                else if (i == 212) {
                    imageView.setImageResource(R.drawable.queen_of_diamonds);
                }
                else if (i == 213) {
                    imageView.setImageResource(R.drawable.king_of_diamonds);
                }
                else if (i == 301) {
                    imageView.setImageResource(R.drawable.ace_of_hearts);

                }
                else if (i == 302) {
                    imageView.setImageResource(R.drawable.two_of_hearts);
                }
                else if (i == 303) {
                    imageView.setImageResource(R.drawable.three_of_hearts);
                }
                else if (i == 304) {
                    imageView.setImageResource(R.drawable.four_of_hearts);
                }
                else if (i == 305) {
                    imageView.setImageResource(R.drawable.five_of_hearts);
                }
                else if (i == 306) {
                    imageView.setImageResource(R.drawable.six_of_hearts);

                }
                else if (i == 307) {
                    imageView.setImageResource(R.drawable.seven_of_hearts);
                }
                else if (i == 308) {
                    imageView.setImageResource(R.drawable.eight_of_hearts);
                }
                else if (i == 309) {
                    imageView.setImageResource(R.drawable.nine_of_hearts);
                }
                else if (i == 310) {
                    imageView.setImageResource(R.drawable.ten_of_hearts);
                }
                else if (i == 311) {
                    imageView.setImageResource(R.drawable.jack_of_hearts);

                }
                else if (i == 312) {
                    imageView.setImageResource(R.drawable.queen_of_hearts);
                }
                else if (i == 313) {
                    imageView.setImageResource(R.drawable.king_of_hearts);
                }
                else if (i == 401) {
                    imageView.setImageResource(R.drawable.ace_of_spades);
                }
                else if (i == 402) {
                    imageView.setImageResource(R.drawable.two_of_spades);

                }
                else if (i == 403) {
                    imageView.setImageResource(R.drawable.three_of_spades);
                }
                else if (i == 404) {
                    imageView.setImageResource(R.drawable.four_of_spades);
                }
                else if (i == 405) {
                    imageView.setImageResource(R.drawable.five_of_spades);
                }
                else if (i == 406) {
                    imageView.setImageResource(R.drawable.six_of_spades);
                }
                else if (i == 407) {
                    imageView.setImageResource(R.drawable.seven_of_spades);

                }
                else if (i == 408) {
                    imageView.setImageResource(R.drawable.eight_of_spades);
                }
                else if (i == 409) {
                    imageView.setImageResource(R.drawable.nine_of_spades);
                }
                else if (i == 410) {
                    imageView.setImageResource(R.drawable.ten_of_spades);
                }
                else if (i == 411) {
                    imageView.setImageResource(R.drawable.jack_of_spades);
                }
                else if (i == 412) {
                    imageView.setImageResource(R.drawable.queen_of_spades);

                }
                else if (i == 413) {
                    imageView.setImageResource(R.drawable.king_of_spades);
                }

                oa2.start();
            }
        });
        oa1.start();



        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        middleCard= findViewById(R.id.middleCard);
        middleCard2= findViewById(R.id.middleCard2);
        middleCard3= findViewById(R.id.middleCard3);
        middleCard4= findViewById(R.id.middleCard4);
        middleCard5= findViewById(R.id.middleCard5);
        middleCard6= findViewById(R.id.middleCard6);
        middleCard7= findViewById(R.id.middleCard7);
        middleCard8= findViewById(R.id.middleCard8);
        middleCard9= findViewById(R.id.middleCard9);
        middleCard10= findViewById(R.id.middleCard10);
        middleCard11= findViewById(R.id.middleCard11);
        middleCard12= findViewById(R.id.middleCard12);
        middleCard13= findViewById(R.id.middleCard13);
        middleCard14= findViewById(R.id.middleCard14);
        middleCard15= findViewById(R.id.middleCard15);
        middleCard16= findViewById(R.id.middleCard16);
        middleCard17= findViewById(R.id.middleCard17);
        middleCard18= findViewById(R.id.middleCard18);
        middleCard19= findViewById(R.id.middleCard19);
        middleCard20= findViewById(R.id.middleCard20);
        middleCard21= findViewById(R.id.middleCard21);
        middleCard22= findViewById(R.id.middleCard22);
        middleCard23= findViewById(R.id.middleCard23);
        middleCard24= findViewById(R.id.middleCard24);
        middleCard25= findViewById(R.id.middleCard25);
        middleCard26= findViewById(R.id.middleCard26);
        middleCard27= findViewById(R.id.middleCard27);
        middleCard28= findViewById(R.id.middleCard28);
        middleCard29= findViewById(R.id.middleCard29);
        middleCard30= findViewById(R.id.middleCard30);
        middleCard31= findViewById(R.id.middleCard31);
        middleCard32= findViewById(R.id.middleCard32);
        middleCard33= findViewById(R.id.middleCard33);
        middleCard34= findViewById(R.id.middleCard34);
        middleCard35= findViewById(R.id.middleCard35);
        middleCard36= findViewById(R.id.middleCard36);
        middleCard37= findViewById(R.id.middleCard37);
        middleCard38= findViewById(R.id.middleCard38);
        middleCard39= findViewById(R.id.middleCard39);
        middleCard40= findViewById(R.id.middleCard40);
        middleCard41= findViewById(R.id.middleCard41);
        middleCard42= findViewById(R.id.middleCard42);
        middleCard43= findViewById(R.id.middleCard43);
        middleCard44= findViewById(R.id.middleCard44);
        middleCard45= findViewById(R.id.middleCard45);
        middleCard46= findViewById(R.id.middleCard46);
        middleCard47= findViewById(R.id.middleCard47);
        middleCard48= findViewById(R.id.middleCard48);
        middleCard49= findViewById(R.id.middleCard49);
        middleCard50= findViewById(R.id.middleCard50);
        middleCard51= findViewById(R.id.middleCard51);
        middleCard52= findViewById(R.id.middleCard52);

        imageViews = new ArrayList<>(asList(middleCard,middleCard2,middleCard3,middleCard4,middleCard5,middleCard6,middleCard7,middleCard8,middleCard9,
                middleCard10,middleCard11,middleCard12, middleCard13, middleCard14, middleCard15, middleCard16, middleCard17, middleCard18, middleCard19, middleCard20,
                middleCard21, middleCard22, middleCard23, middleCard24, middleCard25,middleCard26, middleCard27, middleCard28, middleCard29, middleCard30, middleCard31,
                middleCard32, middleCard33, middleCard34, middleCard35, middleCard36, middleCard37, middleCard38, middleCard39, middleCard40, middleCard41, middleCard42,
                middleCard43, middleCard44, middleCard45, middleCard46, middleCard47,middleCard48, middleCard49,middleCard50, middleCard51, middleCard52));


        XAndY = new ArrayList<>();


        //6-9-12-3

        XAndY.add(new float[] {665, 980});
        XAndY.add(new float[] {770, 980});
        XAndY.add(new float[] {875, 980});
        XAndY.add(new float[] {980, 980});
        XAndY.add(new float[] {1085, 980});
        XAndY.add(new float[] {1190, 980});
        XAndY.add(new float[] {1295, 980});
        XAndY.add(new float[] {1400, 980});
        XAndY.add(new float[] {1505, 980});
        XAndY.add(new float[] {1610, 980});
        XAndY.add(new float[] {1715, 980});
        XAndY.add(new float[] {1820, 980});
        XAndY.add(new float[] {1925, 980});

        XAndY.add(new float[] {119, 140});
        XAndY.add(new float[] {119, 210});
        XAndY.add(new float[] {119, 280});
        XAndY.add(new float[] {119, 350});
        XAndY.add(new float[] {119, 420});
        XAndY.add(new float[] {119, 490});
        XAndY.add(new float[] {119, 560});
        XAndY.add(new float[] {119, 630});
        XAndY.add(new float[] {119, 700});
        XAndY.add(new float[] {119, 770});
        XAndY.add(new float[] {119, 840});
        XAndY.add(new float[] {119, 910});
        XAndY.add(new float[] {119, 980});

        XAndY.add(new float[] {665, 70});
        XAndY.add(new float[] {770, 70});
        XAndY.add(new float[] {875, 70});
        XAndY.add(new float[] {980, 70});
        XAndY.add(new float[] {1085, 70});
        XAndY.add(new float[] {1190, 70});
        XAndY.add(new float[] {1295, 70});
        XAndY.add(new float[] {1400, 70});
        XAndY.add(new float[] {1505, 70});
        XAndY.add(new float[] {1610, 70});
        XAndY.add(new float[] {1715, 70});
        XAndY.add(new float[] {1820, 70});
        XAndY.add(new float[] {1925, 70});

        XAndY.add(new float[] {2463, 140});
        XAndY.add(new float[] {2463, 210});
        XAndY.add(new float[] {2463, 280});
        XAndY.add(new float[] {2463, 350});
        XAndY.add(new float[] {2463, 420});
        XAndY.add(new float[] {2463, 490});
        XAndY.add(new float[] {2463, 560});
        XAndY.add(new float[] {2463, 630});
        XAndY.add(new float[] {2463, 700});
        XAndY.add(new float[] {2463, 770});
        XAndY.add(new float[] {2463, 840});
        XAndY.add(new float[] {2463, 910});
        XAndY.add(new float[] {2463, 980});

        cardIntegers = new ArrayList<>();
        for (int i=101; i<=113; i++) {
            cardIntegers.add(i);
        }
        for (int i=201; i<=213; i++) {
            cardIntegers.add(i);
        }
        for (int i=301; i<=313; i++) {
            cardIntegers.add(i);
        }
        for (int i=401; i<=413; i++) {
            cardIntegers.add(i);
        }

        //Map<Integer, ImageView> [101,

        Collections.shuffle(cardIntegers);
        final ArrayList<Integer> playerCards = new ArrayList<>();
        for (int i=0;i<13;i++) {
            playerCards.add(cardIntegers.get(i));
        }

        Collections.sort(playerCards);

        imageViews.get(0).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
            @Override
            public void run() {
                imageViews.get(0).animate().setDuration(200).translationYBy(-300);
                imageViews.get(5).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imageViews.get(5).animate().setDuration(200).translationYBy(-300);
                        imageViews.get(9).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                imageViews.get(9).animate().setDuration(200).translationYBy(-300);
                                imageViews.get(18).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                    @Override
                                    public void run() {
                                        imageViews.get(18).animate().setDuration(200).translationYBy(-300);
                                        imageViews.get(0).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                            @Override
                                            public void run() {
                                                imageViews.get(0).animate().setDuration(200).translationYBy(-300);
                                                imageViews.get(5).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        imageViews.get(5).animate().setDuration(200).translationYBy(-300);
                                                        imageViews.get(9).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                imageViews.get(9).animate().setDuration(200).translationYBy(-300);
                                                                imageViews.get(18).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                                                    @Override
                                                                    public void run() {
                                                                        imageViews.get(18).animate().setDuration(200).translationYBy(-300);
                                                                        CountDownTimer timer = new CountDownTimer(8000, 100) {
                                                                            @Override
                                                                            public void onTick(long millisUntilFinished) {

                                                                                if (j<=50) {
                                                                                    j++;

                                                                                    imageViews.get(j).animate()
                                                                                            .x(XAndY.get(j)[0])
                                                                                            .y(XAndY.get(j)[1])
                                                                                            .setDuration(1000)
                                                                                            .rotationBy(360)
                                                                                            .start();
                                                                                }

                                                                            }

                                                                            @Override
                                                                            public void onFinish() {
                                                                                CountDownTimer timer2 = new CountDownTimer(30000, 50) {
                                                                                    @Override
                                                                                    public void onTick(long millisUntilFinished) {

                                                                                        if (k<=11) {
                                                                                            k++;
                                                                                            assignImage(imageViews.get(k), playerCards.get(k));
                                                                                        }

                                                                                    }

                                                                                    @Override
                                                                                    public void onFinish() {
                                                                                        //Toast.makeText(MainActivity.this, "Let's go!", Toast.LENGTH_SHORT).show();

                                                                                    }
                                                                                }.start();

                                                                            }
                                                                        }.start();
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });

                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });

            }
        });
        /*startButton.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               //Collections.shuffle(cardIntegers);
                                               startButton.setVisibility(View.INVISIBLE);
                                               startButton.setEnabled(false);
                                               for (int j = 0; j < 52; j++) {
                                                   imageViews.get(j).animate()
                                                           .x(XAndY.get(j)[0])
                                                           .y(XAndY.get(j)[1])
                                                           .setDuration(1000)
                                                           .rotationBy(360)
                                                           .start();
                                               }

                                               button2.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       Collections.shuffle(cardIntegers);
                                                       for (int j = 0; j < 13; j++) {
                                                           assignImage(imageViews.get(j), cardIntegers.get(j));
                                                       }
                                                   }
                                               });


                                           }
                                       });*/
    }
}





            /*for (int i = 0; i < 52; i++) {
                final int finalI = i;
                imageViews.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (gameState == 0) {

                            for (int j = 0; j < 52; j++) {
                                imageViews.get(j).animate()
                                        .x(XAndY.get(j)[0])
                                        .y(XAndY.get(j)[1])
                                        .setDuration(1000)
                                        .rotation(360)
                                        .start();


                            }
                    }
                    }
                });
            }*/


        /*middleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                middleCard.animate()
                        .x(XAndY.get(51)[0])
                        .y(XAndY.get(51)[1])
                        .setDuration(1000)
                        .rotation(360)
                        .start();

                //Toast.makeText(MainActivity.this, String.valueOf(XAndY.get(51)[0]), Toast.LENGTH_SHORT).show();

            }
        });*/










/*ImageView imageView20;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView13;

    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    ImageView imageView18;
    ImageView imageView19;
    ImageView imageView34;
    ImageView imageView35;
    ImageView imageView36;
    ImageView imageView37;
    ImageView imageView38;
    ImageView imageView39;
    ImageView imageView40;

    ImageView imageView41;
    ImageView imageView43;
    ImageView imageView44;
    ImageView imageView45;
    ImageView imageView46;
    ImageView imageView47;
    ImageView imageView48;
    ImageView imageView49;
    ImageView imageView50;
    ImageView imageView51;
    ImageView imageView52;
    ImageView imageView53;
    ImageView imageView54;

    ImageView imageView55;
    ImageView imageView56;
    ImageView imageView57;
    ImageView imageView58;
    ImageView imageView59;
    ImageView imageView60;
    ImageView imageView61;
    ImageView imageView62;
    ImageView imageView63;
    ImageView imageView64;
    ImageView imageView65;
    ImageView imageView66;
    ImageView imageView67;*/


/*imageView20= findViewById(R.id.imageView20);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView13 = findViewById(R.id.imageView13);

        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView34 = findViewById(R.id.imageView34);
        imageView35 = findViewById(R.id.imageView35);
        imageView36 = findViewById(R.id.imageView36);
        imageView37 = findViewById(R.id.imageView37);
        imageView38 = findViewById(R.id.imageView38);
        imageView39 = findViewById(R.id.imageView39);
        imageView40 = findViewById(R.id.imageView40);

        imageView41 = findViewById(R.id.imageView41);
        imageView43 = findViewById(R.id.imageView43);
        imageView44 = findViewById(R.id.imageView44);
        imageView45 = findViewById(R.id.imageView45);
        imageView46 = findViewById(R.id.imageView46);
        imageView47 = findViewById(R.id.imageView47);
        imageView48 = findViewById(R.id.imageView48);
        imageView49 = findViewById(R.id.imageView49);
        imageView50 = findViewById(R.id.imageView50);
        imageView51 = findViewById(R.id.imageView51);
        imageView52 = findViewById(R.id.imageView52);
        imageView53 = findViewById(R.id.imageView53);
        imageView54 = findViewById(R.id.imageView54);

        imageView55 = findViewById(R.id.imageView55);
        imageView56 = findViewById(R.id.imageView56);
        imageView57 = findViewById(R.id.imageView57);
        imageView58 = findViewById(R.id.imageView58);
        imageView59 = findViewById(R.id.imageView59);
        imageView60 = findViewById(R.id.imageView60);
        imageView61 = findViewById(R.id.imageView61);
        imageView62 = findViewById(R.id.imageView62);
        imageView63 = findViewById(R.id.imageView63);
        imageView64 = findViewById(R.id.imageView64);
        imageView65 = findViewById(R.id.imageView65);
        imageView66 = findViewById(R.id.imageView66);
        imageView67 = findViewById(R.id.imageView67);


        ArrayList<ImageView> imageViews = new ArrayList<>(asList(imageView20, imageView, imageView2, imageView3,
                imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView13,
                imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView34, imageView35, imageView36,
                imageView37, imageView38, imageView39, imageView40, imageView41, imageView43, imageView44, imageView45, imageView46, imageView47,
                imageView48, imageView49, imageView50, imageView51, imageView52, imageView53, imageView54,
                imageView55, imageView56, imageView57, imageView58, imageView59, imageView60, imageView61, imageView62, imageView63, imageView64, imageView65,
                imageView66, imageView67));*/










