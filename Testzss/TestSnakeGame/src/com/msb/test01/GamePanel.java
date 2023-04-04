package com.msb.test01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author : msb-zhaoss
 * GamePanel游戏面板   想具备面板的能力，必须继承一个面板类：
 */
public class GamePanel extends JPanel {
    //定义小蛇的长度：
    int length;
    //定义一个数组，专门用来存储小蛇的x轴坐标;
    int[] snakeX = new int[600];
    //定义一个数组，专门用来存储小蛇的y轴坐标;
    int[] snakeY = new int[600];

    //加入一个小蛇的行走方向：
    String direction ;
    //加入一个布尔类型的变量，来指定游戏是否开始：
    boolean isStart = false;//默认游戏没有开始
    //引入一个定时器：
    Timer timer;
    //加入一个坐标：
    //蛇师生是死：
    boolean isDie = false;//默认情况下，蛇是活着的

    //定义食物的xy轴坐标：
    int foodX;
    int foodY;
    //定义一个积分：
    int score;
    //对定义的属性进行初始化操作：
    public void init(){
        //初始化蛇的长度为3
        length = 3;
        //初始化  蛇头 坐标：
        snakeX[0] = 150;
        snakeY[0] = 275;
        //初始化 第一节身子 坐标：
        snakeX[1] = 125;
        snakeY[1] = 275;
        //初始化  第二节身子 坐标：
        snakeX[2] = 100;
        snakeY[2] = 275;
        //定义小蛇初始化方向：
        direction = "R";
        //初始化食物的坐标：
        foodX = 275;
        foodY = 125;
        //初始化积分：
        score = 0;
    }

    public GamePanel(){
        init();
        //将 系统焦点 放在面板上：
        this.setFocusable(true);
        //加入一个监听器：
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//监听按下去的动作：
                super.keyPressed(e);
                //获取你按的按键：
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode == KeyEvent.VK_SPACE){//按住空格了
                    if(isDie){
                        //恢复初始化动作：
                        init();
                        //死亡状态改为false:
                        isDie = false;
                    }else{
                        //将isStart设置为相反的值？？？
                        isStart = !isStart;
                        //页面重新绘制：
                        repaint();//底层调用的还是paintComponent
                    }
                }
                if(keyCode == KeyEvent.VK_UP){
                    direction = "U" ;
                }
                if(keyCode == KeyEvent.VK_DOWN){
                    direction = "D" ;
                }
                if(keyCode == KeyEvent.VK_LEFT){
                    direction = "L" ;
                }
                if(keyCode == KeyEvent.VK_RIGHT){
                    direction = "R" ;
                }
            }
        });
        //给定时器初始化 ---》  创建定时器具体的对象：100ms

        timer = new Timer(100, new ActionListener() {
            //actionPerformed 就是一个 每100毫秒 程序执行一次的方法：
            @Override
            public void actionPerformed(ActionEvent e) {
                //每100毫秒，蛇的坐标要动一次：
                //&&isDie == false 游戏是开始的情况下，蛇是没死的情况：蛇才会动：
                if(isStart == true&&isDie == false){//如果游戏是开始的，那么小蛇动一次
                    //蛇开始动 --》 坐标动：
                    //先动身子，再动头：
                    //身子动
                    for (int i = length-1; i > 0 ; i--) {
                        snakeX[i] = snakeX[i-1];
                        snakeY[i] = snakeY[i-1];
                    }
                    //头动：
                    //按照行走 的方向改变蛇头的坐标：
                    switch (direction){
                        case "U" : snakeY[0] = snakeY[0] - 25;break;
                        case "D" : snakeY[0] = snakeY[0] + 25;break;
                        case "L" : snakeX[0] = snakeX[0] - 25;break;
                        case "R" : snakeX[0] = snakeX[0] + 25;break;
                    }

                    //给蛇行走设置边界：防止小蛇飞出去：
                    if(snakeX[0] > 750){
                        snakeX[0] = 25;
                    }
                    if(snakeX[0] <25){
                        snakeX[0] = 750;
                    }
                    if(snakeY[0] < 100){
                        snakeY[0] = 725;
                    }
                    if(snakeY[0] > 725){
                        snakeY[0] = 100;
                    }

                    //当蛇头和食物碰撞的时候，食物的坐标改变：
                    if(snakeX[0] == foodX&&snakeY[0] == foodY){
                        //蛇长度加1：
                        length++;
                        //食物的坐标发生改变：
                        /*
                        [25,725]之间被25整除的数
                        [25,725]/25 = [1,29]*25 = [25,725]
                        [1,29]:
                        Math.random - [0.0,1.0)
                        Math.random*29 - [0.0,29.0)
                        (int)(Math.random*29) - [0,28]
                        (int)(Math.random*29) + 1 - [1,29]
                        ((int)(Math.random*29) + 1)*25 - [25,725]
                         */

                        foodX = ((int)(Math.random()*29) + 1)*25;
                        foodY = ((int)(Math.random()*26) + 4)*25; //[100,725]/25 = [4,29]*25   -- ([1,26]+3)*25

                        score += 10; //score = (length-3)*10;
                    }

                    //判断蛇是否死亡：
                    //蛇什么时候死：只要蛇头跟任意一节身子重合，就是死：
                    for (int i = 1; i < length ; i++) {
                        if(snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
                            isDie = true;//蛇死亡了
                        }
                    }


                    //在蛇坐标改完以后，页面刷新：
                    repaint();
                }
            }
        });
        //定时器必须要启动：
        timer.start();
    }
    //重写一个方法：paintComponent
    //所有在面板中画图的逻辑，都要写在这个方法里
    //paintComponent底层自动调用，无需我们调用
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //设置面板的背景颜色：
        this.setBackground(new Color(209, 237, 239));
        //插入一个头部图片：
        Images.headerImg.paintIcon(this,g,10,10);
        //画一个矩形区域：
        //将画笔的颜色改变一下：
        g.setColor(new Color(239, 219, 218));
        g.fillRect(10,70,770,685);

        //在对应的位置，将蛇头画进去：
        switch (direction){
            case "L" : Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "R" : Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "U" : Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "D" : Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
        }
        //在对应的位置，将第1节身子画进去：
        //Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
        //在对应的位置，将第2节身子画进去：
        //Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);
        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //游戏没有开始，面板中要加入一句话加入一个提示：点击空格游戏开始：
        if(isStart == false){//游戏是暂停的：
            //中间写入文字：
            g.setColor(new Color(159, 123, 214));
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("点击空格开始游戏",250,330);
        }

        //画食物：
        Images.foodImg.paintIcon(this,g,foodX,foodY);
        //画积分：
        //中间写入文字：
        g.setColor(new Color(255, 255, 255));
        g.setFont(new Font("微软雅黑",Font.BOLD,20));
        g.drawString("积分为：" + score,620,40);
        //判断死亡状态：
        if(isDie){
            g.setColor(new Color(255, 82, 109));
            g.setFont(new Font("微软雅黑",Font.BOLD,20));
            g.drawString("小蛇死亡，游戏停止，按下空格游戏重新开始！",100,350);
        }
    }
}
