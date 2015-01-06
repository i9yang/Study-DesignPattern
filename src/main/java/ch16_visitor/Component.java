package ch16_visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Component implements Acceptor {
    protected List<Component> children = new ArrayList<Component>();
    private String componentName;

    public Component(String componentName) {
        this.componentName = componentName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getComponentName() {
        return componentName;
    }

    public abstract void add(Component c);

    public List<Component> getChildren() {
        return children;
    }

     public String getString() {
        return getString(0);
    }

    private String getString(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }

        if (this instanceof Composite) {
            sb.append("+" + getComponentName() + "\n");
            for (Component comp : children) {
                sb.append(comp.getString(depth + 1));
            }
        } else {
            sb.append("-" + getComponentName() + "\n");
        }
        return sb.toString();
    }
}

