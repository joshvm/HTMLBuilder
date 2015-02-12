package cats.htmlbuilder.page.view;

import cats.htmlbuilder.page.Page;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 * Josh
 * 04/10/13
 * 6:58 PM
 */
public class PageView extends JPanel{

    private class SourceViewComponent extends JPanel{

        private final JTextArea source;

        private SourceViewComponent(){
            super(new BorderLayout());

            source = new JTextArea(page.html());
            source.setLineWrap(true);
            source.setWrapStyleWord(true);
            source.setEditable(false);

            add(new JScrollPane(source), BorderLayout.CENTER);
        }
    }

    private final JEditorPane content;
    private final Page page;

    public PageView(final Page page){
        super(new BorderLayout());
        this.page = page;

        content = new JEditorPane("text/html", page.html());
        content.setEditable(false);
        content.addMouseListener(
                new MouseAdapter() {
                    public void mousePressed(final MouseEvent e) {
                        if (e.getButton() != MouseEvent.BUTTON3)
                            return;
                        final JPopupMenu popup = new JPopupMenu();
                        final JMenuItem source = new JMenuItem("View Source");
                        source.addActionListener(
                                ev -> {
                                    final JFrame window = new JFrame("View source: " + page.title());
                                    window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                                    window.setLayout(new BorderLayout());
                                    window.add(new SourceViewComponent(), BorderLayout.CENTER);
                                    window.setSize(500, 500);
                                    window.setVisible(true);
                                    window.setLocationRelativeTo(null);
                                }
                        );
                        popup.add(source);
                        popup.show(content, e.getX(), e.getY());
                    }
                }
        );

        add(new JScrollPane(content), BorderLayout.CENTER);
    }

    public Page page(){
        return page;
    }
}
