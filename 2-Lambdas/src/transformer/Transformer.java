package transformer;

@FunctionalInterface
public interface Transformer <T>{
    T transform (T value);
}
