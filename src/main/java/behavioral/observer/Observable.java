package behavioral.observer;


import java.util.Vector;

// 手敲源码
public class Observable  {
    // 容器
    private static Vector container = new Vector();
    // 标志位
    private Boolean logo = false;

    public void addBean(Object o) {
        if (o == null)
            throw new NullPointerException();
        if (!container.contains(o)) {
            container.addElement(o);
        }
    }

    public void change() {
        logo = true;
    }

    public void cleanChange() {
        logo = false;
    }

    public void notifyObservers(Object arg) {
        Object[] obs;

        synchronized (this) {
            if (!logo) {
                return;
            }
            obs = container.toArray();
            cleanChange();
        }
        for (int i = obs.length-1; i>=0; i--)
            ((Observer)obs[i]).update(this, arg);
    }

}
