package cats.htmlbuilder.page;

import cats.htmlbuilder.page.util.Utils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Josh
 * 02/10/13
 * 4:51 PM
 */
public class Element {

    /** Defines a hyperlink */
    public static final String A = "a";

    /** Defines an abbreviation */
    public static final String ABBR = "abbr";

    /** Not supported in HTML5. Defines an acronym */
    public static final String ACRONYM = "acronym";

    /** Defines contact information for the author/owner of a document */
    public static final String ADDRESS = "address";

    /** Not supported in HTML5. Deprecated in HTML 4.01. Defines an embedded applet */
    public static final String APPLET = "applet";

    /** Defines an area inside an image-map */
    public static final String AREA = "area";

    /** Defines an article */
    public static final String ARTICLE = "article";

    /** Defines content aside from the page content */
    public static final String ASIDE = "aside";

    /** Defines sound content */
    public static final String AUDIO = "audio";

    /** Defines bold text */
    public static final String B = "b";

    /** Specifies the base URL/target for all relative URLs in a document */
    public static final String BASE = "base";

    /** Not supported in HTML5. Deprecated in HTML 4.01. Specifies a default color, size, and font for all text in a document */
    public static final String BASEFONT = "basefont";

    /** Isolates a part of text that might be formatted in a different direction from other text outside it */
    public static final String BDI = "bdi";

    /** Overrides the current text direction */
    public static final String BDO = "bdo";

    /** Not supported in HTML5. Defines big text */
    public static final String BIG = "big";

    /** Defines a section that is quoted from another source */
    public static final String BLOCKQUOTE = "blockquote";

    /** Defines the document's body */
    public static final String BODY = "body";

    /** Defines a single line break */
    public static final String BR = "br";

    /** Defines a clickable button */
    public static final String BUTTON = "button";

    /** Used to draw graphics, on the fly, via scripting (usually JavaScript) */
    public static final String CANVAS = "canvas";

    /** Defines a table caption */
    public static final String CAPTION = "caption";

    /** Not supported in HTML5. Deprecated in HTML 4.01. Defines centered text */
    public static final String CENTER = "center";

    /** Defines the title of a work */
    public static final String CITE = "cite";

    /** Defines a piece of computer code */
    public static final String CODE = "code";

    /** Specifies column properties for each column within a <colgroup> element  */
    public static final String COL = "col";

    /** Specifies a group of one or more columns in a table for formatting */
    public static final String COLGROUP = "colgroup";

    /** Defines a command button that a user can invoke */
    public static final String COMMAND = "command";

    /** Specifies a list of pre-defined options for input controls */
    public static final String DATALIST = "datalist";

    /** Defines a description/value of a term in a description list */
    public static final String DD = "dd";

    /** Defines text that has been deleted from a document */
    public static final String DEL = "del";

    /** Defines additional details that the user can view or hide */
    public static final String DETAILS = "details";

    /** Defines a definition term */
    public static final String DFN = "dfn";

    /** Defines a dialog box or window */
    public static final String DIALOG = "dialog";

    /** Not supported in HTML5. Deprecated in HTML 4.01. Defines a directory list */
    public static final String DIR = "dir";

    /** Defines a section in a document */
    public static final String DIV = "div";

    /** Defines a description list */
    public static final String DL = "dl";

    /** Defines a term/name in a description list */
    public static final String DT = "dt";

    /** Defines emphasized text  */
    public static final String EM = "em";

    /** Defines a container for an external (non-HTML) application */
    public static final String EMBED = "embed";

    /** Groups related elements in a form */
    public static final String FIELDSET = "fieldset";

    /** Defines a caption for a <figure> element */
    public static final String FIGCAPTION = "figcaption";

    /** Specifies self-contained content */
    public static final String FIGURE = "figure";

    /** Not supported in HTML5. Deprecated in HTML 4.01. Defines font, color, and size for text */
    public static final String FONT = "font";

    /** Defines a footer for a document or section */
    public static final String FOOTER = "footer";

    /** Defines an HTML form for user input */
    public static final String FORM = "form";

    /** Not supported in HTML5. Defines a window (a frame) in a frameset */
    public static final String FRAME = "frame";

    /** Not supported in HTML5. Defines a set of frames */
    public static final String FRAMESET = "frameset";

    /** Defines HTML heading */
    public static final String H1 = "h1";

    /** Defines HTML heading */
    public static final String H2 = "h2";

    /** Defines HTML heading */
    public static final String H3 = "h3";

    /** Defines HTML heading */
    public static final String H4 = "h4";

    /** Defines HTML heading */
    public static final String H5 = "h5";

    /** Defines HTML heading */
    public static final String H6 = "h5";

    /** Defines information about the document */
    public static final String HEAD = "head";

    /** Defines a header for a document or section */
    public static final String HEADER = "header";

