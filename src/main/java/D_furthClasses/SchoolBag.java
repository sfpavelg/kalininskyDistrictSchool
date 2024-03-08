package D_furthClasses;

public class SchoolBag {
    HomeBox homeBox = new HomeBox();

    public SchoolBag() {
    }

    void completingSchoolBag() {
        System.out.println("Комплектность портфеля:");
        System.out.println(homeBox.getBoxWithPens());
        System.out.println(homeBox.getBoxWithPencils());
        System.out.println(homeBox.getBoxWithRulers());
        System.out.println(homeBox.getBoxWithSchoolDiaries());
    }
    void completingSchoolBag(String sandwich){
        System.out.println("Комплектность портфеля:");
        System.out.println(homeBox.getBoxWithPens());
        System.out.println(homeBox.getBoxWithPencils());
        System.out.println(homeBox.getBoxWithRulers());
        System.out.println(homeBox.getBoxWithSchoolDiaries());
        System.out.println(sandwich);
    }

    void completingSchoolBag(String sneakers, String sportsUniform){
        System.out.println("Комплектность портфеля:");
        System.out.println(homeBox.getBoxWithPens());
        System.out.println(homeBox.getBoxWithPencils());
        System.out.println(homeBox.getBoxWithRulers());
        System.out.println(homeBox.getBoxWithSchoolDiaries());
        System.out.println(sneakers);
        System.out.println(sportsUniform);
    }
}
