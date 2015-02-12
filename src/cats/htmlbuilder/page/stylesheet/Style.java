package cats.htmlbuilder.page.stylesheet;

import cats.htmlbuilder.page.util.Utils;
import java.awt.Color;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Josh
 * 04/10/13
 * 7:14 PM
 */
public class Style {

    /** Specifies the animation */
    public static final String KEYFRAMES = "@keyframes";

    /** A shorthand property for all the animation properties below, except the animation-play-state property */
    public static final String ANIMATION = "animation";

    /** Specifies a name for the @keyframes animation */
    public static final String ANIMATION_NAME = "animation-name";

    /** Specifies how many seconds or milliseconds an animation takes to complete one cycle */
    public static final String ANIMATION_DURATION = "animation-duration";

    /** Specifies the speed curve of the animation */
    public static final String ANIMATION_TIMING_FUNCTION = "animation-timing-function";

    /** Specifies when the animation will start */
    public static final String ANIMATION_DELAY = "animation-delay";

    /** Specifies the number of times an animation should be played */
    public static final String ANIMATION_ITERATION_COUNT = "animation-iteration-count";

    /** Specifies whether or not the animation should play in reverse on alternate cycles */
    public static final String ANIMATION_DIRECTION = "animation-direction";

    /** Specifies whether the animation is running or paused */
    public static final String ANIMATION_PLAY_STATE = "animation-play-state";

    /** Sets all the background properties in one declaration */
    public static final String BACKGROUND = "background";

    /** Sets whether a background image is fixed or scrolls with the rest of the page */
    public static final String BACKGROUND_ATTACHMENT = "background-attachment";

    /** Sets the background color of an element */
    public static final String BACKGROUND_COLOR = "background-color";

    /** Sets the background image for an element */
    public static final String BACKGROUND_IMAGE = "background-image";

    /** Sets the starting position of a background image */
    public static final String BACKGROUND_POSITION = "background-position";

    /** Sets how a background image will be repeated */
    public static final String BACKGROUND_REPEAT = "background-repeat";

    /** Specifies the painting area of the background */
    public static final String BACKGROUND_CLIP = "background-clip";

    /** Specifies the positioning area of the background images */
    public static final String BACKGROUND_ORIGIN = "background-origin";

    /** Specifies the size of the background images */
    public static final String BACKGROUND_SIZE = "background-size";

    /** Sets all the border properties in one declaration */
    public static final String BORDER = "border";

    /** Sets all the bottom border properties in one declaration */
    public static final String BORDER_BOTTOM = "border-bottom";

    /** Sets the color of the bottom border */
    public static final String BORDER_BOTTOM_COLOR = "border-bottom-color";

    /** Sets the style of the bottom border */
    public static final String BORDER_BOTTOM_STYLE = "border-bottom-style";

    /** Sets the width of the bottom border */
    public static final String BORDER_BOTTOM_WIDTH = "border-bottom-width";

    /** Sets the color of the four borders */
    public static final String BORDER_COLOR = "border-color";

    /** Sets all the left border properties in one declaration */
    public static final String BORDER_LEFT = "border-left";

    /** Sets the color of the left border */
    public static final String BORDER_LEFT_COLOR = "border-left-color";

    /** Sets the style of the left border */
    public static final String BORDER_LEFT_STYLE = "border-left-style";

    /** Sets the width of the left border */
    public static final String BORDER_LEFT_WIDTH = "border-left-width";

    /** Sets all the right border properties in one declaration */
    public static final String BORDER_RIGHT = "border-right";

    /** Sets the color of the right border */
    public static final String BORDER_RIGHT_COLOR = "border-right-color";

    /** Sets the style of the right border */
    public static final String BORDER_RIGHT_STYLE = "border-right-style";

    /** Sets the width of the right border */
    public static final String BORDER_RIGHT_WIDTH = "border-right-width";

    /** Sets the style of the four borders */
    public static final String BORDER_STYLE = "border-style";

    /** Sets all the top border properties in one declaration */
    public static final String BORDER_TOP = "border-top";

    /** Sets the color of the top border */
    public static final String BORDER_TOP_COLOR = "border-top-color";

    /** Sets the style of the top border */
    public static final String BORDER_TOP_STYLE = "border-top-style";

    /** Sets the width of the top border */
    public static final String BORDER_TOP_WIDTH = "border-top-width";

