package util;

/**
 * Created by gh-abdoli on 9/25/16.
 */
public enum Position {
    MANAGER,
    LEADER,
    DEPARTMENT_HEAD,
    EMPLOYEE;

    public static Position getUsingOrdinal(int ordinal){
        return Position.values()[ordinal];
    }
}
