package com.harman.jbl.partybox.ui.dashboard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/UiPage;", "", "(Ljava/lang/String;I)V", "DISCOVERY", "BLUETOOTH_PERMISSION", "LOCATION_PERMISSION", "PERMISSION_INFO", "WELCOME_SCREEN", "PRODUCT_LIST", "AURACAST", "AURACAST_SCAN", "AURACAST_QA", "LANGUAGE", "LEGAL", "HELP", "FEEDBACK", "ADD_PRODUCT", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UiPage {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ UiPage[] $VALUES;
    public static final UiPage DISCOVERY = new UiPage("DISCOVERY", 0);
    public static final UiPage BLUETOOTH_PERMISSION = new UiPage("BLUETOOTH_PERMISSION", 1);
    public static final UiPage LOCATION_PERMISSION = new UiPage("LOCATION_PERMISSION", 2);
    public static final UiPage PERMISSION_INFO = new UiPage("PERMISSION_INFO", 3);
    public static final UiPage WELCOME_SCREEN = new UiPage("WELCOME_SCREEN", 4);
    public static final UiPage PRODUCT_LIST = new UiPage("PRODUCT_LIST", 5);
    public static final UiPage AURACAST = new UiPage("AURACAST", 6);
    public static final UiPage AURACAST_SCAN = new UiPage("AURACAST_SCAN", 7);
    public static final UiPage AURACAST_QA = new UiPage("AURACAST_QA", 8);
    public static final UiPage LANGUAGE = new UiPage("LANGUAGE", 9);
    public static final UiPage LEGAL = new UiPage("LEGAL", 10);
    public static final UiPage HELP = new UiPage("HELP", 11);
    public static final UiPage FEEDBACK = new UiPage("FEEDBACK", 12);
    public static final UiPage ADD_PRODUCT = new UiPage("ADD_PRODUCT", 13);

    static {
        UiPage[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private UiPage(String str, int i4) {
    }

    private static final /* synthetic */ UiPage[] b() {
        return new UiPage[]{DISCOVERY, BLUETOOTH_PERMISSION, LOCATION_PERMISSION, PERMISSION_INFO, WELCOME_SCREEN, PRODUCT_LIST, AURACAST, AURACAST_SCAN, AURACAST_QA, LANGUAGE, LEGAL, HELP, FEEDBACK, ADD_PRODUCT};
    }

    @l3.d
    public static kotlin.enums.a<UiPage> e() {
        return $ENTRIES;
    }

    public static UiPage valueOf(String str) {
        return (UiPage) Enum.valueOf(UiPage.class, str);
    }

    public static UiPage[] values() {
        return (UiPage[]) $VALUES.clone();
    }
}
