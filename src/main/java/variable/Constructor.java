package variable;

class base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    class Derived extends base {
    	int y;

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
  
    }
}

    public class Constructor {

    public static void main(String[] args) {
        base b = new base();
        b.setX(100);
        System.out.println(b.getX());
    }
}
