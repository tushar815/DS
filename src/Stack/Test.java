package Stack;

public class Test {


    public static void main(String[] args) {
        StackOnArray firstStack = new StackOnArray(10);
        StackOnArray secondStack = new StackOnArray(10);

        firstStack.push(20);
        firstStack.push(21);
        firstStack.push(22);
        firstStack.push(23);
        firstStack.push(24);
        firstStack.push(25);
        firstStack.push(26);

        while(firstStack.top()!=null){
            secondStack.push(firstStack.pop());
            System.out.println(secondStack.top());
        }




    }
}
