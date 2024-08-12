public class person {
    String name;
    String address;
    int ade ;

    public person(String name, String address, int ade) {
        this.name = name;
        this.address = address;
        this.ade = ade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAde() {
        return ade;
    }

    public void setAde(int ade) {
        this.ade = ade;
    }


}
