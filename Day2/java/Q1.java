class Cat{
    String name;
    int age;

    public Cat(){
        this.name = "Unknown";
        this.age = 0;
    }

    public void display(){
        System.out.println("Cat's Name: "+name);
        System.out.println("Cat's age: "+age);
    }

    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.display();
    }
}