    /** Sets the width of the four borders */
    public static final String BORDER_WIDTH = "border-width";

    /** Sets all the outline properties in one declaration */
    public static final String OUTLINE = "outline";

    /** Sets the color of an outline */
    public static final String OUTLINE_COLOR = "outline-color";

    /** Sets the style of an outline */
    public static final String OUTLINE_STYLE = "outline-style";

    /** Sets the width of an outline */
    public static final String OUTLINE_WIDTH = "outline-width";

    /** Defines the shape of the border of the bottom-left corner */
    public static final String BORDER_BOTTOM_LEFT_RADIUS = "border-bottom-left-radius";

    /** Defines the shape of the border of the bottom-right corner */
    public static final String BORDER_BOTTOM_RIGHT_RADIUS = "border-bottom-right-radius";

    /** A shorthand property for setting all the border-image-* properties */
    public static final String BORDER_IMAGE = "border-image";

    /** Specifies the amount by which the border image area extends beyond the border box */
    public static final String BORDER_IMAGE_OUTSET = "border-image-outset";

    /** Specifies whether the image-border should be repeated, rounded or stretched */
    public static final String BORDER_IMAGE_REPEAT = "border-image-repeat";

    /** Specifies the inward offsets of the image-border */
    public static final String BORDER_IMAGE_SLICE = "border-image-slice";

    /** Specifies an image to be used as a border */
    public static final String BORDER_IMAGE_SOURCE = "border-image-source";

    /** Specifies the widths of the image-border */
    public static final String BORDER_IMAGE_WIDTH = "border-image-width";

    /** A shorthand property for setting all the four border-*-radius properties */
    public static final String BORDER_RADIUS = "border-radius";

    /** Defines the shape of the border of the top-left corner */
    public static final String BORDER_TOP_LEFT_RADIUS = "border-top-left-radius";

    /** Defines the shape of the border of the top-right corner */
    public static final String BORDER_TOP_RIGHT_RADIUS = "border-top-right-radius";

    /**   */
    public static final String BOX_DECORATION_BREAK = "box-decoration-break";

    /** Attaches one or more drop-shadows to the box */
    public static final String BOX_SHADOW = "box-shadow";

    /** Specifies whether or not to clip the left/right edges of the content, if it overflows the element's content area */
    public static final String OVERFLOW_X = "overflow-x";

    /** Specifies whether or not to clip the top/bottom edges of the content, if it overflows the element's content area */
    public static final String OVERFLOW_Y = "overflow-y";

    /** Specifies the preferred scrolling method for elements that overflow */
    public static final String OVERFLOW_STYLE = "overflow-style";

    /** Rotates an element around a given point defined by the rotation-point property */
    public static final String ROTATION = "rotation";

    /** Defines a point as an offset from the top left border edge */
    public static final String ROTATION_POINT = "rotation-point";

    /** Permits the specification of a source color profile other than the default */
    public static final String COLOR_PROFILE = "color-profile";

    /** Sets the opacity level for an element */
    public static final String OPACITY = "opacity";

    /** Permits the specification of a color profile rendering intent other than the default */
    public static final String RENDERING_INTENT = "rendering-intent";

    /** Specifies the label of the bookmark */
    public static final String BOOKMARK_LABEL = "bookmark-label";

    /** Specifies the level of the bookmark */
    public static final String BOOKMARK_LEVEL = "bookmark-level";

    /** Specifies the target of the bookmark link */
    public static final String BOOKMARK_TARGET = "bookmark-target";

    /** Pushes floated elements in the opposite direction of the where they have been floated with float */
    public static final String FLOAT_OFFSET = "float-offset";

    /** Specifies the minimum number of characters in a hyphenated word after the hyphenation character */
    public static final String HYPHENATE_AFTER = "hyphenate-after";

    /** Specifies the minimum number of characters in a hyphenated word before the hyphenation character */
    public static final String HYPHENATE_BEFORE = "hyphenate-before";

    /** Specifies a string that is shown when a hyphenate-break occurs */
    public static final String HYPHENATE_CHARACTER = "hyphenate-character";

    /** Indicates the maximum number of successive hyphenated lines in an element */
    public static final String HYPHENATE_LINES = "hyphenate-lines";

    /** Specifies a comma-separated list of external resources that can help the browser determine hyphenation points */
    public static final String HYPHENATE_RESOURCE = "hyphenate-resource";

