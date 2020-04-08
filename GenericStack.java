/**
 *CSCI 1913 LAB 9
 * Minh Tam H Nguyen
 * Date: 4/8/2020
 */

public class GenericStack<Elem> {

    private Elem[] elements;
    private int size = 0;

    public GenericStack(int maxValue) {

        this.elements = (Elem[]) new Object[maxValue];
    }


    public boolean isEmpty(){
        int empty = 0;
        for(int i = 0 ; i < this.elements.length; i++)
        {
            if(this.elements[i] == null)
                empty++;
        }
        return this.elements.length == empty;
    }

    public void push(Elem push){
        Elem[] temp;
        if(size == elements.length){
            temp = (Elem[]) new Object[this.elements.length*2];

            for(int i = 0; i < this.elements.length; i++){
                if(i < temp.length){ // Just in case the new array isn't larger
                    temp[i] = elements[i];
                }
            }
            this.elements = temp;
        }
        this.elements[size] = push;
        this.size++;
    }

    public Elem peek(){
        if(this.isEmpty()) return null;
        else{
            return this.elements[size-1];
        }

    }

    public Elem pop(){
        if(this.isEmpty()) return null;
        else{
            Elem lastVariable = this.elements[size-1];
            this.size--; //reduce the size
            this.elements[size] = null;
            return lastVariable;
        }

    }



}
