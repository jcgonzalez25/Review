public class HashTable
{
    //GET PUT DELETE
    public static class HTObject
    {
        public String key;
        public Integer value;
    }
    public static final int ARR_SIZE = 128;
    private LinkedList<HTObject>[] arr = new LinkedList[ARR_SIZE];

    public HashTable(){
        for(int i = 0; i <ARR_SIZE; i++){
            arr[i] = null;
        }
    }

    private HTObject getObj(String key)
    {
        if(key == null){
            return null;
        }
        int index = key.hashCode()%ARR_SIZE;
        LinkedList<HTObject> items = arr[index];

        if(items == null){
            return null;
        }
        for(HTOBJECT item : items){
            if(item.key.equals(key))
                return item;
        }
        return null;
    }
    public integer get(String key)
    {
        HTOBJECT item = getObj(key);
        if(item == null){
            return null;
        }
        return item.value;
    }
    public void put(){
    }
    public void delete(){
        
    }

}


public class Main
{
    public static void main()
    {
    }

}