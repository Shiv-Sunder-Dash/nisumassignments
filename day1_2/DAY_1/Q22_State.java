package DAY_1;
class Q22_State {
    public void showInfo() {
        System.out.println("This is a generic state.");
    }
}
class California extends Q22_State {
    public void showFamousPlace() {
        System.out.println("Famous place: Golden Gate Bridge.");
    }
}
class SubclassMethodAccessDemo {
    public static void main(String[] args) {
        Q22_State state = new California();
        state.showInfo();
        if (state instanceof California) {
            ((California) state).showFamousPlace();
        }
    }
}
