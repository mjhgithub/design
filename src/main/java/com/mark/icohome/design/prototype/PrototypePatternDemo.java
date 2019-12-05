package com.mark.icohome.design.prototype;

/**
 * @author mjh
 */

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

/*        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
//            Shape shape = new Circle();
            Shape shape = ShapeCache.getShape("1");
//            shape.setId(String.valueOf(i));
        }
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Shape shape = new Circle();
//            Shape shape = ShapeCache.getShape("1");
//            shape.setId(String.valueOf(i));
        }
        System.out.println(System.currentTimeMillis() - start);*/
    }
}
