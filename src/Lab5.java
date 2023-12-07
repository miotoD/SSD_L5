class ArrayProcessor
{
    public int getArrayLength(Object [] a){
        int count = 0;
        while(true){
            Object t = a[count];
            count++;
        }

    }
}

class driver{
    ArrayProcessor arrayProcessor = new ArrayProcessor();
    int length = arrayProcessor.getArrayLength(new String[] {"mioto","genji","rika"});
}

public class Lab5 {
}
