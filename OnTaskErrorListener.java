package Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void error(String result);
}
