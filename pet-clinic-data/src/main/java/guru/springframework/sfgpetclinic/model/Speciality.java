package guru.springframework.sfgpetclinic.model;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: sfg-pet-clinic.
 * Date: 4/2/2020.
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
