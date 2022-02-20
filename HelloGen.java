import java.util.*;

 class HelloGen {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer arr[] = new Integer[N];
        String strarr[] = new String[N];
        Man manarr[] = new Man[N];
        for(int index=0; index < N; index++){
            arr[index] = sc.nextInt();
            manarr[index] = new Man(arr[index]);
            strarr[index] = sc.nextLine().trim();
        }
        
        System.out.println(MaxFinder.max(arr));
        System.out.println(MaxFinder.max(strarr));
        System.out.println(MaxFinder.max(manarr));
    }

}

class Man implements Comparable<Man> {

    int age;

    public Man(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Man t) {
        return this.age - t.age;
    }
    
    public String toString(){
        return this.age+"";
    }
}
class MaxFinder
{
public static <T extends Comparable<T>> T max(T[] a)
{
    T m=a[0];
    for(T i:a)
    {
        if(i.compareTo(m)>0)
        {
            m=i;
        }
    }
    return m;
}
}