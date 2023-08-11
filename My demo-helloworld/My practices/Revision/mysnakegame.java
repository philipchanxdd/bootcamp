import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeGame extends JPanel implements Runnable, KeyListener {

    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 500, HEIGHT = 500;

    private Thread thread;

    private boolean running;

    private boolean right = true, left = false, up = false, down = false;

    private BodyPart b;
    private ArrayList<BodyPart> snake;

    private Apple apple;
    private ArrayList<Apple> apples;

    private Random r;

    private int xCoor = 10, yCoor = 10, size = 5;

    private int ticks = 0;

    public SnakeGame() {

        setFocusable(true);

        addKeyListener(this);

        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        r = new Random();

        snake = new ArrayList<BodyPart>();
        apples = new ArrayList<Apple>();

        start();
    }

    public void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void tick() {

        if (snake.size() == 0) {
            b = new BodyPart(xCoor, yCoor, 10);
            snake.add(b);
        }

        ticks++;

        if (ticks > 250000) {

            if (right)
                xCoor++;
            if (left)
                xCoor--;
            if (up)
                yCoor--;
            if (down)
                yCoor++;

            ticks = 0;

            b = new BodyPart(xCoor, yCoor, 10);
            snake.add(b);

            if (snake.size() > size) {
                snake.remove(0);
            }
        }

        if (apples.size() == 0) {
            int xCoor = r.nextInt(49);
            int yCoor = r.nextInt(49);

            apple = new Apple(xCoor, yCoor, 10);
            apples.add(apple);
        }

        for (int i = 0; i < apples.size(); i++) {
            if (xCoor == apples.get(i).getxCoor() && yCoor == apples.get(i).getyCoor()) {
                size++;
                apples.remove(i);
                i++;
            }
        }

        for (int i = 0; i < snake.size(); i++) {
            if (xCoor == snake.get(i).getxCoor() && yCoor == snake.get(i).getyCoor()) {
                if (i != snake.size() - 1) {
                    stop();
                }
            }
        }

        if (xCoor < 0 || xCoor > 49 || yCoor < 0 || yCoor > 49) {
            stop();
        }
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.WHITE);
        for (int i = 0; i < WIDTH / 10; i++) {
            g.drawLine(i * 10, 0, i * 10, HEIGHT);
        }

        for (int i = 0; i < HEIGHT / 10; i++) {
            g.drawLine(0, i * 10, WIDTH, i * 10);
        }

        for (int i = 0; i < snake.size(); i++) {
            snake.get(i).draw(g);
        }

        for (int i = 0; i < apples.size(); i++) {
            apples.get(i).draw(g);
        }
    }

    public void run() {

        while (running) {
            tick();
            repaint();
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT && !left) {
            up = false;
            down = false;
            right = true;
        }

        if (key == KeyEvent.VK_LEFT && !right) {
            up = false;
            down = false;
            left = true;
        }

        if (key == KeyEvent.VK_UP && !down) {
            left = false;
            right = false;
            up = true;
        }

        if (key == KeyEvent.VK_DOWN && !up){
            left = false;
            right = false;
            down = true;
        }
    }

    public void keyReleased(KeyEvent arg0) {
    }

    public void keyTyped(KeyEvent arg0) {
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new SnakeGame());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public class BodyPart {

        private int xCoor, yCoor, width, height;

        public BodyPart(int xCoor, int yCoor, int tileSize) {
            this.xCoor = xCoor;
            this.yCoor = yCoor;
            width = tileSize;
            height = tileSize;
        }

        public void tick() {
        }

        public void draw(Graphics g) {
            g.setColor(Color.GREEN);
            g.fillRect(xCoor * width, yCoor * height, width, height);
        }

        public int getxCoor() {
            return xCoor;
        }

        public void setxCoor(int xCoor) {
            this.xCoor = xCoor;
        }

        public int getyCoor() {
            return yCoor;
        }

        public void setyCoor(int yCoor) {
            this.yCoor = yCoor;
        }
    }

    public class Apple {

        private int xCoor, yCoor, width, height;

        public Apple(int xCoor, int yCoor, int tileSize) {
            this.xCoor = xCoor;
            this.yCoor = yCoor;
            width = tileSize;
            height = tileSize;
        }

        public void tick() {
        }

        public void draw(Graphics g) {
            g.setColor(Color.RED);
            g.fillRect(xCoor * width, yCoor * height, width, height);
        }

        public int getxCoor() {
            return xCoor;
        }

        public void setxCoor(int xCoor) {
            this.xCoor = xCoor;
        }

        public int getyCoor() {
            return yCoor;
        }

        public void setyCoor(int yCoor) {
            this.yCoor = yCoor;
        }
    }

}