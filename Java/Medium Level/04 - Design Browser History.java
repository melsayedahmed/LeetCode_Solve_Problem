// Link in Leetcode
// https://leetcode.com/problems/design-browser-history/


// (----------------------------- THE ANSWER -----------------------------)


import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> history;
    private int currIndex;
    
    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currIndex = 0;
    }
    
    public void visit(String url) {
        // clear forward history
        for (int i = history.size() - 1; i > currIndex; i--) {
            history.remove(i);
        }
        // add new url to history
        history.add(url);
        currIndex = history.size() - 1;
    }
    
    public String back(int steps) {
        int newIndex = Math.max(0, currIndex - steps);
        currIndex = newIndex;
        return history.get(newIndex);
    }
    
    public String forward(int steps) {
        int newIndex = Math.min(history.size() - 1, currIndex + steps);
        currIndex = newIndex;
        return history.get(newIndex);
    }
}
