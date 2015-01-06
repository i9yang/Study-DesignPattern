package ch16_visitor;

public interface Acceptor {
    void accept(Visitor visitor);
}
