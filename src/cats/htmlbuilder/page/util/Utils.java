package cats.htmlbuilder.page.util;

import java.util.Objects;

/**
 * Josh
 * 02/10/13
 * 6:25 PM
 */
public final class Utils {

    private Utils(){}

    public static boolean isNull(final Object object){
        return Objects.isNull(object);
    }

    public static boolean isEmpty(final String string){
        return string.trim().isEmpty();
    }

    public static void requireNonNull(final Object object, final String name){
        Objects.requireNonNull(object, name + " can't be null");
    }

    public static void requireNonEmpty(final String string, final String name){
        if(string.trim().isEmpty())
            throw new IllegalArgumentException(name + " can't be empty");
    }

    public static void requireNonNullAndNonEmpty(final String string, final String name){
        requireNonNull(string, name);
        requireNonEmpty(string, name);
    }

    public static void requireInBounds(final int value, final int min, final int max, final String name){
        if(value < min || value > max)
            throw new IllegalArgumentException(String.format("%s: %d is out of bounds: range [%d, %d]", name, value, min, max));
    }

    public static String tabs(final int n){
        final StringBuilder builder = new StringBuilder(n * 2);
        for(int i = 0; i < n; i++)
            builder.append("\t");
        return builder.toString();
    }
}
