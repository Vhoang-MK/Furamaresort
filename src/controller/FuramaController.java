package controller;

import view.Menu;
import utils.Utils;
import service.EmployeeService;
import service.CustomerService;
import service.FacilityService;
import service.BookingService;
import service.PromotionService;

public class FuramaController extends Menu {
    private static final String MENU_TITLE = "==== FURAMA RESORT MANAGEMENT ====";
    private static final String[] MENU_OPTIONS = {
            "Employee Management",
            "Customer Management",
            "Facility Management",
            "Booking Management",
            "Promotion Management",
            "Exit"
    };

    private Menu<String> employeeManagementMenu;
    private Menu<String> customerManagementMenu;
    private Menu<String> facilityManagementMenu;
    private Menu<String> bookingManagementMenu;
    private Menu<String> promotionManagementMenu;

    private EmployeeService employeeService;
    private CustomerService customerService;
    private FacilityService facilityService;
    private BookingService bookingService;
    private PromotionService promotionService;

    public FuramaController() {
        super(MENU_TITLE, MENU_OPTIONS);

    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                runEmployeeManagementMenu();
                break;
            case 2:
                runCustomerManagementMenu();
                break;
            case 3:
                runFacilityManagementMenu();
                break;
            case 4:
                runBookingManagementMenu();
                break;
            case 5:
                runPromotionManagementMenu();
                break;
            case 6:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void runEmployeeManagementMenu() {
        String title = "--- EMPLOYEE MANAGEMENT ---";
        String[] options = {
                "Display employee list",
                "Add new employee",
                "Edit employee information",
                "Return to main menu"
        };

        employeeManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        employeeService.displayEmployeeList();
                        break;
                    case 2:
                        employeeService.addNewEmployee();
                        break;
                    case 3:
                        employeeService.editEmployee();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };

        employeeManagementMenu.run();
    }

    private void runCustomerManagementMenu() {
        String title = "--- CUSTOMER MANAGEMENT ---";
        String[] options = {
                "Display customer list",
                "Add new customer",
                "Edit customer information",
                "Return to main menu"
        };

        customerManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        customerService.displayCustomerList();
                        break;
                    case 2:
                        customerService.addNewCustomer();
                        break;
                    case 3:
                        customerService.editCustomer();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };

        customerManagementMenu.run();
    }

    private void runFacilityManagementMenu() {
        String title = "--- FACILITY MANAGEMENT ---";
        String[] options = {
                "Display facility list",
                "Add new facility",
                "Display facility maintenance list",
                "Return to main menu"
        };

        facilityManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        facilityService.displayFacilityList();
                        break;
                    case 2:
                        facilityService.addNewFacility();
                        break;
                    case 3:
                        facilityService.displayFacilityMaintenanceList();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };

        facilityManagementMenu.run();
    }

    private void runBookingManagementMenu() {
        String title = "--- BOOKING MANAGEMENT ---";
        String[] options = {
                "Add new booking",
                "Display booking list",
                "Create new contracts",
                "Display contracts",
                "Edit contracts",
                "Return to main menu"
        };

        bookingManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };

        bookingManagementMenu.run();
    }

    private void runPromotionManagementMenu() {
        String title = "--- PROMOTION MANAGEMENT ---";
        String[] options = {
                "Display list of customers using services",
                "Display list of customers getting vouchers",
                "Return to main menu"
        };

        promotionManagementMenu = new Menu<String>(title, options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        promotionService.displayCustomersUsingServices();
                        break;
                    case 2:
                        promotionService.displayCustomersGettingVouchers();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };

        promotionManagementMenu.run();
    }

    public static void main(String[] args) {
        new FuramaController().run();
    }
}