    /** Sets how to split words to improve the layout of paragraphs */
    public static final String HYPHENS = "hyphens";

    /** Specifies the correct resolution of images */
    public static final String IMAGE_RESOLUTION = "image-resolution";

    /** Adds crop and/or cross marks to the document */
    public static final String MARKS = "marks";

    /**   */
    public static final String STRING_SET = "string-set";

    /** Sets the height of an element */
    public static final String HEIGHT = "height";

    /** Sets the maximum height of an element */
    public static final String MAX_HEIGHT = "max-height";

    /** Sets the maximum width of an element */
    public static final String MAX_WIDTH = "max-width";

    /** Sets the minimum height of an element */
    public static final String MIN_HEIGHT = "min-height";

    /** Sets the minimum width of an element */
    public static final String MIN_WIDTH = "min-width";

    /** Sets the width of an element */
    public static final String WIDTH = "width";

    /** Specifies how to align the child elements of a box */
    public static final String BOX_ALIGN = "box-align";

    /** Specifies in which direction the children of a box are displayed */
    public static final String BOX_DIRECTION = "box-direction";

    /** Specifies whether the children of a box is flexible or inflexible in size */
    public static final String BOX_FLEX = "box-flex";

    /** Assigns flexible elements to flex groups */
    public static final String BOX_FLEX_GROUP = "box-flex-group";

    /** Specifies whether columns will go onto a new line whenever it runs out of space in the parent box */
    public static final String BOX_LINES = "box-lines";

    /** Specifies the display order of the child elements of a box */
    public static final String BOX_ORDINAL_GROUP = "box-ordinal-group";

    /** Specifies whether the children of a box should be laid out horizontally or vertically */
    public static final String BOX_ORIENT = "box-orient";

    /** Specifies the horizontal position in horizontal boxes and the vertical position in vertical boxes */
    public static final String BOX_PACK = "box-pack";

    /** Sets all the font properties in one declaration */
    public static final String FONT = "font";

    /** Specifies the font family for text */
    public static final String FONT_FAMILY = "font-family";

    /** Specifies the font size of text */
    public static final String FONT_SIZE = "font-size";

    /** Specifies the font style for text */
    public static final String FONT_STYLE = "font-style";

    /** Specifies whether or not a text should be displayed in a small-caps font */
    public static final String FONT_VARIANT = "font-variant";

    /** Specifies the weight of a font */
    public static final String FONT_WEIGHT = "font-weight";

    /** A property that allows websites to download and use fonts other than the "web-safe" fonts */
    public static final String FONT_FACE = "@font-face";

    /** Preserves the readability of text when font fallback occurs */
    public static final String FONT_SIZE_ADJUST = "font-size-adjust";

    /** Selects a normal, condensed, or expanded face from a font family */
    public static final String FONT_STRETCH = "font-stretch";

    /** Used with the :before and :after pseudo-elements, to insert generated content */
    public static final String CONTENT = "content";

    /** Increments one or more counters */
    public static final String COUNTER_INCREMENT = "counter-increment";

    /** Creates or resets one or more counters */
    public static final String COUNTER_RESET = "counter-reset";

    /** Sets the type of quotation marks for embedded quotations */
    public static final String QUOTES = "quotes";

    /** Allows a replaced element to be just a rectangular area of an object, instead of the whole object */
    public static final String CROP = "crop";

    /** Causes an element to be removed from the flow and reinserted at a later point in the document */
    public static final String MOVE_TO = "move-to";

    /** Determines which page-based occurance of a given element is applied to a counter or string value */
    public static final String PAGE_POLICY = "page-policy";

    /** Specifies the width of each column in a grid */
    public static final String GRID_COLUMNS = "grid-columns";

    /** Specifies the height of each column in a grid */
    public static final String GRID_ROWS = "grid-rows";

    /** A shorthand property for setting the target-name, target-new, and target-position properties */
    public static final String TARGET = "target";

    /** Specifies where to open links (target destination) */
    public static final String TARGET_NAME = "target-name";

    /** Specifies whether new destination links should open in a new window or in a new tab of an existing window */
    public static final String TARGET_NEW = "target-new";

    /** Specifies where new destination links should be placed */
    public static final String TARGET_POSITION = "target-position";

    /** Allows more precise alignment of elements */
    public static final String ALIGNMENT_ADJUST = "alignment-adjust";

