package guru.springframework.sfgpetclinic.model;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: sfg-pet-clinic.
 * Date: 11/11/2019.
 */
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
