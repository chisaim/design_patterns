package home.pb.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