    /** Specifies how an inline-level element is aligned with respect to its parent */
    public static final String ALIGNMENT_BASELINE = "alignment-baseline";

    /** Allows repositioning of the dominant-baseline relative to the dominant-baseline */
    public static final String BASELINE_SHIFT = "baseline-shift";

    /** Specifies a scaled-baseline-table */
    public static final String DOMINANT_BASELINE = "dominant-baseline";

    /** Sets the alignment point of the drop initial for the primary connection point */
    public static final String DROP_INITIAL_AFTER_ADJUST = "drop-initial-after-adjust";

    /** Sets which alignment line within the initial line box is used at the primary connection point with the initial letter box */
    public static final String DROP_INITIAL_AFTER_ALIGN = "drop-initial-after-align";

    /** Sets the alignment point of the drop initial for the secondary connection point */
    public static final String DROP_INITIAL_BEFORE_ADJUST = "drop-initial-before-adjust";

    /** Sets which alignment line within the initial line box is used at the secondary connection point with the initial letter box */
    public static final String DROP_INITIAL_BEFORE_ALIGN = "drop-initial-before-align";

    /** Controls the partial sinking of the initial letter */
    public static final String DROP_INITIAL_SIZE = "drop-initial-size";

    /** Activates a drop-initial effect */
    public static final String DROP_INITIAL_VALUE = "drop-initial-value";

    /** Sets which line of a multi-line inline block align with the previous and next inline elements within a line */
    public static final String INLINE_BOX_ALIGN = "inline-box-align";

    /** A shorthand property for setting the line-stacking-strategy, line-stacking-ruby, and line-stacking-shift properties */
    public static final String LINE_STACKING = "line-stacking";

    /** Sets the line stacking method for block elements containing ruby annotation elements */
    public static final String LINE_STACKING_RUBY = "line-stacking-ruby";

    /** Sets the line stacking method for block elements containing elements with base-shift */
    public static final String LINE_STACKING_SHIFT = "line-stacking-shift";

    /** Sets the line stacking strategy for stacked line boxes within a containing block element */
    public static final String LINE_STACKING_STRATEGY = "line-stacking-strategy";

    /** Sets the block-progression dimension of the text content area of an inline box */
    public static final String TEXT_HEIGHT = "text-height";

    /** Sets all the properties for a list in one declaration */
    public static final String LIST_STYLE = "list-style";

    /** Specifies an image as the list-item marker */
    public static final String LIST_STYLE_IMAGE = "list-style-image";

    /** Specifies if the list-item markers should appear inside or outside the content flow */
    public static final String LIST_STYLE_POSITION = "list-style-position";

    /** Specifies the type of list-item marker */
    public static final String LIST_STYLE_TYPE = "list-style-type";

    /** Sets all the margin properties in one declaration */
    public static final String MARGIN = "margin";

    /** Sets the bottom margin of an element */
    public static final String MARGIN_BOTTOM = "margin-bottom";

    /** Sets the left margin of an element */
    public static final String MARGIN_LEFT = "margin-left";

    /** Sets the right margin of an element */
    public static final String MARGIN_RIGHT = "margin-right";

    /** Sets the top margin of an element */
    public static final String MARGIN_TOP = "margin-top";

    /** Sets the direction of the moving content */
    public static final String MARQUEE_DIRECTION = "marquee-direction";

    /** Sets how many times the content move */
    public static final String MARQUEE_PLAY_COUNT = "marquee-play-count";

    /** Sets how fast the content scrolls */
    public static final String MARQUEE_SPEED = "marquee-speed";

    /** Sets the style of the moving content */
    public static final String MARQUEE_STYLE = "marquee-style";

    /** Specifies the number of columns an element should be divided into */
    public static final String COLUMN_COUNT = "column-count";

    /** Specifies how to fill columns */
    public static final String COLUMN_FILL = "column-fill";

    /** Specifies the gap between the columns */
    public static final String COLUMN_GAP = "column-gap";

    /** A shorthand property for setting all the column-property-* properties */
    public static final String COLUMN_RULE = "column-property";

    /** Specifies the color of the property between columns */
    public static final String COLUMN_RULE_COLOR = "column-property-color";

    /** Specifies the style of the property between columns */
    public static final String COLUMN_RULE_STYLE = "column-property-style";

