import java.util.*;

public class HelloString {

    public static void display(List<String> strList) {
        for (String S : strList) {
            System.out.print(S + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<String> strList = new ArrayList<>();
        for (int query = 1; query <= N; query++) {
            int queryType = sc.nextInt();
            String str = "";
            switch (queryType) {
case 1: str=sc.next();
        sc.nextLine();
        strList.add(str);
        break;
case 2: int n=sc.nextInt();
        str=sc.next();
        sc.nextLine();
        strList.add(n,str);
        break;
case 3: str=sc.next();
        sc.nextLine();
        int c=0;
        for(int i=0;i<strList.size();i++)
        {
            if((strList.get(i)).equals(str))
            {
                System.out.println(i);
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
        break;
case 4: str=sc.next();
        sc.nextLine();
        int d=0;
        for(int i=0;i<strList.size();i++)
        {
            if(strList.get(i).startsWith(str))
            {
               System.out.print(strList.get(i)+" ");
                d=1;
            }
        }
        if(d==0)
        {
            System.out.println("No such string");
        }
        else
        {
            System.out.println();
        }
        break;
case 5: str=sc.next();
        sc.nextLine();
        if(!strList.remove(str))
            System.out.println("No such string");
        break;
case 6: Collections.sort(strList);
        break;
case 7: System.out.println(strList.size());
        break;
                case 8:
                    if (!strList.isEmpty()) {
                        display(strList);
                        System.out.println();
                    } else {
                        System.out.println("List is empty");
                    }
                    break;
            }
        }
    }
}
