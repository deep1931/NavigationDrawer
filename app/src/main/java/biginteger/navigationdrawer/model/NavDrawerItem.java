package biginteger.navigationdrawer.model;

/**
 * Created by deepsan on 15/4/15.
 */

public class NavDrawerItem {
    private String title;
    private int icon;


    public NavDrawerItem() {

    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}