    /** Specifies the width of the property between columns */
    public static final String COLUMN_RULE_WIDTH = "column-property-width";

    /** Specifies how many columns an element should span across */
    public static final String COLUMN_SPAN = "column-span";

    /** Specifies the width of the columns */
    public static final String COLUMN_WIDTH = "column-width";

    /** A shorthand property for setting column-width and column-count */
    public static final String COLUMNS = "columns";

    /** Sets all the padding properties in one declaration */
    public static final String PADDING = "padding";

    /** Sets the bottom padding of an element */
    public static final String PADDING_BOTTOM = "padding-bottom";

    /** Sets the left padding of an element */
    public static final String PADDING_LEFT = "padding-left";

    /** Sets the right padding of an element */
    public static final String PADDING_RIGHT = "padding-right";

    /** Sets the top padding of an element */
    public static final String PADDING_TOP = "padding-top";

    /** Gives a hint for how to scale a replaced element if neither its width nor its height property is auto */
    public static final String FIT = "fit";

    /** Determines the alignment of the object inside the box */
    public static final String FIT_POSITION = "fit-position";

    /** Specifies a rotation in the right or clockwise direction that a user agent applies to an image */
    public static final String IMAGE_ORIENTATION = "image-orientation";

    /** Specifies a particular type of page where an element SHOULD be displayed */
    public static final String PAGE = "page";

    /** Specifies the size and orientation of the containing box for page content */
    public static final String SIZE = "size";

    /** Specifies the bottom position of a positioned element */
    public static final String BOTTOM = "bottom";

    /** Specifies which sides of an element where other floating elements are not allowed */
    public static final String CLEAR = "clear";

    /** Clips an absolutely positioned element */
    public static final String CLIP = "clip";

    /** Specifies the type of cursor to be displayed */
    public static final String CURSOR = "cursor";

    /** Specifies how a certain HTML element should be displayed */
    public static final String DISPLAY = "display";

    /** Specifies whether or not a box should float */
    public static final String FLOAT = "float";

    /** Specifies the left position of a positioned element */
    public static final String LEFT = "left";

    /** Specifies what happens if content overflows an element's box */
    public static final String OVERFLOW = "overflow";

    /** Specifies the type of positioning method used for an element (static, relative, absolute or fixed) */
    public static final String POSITION = "position";

    /** Specifies the right position of a positioned element */
    public static final String RIGHT = "right";

    /** Specifies the top position of a positioned element */
    public static final String TOP = "top";

    /** Specifies whether or not an element is visible */
    public static final String VISIBILITY = "visibility";

    /** Sets the stack order of a positioned element */
    public static final String Z_INDEX = "z-index";

    /** Sets the minimum number of lines that must be left at the bottom of a page when a page break occurs inside an element */
    public static final String ORPHANS = "orphans";

    /** Sets the page-breaking behavior after an element */
    public static final String PAGE_BREAK_AFTER = "page-break-after";

    /** Sets the page-breaking behavior before an element */
    public static final String PAGE_BREAK_BEFORE = "page-break-before";

    /** Sets the page-breaking behavior inside an element */
    public static final String PAGE_BREAK_INSIDE = "page-break-inside";

    /** Sets the minimum number of lines that must be left at the top of a page when a page break occurs inside an element */
    public static final String WIDOWS = "widows";

    /** Controls the text alignment of the ruby text and ruby base contents relative to each other */
    public static final String RUBY_ALIGN = "ruby-align";

    /** Determines whether, and on which side, ruby text is allowed to partially overhang any adjacent text in addition to its own base, when the ruby text is wider than the ruby base */
    public static final String RUBY_OVERHANG = "ruby-overhang";

    /** Controls the position of the ruby text with respect to its base */
    public static final String RUBY_POSITION = "ruby-position";

    /** Controls the spanning behavior of annotation elements */
    public static final String RUBY_SPAN = "ruby-span";

    /** A shorthand property for setting the mark-before and mark-after properties */
    public static final String MARK = "mark";

    /** Allows named markers to be attached to the audio stream */
    public static final String MARK_AFTER = "mark-after";

    /** Allows named markers to be attached to the audio stream */
    public static final String MARK_BEFORE = "mark-before";

    /** Specifies a phonetic pronunciation for the text contained by the corresponding element */
    public static final String PHONEMES = "phonemes";

    /** A shorthand property for setting the rest-before and rest-after properties */
    public static final String REST = "rest";

