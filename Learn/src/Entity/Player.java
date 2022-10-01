package Entity;

public class Player extends Human {
    public Player(String name) {
        super(name);
    }

    class Backpack {

        private String staff = "";

        public void put(String thing) {
            staff += thing + ",";
        }

        @Override
        public String toString() {
            if (staff.equals("")) {
                return "The packback is empty";
            } else return staff.substring(0, staff.length() - 1) + " in the backpack";
        }
    }
}
