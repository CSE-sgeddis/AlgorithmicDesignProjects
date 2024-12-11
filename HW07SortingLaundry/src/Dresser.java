/*
 * Written by Shalin Geddis
 */

class Dresser {
    private Clothing[][] clothes;

    // Constructor
    public Dresser() {
        this.clothes = new Clothing[5][10];
    }

    // Methods
    public void add(Clothing item) {
        switch (item.getType()) {
            case "Undergarment":
                addToDrawer(0, item);
                break;
            case "Socks":
            case "Stockings":
                addToDrawer(1, item);
                break;
            case "Top":
                addToDrawer(2, item);
                break;
            case "Bottom":
                addToDrawer(3, item);
                break;
            case "Cape":
                addToDrawer(4, item);
                break;
            default:
                System.out.println("Invalid clothing type");
        }
    }

    private void addToDrawer(int drawer, Clothing item) {
        for (int i = 0; i < 10; i++) {
            if (clothes[drawer][i] == null) {
                clothes[drawer][i] = item;
                return;
            }
        }
        System.out.println("Drawer " + drawer + " is full");
    }

    public void remove(Clothing item) {
        for (int drawer = 0; drawer < 5; drawer++) {
            for (int i = 0; i < 10; i++) {
                if (clothes[drawer][i] != null && clothes[drawer][i].equals(item)) {
                    clothes[drawer][i] = null;
                    return;
                }
            }
        }
        System.out.println("Item not found in dresser");
    }

    public void print() {
        for (int drawer = 0; drawer < 5; drawer++) {
            System.out.println("Drawer " + drawer + "\n");
            for (int i = 0; i < 10; i++) {
                if (clothes[drawer][i] != null) {
                    System.out.println(clothes[drawer][i]);
                }
            }
            System.out.println("\n");
        }
    }
}
