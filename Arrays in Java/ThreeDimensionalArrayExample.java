public class ThreeDimensionalArrayExample
{
    public static void main(String[] args) {
        int[][][] arr = { { {1,2}, {3,4} }, { {5,6}, {7,8} } };

        int n = arr.length;
        int m = arr[0].length;
        int o = arr[0][0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<o;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
