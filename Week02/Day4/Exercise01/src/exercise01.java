public class exercise01 {
    public static void main(String[] args) {
        int a[]={3,2,1,4,2,1,5,4,4,3,8,10,8,10,11,11,11,12,12,13};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        int b=0;
        a[b]=a[0];
        for(int i=0;i<a.length;i++)
        {
            if (a[b]!=a[i])
            {
                b++;
                a[b]=a[i];
            }
        }
        for (int i=0;i<=b;i++ )
        {
            System.out.print(a[i]+" ");
        }
    }
}
