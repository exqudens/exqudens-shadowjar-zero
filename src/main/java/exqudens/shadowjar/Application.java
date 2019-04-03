package exqudens.shadowjar;

import com.google.common.collect.ImmutableMap;

public class Application {

    public static void main(String... args) {
        try {
            System.out.println(ImmutableMap.of(1, "a"));
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw e;
        } catch (Throwable t) {
            t.printStackTrace();
            throw new RuntimeException(t);
        }
    }

}
