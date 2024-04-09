class Datatypes
{
    public static int dataTypes(String type) {
        switch(type)
        {
            case "Long":
                return Long.BYTES;
            case "Integer":
                return Integer.BYTES;
            case "Float":
                return Float.BYTES;
            case "Double":
                return Double.BYTES;
            case "Character":
                return Character.BYTES;
            default:
                return -1;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(dataTypes("Character"));
    }
}