    /** Defines a thematic change in the content */
    public static final String HR = "hr";

    /** Defines the root of an HTML document */
    public static final String HTML = "html";

    /** Defines a part of text in an alternate voice or mood */
    public static final String I = "i";

    /** Defines an inline frame */
    public static final String IFRAME = "iframe";

    /** Defines an image */
    public static final String IMG = "img";

    /** Defines an input control */
    public static final String INPUT = "input";

    /** Defines a text that has been inserted into a document */
    public static final String INS = "ins";

    /** Defines keyboard input */
    public static final String KBD = "kbd";

    /** Defines a key-pair generator field (for forms) */
    public static final String KEYGEN = "keygen";

    /** Defines a label for an <input> element */
    public static final String LABEL = "label";

    /** Defines a caption for a <fieldset> element */
    public static final String LEGEND = "legend";

    /** Defines a list item */
    public static final String LI = "li";

    /** Defines the relationship between a document and an external resource (most used to link to style sheets) */
    public static final String LINK = "link";

    /** Defines a client-side image-map */
    public static final String MAP = "map";

    /** Defines marked/highlighted text */
    public static final String MARK = "mark";

    /** Defines a list/menu of commands */
    public static final String MENU = "menu";

    /** Defines metadata about an HTML document */
    public static final String META = "meta";

    /** Defines a scalar measurement within a known range (a gauge) */
    public static final String METER = "meter";

    /** Defines navigation links */
    public static final String NAV = "nav";

    /** Not supported in HTML5. Defines an alternate content for users that do not support frames */
    public static final String NOFRAMES = "noframes";

    /** Defines an alternate content for users that do not support client-side scripts */
    public static final String NOSCRIPT = "noscript";

    /** Defines an embedded object */
    public static final String OBJECT = "object";

    /** Defines an ordered list */
    public static final String OL = "ol";

    /** Defines a group of related options in a drop-down list */
    public static final String OPTGROUP = "optgroup";

    /** Defines an option in a drop-down list */
    public static final String OPTION = "option";

    /** Defines the result of a calculation */
    public static final String OUTPUT = "output";

    /** Defines a paragraph */
    public static final String P = "p";

    /** Defines a parameter for an object */
    public static final String PARAM = "param";

    /** Defines preformatted text */
    public static final String PRE = "pre";

    /** Represents the progress of a task */
    public static final String PROGRESS = "progress";

    /** Defines a short quotation */
    public static final String Q = "q";

    /** Defines what to show in browsers that do not support ruby annotations */
    public static final String RP = "rp";

    /** Defines an explanation/pronunciation of characters (for East Asian typography) */
    public static final String RT = "rt";

    /** Defines a ruby annotation (for East Asian typography) */
    public static final String RUBY = "ruby";

    /** Defines text that is no longer correct */
    public static final String S = "s";

    /** Defines sample output from a computer program */
    public static final String SAMP = "samp";

    /** Defines a client-side script */
    public static final String SCRIPT = "script";

    /** Defines a section in a document */
    public static final String SECTION = "section";

    /** Defines a drop-down list */
    public static final String SELECT = "select";

    /** Defines smaller text */
    public static final String SMALL = "small";

    /** Defines multiple media resources for media elements (<video> and <audio>) */
    public static final String SOURCE = "source";

    /** Defines a section in a document */
    public static final String SPAN = "span";

    /** Not supported in HTML5. Deprecated in HTML 4.01. Defines strikethrough text */
    public static final String STRIKE = "strike";

    /** Defines important text */
    public static final String STRONG = "strong";

    /** Defines style information for a document */
    public static final String STYLE = "style";

    /** Defines subscripted text */
    public static final String SUB = "sub";

    /** Defines a visible heading for a <details> element */
    public static final String SUMMARY = "summary";

    /** Defines superscripted text */
    public static final String SUP = "sup";

    /** Defines a table */
    public static final String TABLE = "table";

    /** Groups the body content in a table */
    public static final String TBODY = "tbody";

    /** Defines a cell in a table */
    public static final String TD = "td";

    /** Defines a multiline input control (text area) */
    public static final String TEXTAREA = "textarea";

    /** Groups the footer content in a table */
    public static final String TFOOT = "tfoot";

    /** Defines a header cell in a table */
    public static final String TH = "th";

    /** Groups the header content in a table */
    public static final String THEAD = "thead";

    /** Defines a date/time */
    public static final String TIME = "time";

    /** Defines a title for the document */
    public static final String TITLE = "title";

    /** Defines a row in a table */
    public static final String TR = "tr";

    /** Defines text tracks for media elements (<video> and <audio>) */
    public static final String TRACK = "track";

    /** Not supported in HTML5. Defines teletype text */
    public static final String TT = "tt";

    /** Defines text that should be stylistically different from normal text */
    public static final String U = "u";

