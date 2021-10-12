package StayAbroad.Family;

public class Family {
    private Integer id_family;
    private String name;
    private Integer min_age;
    private Integer max_age;
    private Integer num_children;
    private String email;
    private Integer id_family_house;

    public Family() {
    }

    public Family(Integer id_family, String name, Integer min_age, Integer max_age, Integer num_children, String email, Integer id_family_house) {
        this.id_family = id_family;
        this.name = name;
        this.min_age = min_age;
        this.max_age = max_age;
        this.num_children = num_children;
        this.email = email;
        this.id_family_house = id_family_house;
    }

    public Integer getId_family() {
        return id_family;
    }

    public void setId_family(Integer id_family) {
        this.id_family = id_family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMin_age() {
        return min_age;
    }

    public void setMin_age(Integer min_age) {
        this.min_age = min_age;
    }

    public Integer getMax_age() {
        return max_age;
    }

    public void setMax_age(Integer max_age) {
        this.max_age = max_age;
    }

    public Integer getNum_children() {
        return num_children;
    }

    public void setNum_children(Integer num_children) {
        this.num_children = num_children;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId_family_house() {
        return id_family_house;
    }

    public void setId_family_house(Integer id_family_house) {
        this.id_family_house = id_family_house;
    }

    @Override
    public String toString() {
        return "Family{" + "id_family=" + id_family + ", name=" + name + ", min_age=" + min_age + ", max_age=" + max_age + ", num_children=" + num_children + ", email=" + email + ", id_family_house=" + id_family_house + '}';
    }
    
}
