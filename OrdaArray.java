public class OrdaArray {
    private double[] a;
    private int nElems;

    public OrdaArray(int max)
    {
        a = new double[max];
        nElems = 0;
    }

    public int size()
    {
        return nElems;
    }

    public int find(double searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;

        while(true)
        {
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn] == searchKey)
                return curIn;
            else if (lowerBound>upperBound)
                return nElems;
            else
            {
                if(a[curIn]<searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(double)
}
