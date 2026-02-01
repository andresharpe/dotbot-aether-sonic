package com.harman.jbl.partybox.ui.party.stereo.define;

import com.harman.jbl.partybox.ui.dashboard.DashboardFragment;
import com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment;
import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoChannelFromPage;", "", "", "value", "I", "g", "()I", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "DASHBOARD", "STAGE_DASHBOARD", "STEREO_CREATE", "GROUP_SETTING", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumStereoChannelFromPage {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumStereoChannelFromPage[] $VALUES;

    @d
    private final String desc;
    private final int value;
    public static final EnumStereoChannelFromPage DASHBOARD = new EnumStereoChannelFromPage("DASHBOARD", 0, 1, DashboardFragment.TAG);
    public static final EnumStereoChannelFromPage STAGE_DASHBOARD = new EnumStereoChannelFromPage("STAGE_DASHBOARD", 1, 2, StageDashboardFragment.TAG);
    public static final EnumStereoChannelFromPage STEREO_CREATE = new EnumStereoChannelFromPage("STEREO_CREATE", 2, 3, "StereoCreateFragment");
    public static final EnumStereoChannelFromPage GROUP_SETTING = new EnumStereoChannelFromPage("GROUP_SETTING", 3, 4, "GroupSettingFragment");

    static {
        EnumStereoChannelFromPage[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EnumStereoChannelFromPage(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.desc = str2;
    }

    private static final /* synthetic */ EnumStereoChannelFromPage[] b() {
        return new EnumStereoChannelFromPage[]{DASHBOARD, STAGE_DASHBOARD, STEREO_CREATE, GROUP_SETTING};
    }

    @d
    public static a<EnumStereoChannelFromPage> f() {
        return $ENTRIES;
    }

    public static EnumStereoChannelFromPage valueOf(String str) {
        return (EnumStereoChannelFromPage) Enum.valueOf(EnumStereoChannelFromPage.class, str);
    }

    public static EnumStereoChannelFromPage[] values() {
        return (EnumStereoChannelFromPage[]) $VALUES.clone();
    }

    @d
    public final String e() {
        return this.desc;
    }

    public final int g() {
        return this.value;
    }
}
