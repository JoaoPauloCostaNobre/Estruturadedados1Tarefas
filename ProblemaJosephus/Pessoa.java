
class Pessoa {
    int number;
    String name;
    String phone;
    String address;
    String cpf;

    Pessoa(int number, String name, String phone, String address, String cpf) {
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}


