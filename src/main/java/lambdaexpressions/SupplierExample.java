package lambdaexpressions;

import java.util.function.Supplier;

public class SupplierExample implements Supplier<String> {
    @Override
    public String get() {
        return "Hello!";
    }
}