    /** Specifies a rest or prosodic boundary to be observed after speaking an element's content */
    public static final String REST_AFTER = "rest-after";

    /** Specifies a rest or prosodic boundary to be observed before speaking an element's content */
    public static final String REST_BEFORE = "rest-before";

    /** Specifies the balance between left and right channels */
    public static final String VOICE_BALANCE = "voice-balance";

    /** Specifies how long it should take to render the selected element's content */
    public static final String VOICE_DURATION = "voice-duration";

    /** Specifies the average pitch (a frequency) of the speaking voice */
    public static final String VOICE_PITCH = "voice-pitch";

    /** Specifies variation in average pitch */
    public static final String VOICE_PITCH_RANGE = "voice-pitch-range";

    /** Controls the speaking rate */
    public static final String VOICE_RATE = "voice-rate";

    /** Indicates the strength of emphasis to be applied */
    public static final String VOICE_STRESS = "voice-stress";

    /** Refers to the amplitude of the waveform output by the speech synthesises */
    public static final String VOICE_VOLUME = "voice-volume";

    /** Specifies whether or not table borders should be collapsed */
    public static final String BORDER_COLLAPSE = "border-collapse";

    /** Specifies the distance between the borders of adjacent cells */
    public static final String BORDER_SPACING = "border-spacing";

    /** Specifies the placement of a table caption */
    public static final String CAPTION_SIDE = "caption-side";

    /** Specifies whether or not to display borders and background on empty cells in a table */
    public static final String EMPTY_CELLS = "empty-cells";

    /** Sets the layout algorithm to be used for a table */
    public static final String TABLE_LAYOUT = "table-layout";

    /** Sets the color of text */
    public static final String COLOR = "color";

    /** Specifies the text direction/writing direction */
    public static final String DIRECTION = "direction";

    /** Increases or decreases the space between characters in a text */
    public static final String LETTER_SPACING = "letter-spacing";

    /** Sets the line height */
    public static final String LINE_HEIGHT = "line-height";

    /** Specifies the horizontal alignment of text */
    public static final String TEXT_ALIGN = "text-align";

    /** Specifies the decoration added to text */
    public static final String TEXT_DECORATION = "text-decoration";

    /** Specifies the indentation of the first line in a text-block */
    public static final String TEXT_INDENT = "text-indent";

    /** Controls the capitalization of text */
    public static final String TEXT_TRANSFORM = "text-transform";

    /**   */
    public static final String UNICODE_BIDI = "unicode-bidi";

    /** Sets the vertical alignment of an element */
    public static final String VERTICAL_ALIGN = "vertical-align";

    /** Specifies how white-space inside an element is handled */
    public static final String WHITE_SPACE = "white-space";

    /** Increases or decreases the space between words in a text */
    public static final String WORD_SPACING = "word-spacing";

    /** Specifies whether a punctuation character may be placed outside the line box */
    public static final String HANGING_PUNCTUATION = "hanging-punctuation";

    /** Specifies whether a punctuation character should be trimmed */
    public static final String PUNCTUATION_TRIM = "punctuation-trim";

    /** Describes how the last line of a block or a line right before a forced line break is aligned when text-align is "justify" */
    public static final String TEXT_ALIGN_LAST = "text-align-last";

    /** Specifies the justification method used when text-align is "justify" */
    public static final String TEXT_JUSTIFY = "text-justify";

    /** Specifies a text outline */
    public static final String TEXT_OUTLINE = "text-outline";

    /** Specifies what should happen when text overflows the containing element */
    public static final String TEXT_OVERFLOW = "text-overflow";

    /** Adds shadow to text */
    public static final String TEXT_SHADOW = "text-shadow";

    /** Specifies line breaking rules for text */
    public static final String TEXT_WRAP = "text-wrap";

    /** Specifies line breaking rules for non-CJK scripts */
    public static final String WORD_BREAK = "word-break";

    /** Allows long, unbreakable words to be broken and wrap to the next line */
    public static final String WORD_WRAP = "word-wrap";

    /** Applies a 2D or 3D transformation to an element */
    public static final String TRANSFORM = "transform";

    /** Allows you to change the position on transformed elements */
    public static final String TRANSFORM_ORIGIN = "transform-origin";

    /** Specifies how nested elements are rendered in 3D space */
    public static final String TRANSFORM_STYLE = "transform-style";

