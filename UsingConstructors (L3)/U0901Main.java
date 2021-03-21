package max.idea;

import java.util.Date;

public class U0901Main {
    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[10];
        for (int i = 0; i <= floatArr.length - 1; i++)
        {
            floatArr[i] = (float) Math.random();
            System.out.print(floatArr[i] + " ");
        }
        U0901WorkArray insWorkArrayInt = new U0901WorkArray(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray(floatArr);
        insWorkArrayInt.sum();
        insWorkArrayFloat.sum();
        //String[] strArr = new String[3];
        //U0901WorkArray insWorkArrayString = new U0901WorkArray(strArr);
        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem foodItem = new FoodItem(item_fld[0],Float.parseFloat(item_fld[1]),Short.parseShort(item_fld[2]));
        foodItem.printAll();








        GenericItem book = new GenericItem();
        GenericItem keyboard = new GenericItem();
        GenericItem cup = new GenericItem();
        book.ID = 1;
        book.name = "Java for Dummies";
        book.price = 1000;
        keyboard.ID = 2;
        keyboard.name = "Oklick";
        keyboard.price = 1500;
        cup.ID = 3;
        cup.name = "Basik";
        cup.price = 250;
        cup.category = GenericItem.Category.FOOD;
        //book.printAll();
        //keyboard.printAll();
        //cup.printAll();

        FoodItem Fruit = new FoodItem("Banana");
        Fruit.ID = 4;
        Fruit.price = 10;
        Fruit.category = GenericItem.Category.FOOD;
        Fruit.dateOfIncome = new Date();
        Fruit.expires = 5;
    }
}
