package project;

import project.dao.ItemDao;
import project.entity.Item;

import java.util.Optional;

public class ItemDemo {
    public static void main(String[] args) {
        Optional<Item> itemOptional
//                = ItemDao.getItemInstance().saveItem(new Item("Shoes", "Nike"));
                = ItemDao.getItemInstance().saveItem(new Item ("Jeans", "Lee"));
        if (itemOptional.isPresent()) {
            System.out.println(itemOptional.get());
        }
    }
}
