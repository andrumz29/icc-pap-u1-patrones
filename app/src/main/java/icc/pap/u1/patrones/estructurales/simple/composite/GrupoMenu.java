package icc.pap.u1.patrones.estructurales.simple.composite;
/**
 * Composite porque agrupa productos ElementoMenu
 * y calcula un precio en este caso es la sumatoria de todos los Elementos
 * GrupoMenu
 */

import java.util.ArrayList;
import java.util.List;

public class GrupoMenu implements ElementoMenu {

    private List<ElementoMenu> items;

    public GrupoMenu() {
        items = new ArrayList<>();
    }

    @Override
    public double precio() {
        return items.stream()
                    .mapToDouble(ElementoMenu::precio)
                    .sum();
    }

    public void addItem(ElementoMenu _item) {
        this.items.add(_item);
    }
}