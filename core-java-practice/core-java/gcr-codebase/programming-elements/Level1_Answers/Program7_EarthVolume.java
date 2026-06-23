package Level1_Answers;

class EarthVolume {

    public static void main(String[] args) {

        double r = 6378;
        double pi = Math.PI;

        double km = (4.0 / 3) * pi * Math.pow(r, 3);
        double miles = km / 4.096;

        System.out.println("The volume of earth in cubic kilometers is " + km
                + " and cubic miles is " + miles);

    }
}