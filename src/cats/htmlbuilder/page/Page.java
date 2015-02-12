package cats.htmlbuilder.page;

import cats.htmlbuilder.page.stylesheet.Stylesheet;
import cats.htmlbuilder.page.view.PageView;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Josh
 * 02/10/13
 * 4:49 PM
 */
public class Page {

    private static final String DOCTYPE = "<!DOCTYPE html>";

    private final Element html;
    private Stylesheet stylesheet;

    public Page(final String title, final Stylesheet stylesheet){
        html = new Element("html");

        final Element head = new Element("head").parent(html);
        if(title != null && !title.trim().isEmpty())
            head.append(new Element("title", title).parent(head));

        html.append(head).append(new Element("body").parent(html));

        stylesheet(stylesheet);
    }

    public Page(final String title){
        this(title, null);
    }

    public Page(final Stylesheet stylesheet){
        this("Untitled", stylesheet);
    }

    public Page(){
        this("Untitled");
    }

    public String html(){
        final StringBuilder builder = new StringBuilder();
        builder.append(DOCTYPE);
        builder.append("\n");
        builder.append(html);
        return builder.toString();
    }

    public Element body(){
        return html.child(Element.TAG, "body");
    }

    public Element head(){
        return html.child(Element.TAG, "head");
    }

    public String title(){
        final Element t = head().child(Element.TAG, "title");
        return t == null ? "Untitled" : t.inner();
    }

    public Stylesheet stylesheet(){
        return stylesheet;
    }

    public Page stylesheet(final Stylesheet stylesheet){
        this.stylesheet = stylesheet;
        if(stylesheet == null)
            head().remove(head().child(Element.TAG, "style"));
        else if(!head().contains(Element.TAG, "style"))
            head().append(stylesheet);
        return this;
    }

    public void view(){
        final JFrame window = new JFrame(title());
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
        final PageView view = new PageView(this);
        window.add(view, BorderLayout.CENTER);
        window.setSize(500, 500);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public boolean viewInBrowser(){
        try{
            final File file = File.createTempFile(title(), ".html");
            Files.write(file.toPath(), html().getBytes());
            Desktop.getDesktop().browse(file.toURI());
            return true;
        }catch(IOException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public boolean write(final File directory) throws IOException {
        final File file = new File(directory, title() + ".html");
        Files.write(new File(directory, title() + ".html").toPath(), html().getBytes());
        return file.exists();
    }

}
