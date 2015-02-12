package cats.htmlbuilder.page.stylesheet;

import cats.htmlbuilder.page.Element;
import cats.htmlbuilder.page.util.Utils;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Josh
 * 04/10/13
 * 7:14 PM
 */
public class Stylesheet extends Element {

    private static final String TAG = "<style type=\"text/css\">";

    private final Map<String, Style> styles;

    public Stylesheet(){
        super("style");
        styles = new LinkedHashMap<>();
    }

    public Stylesheet add(final Style style){
        Utils.requireNonNull(style, "stylesheet style");
        styles.put(style.name(), style);
        return this;
    }

    public String toString(){
        final String tabs = Utils.tabs(1);
        final StringBuilder builder = new StringBuilder();
        builder.append(tabs);
        builder.append(TAG);
        builder.append("\n");
        styles.values().forEach(
                style -> {
                    builder.append(style);
                    builder.append("\n");
                }
        );
        builder.append(tabs);
        builder.append("</style>");
        builder.append("\n");
        return builder.toString();
    }
}
