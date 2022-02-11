import java.util.Queue;
import java.util.Stack;

/**
 * Add your own comments
 */
public class HtmlValidator {
    public HtmlValidator(Queue<HtmlTag> tags) {

    }

    public Stack<HtmlTag> HtmlValidator(Queue<HtmlTag> tags) {
        Stack<HtmlTag> returnStack = new Stack<HtmlTag>();
        HtmlTag t;
        while (!tags.isEmpty()) {
            t = tags.remove();
            if (t.isSelfClosing()) { //is self closing tag
                continue;
            } else if (t.isOpenTag()) { //is opening tag
                returnStack.push(t);
            } else { //is closing tag
                if (returnStack.isEmpty()) { //is there anything on the stack
                    System.err.println("Uncalled for closing tag. : " + t.toString());
                    return null;
                } else if (t.matches(returnStack.peek())) { //is this a matching closing tag
                    returnStack.pop();
                } else {
                    System.err.println("Closing tag out of order. : " + t.toString());
                    return returnStack;
                }
            }
        }
        System.out.println(returnStack);
        return returnStack;
    }

    public HtmlValidator() {

    }

    public void addTag(HtmlTag tag) {

    }

    public Queue<HtmlTag> getTags() {
        removeAll(validate());
        return null;
    }

    public void removeAll(String element) {
    }

    public String validate() {
        return null;
    }
}
