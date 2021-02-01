package Stack;

public class isHtmlMatched {

    public static boolean isHtml(String Html){
        StackOnList<String> buffer =new StackOnList<>();
        int j = Html.indexOf('<');  //find first <
        while (j!=-1){
            int k = Html.indexOf('>',j+1);  //find next >
            if(k == -1){
                return false;
            }
            String tag = Html.substring(j+1,k);
            if(!tag.startsWith("/")){
                    buffer.push(tag);
            }
            else {
                if(buffer.isEmpty())
                    return false;
                if(!tag.substring(1).equals(buffer.pop()))
                    return false;
            }
            j  = Html.indexOf('<',k+1);

        }
        return buffer.isEmpty();
    }

}
