package com.harman.rating.model;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/harman/rating/model/UserAction;", "", "(Ljava/lang/String;I)V", "ACTION_NONE", "ACTION_RATE_US", "ACTION_NOT_NOW", "ACTION_NEVER", "0_ratingInApp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserAction[] $VALUES;
    public static final UserAction ACTION_NONE = new UserAction("ACTION_NONE", 0);
    public static final UserAction ACTION_RATE_US = new UserAction("ACTION_RATE_US", 1);
    public static final UserAction ACTION_NOT_NOW = new UserAction("ACTION_NOT_NOW", 2);
    public static final UserAction ACTION_NEVER = new UserAction("ACTION_NEVER", 3);

    static {
        UserAction[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private UserAction(String str, int i4) {
    }

    private static final /* synthetic */ UserAction[] b() {
        return new UserAction[]{ACTION_NONE, ACTION_RATE_US, ACTION_NOT_NOW, ACTION_NEVER};
    }

    @d
    public static a<UserAction> e() {
        return $ENTRIES;
    }

    public static UserAction valueOf(String str) {
        return (UserAction) Enum.valueOf(UserAction.class, str);
    }

    public static UserAction[] values() {
        return (UserAction[]) $VALUES.clone();
    }
}
