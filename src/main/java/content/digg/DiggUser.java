package content.digg;

import com.timerchina.collaborative.model.User;

public class DiggUser extends User {

    /**
     * SVUID
     */
    private static final long serialVersionUID = 5334812189997430446L;

    public DiggUser(int id, String name) {
        super(id, name);
    }
}
