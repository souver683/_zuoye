public class 求数组中的最大值最小值平均值及个元素之和 {
    public static  void main(String[] args){
        int[] arr=new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*382+77);

        }
        int max=arr[0];
        int min=arr[1];
        int sum=0;
        int aver=0;
        for(int j: arr){
            if(max<j){
                max=j;
            }
            if(min>j){
                min=j;
            }
            sum+=j;
            aver=sum/20;
        }
        System.out.println("最大值:" +max);
        System.out.println("最小值："+min);
        System.out.println("平均值："+aver);
        System.out.println("各元素和为： "+sum);
    }
}
