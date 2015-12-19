package profile.demo;

/**
 * Created by yangjunming on 12/19/15.
 * author: yangjunming@huijiame.com
 */
public class DemoObject {


    private String something;


    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "DemoObject{" +
                "something='" + something + '\'' +
                '}';
    }
}
