package ie.atu.productv5;

public class TV extends Product{
        private String screen;
        private String manufacture;

        public TV()
        {
            super();
            screen = "";
            manufacture = "";
            count++;

        }

        public String getScreen() { return screen; }

        public void setScreen(String screen) { this.screen = screen; }

        public String getManufacture() {return manufacture; }

        public void setManufacture(String manufacture) { this.manufacture =manufacture; }

        @Override
        public String toString() {
            return super.toString() +  " " + "bv" + screen + manufacture;
        }





}
