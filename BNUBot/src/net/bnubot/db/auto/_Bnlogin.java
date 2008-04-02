package net.bnubot.db.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import net.bnubot.db.Account;

/**
 * Class _Bnlogin was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Bnlogin extends CayenneDataObject {

    public static final String CREATED_PROPERTY = "created";
    public static final String LAST_ACTION_PROPERTY = "lastAction";
    public static final String LAST_SEEN_PROPERTY = "lastSeen";
    public static final String LEVEL_D2_PROPERTY = "levelD2";
    public static final String LEVEL_W3_PROPERTY = "levelW3";
    public static final String LOGIN_PROPERTY = "login";
    public static final String WINS_SEXP_PROPERTY = "winsSEXP";
    public static final String WINS_STAR_PROPERTY = "winsSTAR";
    public static final String WINS_W2BN_PROPERTY = "winsW2BN";
    public static final String ACCOUNT_PROPERTY = "account";

    public static final String ID_PK_COLUMN = "id";

    public void setCreated(Date created) {
        writeProperty("created", created);
    }
    public Date getCreated() {
        return (Date)readProperty("created");
    }

    public void setLastAction(String lastAction) {
        writeProperty("lastAction", lastAction);
    }
    public String getLastAction() {
        return (String)readProperty("lastAction");
    }

    public void setLastSeen(Date lastSeen) {
        writeProperty("lastSeen", lastSeen);
    }
    public Date getLastSeen() {
        return (Date)readProperty("lastSeen");
    }

    public void setLevelD2(Integer levelD2) {
        writeProperty("levelD2", levelD2);
    }
    public Integer getLevelD2() {
        return (Integer)readProperty("levelD2");
    }

    public void setLevelW3(Integer levelW3) {
        writeProperty("levelW3", levelW3);
    }
    public Integer getLevelW3() {
        return (Integer)readProperty("levelW3");
    }

    public void setLogin(String login) {
        writeProperty("login", login);
    }
    public String getLogin() {
        return (String)readProperty("login");
    }

    public void setWinsSEXP(Integer winsSEXP) {
        writeProperty("winsSEXP", winsSEXP);
    }
    public Integer getWinsSEXP() {
        return (Integer)readProperty("winsSEXP");
    }

    public void setWinsSTAR(Integer winsSTAR) {
        writeProperty("winsSTAR", winsSTAR);
    }
    public Integer getWinsSTAR() {
        return (Integer)readProperty("winsSTAR");
    }

    public void setWinsW2BN(Integer winsW2BN) {
        writeProperty("winsW2BN", winsW2BN);
    }
    public Integer getWinsW2BN() {
        return (Integer)readProperty("winsW2BN");
    }

    public void setAccount(Account account) {
        setToOneTarget("account", account, true);
    }

    public Account getAccount() {
        return (Account)readProperty("account");
    }


}