    /** Defines an unordered list */
    public static final String UL = "ul";

    /** Defines a variable */
    public static final String VAR = "var";

    /** Defines a video or movie */
    public static final String VIDEO = "video";

    /** Defines a possible line-break */
    public static final String WBR = "wbr";

    public static final int TAG = 0;
    public static final int CLASS = 1;
    public static final int ID = 2;

    public static class Attribute {

        private final String name;
        private final String value;

        public Attribute(final String name, final Object value){
            Utils.requireNonNullAndNonEmpty(name, "attribute name");
            this.name = name;
            this.value = value.toString();
        }

        public Attribute(final String name){
            this(name, null);
        }

        public String name(){
            return name;
        }

        public String value(){
            return value;
        }

        public String toString(){
            return String.format("%s=\"%s\"", name, value);
        }
    }

    private final Map<String, Attribute> attributes;
    private final List<Element> children;

    private String tag;
    private String inner;

    private Element parent;

    public Element(final String tag, final String inner){
        tag(tag);
        inner(inner);

        attributes = new LinkedHashMap<>();

        children = new LinkedList<>();
    }

    public Element(final String tag){
        this(tag, "");
    }

    public Element parent(){
        return parent;
    }

    protected Element parent(final Element parent){
        this.parent = parent;
        return this;
    }

    public Element inner(final String inner){
        this.inner = inner == null ? "" : inner;
        return this;
    }

    public String inner(){
        return inner;
    }

    public Element tag(final String tag){
        Utils.requireNonNullAndNonEmpty(tag, "element tag");
        this.tag = tag.toLowerCase();
        return this;
    }

    public Element append(final Element child){
        Utils.requireNonNull(child, "element child");
        child.parent = this;
        children.add(child);
        return this;
    }

    public Element append(final String tag, final String inner){
        return append(new Element(tag, inner));
    }

    public Element append(final String tag){
        return append(tag, "");
    }

    public Element child(final int type, final String search, final int index){
        final List<Element> children = children(type, search);
        return index < 0 || index > children.size()-1 ? null : children.get(index);
    }

    public Element child(final int type, final String search){
        return child(type, search, 0);
    }

    public boolean contains(final int type, final String search){
        return child(type, search) != null;
    }

    public Element remove(final Element child){
        Utils.requireNonNull(child, "element child");
        children.remove(child);
        return this;
    }

    public List<Element> children(final int type, final String search){
        Utils.requireInBounds(type, TAG, ID, "element child search type");
        Utils.requireNonNullAndNonEmpty(search, "element child search");
        return children.stream().filter(
                child -> {
                    switch (type) {
                        case TAG:
                            return child.tag.equalsIgnoreCase(search);
                        case CLASS:
                            final Attribute attribute = attribute("class");
                            return attribute != null && attribute.value().equalsIgnoreCase(search);
                        case ID:
                            final Attribute a = attribute("id");
                            return a != null && a.value().equalsIgnoreCase(search);
                        default:
                            return false;
                    }
                }
        ).collect(Collectors.toList());
    }

    public List<Element> children(){
        return Collections.unmodifiableList(children);
    }

    public int childrenCount(){
        return children.size();
    }

    public String tag(){
        return tag;
    }

    public List<Attribute> attributes(){
        return Collections.unmodifiableList(new LinkedList<>(attributes.values()));
    }

    public Element attribute(final Attribute attr){
        Utils.requireNonNull(attr, "element attribute");
        attributes.put(attr.name().toLowerCase(), attr);
        return this;
    }

    public Element attribute(final String name, final Object value){
        return attribute(new Attribute(name, value));
    }

    public Attribute attribute(final String name){
        return attributes.get(name.toLowerCase());
    }

    private int parents(){
        if(parent == null)
            return 0;
        int count = 0;
        Element p = parent;
        while((p = p.parent) != null)
            count++;
        return count;
    }

    private String fopentag(){
        final StringBuilder builder = new StringBuilder();
        builder.append(String.format("<%s", tag));
        attributes.values().forEach(a -> builder.append(String.format(" %s", a)));
        builder.append(">");
        return builder.toString();
    }

    public Element child(final int i){
        return i < 0 || i > children.size()-1 ? null : children.get(i);
    }

    public String toString(){
        final int tabCount = parents();
        final String tabs = Utils.tabs(tabCount);
        final String innerTabs = Utils.tabs(tabCount + 1);
        final StringBuilder builder = new StringBuilder();
        builder.append(tabs);
        builder.append(fopentag());
        builder.append("\n");
        builder.append(innerTabs);
        builder.append(inner);
        builder.append("\n");
        children.forEach(c -> builder.append(String.format("%s\n", c)));
        builder.append(tabs);
        builder.append(String.format("</%s>", tag));
        builder.append("\n");
        return builder.toString();
    }

}
