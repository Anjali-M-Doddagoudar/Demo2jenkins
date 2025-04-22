public class Company {
    private String name;
    private String location;
    private int numberOfEmployees;

    // Constructor to initialize the company details
    public Company(String name, String location, int numberOfEmployees) {
        this.name = name;
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Method to display company details
    public void displayCompanyInfo() {
        System.out.println("Company Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Employees: " + numberOfEmployees);
    }

    public static void main(String[] args) {
        // Create a Company object and pass details directly
        Company company = new Company("Tech Innovations", "New York", 150);

        // Display company information
        company.displayCompanyInfo();
    }
}