package easytest.p1;

public class Game {
    
    public void play() throws Exception {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {
    
    public void play(String ball) {
        System.out.println("Playing Soccer with " + ball);
    }
}

class Run {
    
    public static void main(String[] args) throws Exception {
        Game g = new Soccer();
        
        g.play();
        
        Soccer s = (Soccer) g;
        s.play("asa");
        
        Soccer soccer = new Soccer();
        soccer.play();
        Game game = new Game();
        game.play();
        
    }
}

class Discounter {
    
    final static double percent = 2;//1
    int offset = 10, base = 50; //2

    public static double calc(double value) {
        int coupon, offset, base;
        if (percent < 10) { //4                   
            coupon = 15;
            offset = 20;
            base = 10;
        }
        return coupon * offset * base * value / 100; //5
    }
}

class Superclass {
    
    public Superclass(int z) {
        
    }
    
    public Superclass() {
    }
    
}

class Subclass extends Superclass {
    
    int i, j, k;
    
    public Subclass(int m, int n, int k) {
        
        this.i = m;
        this.j = n;
        this.k = k;
    }
    
    public Subclass(int m) {
        super(m);
    }
    
    @Override
    public String toString() {
        return i + " " + j + " " + k;
        
    }
    
    public static void main(String[] args) {
        
        Subclass s = new Subclass(34, 45, 32);
        
        System.out.println(s);
        
    }
    
}
