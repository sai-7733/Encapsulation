class Gmail{
    private String userName="sai";
    private String gid="sai@gmail.com";
    private int password=7733;
    void set(String userName,String gid,int password)
    {
        this.userName=userName;
        this.gid=gid;
        this.password=password;
    }
    String getName()
    {
        return userName;
    }
    String getGid()
    {
        return gid;
    }
    int getPassword(){
        return password;
    }
}
public class User extends Gmail{
    public static void main(String args[]){
        User s=new User();
        System.out.println(s.getName());
        System.out.println(s.getGid());
        System.out.println(s.getPassword());
        s.set("sai Tharun","sai@gmail",1327);
        System.out.println(s.getName());
        System.out.println(s.getGid());
        System.out.println(s.getPassword());
    }
}