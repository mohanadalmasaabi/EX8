public class task1 {
    interface Salary{
        double salaryToPay(double hours, double rate);
        default double salaryForOvertime(double overtime, double rate){
            return 5;
        }
        static int bonus(int yearsOfExperience){
            if(yearsOfExperience>3){
                return 90;
            }else{
                return 0;
            }
        }
    }

    public class Task1 {
        String surnamealmasaabi60527;
        String namealmasaabi60527;
        String streetalmasaabi60527;
        String zipCodealmasaabi60527;
        String cityalmasaabi60527;

        public void initialize() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Getting Info about the person");
            System.out.println("Enter your surname");
            surnamealmasaabi60527 = br.readLine();
            System.out.println("Enter your first name");
            namealmasaabi60527 = br.readLine();
            System.out.println("Enter street");
            streetalmasaabi60527 = br.readLine();
            System.out.println("Enter your zip code");
            zipCodealmasaabi60527 = br.readLine();
            System.out.println("Enter city");
            cityalmasaabi60527 = br.readLine();

        }

        public void print() {
            System.out.println("Displaying information");
            System.out.println("       ");
            System.out.println("Surname:" + surnamealmasaabi60527);
            System.out.println("First name:" + namealmasaabi60527);
            System.out.println("Street:" + streetalmasaabi60527);
            System.out.println("Zip code:" + zipCodealmasaabi60527);
            System.out.println("City:" + cityalmasaabi60527);
        }
    }

    class Staff extends Task1 implements Salary{
        String educationalmasaabi60527;
        String positionalmasaabi60527;

        public void initialize1() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            initialize();
            System.out.println("Enter your education");
            educationalmasaabi60527 = br.readLine();
            System.out.println("Enter your position");
            positionalmasaabi60527 = br.readLine();
        }


        public void print1() {
            print();
            System.out.println("Education:" + educationalmasaabi60527);
            System.out.println("Position:" + positionalmasaabi60527);
        }

        @Override
        public double salaryToPay(double hours, double rate) {
            return hours*rate;
        }

        @Override
        public double salaryForOvertime(double overtime, double rate) {
            return overtime * (3 * rate);
        }
    }

    class Payment{
        public static void main(String[] args) throws IOException{
            Staff worker = new Staff();

            double salary = worker.salaryToPay(150,25);
            System.out.println("Salary received by the worker is: " + salary);
            double overtimeSalary = worker.salaryForOvertime(7,40 );
            System.out.println("Salary for Overtime received by the worker is: " + overtimeSalary);
            int extra = Salary.bonus(4);
            System.out.println("Bonus provided is: " + extra);
}
