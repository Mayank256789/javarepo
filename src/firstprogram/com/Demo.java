package firstprogram.com;

 class Demo {
     public static void main(String[] args) {
         Human obj = new Human();
         obj.setAge(23);
         obj.setName("Mayank");
         System.out.println(obj.getAge() + " " + obj.getName());
     }
}
