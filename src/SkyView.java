public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int a;
        int scanCount=0;
        for(int i=0;i<numRows;i++)
        {
            for(int k=0;k<numCols;k++)
            {
                if(i%2==0)
                {
                    view[i][k]=scanned[scanCount];
                    scanCount++;
                }
                else{
                    a=scanCount+numCols-1;
                    view[i][k]=scanned[a];
                    a--;
                }
            }
        }
    }
    /*
                        0.3,0.7,0.8,
                        1.1,1.4,0.4.
                        0.2,0.5,0.2,
                        1.6,0.6,0.9};
     */
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double total =0.0;
        int population=0;
        for(int i=startRow;i<=endRow;i++)
        {
            for(int k=startCol;k<=endCol;k++)
            {
                total+=view[i][k];
                population++;
            }
        }
        return total/population;
    }
    public String toString()
    {
        String out="";
        for(int i=0;i<view.length;i++)
        {
            for(int k=0; k<view[i].length;k++)
            {
                out+=view[i][k]+" ";
            }
            out+="\n";
        }
        return out;
    }
}