    /** Specifies the perspective on how 3D elements are viewed */
    public static final String PERSPECTIVE = "perspective";

    /** Specifies the bottom position of 3D elements */
    public static final String PERSPECTIVE_ORIGIN = "perspective-origin";

    /** Defines whether or not an element should be visible when not facing the screen */
    public static final String BACKFACE_VISIBILITY = "backface-visibility";

    /** A shorthand property for setting the four transition properties */
    public static final String TRANSITION = "transition";

    /** Specifies the name of the CSS property the transition effect is for */
    public static final String TRANSITION_PROPERTY = "transition-property";

    /** Specifies how many seconds or milliseconds a transition effect takes to complete */
    public static final String TRANSITION_DURATION = "transition-duration";

    /** Specifies the speed curve of the transition effect */
    public static final String TRANSITION_TIMING_FUNCTION = "transition-timing-function";

    /** Specifies when the transition effect will start */
    public static final String TRANSITION_DELAY = "transition-delay";

    /** Allows you to make an element look like a standard user interface element */
    public static final String APPEARANCE = "appearance";

    /** Allows you to define certain elements to fit an area in a certain way */
    public static final String BOX_SIZING = "box-sizing";

    /** Provides the author the ability to style an element with an iconic equivalent */
    public static final String ICON = "icon";

    /** Specifies where to navigate when using the arrow-down navigation key */
    public static final String NAV_DOWN = "nav-down";

    /** Specifies the tabbing order for an element */
    public static final String NAV_INDEX = "nav-index";

    /** Specifies where to navigate when using the arrow-left navigation key */
    public static final String NAV_LEFT = "nav-left";

    /** Specifies where to navigate when using the arrow-right navigation key */
    public static final String NAV_RIGHT = "nav-right";

    /** Specifies where to navigate when using the arrow-up navigation key */
    public static final String NAV_UP = "nav-up";

    /** Offsets an outline, and draws it beyond the border edge */
    public static final String OUTLINE_OFFSET = "outline-offset";

    /** Specifies whether or not an element is resizable by the user */
    public static final String RESIZE = "resize";

    public static final int ELEMENT = 0;
    public static final int CLASS = '.';
    public static final int ID = '#';

    public static class Property {

        private final String name;
        private final Object value;

        public Property(final String name, final Object value){
            Utils.requireNonNullAndNonEmpty(name, "style property name");
            Utils.requireNonNull(value, "style property value");
            this.name = name;
            this.value = convert(value);
        }

        private String convert(final Object o){
            if(o instanceof Color){
                final Color c = (Color) o;
                return String.format("#%s", Integer.toHexString(c.getRGB()).substring(2));
            }else{
                return o.toString();
            }
        }

        public String name(){
            return name;
        }

        public Object value(){
            return value;
        }

        public String toString(){
            return String.format("%s: %s;", name, value);
        }
    }

    private final StringBuilder nameBuilder;
    private final Map<String, Property> properties;

    public Style(final int type, final String name){
        nameBuilder = new StringBuilder();
        style(type, name);

        properties = new LinkedHashMap<>();
    }

    public Style style(final int type, final String name){
        Utils.requireInBounds(type, ELEMENT, CLASS, "style type");
        Utils.requireNonNullAndNonEmpty(name, "style name");
        if(type != ELEMENT)
            nameBuilder.append((char)type);
        nameBuilder.append(name);
        nameBuilder.append(" ");
        return this;
    }

    public String name(){
        return nameBuilder.toString().trim();
    }

    public List<Property> properties(){
        return Collections.unmodifiableList(new LinkedList<>(properties.values()));
    }

    public Style add(final Property property){
        Utils.requireNonNull(property, "style property");
        properties.put(property.name, property);
        return this;
    }

    public Style property(final String name, final Object value){
        return add(new Property(name, value));
    }

    public String toString(){
        final String tabs = Utils.tabs(2);
        final String innerTabs = Utils.tabs(3);
        final StringBuilder builder = new StringBuilder();
        builder.append(tabs);
        builder.append(String.format("%s {", name()));
        builder.append("\n");
        properties.values().forEach(
                rule -> {
                    builder.append(innerTabs);
                    builder.append(rule);
                    builder.append("\n");
                }
        );
        builder.append(tabs);
        builder.append("}");
        return builder.toString();
    }
}
