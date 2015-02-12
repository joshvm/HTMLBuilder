package cats.htmlbuilder.example;

import cats.htmlbuilder.page.Element;
import cats.htmlbuilder.page.Page;
import cats.htmlbuilder.page.stylesheet.Style;
import cats.htmlbuilder.page.stylesheet.Stylesheet;
import java.awt.Color;

import static cats.htmlbuilder.page.Element.BODY;
import static cats.htmlbuilder.page.Element.LI;
import static cats.htmlbuilder.page.Element.P;
import static cats.htmlbuilder.page.Element.UL;
import static cats.htmlbuilder.page.Element.TAG;
import static cats.htmlbuilder.page.stylesheet.Style.BACKGROUND_COLOR;
import static cats.htmlbuilder.page.stylesheet.Style.CLASS;
import static cats.htmlbuilder.page.stylesheet.Style.COLOR;
import static cats.htmlbuilder.page.stylesheet.Style.ELEMENT;
import static cats.htmlbuilder.page.stylesheet.Style.FONT_FAMILY;
import static cats.htmlbuilder.page.stylesheet.Style.TEXT_ALIGN;

/**
 * Josh
 * 03/10/13
 * 10:26 AM
 */
public class Example {

    public static void main(String args[]) {
        final Stylesheet stylesheet = new Stylesheet();
        stylesheet.add(new Style(ELEMENT, BODY).property(BACKGROUND_COLOR, Color.YELLOW));
        stylesheet.add(new Style(ELEMENT, LI).property(COLOR, Color.RED).property(BACKGROUND_COLOR, Color.BLACK).property(FONT_FAMILY, "Verdana"));
        stylesheet.add(new Style(ELEMENT, LI).style(ELEMENT, LI).property(COLOR, Color.BLUE));
        stylesheet.add(new Style(ELEMENT, P).property(COLOR, Color.BLACK));
        stylesheet.add(new Style(CLASS, "para").property(COLOR, Color.BLACK).property(BACKGROUND_COLOR, Color.WHITE).property(TEXT_ALIGN, "center"));
        final Page page = new Page("Example page", stylesheet);
        final Element list = new Element(UL);
        list.append(LI, "Item 1").append(LI, "Item 2").append(LI, "Item 3");
        final Element nested = new Element(UL);
        nested.append(LI, "Nested Item 1").append(LI, "Nested Item 2").append(LI, "Nested Item 3");
        list.child(TAG, LI, 2).append(nested);
        list.append(LI, "Item 4").append(LI, "Item 5").append(LI, "Item 6");
        page.body().append(list);
        page.body().append(new Element(P, "This is a paragraph").attribute("class", "para"));
        page.body().append(new Element(P, "This is another paragraph"));
        page.view();
    }
}
