/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
    /**
     * Employee name.
     */
    private String name;
    /**
     * Employee manager
     */
    private String manager;

    /**
     * Constructor for initialization.
     *
     * @param name name
     * @param manager manager
     */
    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     *
     * @param name Checkstyle is bad.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for manager.
     *
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     *
     * @param manager Checkstyle violates the Sun Coding Conventions here
     */
    public void setManager(final String manager) {
        this.manager = manager;
    }
}
