package base;

public class BaseQe {
    public static int staticCount =0;       //2
    public int instanceCount =0;
    public BaseQe() {
        instanceCount++;
        staticCount++;
    }

    public static void main(String[] args) {
        BaseQe baseQe1 = new BaseQe();
        BaseQe baseQe2 = new BaseQe();
        BaseQe baseQe3 = new BaseQe();
        System.out.println("baseQe1 static count = "+ baseQe1.staticCount);
        System.out.println("baseQe2 static count = "+ baseQe2.staticCount);
        System.out.println("baseQe3 static count = "+ baseQe3.staticCount);
        System.out.println("**********************************************");
        System.out.println("baseQe1 instance count = "+ baseQe1.instanceCount);
        System.out.println("baseQe2 instance count = "+ baseQe2.instanceCount);
        System.out.println("baseQe3 instance count = "+ baseQe3.instanceCount);
    }
}
