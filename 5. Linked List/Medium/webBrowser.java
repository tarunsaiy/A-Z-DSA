public class webBrowser {
    public static void main(String[] args) {
    }
}
class Broswer{
    Node currentpage;
    Broswer(String url){
        currentpage = new Node(url);
    }
    public void visit(String url){
        Node newpage = new Node(url);
        newpage.prev = currentpage;
        currentpage.next = newpage;
        currentpage = newpage;
    }
    public String backward(int steps){
        for(int i = 0; i < steps; i++){
            if(currentpage.prev != null){
                currentpage = currentpage.prev;
            }
            else break;
        }
        return currentpage.data;
    }
    public String forward(int steps){
        for(int i = 0; i < steps; i++){
            if(currentpage.next != null){
                currentpage = currentpage.next;
            }
            else break;
        }
        return currentpage.data;
    }
}