import java.util.ArrayList;
public class NDArrayList<T> extends ArrayList<T>
{
    private boolean duplicates = false;
    public NDArrayList(boolean duplicates)
    {
        this.duplicates = duplicates;    
    }
    @Override public boolean add(T object)
    {
        if(!this.contains(object))
            return super.add(object);
        else
            return false;
    }
}